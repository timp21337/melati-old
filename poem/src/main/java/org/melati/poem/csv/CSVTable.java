package org.melati.poem.csv;

import java.io.*;
import java.util.*;
import org.melati.poem.*;
import org.melati.util.*;

public class CSVTable {

  protected Table table = null;
  protected File data = null;
  protected Hashtable columns = new Hashtable();
  protected Vector columnsInUploadOrder = new Vector();
  protected CSVColumn primaryKey = null;
  protected Vector records = new Vector();

  public CSVTable(Table table, File data) {
    this.table = table;
    this.data = data;
  }


  /**
   * Add column definitions to this table
   */

  public void addColumn(String csvName, String poemName) {
    columns.put(csvName, new CSVColumn(poemName));
  }


  /**
   * Add column definitions, perhaps Primary Keys, to this table
   */

  public void addColumn(String csvName, String poemName, boolean isPrimaryKey)
                               throws CSVPrimaryKeyColumnAlreadySetException {
    if (isPrimaryKey && primaryKey != null)
      throw new CSVPrimaryKeyColumnAlreadySetException(table.getName());
    CSVColumn col = new CSVColumn(poemName, true);
    columns.put(csvName, col);
    if (isPrimaryKey)
      primaryKey = col;
  }


  /**
   * Add column definitions for foreign keys to this table
   */

  public void addColumn(String csvName, String poemName, CSVTable foreignTable) {
    columns.put(csvName, new CSVColumn(poemName, foreignTable));
  }


  /**
   * Parse the CSV data file and store the data for saving later
   */

  public void load() throws IOException, CSVParseException {

    BufferedReader reader = new BufferedReader(new FileReader(data));
    CSVFileParser parser = new CSVFileParser(reader);

    // 1st line contains the field names - this needs to be
    // validated againsed expected values, and the order of
    // the fields established
    parser.nextRecord();

    try {
      while (parser.recordHasMoreFields()) {

        String key = (String) parser.nextField();
        Object col = columns.get(key);
        if (col == null)
          throw new CSVParseException(
            "I don't know what to do the the column in " + data.getPath() +
            " called " + key); 
        columnsInUploadOrder.addElement(col);
      }

      // Suck in all the data
      CSVRecord record;
      while(null != (record = parseRecord(parser, data.getPath())) ) {
        records.addElement(record);
      }

    }
    catch (IllegalArgumentException e) {
       throw new CSVParseException("Failed to read column header in " +
                                    data.getPath() + ": " + e.toString());
    }
    catch (NoSuchElementException f) {
       throw new CSVParseException("Failed to read column header in " +
                                    data.getPath() + ": " + f.toString());
    }
    finally {
      reader.close();
    }
  }


    /**
     * Reads the details file until is has seen an object's-worth of
     * field name/value pairs (e.g. it sees an EOF or a line starting
     * with '$') which is returns in a hashtable (null if there are
     * no field values).
     */

  public CSVRecord parseRecord(CSVFileParser parser, String name)
                                    throws IOException, CSVParseException {
    if (!parser.nextRecord())
      return null;

    int i = 0;
    try {
      CSVRecord record = new CSVRecord(table);
      for (; i < columnsInUploadOrder.size(); i++) {
        String value = (String) parser.nextField();
        CSVColumn col = (CSVColumn)columnsInUploadOrder.elementAt(i);
        record.addField(new CSVField(col, value));
      }

      return record;
    }
    catch (IllegalArgumentException e) {
       throw new CSVParseException("Failed to read data field no. " + (i+1) + " in " +
                                    name + ": " + e.toString());
    }
    catch (NoSuchElementException f) {
       throw new CSVParseException("Failed to read data field no. " + (i+1) + " in " +
                                    name + ": " + f.toString());
    }
  }


  /**
   * Delete all Persistents from the Poem table
   */

  public void emptyTable() {
    Enumeration rows = table.selection();
    while(rows.hasMoreElements()) {
      Persistent p = (Persistent)rows.nextElement();
      p.delete();
    }
  }


  /**
   * Write the records to the database
   */

  public void writeRecords() throws NoPrimaryKeyInCSVTableException {
    for (int i = 0; i < records.size(); i++) {
      ((CSVRecord)records.elementAt(i)).makePersistent();
    }
  }


  /**
   * Lookup the Persistent corresponding to the CSV record
   * with the given value for the CSV table's primary key
   */

  public Persistent getRecordWithID(String csvValue)
                                     throws NoPrimaryKeyInCSVTableException {
    if (primaryKey == null)
      throw new NoPrimaryKeyInCSVTableException(table.getName(), csvValue);

    for (int i = 0; i < records.size(); i++) {
      CSVRecord record = (CSVRecord)records.elementAt(i);
      if (record.primaryKeyValue != null &&
          record.primaryKeyValue.equals(csvValue))
        return record.getPersistent();
    }

    return null;
  }


  /**
   * Return a string reporting on the data added to this table
   */

  public void report(boolean recordDetails, boolean fieldDetails,
                       Writer output) throws IOException {

    output.write("*** TABLE: " + table.getName().toUpperCase() + " **\n\n");
    output.write("** I have read " + records.size() + " records of " +
                   columnsInUploadOrder.size() + " fields\n");

    if (recordDetails) {
      for (int i = 0; i < records.size(); i++) {
        CSVRecord record = (CSVRecord)records.elementAt(i);
        output.write("   Record: CSV primary key = " +
                        record.primaryKeyValue);

        if (record.poemRecord == null)
          output.write(", No Poem Persistent written\n");
        else
          output.write(", Poem Troid = " + record.poemRecord.troid() + "\n");

        if (fieldDetails) {
          for (int j = 0; j < record.size(); j++) {
            CSVField field = (CSVField)record.elementAt(j);
            output.write(field.column + "=\"" + field.value);
            if (j < record.size()-1)
              output.write("\",");
            else
              output.write("\"\n");
          }
        }
      }
    }

    output.write("** Currently " + table.count(null) +
                  " Persistents in this table\n\n");
  }

}
