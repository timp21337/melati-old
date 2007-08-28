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

import java.util.Enumeration;
import java.util.Vector;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.io.IOException;

/**
 * The <code>DSD</code> class is an application which parses a DSD
 * (Data Structure Definition) file and outputs Java code, creating
 * a POEM view of a database.
 * <p>
 * The generated files are placed in the current directory, which is
 * assumed to be similar to <code>org/paneris/myapp/model/</code> and
 * also in a new directory below it called <code>generated</code>.
 *
 * @author  William Chesters
 */

public class DSD {

  static final String autogenStamp =
  "// Do not edit this file!  " +
  "It was generated by Melati POEM's DSD preprocessor.";

  private final Vector packageComponents = new Vector();
  final String packageName;
  private final File dsdFile, dsdDir, dsdDirGen;
  private final String name;
  final String databaseClassName, databaseBaseClassName;
  final String databaseTablesClassName, databaseTablesBaseClassName;
  /** The project name*/
  final String projectName;
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

 /**
  * Constructor.
  *
  * @param file  the name of the DSD file to open
  * @throws ResourceNotFoundException
  *    if a DSD file cannot be found
  * @throws ParsingDSDException
  *    if an unexpected token is encountered
  * @throws IllegalityException
  *    if a semantic incoherence is detected
  * @throws IOException
  *    if a problem with the file system is encountered
  */
  public DSD(String file) throws IOException, ParsingDSDException,
                            IllegalityException, ResourceNotFoundException {
    this(file, new TableNamingStore(), true);
  }

 /**
  * Constructor.
  *
  * @param file  the name of the DSD file to open
  * @param names a {@link TableNamingStore} containing names encountered so far
  * @param includePoem whether to include the Poem tables
  * @throws ResourceNotFoundException
  *    if a DSD file cannot be found
  * @throws ParsingDSDException
  *    if an unexpected token is encountered
  * @throws IllegalityException
  *    if a semantic incoherence is detected
  * @throws IOException
  *    if a problem with the file system is encountered
  */
  public DSD(String file, TableNamingStore names, boolean includePoem)
      throws ResourceNotFoundException, ParsingDSDException,
             IllegalityException, IOException {
    nameStore = names;
    dsdFile = new File(file);
    String dsdFileName = dsdFile.getName();
    int dot = dsdFileName.lastIndexOf('.');
    name = dot == -1 ? dsdFileName : dsdFileName.substring(0, dot);

    projectName = StringUtils.capitalised(name);
    databaseClassName = projectName + "Database";
    databaseBaseClassName = projectName + "DatabaseBase";
    databaseTablesClassName = projectName + "DatabaseTables";
    databaseTablesBaseClassName = projectName + "DatabaseTablesBase";
    dsdDir = new File(new File(dsdFile.getAbsolutePath()).getParent());
    dsdDirGen = new File(
                  dsdDir.getAbsolutePath() + File.separator + "generated");

    /* Read in the default Poem tables, if appropriate */
    if (includePoem && !"Poem".equals(projectName)) {
      DSD poemDSD = new DSD(filePath("org.melati.poem.Poem.dsd"),
                            nameStore, false);
      Vector poemTables = poemDSD.tablesInPackage;
      for(int i = 0; i < poemTables.size(); i++)
        tablesInDatabase.addElement(poemTables.elementAt(i));
    }
    Reader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException e) {
      if (file.indexOf("!") != -1) {
        String resourceName = file.substring(file.indexOf("!") + 2);
        reader = new BufferedReader(
                   new InputStreamReader(Thread.currentThread()
                        .getContextClassLoader()
                          .getResourceAsStream(resourceName)));
      } else
        throw e;
    }
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

