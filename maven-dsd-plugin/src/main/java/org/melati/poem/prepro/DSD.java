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

package org.melati.poem.prepro;

import java.util.*;
import java.io.*;
import org.melati.util.*;

public class DSD {

  public static final String autogenStamp =
  "// Do not edit this file!  " +
  "It was generated by Melati POEM's DSD preprocessor.";

  private final Vector packageComponents = new Vector();
  public final String packageName;
  private final File dsdFile, dsdDir, dsdDirGen;
  private final String name;
  final String databaseClass, databaseBaseClass;
  final String databaseTablesClass, databaseTablesBaseClass;
  TableNamingStore nameStore;

  /* All tables defined in this DSD */
  final Vector tablesInPackage = new Vector();

  /* All tables defined in this, and any imported, DSDs including Poem.dsd */
  final Vector tablesInDatabase = new Vector();

  /* A list of imported DSDs */
  final Vector importedDSDs = new Vector();

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

  public DSD(String file) throws IOException, ParsingDSDException,
                            IllegalityException, ResourceNotFoundException {
    this(file, new TableNamingStore(), true);
  }

  public DSD(String file, TableNamingStore names, boolean includeMelati)
                      throws IOException, ParsingDSDException,
                             IllegalityException, ResourceNotFoundException {
    nameStore = names;
    dsdFile = new File(file);
    String dsdFileName = dsdFile.getName();
    int dot = dsdFileName.lastIndexOf('.');
    name = dot == -1 ? dsdFileName : dsdFileName.substring(0, dot);

    String nAme = StringUtils.capitalised(name);
    databaseClass = nAme + "Database";
    databaseBaseClass = nAme + "DatabaseBase";
    databaseTablesClass = nAme + "DatabaseTables";
    databaseTablesBaseClass = nAme + "DatabaseTablesBase";
    dsdDir = new File(new File(dsdFile.getAbsolutePath()).getParent());
    dsdDirGen = new File(
                  dsdDir.getAbsolutePath() + File.separator + "generated");

    /* Read in the default Poem tables, if appropriate */
    if (includeMelati && !"Poem".equals(nAme)) {
      DSD melatiDSD = new DSD(filePath("org.melati.poem.Poem.dsd"),
                              nameStore, false);
      Vector melatiTables = melatiDSD.tablesInPackage;
      for(int i = 0; i < melatiTables.size(); i++)
        tablesInDatabase.addElement(melatiTables.elementAt(i));
    }

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

      /* Read in imported databases */
      for (int t = 0; tokens.ttype != StreamTokenizer.TT_EOF; ++t) {

        if (!tokens.sval.equals("import"))
          break;

        if (tokens.nextToken() != StreamTokenizer.TT_WORD)
          throw new ParsingDSDException("<import component>", tokens);

        String importDSD = tokens.sval;
        tokens.nextToken();
        expect(tokens, ';');
        tokens.nextToken();

        DSD dsd = new DSD(filePath(importDSD), nameStore, false);
        importedDSDs.addElement(dsd);

        Vector packageTables = dsd.tablesInPackage;
        for(int i = 0; i < packageTables.size(); i++)
          tablesInDatabase.addElement(packageTables.elementAt(i));
      }

      /* Read in tables */
      for (int t = 0; tokens.ttype != StreamTokenizer.TT_EOF; ++t) {
        boolean isAbstract;

        if (tokens.ttype != StreamTokenizer.TT_WORD)
          throw new ParsingDSDException("table", tokens);

        if (tokens.sval.equals("abstract")) {
          isAbstract = true;
          tokens.nextToken();
        } else
          isAbstract = false;

        expect(tokens, "table");

        tokens.nextToken();
        TableDef table = new TableDef(this, tokens, t, isAbstract, nameStore);
        tablesInPackage.addElement(table);
        tablesInDatabase.addElement(table);
      }
    } finally {
      reader.close();
    }
  }

  void createJava(String name, Generator proc, boolean overwrite)
                                                         throws IOException {
    if (!dsdDirGen.exists()) {
      dsdDirGen.mkdir();
    }
    File f = null;
    if (overwrite) {
      f = new File(dsdDirGen, name + ".java");
    } else {
      f = new File(dsdDir, name + ".java");
    }
    if (f.exists())
      if (overwrite) {
        BufferedReader r = new BufferedReader(new FileReader(f));
        try {
          String firstLine = r.readLine();
          if (firstLine == null || firstLine.equals(autogenStamp))
            System.err.println("Replacing " + f);
          else
            throw new TargetExistsDSDException(f);
        } finally {
          r.close();
        }
      } else {
        System.err.println("Leaving existing " + f);
        return;
      } else
      System.err.println("Creating " + f);

    Writer w = new BufferedWriter(new FileWriter(f));
    try {
      if (overwrite) {
        w.write(autogenStamp + "\n" +
                "\n");
        w.write("package " + packageName + ".generated;\n" +
                "\n");
        writeImports(w, name, false);

      } else {
        w.write("package " + packageName + ";\n" +
                "\n");
        writeImports(w, name, true);
      }

      w.write("\n");

      proc.process(w);
    } catch (IOException e) {
      try {
        w.close();
      } catch (Exception ee) {
      }
      try {
        f.delete();
      } catch (Exception ee) {
      }
      throw e;
    }

    w.close();
  }

  void writeImports(Writer w, String name, boolean generated)
                                                          throws IOException {

    for (int i = 0; i < tablesInDatabase.size(); i++) {
      TableDef def = (TableDef)tablesInDatabase.elementAt(i);
      if (!def.naming.mainClassShortName().equals(name))
        w.write(def.naming.includeMainString());
      if (!def.naming.tableMainClassShortName().equals(name))
        w.write(def.naming.includeTableString());
    }

    w.write("import " + packageName +
            (generated ? ".generated" : "") +
            ".*;\n");

    for (int j = 0; j < importedDSDs.size(); j++) {
      DSD dsd = (DSD)importedDSDs.elementAt(j);
      w.write("import " + dsd.packageName + ".*;\n");
    }

    w.write("import java.util.*;\n" +
            "import java.sql.Date;\n" + // FIXME hack!
            "import java.sql.Timestamp;\n" // FIXME hack!
			);

    if (!packageName.equals("org.melati.poem"))
      w.write("import org.melati.poem.*;\n");
  }

  void createJava(String name, Generator proc) throws IOException {
    createJava(name, proc, true);
  }

  public void generateDatabaseBaseJava(Writer w) throws IOException {
    w.write("public class " + databaseBaseClass + " extends " +
            (packageName.equals("org.melati.poem") &&
                 name.equalsIgnoreCase("Poem") ?
               "Database" : "PoemDatabase") +" {\n\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden &&
          (!td.naming.tableFQName.startsWith("org.melati.poem") ||
           (packageName.equals("org.melati.poem") &&
            name.equalsIgnoreCase("Poem"))))
        td.generateTableDeclJava(w);
    }

    w.write("\n" +
            "  protected " + databaseBaseClass + "() {\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden &&
          (!td.naming.tableFQName.startsWith("org.melati.poem") ||
           (packageName.equals("org.melati.poem") &&
            name.equalsIgnoreCase("Poem"))))
        td.generateTableDefnJava(w);
    }

    w.write("  }\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden &&
          (!td.naming.tableFQName.startsWith("org.melati.poem") ||
           (packageName.equals("org.melati.poem") &&
            name.equalsIgnoreCase("Poem")))) {
        w.write('\n');
        td.generateTableAccessorJava(w);
      }
    }
    w.write("}\n");
  }

  public void generateDatabaseJava(Writer w) throws IOException {
    w.write("public class " + databaseClass +
            " extends " + databaseBaseClass +
            "\n                            implements " + databaseTablesClass);
    w.write(" {\n" +
            "  // programmer's domain-specific code here\n" +
            "}\n");
  }

  public void generateDatabaseTablesBaseJava(Writer w) throws IOException {
    w.write("public interface " + databaseTablesBaseClass);
    boolean first = true;
    for (Enumeration t = importedDSDs.elements(); t.hasMoreElements();) {
      DSD dsd = ((DSD)t.nextElement());
      if (first) {
        w.write("\n                       extends " + dsd.databaseTablesClass);
        first = false;
      }
      else {
        w.write(",\n                               " + dsd.databaseTablesClass);
      }
    }
    w.write(" {\n\n");
    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
//      if (!td.naming.hidden &&
//          (!td.naming.tableFQName.startsWith("org.melati.poem") ||
//           (packageName.equals("org.melati.poem") &&
//            name.equalsIgnoreCase("Poem"))))
      if (!td.naming.hidden)
        td.generateTableAccessorDefnJava(w);
    }
    w.write("}\n");
  }

  public void generateDatabaseTablesJava(Writer w) throws IOException {
    w.write("public interface " + databaseTablesClass +
            " extends " + databaseTablesBaseClass + " {\n" +
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

    createJava(databaseTablesBaseClass,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseTablesBaseJava(w);
                 }
               });

    createJava(databaseTablesClass,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseTablesJava(w);
                 }
               },
               false);

    for (Enumeration t = tablesInPackage.elements(); t.hasMoreElements();)
      ((TableDef)t.nextElement()).generateJava();
  }

  /**
   * This returns the path to a file (which we assume is a DSD) by
   * finding the Database class it generated and which the user has
   * compiled.
   */
  String filePath(String resource) throws ResourceNotFoundException {
    int ext = resource.lastIndexOf('.');
    if (ext == -1)
      throw new ResourceNotFoundException(resource,
        "I can't find the type of this resource (i.e. the file's extension)");
    int file = resource.lastIndexOf('.', ext - 1);
    if (file == -1)
      throw new ResourceNotFoundException(resource,
                  "I can't find a package name for this resource");
    String packageName = resource.substring(0, file);
    String fileName = resource.substring(file + 1, ext);
    String extension = resource.substring(ext + 1);
    String fileToLookFor = fileName + "." + extension;
    String databaseName = StringUtils.capitalised(fileName.toLowerCase()) +
                            "Database";
    Class database;
    try {
      database = Class.forName(packageName + "." + databaseName);
    } catch (Exception e) {
      throw new ResourceNotFoundException(resource,
                  "I can't find the database class associated with this "+
                  "resource (" + packageName + "." + databaseName + "). " +
                  "Is it in your classpath?");
    }
    java.net.URL url = database.getResource(fileToLookFor);
    if (url == null || url.getFile() == null || url.getFile().equals(""))
      throw new ResourceNotFoundException(resource,
                  "I can't find the resource from the database class file. "+
                  "Is the resource in your classpath?");
    return url.getFile();
  }

  public static void main(String[] args) throws Exception {
    DSD dsd = new DSD(args[0]);
    dsd.generateJava();
  }

}
