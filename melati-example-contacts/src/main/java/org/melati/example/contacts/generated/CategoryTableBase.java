// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.example.contacts.generated;

import org.melati.example.contacts.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.poem.*;

public class CategoryTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;

  public CategoryTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public CategoryTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public ContactsDatabaseTables getContactsDatabaseTables() {
    return (ContactsDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id", new TroidPoemType(), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Category)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Category)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((Category)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Category)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Category)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Category)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Category)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, -1), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Category)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Category)g).setName((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((Category)g).getNameField();
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
            return "Category Name";
          }

          protected int defaultWidth() {
            return 20;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Category)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Category)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Category)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Category)g).setName((String)raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public Category getCategoryObject(Integer troid) {
    return (Category)getObject(troid);
  }

  public Category getCategoryObject(int troid) {
    return (Category)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Category();
  }
  protected String defaultDescription() {
    return "A Category for Contacts";
  }

  protected String defaultCategory() {
    return "Codes";
  }

  protected int defaultDisplayOrder() {
    return 100;
  }
}
