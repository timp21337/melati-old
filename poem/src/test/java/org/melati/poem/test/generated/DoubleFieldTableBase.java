// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.DoublePoemType;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.DoubleField;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>DoubleField</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class DoubleFieldTableBase extends EverythingTable {

  private Column<Integer> col_id = null;
  private Column<Double> col_doublefield = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public DoubleFieldTableBase(
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
            return ((DoubleField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((DoubleField)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((DoubleField)g).getIdField();
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
            return ((DoubleField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((DoubleField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((DoubleField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((DoubleField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_doublefield =
        new Column<Double>(this, "doublefield",
                   new DoublePoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((DoubleField)g).getDoublefield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((DoubleField)g).setDoublefield((Double)cooked);
          }

          public Field<Double> asField(Persistent g) {
            return ((DoubleField)g).getDoublefieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Double Field";
          }

          protected int defaultDisplayOrder() {
            return 6;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((DoubleField)g).getDoublefield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((DoubleField)g).setDoublefield_unsafe((Double)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((DoubleField)g).getDoublefield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((DoubleField)g).setDoublefield((Double)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>DoubleField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Doublefield</code> <code>Column</code> for this 
  * <code>DoubleField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the doublefield <code>Column</code>
  */
  public final Column<Double> getDoublefieldColumn() {
    return col_doublefield;
  }


 /**
  * Retrieve the <code>DoubleField</code> as a <code>DoubleField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public DoubleField getDoubleFieldObject(Integer troid) {
    return (DoubleField)getObject(troid);
  }


 /**
  * Retrieve the <code>DoubleField</code> 
  * as a <code>DoubleField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public DoubleField getDoubleFieldObject(int troid) {
    return (DoubleField)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new DoubleField();
  }
  protected String defaultDisplayName() {
    return "Double Field";
  }

  protected String defaultDescription() {
    return "A table with only a double field in it";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 22;
  }
}

