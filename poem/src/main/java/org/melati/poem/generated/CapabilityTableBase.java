// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.*;
import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;

public class CapabilityTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;

  public CapabilityTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public CapabilityTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id", new TroidPoemType(), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Capability)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Capability)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((Capability)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Capability)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Capability)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Capability)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Capability)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Capability)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Capability)g).setName((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((Capability)g).getNameField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "A human-readable name for the capability";
          }

          protected boolean defaultUnique() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Capability)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Capability)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Capability)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Capability)g).setName((String)raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public Capability getCapabilityObject(Integer troid) {
    return (Capability)getObject(troid);
  }

  public Capability getCapabilityObject(int troid) {
    return (Capability)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Capability();
  }
  protected String defaultDescription() {
    return "A capability which users can be required to possess before accessing data";
  }

  protected boolean defaultRememberAllTroids() {
    return true;
  }

  protected String defaultCategory() {
    return "User";
  }

  protected int defaultDisplayOrder() {
    return 2030;
  }
}
