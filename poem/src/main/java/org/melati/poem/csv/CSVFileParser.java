package org.melati.util;

import java.io.*;
import java.util.*;

/**
 * A utility for tokenising a file made up of comma-separated
 * variables.  We allow for fields having returns in them.
 *
 * <PRE>
 *   foo, bar om,,"baz, ,oof",xyz,   ->
 *     "foo", " bar om", "", "baz, , oof", "xyz", ""
 *
 *   foo, "bar
 *   bar
 *   bar", baz ->
 *   "foo", "bar\u0015bar\u0015bar", "baz"
 * </PRE>
 *
 * Each record (which is usually a line, unless some fields have
 * a line break in them) is accessed one at a time by calling
 * <code>nextRecord()</code>. Within each record
 * <code>recordHasMoreFields()</code> and <code>nextField()</code>
 * can be used like an Enumeration to iterate through the fields.
 *
 * @author	myles@paneris.org, based heavily on williamc@paneris.org
 *          orginal CSVStringEnumeration
 * @quality     personal
 */

public class CSVFileParser {

  private BufferedReader reader = null;

  int line_no = 0;      // The first line will be line '1'
  private String line = "";
  private boolean emptyLastField = false;
  int p = 0;

  public CSVFileParser(BufferedReader reader) {
    this.reader = reader;
  }

  /**
   * Look at a new line
   */

  public boolean nextRecord() throws IOException {
    return nextLine();
  }

  private boolean nextLine() throws IOException {
    line = reader.readLine();
    // This should be false anyway if we're called from nextToken()
    emptyLastField = false;
    p = 0;
    if (line == null) {
      reader.close();
      return false;
    }
    line_no++;
    return true;
  }

  /**
   * Are there any more tokens to come?
   */

  public boolean recordHasMoreFields() {
    return emptyLastField || p < line.length();
  }

  /**
   * Return the next token as an <TT>Object</TT>.
   */

  public String nextField() throws IOException {
    return nextToken(false);
  }



  /**
   * Return the next token as a <TT>String</TT>.
   */

  private String nextToken(boolean inUnclosedQuotes) throws IOException {

    if (emptyLastField) {
      emptyLastField = false;
      return "";
    }

    if (p >= line.length()) throw new NoSuchElementException();

    if (inUnclosedQuotes || (line.charAt(p) == '"' && (++p>0)) ) {

      // we need to allow for quotes inside quoted fields, so now test for ",
      int q = line.indexOf("\",", p);
      // if it is not there, we are (hopefully) at the end of a line
      if (q == -1 && (line.indexOf('"', p) == line.length()-1)) 
        q = line.length()-1;
        
      // If we don't find the end quote try reading in more lines
      // since fields can have \n in them
      if (q == -1) {
        String sofar = line.substring(p, line.length());
        if (!nextLine())
          throw new IllegalArgumentException("Unclosed quotes on line "
                                             + line_no);
        return sofar + "\n" + nextToken(true);
      }

      String it = line.substring(p, q);

      ++q;
      p = q+1;
      if (q < line.length()) {
        if (line.charAt(q) != ',') {
	        p = line.length();
	        throw new IllegalArgumentException("No comma after quotes on line "
	                                           + line_no);
        }
        else if (q == line.length() - 1)
          emptyLastField = true;
      }
      return it;
    } else {
      int q = line.indexOf(',', p);
      if (q == -1) {
	      String it = line.substring(p);
	      p = line.length();
	      return it;
      } else {
	      String it = line.substring(p, q);
          if (q == line.length() - 1)
            emptyLastField = true;
	      p = q + 1;
	      return it;
      }
    }
  }

  public static void main(String[] args) throws Exception {

    System.out.println("***** Reading file " + args[0]);

    BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
    CSVFileParser toks = new CSVFileParser(reader);

    int recordCount = 0;
    while(toks.nextRecord()) {
      System.out.println("*** Record " + ++recordCount);
      int i = 0;
      while (toks.recordHasMoreFields()) {
        System.out.println("Field " + ++i + ":" + toks.nextField());
      }
    }
  }


}