  void createJava(String nameP, Generator proc, boolean overwrite)
      throws IOException {
    if (!dsdDirGen.exists()) {
      dsdDirGen.mkdir();
    }
    File f = null;
    if (overwrite) {
      f = new File(dsdDirGen, nameP + ".java");
    } else {
      f = new File(dsdDir, nameP + ".java");
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
      }
    else
      System.err.println("Creating " + f);

    Writer w = new BufferedWriter(new FileWriter(f));
    try {
      if (overwrite) {
        w.write(autogenStamp + "\n" + "\n");
        w.write("package " + packageName + ".generated;\n" + "\n");
      } else {
        w.write("package " + packageName + ";\n" + "\n");
      }

      proc.process(w);
    } catch (IOException e) {
      try {
        w.close();
      } catch (Exception ee) {
        // If we fail here the cause is reported below
        ee = null; // shut PMD up
      }
      try {
        f.delete();
      } catch (Exception ee) {
        // If we fail here the cause is reported below
        ee = null; // shut PMD up
      }
      throw e;
    }
    w.write("\n");
    w.close();
  }

  void createPackageHTML(Generator proc, boolean overwrite)
      throws IOException {
    File f = null;
    if (overwrite) {
      f = new File(dsdDirGen, "package.html");
    } else {
      f = new File(dsdDir, "package.html");
    }
    if (f.exists()) {
      if (overwrite) {
        BufferedReader r = new BufferedReader(new FileReader(f));
        try {
          for(int i = 0; i < 8; i++) {r.readLine(); }
          String ninthLine = r.readLine();
          if (ninthLine == null || ninthLine.indexOf(autogenStamp) != -1)
            System.err.println("Replacing " + f);
          else {
            System.err.println(ninthLine);
            throw new TargetExistsDSDException(f);
          }
        } finally {
          r.close();
        }
      } else {
        System.err.println("Leaving existing " + f);
        return;
      }
    } else
      System.err.println("Creating " + f);

    Writer w = new BufferedWriter(new FileWriter(f));
    try {
      w.write("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n" +
              "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n" +
              "   \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
              "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
              "<head>\n" +
              " <meta http-equiv=\"Content-Type\" content=\"text/html; charset=us-ascii\" />\n" +
              " <title>" + packageName);
      if (overwrite)
        w.write(".generated");
      w.write("</title>\n" +
              "</head>\n" +
              "<!-- " + autogenStamp + "-->\n" +
              "<body>\n");
      proc.process(w);

      w.write("</body>\n" +
              "</html>\n" +
              "\n");
    } catch (IOException e) {
      try {
        w.close();
      } catch (Exception ee) {
        // If we fail here the cause is reported below
        ee = null; // shut PMD up
      }
      try {
        f.delete();
      } catch (Exception ee) {
        // If we fail here the cause is reported below
        ee = null; // shut PMD up
      }
      throw e;
    }
    w.write("\n");
    w.close();
  }


