/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2006 Tim Pizey
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * Melati is free software; Permission is granted to copy, distribute
 * and/or modify this software under the terms either:
 *
 * a) the GNU General Public License as published by the Free Software
 *    Foundation; either version 2 of the License, or (at your option)
 *    any later version,
 *
 *    or
 *
 * b) any version of the Melati Software License, as published
 *    at http://melati.org
 *
 * You should have received a copy of the GNU General Public License and
 * the Melati Software License along with this program;
 * if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA to obtain the
 * GNU General Public License and visit http://melati.org to obtain the
 * Melati Software License.
 *
 * Feel free to contact the Developers of Melati (http://melati.org),
 * if you would like to work out a different arrangement than the options
 * outlined here.  It is our intention to allow Melati to be used by as
 * wide an audience as possible.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Contact details for copyright holder:
 *
 *     Tim Pizey (timp@paneris.org)
 *
 */
package org.melati.poem.dbms;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.melati.poem.BigDecimalPoemType;
import org.melati.poem.BinaryPoemType;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.DatePoemType;
import org.melati.poem.DoublePoemType;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.LongPoemType;
import org.melati.poem.PoemType;
import org.melati.poem.SQLPoemType;
import org.melati.poem.StringPoemType;
import org.melati.poem.TimestampPoemType;
import org.melati.util.StringUtils;
/**
 * A Driver for the Microsoft Access database server.
 * http://www.tobychampion.co.uk/Access2000Dialect.java.txt
 * 
 */
public class MSAccess extends AnsiStandard {
  /** Size of text fields. */
  public static final int msAccessTextHack = 250;
  /** Size of memo fields. */
  public static final int msAccessMemoSize = 1073741823;

  /** Constructor. */
  public MSAccess() {
    //  does not work as it does not implement getColumns !!
    // setDriverClassName("sun.jdbc.odbc.JdbcOdbcDriver"); 
    setDriverClassName("easysoft.sql.jobDriver"); 
  }
  /**
   * Return <code>null</code> as the Schema Name, 
   * which tells jdbc not to filter on it. 
   * 
   * @see org.melati.poem.dbms.Dbms#getSchema()
   * @see org.melati.poem.dbms.AnsiStandard#getConnection
   */
  public String getSchema() {
    return null;
  }

  /**
   * Ignore tables starting with '~', which should 
   * probably have a jdbc type of 'SYSTEM TABLE'.
   */
  public String melatiName(String name) {
    if (name == null)
      return null;
    if (name.startsWith("~"))
      return null;
    return name;
  }
  
  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#unreservedName(java.lang.String)
   */
  public String unreservedName(String name) {
    return name;
  }



  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#getSqlDefinition(java.lang.String)
   */
  public String getSqlDefinition(String sqlTypeName) {
    if (sqlTypeName.equals("BOOLEAN")) {
      return ("BIT");
    }
    if (sqlTypeName.equals("DOUBLE PRECISION")) {
      return ("DOUBLE");
    }
    if (sqlTypeName.equals("INT8")) {
      return ("INTEGER");
    }
    if (sqlTypeName.equals("Big Decimal")) {
      return ("NUMERIC");
    }
    return super.getSqlDefinition(sqlTypeName);
  }
  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#getLongSqlDefinition()
   */
  public String getLongSqlDefinition() {
    return "INTEGER";
  }
  
  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#getStringSqlDefinition(int)
   */
  public String getStringSqlDefinition(int size) throws SQLException {
    if (size < 0) { 
      // Don't use TEXT as it doesn't seem to work as documented
      return "VARCHAR(" + msAccessTextHack + ")";
    }
    return super.getStringSqlDefinition(size);
  }
  
  /**
   * Cludge?
   */
  public String getFixedPtSqlDefinition(int scale, int precision)
  throws SQLException {
    if (scale < 0 || precision <= 0)
      throw new SQLException(
      "negative scale or nonpositive precision not supported in AnsiStandard DECIMALs");
    return "NUMERIC";
  }
  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#getBinarySqlDefinition(int)
   */
  public String getBinarySqlDefinition(int size) throws SQLException {
    if (size < 0)
      return "BINARY"; // 512
    return "BINARY(" + size + ")";
  }
  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#canRepresent(org.melati.poem.PoemType, org.melati.poem.PoemType)
   */
  public PoemType canRepresent(PoemType storage, PoemType type) {
    if (storage instanceof StringPoemType && type instanceof StringPoemType) {
      if (((StringPoemType)storage).getSize() == msAccessTextHack
              && ((StringPoemType) type).getSize() == -1) {
        return type;
      } else if (((StringPoemType)storage).getSize() == msAccessMemoSize
                 && ((StringPoemType)type).getSize() == -1) {
              return type;
      } else {
        return storage.canRepresent(type);
      }
    } else if (storage instanceof TimestampPoemType && type instanceof DatePoemType) {
      return type;
    } else if (storage instanceof BooleanPoemType && type instanceof BooleanPoemType) {
      // ignore nullability
      return type;
    } else if (storage instanceof DoublePoemType && type instanceof BigDecimalPoemType) {
      return type;
    } else if (storage instanceof IntegerPoemType && type instanceof LongPoemType) {
      return type;
    } else {
      return storage.canRepresent(type);
    }
  }
  /**
   * Translates a MSSQL String into a Poem <code>StringPoemType</code>.
   */
  public static class MSAccessStringPoemType extends StringPoemType {
    public MSAccessStringPoemType(boolean nullable, int size) {
      super(nullable, size);
    }
    // We set size to sqlServerTextHack for our Text type
    protected boolean _canRepresent(SQLPoemType other) {
      return (getSize() < 0 || 
              getSize() == msAccessTextHack || 
              getSize() >= ((StringPoemType) other).getSize());
    }
    /* (non-Javadoc)
     * @see org.melati.poem.PoemType#canRepresent(org.melati.poem.PoemType)
     */
    public PoemType canRepresent(PoemType other) {
      return other instanceof StringPoemType
              && _canRepresent((StringPoemType) other)
              && !(!getNullable() && ((StringPoemType) other).getNullable()) ? other
              : null;
    }
  }
  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#defaultPoemTypeOfColumnMetaData(java.sql.ResultSet)
   */
  public SQLPoemType defaultPoemTypeOfColumnMetaData(ResultSet md)
      throws SQLException {
    /*<pre>
     * ResultSetMetaData rsmd = md.getMetaData(); 
     * int cols = rsmd.getColumnCount(); 
     * for (int i = 1; i <= cols; i++) { 
     *  String table = rsmd.getTableName(i); 
     *  System.err.println("table name: " + table); 
     *  String column = rsmd.getColumnName(i); 
     *  System.err.println("column name: " + column); 
     *  int type = rsmd.getColumnType(i); 
     *  System.err.println("type: " + type);
     *  String typeName = rsmd.getColumnTypeName(i);
     *  System.err.println("type Name: " + typeName); 
     *  String className = rsmd.getColumnClassName(i); 
     *  System.err.println("class Name: " + className);
     *  System.err.println("String val: " + md.getString(i));
     *  System.err.println(""); 
     * }
     * </pre>
     */
    if (md.getString("TYPE_NAME").equals("text"))
      return new MSAccessStringPoemType(
                                     md.getInt("NULLABLE") == DatabaseMetaData.columnNullable,
                                     md.getInt("COLUMN_SIZE"));
    // We use a magic number for text fields
/*
    if (md.getString("TYPE_NAME").equals("VARCHAR")
            && md.getInt("COLUMN_SIZE") == msAccessTextHack)
      return new MSAccessStringPoemType(
      md.getInt("NULLABLE") == DatabaseMetaData.columnNullable, md
              .getInt("COLUMN_SIZE"));
    if (md.getString("TYPE_NAME").equals("CHAR"))
      return new StringPoemType(
                                md.getInt("NULLABLE") == DatabaseMetaData.columnNullable,
                                md.getInt("COLUMN_SIZE"));
*/                               
    if (md.getString("TYPE_NAME").equals("BINARY"))
      return new BinaryPoemType(
                   md.getInt("NULLABLE") == DatabaseMetaData.columnNullable,
                   md.getInt("COLUMN_SIZE"));
    if (md.getString("TYPE_NAME").equals("INT"))
      return new LongPoemType(
                   md.getInt("NULLABLE") == DatabaseMetaData.columnNullable);
    if (md.getString("TYPE_NAME").equals("SMALLINT"))
      return new IntegerPoemType(
                   md.getInt("NULLABLE") == DatabaseMetaData.columnNullable);
    return super.defaultPoemTypeOfColumnMetaData(md);
  }

  /** 
   * 
   * @see org.melati.poem.dbms.Dbms#caseInsensitiveRegExpSQL(java.lang.String, java.lang.String)
   */
  public String caseInsensitiveRegExpSQL(String term1, String term2) {
    if (StringUtils.isQuoted(term2)) {
      term2 = term2.substring(1, term2.length() - 1);
    } 
    term2 = StringUtils.quoted(StringUtils.quoted(term2, '%'), '\'');
    
    return term1 + " LIKE " + term2;
  }


}
