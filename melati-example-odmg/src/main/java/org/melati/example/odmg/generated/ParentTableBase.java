// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.odmg.playing.generated;

import org.melati.poem.odmg.playing.*;
import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.poem.*;

public class ParentTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;

  public ParentTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public ParentTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public PlayingDatabase getPlayingDatabase() {
    return (PlayingDatabase)getDatabase();  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id", new TroidPoemType(), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Parent)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Parent)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((Parent)g).getIdField();
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
            return ((Parent)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Parent)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Parent)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Parent)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Parent)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Parent)g).setName((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((Parent)g).getNameField();
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Parent)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Parent)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Parent)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Parent)g).setName((String)raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public Parent getParentObject(Integer troid) {
    return (Parent)getObject(troid);
  }

  public Parent getParentObject(int troid) {
    return (Parent)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Parent();
  }
  protected int defaultDisplayOrder() {
    return 0;
  }
}
