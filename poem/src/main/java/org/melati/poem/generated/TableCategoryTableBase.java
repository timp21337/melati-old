// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.Column;
import org.melati.poem.Persistent;
import org.melati.poem.Field;
import org.melati.poem.PoemException;
import org.melati.poem.AccessPoemException;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.Table;
import org.melati.poem.PoemDatabaseTables;

import org.melati.poem.StringPoemType;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.TableCategory;
import org.melati.poem.DisplayLevel;


/**
 * Melati POEM generated base class for table TableCategory.
 * Field summary for SQL table tablecategory:
 *   id
 *   name
 *
 */
public class TableCategoryTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;

  public TableCategoryTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public TableCategoryTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableCategory)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableCategory)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableCategory)g).getIdField();
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
            return ((TableCategory)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableCategory)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableCategory)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableCategory)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name",
                   new StringPoemType(false, 60),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableCategory)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableCategory)g).setName((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableCategory)g).getNameField();
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
            return "A human-readable name for the category";
          }

          protected boolean defaultUnique() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableCategory)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableCategory)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableCategory)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableCategory)g).setName((String)raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public TableCategory getTableCategoryObject(Integer troid) {
    return (TableCategory)getObject(troid);
  }

  public TableCategory getTableCategoryObject(int troid) {
    return (TableCategory)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new TableCategory();
  }
  protected String defaultDisplayName() {
    return "Table type";
  }

  protected String defaultDescription() {
    return "A category under which a table can be classified";
  }

  protected boolean defaultRememberAllTroids() {
    return true;
  }

  protected Integer defaultCacheLimit() {
    return new Integer(999999999);
  }

  protected String defaultCategory() {
    return "System";
  }

  protected int defaultDisplayOrder() {
    return 3030;
  }
}
