/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2001 Myles Chippendale
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
 *     Myles Chippendale <mylesc@paneris.org>
 */
package org.melati.poem;

import java.util.Vector;
import java.io.File;
import java.io.Writer;
import java.io.IOException;
import org.melati.poem.csv.CSVTable;
import org.melati.poem.csv.CSVParseException;
import org.melati.poem.csv.NoPrimaryKeyInCSVTableException;


/**
 * A class to define a sequence of CSVTables and  process them 
 * by parsing the files and writing the data to the database.
 */
public class CSVFilesProcessor {

  Vector tables = new Vector();
  Database db = null;

  public CSVFilesProcessor(Database db) {
    this.db = db;
  }

  public CSVTable addTable(String tablename, File file) {
    return addTable(db.getTable(tablename), file);
  }

  public CSVTable addTable(Table tab, File file) {
    CSVTable table = new CSVTable(tab, file);
    tables.addElement(table);
    return table;
  }

  /**
   * Load all the data from the files, empty the tables if
   * necessary and then write the new data into the tables.
   * <p>
   * Write a report of the progress to the Writer.
   */
  public void process(boolean emptyTables,
                      boolean recordDetails,
                      boolean fieldDetails,
                      Writer output)
                            throws IOException, CSVParseException,
                                     NoPrimaryKeyInCSVTableException {

    // Load in data
    for(int i = 0; i < tables.size(); i++)
      ((CSVTable)tables.elementAt(i)).load();

    output.write("Loaded files\n");
    output.write("Trying to get exclusive lock on the database\n");

    db.beginExclusiveLock();

    output.write("Got exclusive lock on the database!!!\n");

    // Delete all records from the tables, if necessary
    if (emptyTables) {
      for(int i = 0; i < tables.size(); i++)
        ((CSVTable)tables.elementAt(i)).emptyTable();
      PoemThread.writeDown();
    }

    output.write("Emptied all tables\n");

    System.err.println("Emptied all tables");

    // We must have loaded in all the data before we
    // try writing records, otherwise Foreign Key lookups
    // won't work
    for(int i = 0; i < tables.size(); i++)
      ((CSVTable)tables.elementAt(i)).writeRecords();

    output.write("Written records\n");

    db.endExclusiveLock();

    output.write("Ended exclusive lock on the database!!!\n");
    output.write("***** REPORT ******\n");

    // Write a report about how many records are in each table
    for(int i = 0; i < tables.size(); i++)
      ((CSVTable)tables.elementAt(i)).
            report(recordDetails, fieldDetails, output);
  
  }

}
