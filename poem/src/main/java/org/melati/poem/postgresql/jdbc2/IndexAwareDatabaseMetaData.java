/*
 * $Source$
 * $Revision$
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * -------------------------------------
 *  Copyright (C) 2000 William Chesters
 * -------------------------------------
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * A copy of the GPL should be in the file org/melati/COPYING in this tree.
 * Or see http://melati.org/License.html.
 *
 * Contact details for copyright holder:
 *
 *     William Chesters <williamc@paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 *
 *
 * ------
 *  Note
 * ------
 *
 * I will assign copyright to PanEris (http://paneris.org) as soon as
 * we have sorted out what sort of legal existence we need to have for
 * that to make sense.  When WebMacro's "Simple Public License" is
 * finalised, we'll offer it as an alternative license for Melati.
 * In the meantime, if you want to use Melati on non-GPL terms,
 * contact me!
 */

package org.melati.poem.postgresql.jdbc2;

import org.postgresql.*;
import org.postgresql.jdbc2.*;
import org.postgresql.jdbc2.Connection;
import org.melati.util.*;

public class IndexAwareDatabaseMetaData
    extends org.melati.poem.sql.jdbc2.DelegatedDatabaseMetaData {

  public IndexAwareDatabaseMetaData(java.sql.DatabaseMetaData metadata) {
    super(metadata);
  }

  public java.sql.ResultSet getIndexInfo(String catalog, String schema,
                                         String table, boolean unique,
                                         boolean approximate)
      throws java.sql.SQLException {

    return ((Connection)getConnection()).ExecSQL(
        "SELECT " +
          "null AS TABLE_CAT, null AS TABLE_SCHEMA, t.relname AS TABLE_NAME, " +
          "NOT i.indisunique AS NON_UNIQUE, null AS INDEX_QUALIFIER, " +
          "ti.relname AS INDEX_NAME, " + tableIndexOther + " AS TYPE, " +
          "i.indkey[0] AS ORDINAL_POSITION, a.attname AS COLUMN_NAME, " +
          "NULL AS ASC_OR_DESC, 0 AS CARDINALITY, 0 AS PAGES, " +
          "NULL AS FILTER_CONDITION " +
        "FROM " +
          "pg_index i, pg_class ti, pg_class t, pg_attribute a " +
        "WHERE " +
          "ti.oid = i.indexrelid AND t.oid = i.indrelid AND " +
          (table == null ?
             "" :
             "t.relname = '" + StringUtils.escaped(table, '\'') + "' AND ") +
          (unique ? "i.indisunique AND " : "") +
          "a.attrelid = i.indrelid AND " +
          // this strange little construct is needed because
          // `a.attnum = i.indkey[0]' causes 6.4.2 (at least) to fail, losing
          // connection to backend:
          "a.attnum - i.indkey[0] = 0");
  }

  public static void main(String[] args) throws Exception {
    java.sql.DriverManager.registerDriver((Driver)Class.forName("postgresql.Driver").newInstance());
    java.sql.Connection c = java.sql.DriverManager.getConnection("jdbc:postgresql:" + args[0], "postgres", "*");
    java.sql.DatabaseMetaData m = c.getMetaData();

    java.sql.ResultSet inds = m.getIndexInfo(null, "", args[1], false, true);
    while (inds.next())
      System.out.println("TABLE_CAT " + inds.getString("TABLE_CAT") + "\n" +
                         "TABLE_SCHEMA " + inds.getString("TABLE_SCHEMA") + "\n" +
                         "TABLE_NAME " + inds.getString("TABLE_NAME") + "\n" +
                         "NON_UNIQUE " + inds.getBoolean("NON_UNIQUE") + "\n" +
                         "INDEX_QUALIFIER " + inds.getString("INDEX_QUALIFIER") + "\n" +
                         "INDEX_NAME " + inds.getString("INDEX_NAME") + "\n" +
                         "TYPE " + inds.getShort("TYPE") + "\n" +
                         "ORDINAL_POSITION " + inds.getShort("ORDINAL_POSITION") + "\n" +
                         "COLUMN_NAME " + inds.getString("COLUMN_NAME") + "\n" +
                         "ASC_OR_DESC " + inds.getString("ASC_OR_DESC") + "\n" +
                         "CARDINALITY " + inds.getInt("CARDINALITY") + "\n" +
                         "PAGES " + inds.getInt("PAGES") + "\n" +
                         "FILTER_CONDITION " + inds.getString("FILTER_CONDITION") + "\n");
  }
}
