/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2000 William Chesters
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
 *     William Chesters <williamc@paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 */

package org.melati;

import java.util.*;
import java.io.*;
import java.sql.*;
import org.melati.util.*;
import org.melati.poem.*;

public class LogicalDatabase {

  private LogicalDatabase() {}

  public static final String className =
      new LogicalDatabase().getClass().getName();

  private static final String databaseDefsName =
      "org.melati.LogicalDatabase.properties";

  private static Properties databaseDefs = null;

  private static synchronized Properties databaseDefs() throws IOException {
    if (databaseDefs == null)
      databaseDefs =
          PropertiesUtils.fromResource(new LogicalDatabase().getClass(),
                                       databaseDefsName);
    return databaseDefs;
  }

  private static final Hashtable databases = new Hashtable();

  /**
  @deprecated
  */
  public static Database named(String name) throws DatabaseInitException {
      return getDatabase(name);
  }

  private static final Object pending = new Object();

  public static class ConnectionPendingException
      extends MelatiRuntimeException {

    public String name;

    public ConnectionPendingException(String name) {
      this.name = name;
    }

    public String getMessage() {
      return "The database `" + name + "' is in the process of being " +
             "initialized; please try again in a moment";
    }
  }

  public static Database getDatabase(String name) throws DatabaseInitException {
    if (name == null)
      name = "default";

    Object dbOrPending;

    synchronized (databases) {
      dbOrPending = databases.get(name);
      if (dbOrPending == pending)
        throw new ConnectionPendingException(name);
      else if (dbOrPending == null)
        databases.put(name, pending);
    }

    if (dbOrPending != null)
      return (Database)dbOrPending;

    try {
      Properties defs = databaseDefs();
      String pref = className + "." + name + ".";
      String url = PropertiesUtils.getOrDie(defs, pref + "url");
      String user = PropertiesUtils.getOrDie(defs, pref + "user");
      String pass = PropertiesUtils.getOrDie(defs, pref + "pass");
      String clazz = PropertiesUtils.getOrDie(defs, pref + "class");
      String dbmsclass = PropertiesUtils.getOrDie(defs, pref + "dbmsclass");
      // max transactions default to 8 if not set
      int maxTrans = PropertiesUtils.getOrDefault_int(defs, pref + "maxtransactions",8);

      /*
       The driver is now initialized and checked by the dbms class as we
       have one dbms class for each jdbc driver.

      String driverName = PropertiesUtils.getOrDie(defs, pref + "driver");

      Object driverObject = Class.forName(driverName).newInstance();

      if (!(driverObject instanceof Driver))
        throw new ClassCastException(
            "The .driver=" + driverName + " entry named a class of type " +
            driverObject.getClass() + ", which is not a java.sql.Driver");

      Driver driver = (Driver)driverObject;
      */

      Object databaseObject = Class.forName(clazz).newInstance();

      if (!(databaseObject instanceof Database)) 
        throw new ClassCastException(
            "The .class=" + clazz + " entry named a class of type " +
            databaseObject.getClass() + ", " +
            "which is not an org.melati.poem.Database");

      Database database = (Database)databaseObject;

      // Changed to use dbmsclass not driver, it will throw and exception 
      // if that is not correct

      database.connect(dbmsclass, url, user, pass, maxTrans);

      databases.put(name, database);

      return database;
    }
    catch (Exception e) {
      databases.remove(name);
      throw new DatabaseInitException(databaseDefsName, name, e);
    }
  }
}
