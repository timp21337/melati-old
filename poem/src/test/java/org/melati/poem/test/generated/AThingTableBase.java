// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.Column;
import org.melati.poem.Persistent;
import org.melati.poem.Field;
import org.melati.poem.PoemException;
import org.melati.poem.AccessPoemException;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.Table;
import org.melati.poem.test.TestDatabaseTables;

import org.melati.poem.TroidPoemType;
import org.melati.poem.BinaryPoemType;


/**
 * Melati POEM generated base class for table AThing.
 * Field summary for SQL table athing:
 *   id
 *   binaryfield
 *
 */
public class AThingTableBase extends Table {

  private Column col_id = null;
  private Column col_binaryfield = null;

  public AThingTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public AThingTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public TestDatabaseTables getTestDatabaseTables() {
    return (TestDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((AThing)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((AThing)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((AThing)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((AThing)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((AThing)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((AThing)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((AThing)g).setId((Integer)raw);
          }
        });

    defineColumn(col_binaryfield =
        new Column(this, "binaryfield",
                   new BinaryPoemType(true, 13),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((AThing)g).getBinaryfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((AThing)g).setBinaryfield((byte[])cooked);
          }

          public Field asField(Persistent g) {
            return ((AThing)g).getBinaryfieldField();
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((AThing)g).getBinaryfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((AThing)g).setBinaryfield_unsafe((byte[])raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((AThing)g).getBinaryfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((AThing)g).setBinaryfield((byte[])raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getBinaryfieldColumn() {
    return col_binaryfield;
  }

  public AThing getAThingObject(Integer troid) {
    return (AThing)getObject(troid);
  }

  public AThing getAThingObject(int troid) {
    return (AThing)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new AThing();
  }
  protected int defaultDisplayOrder() {
    return 0;
  }
}
