/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2004 Tim Pizey
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

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Types;

//import org.melati.poem.Table;

import org.melati.poem.BooleanPoemType;
import org.melati.poem.PoemType;
import org.melati.poem.SQLPoemType;
//import org.melati.poem.BinaryPoemType;
//import org.melati.poem.DoublePoemType;
import org.melati.poem.IntegerPoemType;
//import org.melati.poem.LongPoemType;
import org.melati.poem.StringPoemType;

//import org.melati.poem.DuplicateKeySQLPoemException;
//import org.melati.poem.NoSuchColumnPoemException;
//import org.melati.poem.SeriousPoemException;
//import org.melati.poem.SQLPoemException;


 /**
  * A Driver for Oracle (http://www.oracle.com/)
  **/

public class Oracle extends AnsiStandard {

  /**
   * Oracle does not have a pleasant <code>TEXT</code> 
   * datatype, so we use an arbetary value in a 
   * <code>VARCHAR</code>.
   */
  public static int oracleTextHack = 2333;

  public Oracle() {
    setDriverClassName("oracle.jdbc.OracleDriver");
  }

  /* Get the user we are connected as and return that as the schema.
   * 
   * @see org.melati.poem.dbms.Dbms#getSchema()
   * @see org.melati.poem.dbms.Ansistandard#getConnection()
   */
  public String getSchema() {
    return schema;
  }
  
  public boolean canDropColumns(Connection con) {
    return true;
  }

  /*

  public String preparedStatementPlaceholder(PoemType type) {
    if (type instanceof IntegerPoemType)
      return "CAST(? AS INT4)";
    else if (type instanceof LongPoemType)
      return "CAST(? AS INT8)";
    else if (type instanceof DoublePoemType)
      return "CAST(? AS FLOAT8)";
    else 
      return "?";
  }
*/
  public String getStringSqlDefinition(int size) throws SQLException {
    if (size < 0) { 
       return "VARCHAR(" + oracleTextHack + ")";
    }
       return super.getStringSqlDefinition(size);
  }


  /* (non-Javadoc)
   * @see org.melati.poem.dbms.Dbms#getLongSqlDefinition()
   */
  public String getLongSqlDefinition() {
    return "NUMBER";
  }

  public String getSqlDefinition(String sqlTypeName) {
    if (sqlTypeName.equals("BOOLEAN")) {
      return ("CHAR(1)");
    }
    return super.getSqlDefinition(sqlTypeName);
  }

  /**
   * Translates an Oracle Boolean into a Poem <code>BooleanPoemType</code>.
   */ 
   public static class OracleBooleanPoemType extends BooleanPoemType {
     public OracleBooleanPoemType(boolean nullable) {
       super(nullable);
     }
     
     protected Object _getRaw(ResultSet rs, int col) throws SQLException {
       synchronized (rs) {
         boolean v = rs.getBoolean(col);
         return rs.wasNull() ? null : (v ? Boolean.TRUE : Boolean.FALSE);
       }
     }

     protected void _setRaw(PreparedStatement ps, int col, Object bool) 
         throws SQLException {
       ps.setInt(col, ((Boolean) bool).booleanValue() ? 1 : 0);
     }

   }

   /**
    * Translates a Oracle String into a Poem <code>StringPoemType</code>.
    */ 
  public static class OracleStringPoemType extends StringPoemType {

      public OracleStringPoemType(boolean nullable, int size) {
        super(nullable, size);
      }

      protected boolean _canRepresent(SQLPoemType other) {
        return (getSize() == oracleTextHack && ((StringPoemType)other).getSize() == -1)
               ||
               (getSize() >= ((StringPoemType)other).getSize());
      }

      public PoemType canRepresent(PoemType other) {
        System.err.println("Creating an OracleStringPoemType");
        return other instanceof StringPoemType &&
               _canRepresent((StringPoemType)other) &&
               !(!getNullable() && ((StringPoemType)other).getNullable()) ?
                 other : null;
      }

    }

  public String getBinarySqlDefinition(int size) throws SQLException {
    return "BLOB";
  }

  /**
   * An Object Id <code>PoemType</code>.
   */
  /*

  public static class BlobPoemType extends IntegerPoemType {
      public BlobPoemType(boolean nullable) {
          super(Types.INTEGER, "BLOB", nullable);
      }

      protected boolean _canRepresent(SQLPoemType other) {
          return other instanceof BinaryPoemType;
      }

      public PoemType canRepresent(PoemType other) {
          return other instanceof BinaryPoemType &&
                 !(!getNullable() && 
       ((BinaryPoemType)other).getNullable()) ? other : null;
      }
  }
*/
   
  public SQLPoemType defaultPoemTypeOfColumnMetaData(ResultSet md)
      throws SQLException {
    System.err.println("Type:"+md.getString("TYPE_NAME"));

    ResultSetMetaData rsmd = md.getMetaData();
    int cols = rsmd.getColumnCount();
    for (int i = 1; i <= cols; i++) {
      String table = rsmd.getTableName(i);
      System.err.println("table name: " + table);
      String column = rsmd.getColumnName(i);
      System.err.println("column name: " + column);
      int type = rsmd.getColumnType(i);
      System.err.println("type: " + type);
      String typeName = rsmd.getColumnTypeName(i);
      System.err.println("type Name: " + typeName);
      String className = rsmd.getColumnClassName(i);
      System.err.println("class Name: " + className);
      System.err.println("String val: " + md.getString(i));
      System.err.println("");
    }

    if(md.getString("TYPE_NAME").equals("VARCHAR2"))
      return 
          new OracleStringPoemType(md.getInt("NULLABLE")==
                                      DatabaseMetaData.columnNullable, 
                                  md.getInt("COLUMN_SIZE"));
    if(md.getString("TYPE_NAME").equals("CHAR"))
      return 
          new OracleBooleanPoemType(md.getInt("NULLABLE")==
                                      DatabaseMetaData.columnNullable);
    SQLPoemType t = 
      md.getString("TYPE_NAME").equals("NUMBER") ?
          new IntegerPoemType(md.getInt("NULLABLE") ==
                              DatabaseMetaData.columnNullable) :
          super.defaultPoemTypeOfColumnMetaData(md);
    System.err.println("SQLType:"+t);
    return t;
  }
/*
if(md.getString("TYPE_NAME").equals("char"))
  return 
      new StringPoemType(
              md.getInt("NULLABLE") == DatabaseMetaData.columnNullable,
              md.getInt("COLUMN_SIZE"));
if(md.getString("TYPE_NAME").equals("datetime"))
  return 
      new MSSQLDatePoemType(
              md.getInt("NULLABLE")== DatabaseMetaData.columnNullable);
return super.defaultPoemTypeOfColumnMetaData(md);
}

*/  
  
  /**
   * Note that this is case sensitive.
   * 
   * @see org.melati.poem.dbms.Dbms#caseInsensitiveRegExpSQL(java.lang.String, java.lang.String)
   */
  public String caseInsensitiveRegExpSQL(String term1, String term2) {
    return term2 + " LIKE '%" + term1 + "%'";
  }

  public String unreservedName(String name) {
    if(name.equalsIgnoreCase("user")) name = "melati_" + name;
    return name;
  }

  public String melatiName(String name) {
    if(name.equalsIgnoreCase("melati_user")) name = "user";
    return name;
  }


}