  void generateDatabaseBaseJava(Writer w) throws IOException {
    if (packageName.equals("org.melati.poem")) {
      w.write("import org.melati.poem.Database;\n");
    } else {
      w.write("import org.melati.poem.PoemDatabase;\n");
    }
    w.write("import org.melati.poem.DefinitionSource;\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!(td.naming.hidden || td.isAbstract))
        w.write(td.naming.importTableString());
    }

    w.write("\n" +
            "/**\n" +
            " * Melati POEM generated Database base class.\n" +
            " */\n");
    w.write("public class " + databaseBaseClassName + " extends " +
            (packageName.equals("org.melati.poem") &&
                 name.equalsIgnoreCase("Poem") ?
               "Database" : "PoemDatabase") +" {\n\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden)
        td.generateTableDeclJava(w);
    }

    w.write("\n" +
            "  protected " + databaseBaseClassName + "() {\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden)
        td.generateTableDefnJava(w);
    }

    w.write("  }\n");

    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden) {
        w.write('\n');
        td.generateTableAccessorJava(w);
      }
    }
    w.write("}\n\n");
  }

  void generateDatabaseJava(Writer w) throws IOException {
    w.write("import " + packageName + ".generated." +
              databaseBaseClassName + ";\n");
    w.write("\n" +
            "/**\n" +
            " * Melati POEM generated, programmer modifiable stub.\n" +
            " */\n");
    w.write("public class " + databaseClassName +
            " extends " + databaseBaseClassName +
            "\n                            implements " + databaseTablesClassName);
    w.write(" {\n" +
            "  // programmer's domain-specific code here\n" +
            "}\n\n");
  }

  void generateDatabaseTablesBaseJava(Writer w) throws IOException {
    w.write("// " + tablesInDatabase.size() + " tables in database\n");
    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (td.isAbstract) w.write("// abstract ");
      if (td.naming.hidden) w.write ("// hidden ");
      if (td.naming.hidesOther) w.write ("// hides ");
      w.write(td.naming.importTableString());

    }
    for (int j = 0; j < importedDSDs.size(); j++) {
      DSD dsd = (DSD)importedDSDs.elementAt(j);
      w.write("import " + dsd.packageName + "."+
              dsd.databaseTablesClassName + ";\n");
    }

    w.write("\n" +
            "/**\n" +
            " * Melati POEM generated base interface to the tables in \n" +
            " * " + packageName + ".\n" +
            " */\n");
    w.write("public interface " + databaseTablesBaseClassName);
    boolean first = true;
    for (Enumeration t = importedDSDs.elements(); t.hasMoreElements();) {
      DSD dsd = ((DSD)t.nextElement());
      if (first) {
        w.write("\n                       extends " + dsd.databaseTablesClassName);
        first = false;
      }
      else {
        w.write(",\n                               " +
                dsd.databaseTablesClassName);
      }
    }
    w.write(" {\n\n");
    for (Enumeration t = tablesInDatabase.elements(); t.hasMoreElements();) {
      TableDef td = ((TableDef)t.nextElement());
      if (!td.naming.hidden)
        td.generateTableAccessorDefnJava(w);
    }
    w.write("}\n\n");
  }

  void generateDatabaseTablesJava(Writer w) throws IOException {
    w.write("import " + packageName + ".generated." +
              databaseTablesBaseClassName + ";\n");
    w.write("\n" +
            "/**\n" +
            " * Melati POEM generated, " +
            "programmer modifiable interface stub.\n" +
            " */\n");
    w.write("public interface " + databaseTablesClassName +
            " extends " + databaseTablesBaseClassName + " {\n" +
            "  // programmer's domain-specific code here\n" +
            "}\n\n");
  }

  /**
   * Generate the project table from which all project tables inherit. 
   * 
   * @param w the project table writer
   */
  void generateProjectTableJava(Writer w) throws IOException {
    w.write("import org.melati.poem.Table;\n");
    w.write("import org.melati.poem.DefinitionSource;\n");
    w.write("import org.melati.poem.Database;\n");
    w.write("import org.melati.poem.PoemException;\n");

    w.write("\n" +
            "/**\n" +
            " * Melati POEM generated, " +
            "programmer modifyable inheritance hook.\n" +
            " */\n");
    w.write("public class " + getProjectTableClassName() +
            " extends Table {\n");
    
    w.write("\n /**\n" + "  * Constructor. \n" + "  * \n" 
            + "  * @generator " + "org.melati.poem.prepro.DSD" + "#generateProjectTableJava \n"
            + "  * @param database          the POEM database we are using\n"
            + "  * @param name              the name of this <code>Table</code>\n"
            + "  * @param definitionSource  which definition is being used\n"
            + "  * @throws PoemException    if anything goes wrong\n" + "  */\n");

    w.write("\n" + "  public " + getProjectTableClassName() + "(\n"
            + "      Database database, String name,\n"
            + "      DefinitionSource definitionSource)"
            + " throws PoemException {\n"
            + "    super(database, name, definitionSource);\n" + "  }\n" + "\n");

    //w.write("\n /**\n" + "  * Constructor.\n" + "  *\n" 
    //        + "  * @generator " + "org.melati.poem.prepro.DSD" + "#generateProjectTableJava \n"
    //        + "  * @param database          the POEM database we are using\n"
    //        + "  * @param name              the name of this <code>Table</code>\n"
    //        + "  * @throws PoemException    if anything goes wrong\n" + "  */\n");
    //w.write("  public " + getProjectTableClassName() + "(\n"
    //        + "      Database database, String name)" + " throws PoemException {\n"
    //        + "    this(database, name, DefinitionSource.dsd);\n" + "  }\n" + "\n");

    w.write("  // programmer's domain-specific code here\n" +
    "}\n\n");
  }
  
  /**
   * Generate the java files.
   */
  void generateJava() throws IOException, IllegalityException {
    final DSD this_ = this;

    createJava(databaseBaseClassName,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseBaseJava(w);
                 }
               },
               true);

    createJava(databaseClassName,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseJava(w);
                 }
               },
               false);

    createJava(databaseTablesBaseClassName,
               new Generator() {
                 public void process(Writer w) throws IOException {
                   this_.generateDatabaseTablesBaseJava(w);
                 }
               },
               true);

    createJava(databaseTablesClassName,
            new Generator() {
              public void process(Writer w) throws IOException {
                this_.generateDatabaseTablesJava(w);
              }
            },
            false);

    createJava(getProjectTableClassName(),
            new Generator() {
              public void process(Writer w) throws IOException {
                this_.generateProjectTableJava(w);
              }
            },
            false);
    
    // Create a default package.html if it does not exist
    createPackageHTML(new Generator() {
      public void process(Writer w) throws IOException {
        w.write("<p>The POEM-generated model classes for " +
        packageName + ".</p>\n");
      }
    }, false);

    // Create a package.html for the generated files
    createPackageHTML(new Generator() {
      public void process(Writer w) throws IOException {
        w.write("<p>The POEM-generated support classes for " +
        packageName + ".</p>\n");
      }
    }, true);

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
    String packageNameLocal = resource.substring(0, file);
    String fileName = resource.substring(file + 1, ext);
    String extension = resource.substring(ext + 1);
    String fileToLookFor = fileName + "." + extension;
    String databaseName = StringUtils.capitalised(fileName.toLowerCase()) +
                            "Database";
    Class database;
    try {
      database = Class.forName(packageNameLocal + "." + databaseName);
    } catch (Exception e) {
      throw new ResourceNotFoundException(resource,
                  "I can't find the database class associated with this "+
                  "resource (" + packageNameLocal + "." + databaseName + "). " +
                  "Is it in your classpath?");
    }
    java.net.URL url = database.getResource(fileToLookFor);
    if (url == null || url.getFile() == null || url.getFile().equals(""))
      throw new ResourceNotFoundException(resource,
                  "I can't find the resource from the database class file. "+
                  "Is " + fileToLookFor +" in your classpath?");
    return url.getFile();
  }


  static String javadocFormat(String indent2,
                                     String string) {
      return javadocFormat(2,Integer.parseInt(indent2), string);
  }
  static String javadocFormat(String string) {
      return javadocFormat(2, 1, string);
  }
  static String javadocFormat(String indent1, String indent2,
                                     String string) {
      return javadocFormat(Integer.parseInt(indent1),Integer.parseInt(indent2),
                           string);
  }
 /**
  * Format a string to fit an indented javadoc comment.
  *
  * @param indent1 the indentation before the asterisk
  * @param indent2 the indentation after  the asterisk
  * @param string  the <code>String</code> to format
  * @return the formatted string
  */
  static String javadocFormat(int indent1, int indent2, String string) {
    int lineWidth = 77;
    int index = indent1;
    StringBuffer b = new StringBuffer();
    for (int i = 0; i < indent1; i++) b.append(" ");
    b.append("*");
    index += 1;
    for (int i = 0; i < indent2; i++)b.append(" ");
    index += indent2;
    int available = lineWidth - index;
    if (string.length() <= available) {
      b.append(string);
      b.append(" \n");
    } else {
      int prevSpace = string.lastIndexOf(' ',available);
      int incision = available;
      if (prevSpace != -1)
        incision = prevSpace + 1;
      b.append(string.substring(0, incision));
      b.append("\n");
      b.append(javadocFormat(indent1, indent2, string.substring(incision)));
    }
    return b.toString();
  }


 /**
  * Run me.
  * @param args the arument array
  * @throws Exception if an exception occurs
  */
  public static void main(String[] args) throws Exception {
    if (args.length == 1) {
      DSD dsd = new DSD(args[0]);
      dsd.generateJava();
    } else if (args.length == 2) {
      DSD dsd = new DSD(args[0], new TableNamingStore(), false);
      dsd.generateJava();
    } else {
       System.err.println(
          "Usage: java org.melati.poem.prepro.DSD <dsd file> [false]");
    }
  }

  /**
   * @return the name of the class from which all project tables inherit
   */
  public String getProjectTableClassName() {
    return projectName + "Table";
  }

  /**
   * @return the project name
   */
  public String getProjectName() {
    return projectName;
  }

}









