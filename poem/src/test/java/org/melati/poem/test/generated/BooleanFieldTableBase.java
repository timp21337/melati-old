// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.BooleanField;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>BooleanField</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class BooleanFieldTableBase extends EverythingTable {

  private Column<Integer> col_id = null;
  private Column<Boolean> col_booleanfield = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public BooleanFieldTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Get the database tables.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }

  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column<Integer>(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((BooleanField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((BooleanField)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((BooleanField)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Id";
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          protected boolean defaultIndexed() {
            return true;
          }

          protected boolean defaultUnique() {
            return true;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((BooleanField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((BooleanField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((BooleanField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((BooleanField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_booleanfield =
        new Column<Boolean>(this, "booleanfield",
                   new BooleanPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((BooleanField)g).getBooleanfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((BooleanField)g).setBooleanfield((Boolean)cooked);
          }

          public Field<Boolean> asField(Persistent g) {
            return ((BooleanField)g).getBooleanfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Boolean Field";
          }

          protected int defaultDisplayOrder() {
            return 4;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((BooleanField)g).getBooleanfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((BooleanField)g).setBooleanfield_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((BooleanField)g).getBooleanfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((BooleanField)g).setBooleanfield((Boolean)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>BooleanField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Booleanfield</code> <code>Column</code> for this 
  * <code>BooleanField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the booleanfield <code>Column</code>
  */
  public final Column<Boolean> getBooleanfieldColumn() {
    return col_booleanfield;
  }


 /**
  * Retrieve the <code>BooleanField</code> as a <code>BooleanField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public BooleanField getBooleanFieldObject(Integer troid) {
    return (BooleanField)getObject(troid);
  }


 /**
  * Retrieve the <code>BooleanField</code> 
  * as a <code>BooleanField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public BooleanField getBooleanFieldObject(int troid) {
    return (BooleanField)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new BooleanField();
  }
  protected String defaultDisplayName() {
    return "Boolean Field";
  }

  protected String defaultDescription() {
    return "A table with only a boolean field in it";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 18;
  }
}

