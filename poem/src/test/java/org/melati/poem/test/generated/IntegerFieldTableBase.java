// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;
import org.melati.poem.test.IntegerField;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>IntegerField</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class IntegerFieldTableBase extends EverythingTable {

  private Column<Integer> col_id = null;
  private Column<Integer> col_integerfield = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public IntegerFieldTableBase(
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
            return ((IntegerField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((IntegerField)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((IntegerField)g).getIdField();
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
            return ((IntegerField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((IntegerField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((IntegerField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((IntegerField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_integerfield =
        new Column<Integer>(this, "integerfield",
                   new IntegerPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((IntegerField)g).getIntegerfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((IntegerField)g).setIntegerfield((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((IntegerField)g).getIntegerfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Integer Field";
          }

          protected int defaultDisplayOrder() {
            return 7;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((IntegerField)g).getIntegerfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((IntegerField)g).setIntegerfield_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((IntegerField)g).getIntegerfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((IntegerField)g).setIntegerfield((Integer)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>IntegerField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Integerfield</code> <code>Column</code> for this 
  * <code>IntegerField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the integerfield <code>Column</code>
  */
  public final Column<Integer> getIntegerfieldColumn() {
    return col_integerfield;
  }


 /**
  * Retrieve the <code>IntegerField</code> as a <code>IntegerField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public IntegerField getIntegerFieldObject(Integer troid) {
    return (IntegerField)getObject(troid);
  }


 /**
  * Retrieve the <code>IntegerField</code> 
  * as a <code>IntegerField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public IntegerField getIntegerFieldObject(int troid) {
    return (IntegerField)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new IntegerField();
  }
  protected String defaultDisplayName() {
    return "Integer Field";
  }

  protected String defaultDescription() {
    return "A table with only an integer field in it";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 24;
  }
}

