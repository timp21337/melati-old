// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import org.melati.util.*;

public class SettingTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;
  private Column col_value = null;

  public SettingTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public SettingTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public PoemDatabase getPoemDatabase() {
    return (PoemDatabase)getDatabase();  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Setting)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Setting)g).setId((Integer)cooked);
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
            return ((Setting)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Setting)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Setting)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Setting)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Setting)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Setting)g).setName((String)cooked);
          }

          protected boolean defaultPrimaryDisplay() {
            return true;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "The name of the setting";
          }

          protected boolean defaultUnique() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Setting)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Setting)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Setting)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Setting)g).setName((String)raw);
          }
        });

    defineColumn(col_value =
        new Column(this, "value", new StringPoemType(false, -1), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Setting)g).getValue();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Setting)g).setValue((String)cooked);
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "The value of the setting";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Setting)g).getValue_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Setting)g).setValue_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Setting)g).getValue();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Setting)g).setValue((String)raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public final Column getValueColumn() {
    return col_value;
  }

  public Setting getSettingObject(Integer troid) {
    return (Setting)getObject(troid);
  }

  public Setting getSettingObject(int troid) {
    return (Setting)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Setting();
  }
  protected String defaultDescription() {
    return "A configurable setting for the application";
  }

  protected String defaultCategory() {
    return "System";
  }

  protected int defaultDisplayOrder() {
    return 1;
  }
}
