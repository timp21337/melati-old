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

package org.melati.poem.prepro;

import java.util.*;
import java.io.*;
import org.melati.util.*;

public class DSD {

  public static final String autogenStamp =
      "// Do not edit this file!  " +
      "It was generated by Melati POEM's DSD preprocessor.";

  private final Vector packageComponents = new Vector();
  private final String packageName;
  private final Vector tables = new Vector();
  final Hashtable tableOfClass = new Hashtable();
  private final File dsdFile, dsdDir;
  private final String name;
  final String databaseClass, databaseBaseClass;

  static void expect(StreamTokenizer tokens, String what)
      throws ParsingDSDException, IOException {
    if (tokens.ttype != StreamTokenizer.TT_WORD || !tokens.sval.equals(what))
      throw new ParsingDSDException(what, tokens);
  }

  static void expect(StreamTokenizer tokens, char what)
      throws ParsingDSDException, IOException {
    if (tokens.ttype != what)
      throw new ParsingDSDException("" + what, tokens);
  }

  public DSD(String file)
        throws IOException, ParsingDSDException, IllegalityException {
    dsdFile = new File(file);
    String dsdFileName = dsdFile.getName();
    int dot = dsdFileName.lastIndexOf('.');
    name = dot == -1 ? dsdFileName : dsdFileName.substring(0, dot);

    String nAme = StringUtils.capitalised(name);
    databaseClass = nAme + "Database";
    databaseBaseClass = nAme + "DatabaseBase";

    dsdDir = new File(new File(dsdFile.getAbsolutePath()).getParent());
    Reader reader = new BufferedReader(new FileReader(file));
    try {
      StreamTokenizer tokens = new StreamTokenizer(reader);
      tokens.slashSlashComments(true);
      tokens.slashStarComments(true);
      tokens.wordChars('_', '_');

      tokens.nextToken();
      expect(tokens, "package");

      StringBuffer packageBuffer = new StringBuffer();
      for (;;) {
        if (tokens.nextToken() != StreamTokenizer.TT_WORD)
          throw new ParsingDSDException("<package component>", tokens);
        packageComponents.addElement(tokens.sval);
        packageBuffer.append(tokens.sval);
        if (tokens.nextToken() != '.') break;
        packageBuffer.append('.');
      }
      packageName = packageBuffer.toString();

      expect(tokens, ';');
      tokens.nextToken();

      for (int t = 0; tokens.ttype != StreamTokenizer.TT_EOF; ++t) {
        expect(tokens, "table");
        tokens.nextToken();
	TableDef table = new TableDef(this, tokens, t);
        tables.addElement(table);
	tableOfClass.put(table.mainClass, table);
      }
    }
    finally {
      reader.close();
    }
  }

  void createJava(String name, Generator proc,
                  boolean overwrite) throws IOException {

    File f = new File(dsdDir, name + ".java");
    if (f.exists())
      if (overwrite) {
        BufferedReader r = new BufferedReader(new FileReader(f));
        try {
          String firstLine = r.readLine();
          if (firstLine == null || firstLine.equals(autogenStamp))
            System.err.println("Replacing " + f);
          else
            throw new TargetExistsDSDException(f);
        }
        finally {
          r.close();
        }
      }
      else {
        System.err.println("Leaving existing " + f);
        return;
      }
    else
      System.err.println("Creating " + f);

    Writer w = new BufferedWriter(new FileWriter(f));
    try {
      if (overwrite)
        w.write(autogenStamp + "\n" +
                "\n");

      w.write("package " + packageName + ";\n" +
              "\n" +
	      "import java.util.*;\n" +
	      "import java.sql.Date;\n" + // FIXME hack!
	      "import org.melati.util.*;\n");

      if (!packageName.equals("org.melati.poem"))
        w.write("import org.melati.poem.*;\n");

      w.write("\n");

      proc.process(w);
    }
    catch (IOException e) {
      try { w.close(); } catch (Exception ee) {}
      try { f.delete(); } catch (Exception ee) {}
      throw e;
    }

    w.close();
  }

  void createJava(String name, Generator proc) throws IOException {
    createJava(name, proc, true);
  }

  public void generateDatabaseBaseJava(Writer w) throws IOException {
    w.write("public class " + databaseBaseClass + " extends " +
            (packageName.equals("org.melati.poem") && name.equalsIgnoreCase("Poem") ?
                 "Database" : "PoemDatabase") + " {\n" +
            "\n");

    for (Enumeration t = tables.elements(); t.hasMoreElements();)
      ((TableDef)t.nextElement()).generateTableDeclJava(w);

    w.write("\n" +
            "  protected " + databaseBaseClass + "() {\n");

    for (Enumeration t = tables.elements(); t.hasMoreElements();)
      ((TableDef)t.nextElement()).generateTableDefnJava(w);

    w.write("  }\n");

    for (Enumeration t = tables.elements(); t.hasMoreElements();) {
      w.write('\n');
      ((TableDef)t.nextElement()).generateTableAccessorJava(w);
    }
    w.write("}\n");
  }

  public void generateDatabaseJava(Writer w) throws IOException {
    w.write("public class " + databaseClass +
                " extends " + databaseBaseClass + " {\n" +
            "  // programmer's domain-specific code here\n" +
            "}\n");
  }

  public void generateJava() throws IOException {
    final DSD this_ = this;

    createJava(databaseBaseClass,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseBaseJava(w);
                 }
               });

    createJava(databaseClass,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseJava(w);
                 }
               },
               false);

    for (Enumeration t = tables.elements(); t.hasMoreElements();)
      ((TableDef)t.nextElement()).generateJava();
  }

  public static void main(String[] args) throws Exception {
    new DSD(args[0]).generateJava();
  }
}
