// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import java.sql.Date;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DatePoemType;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.DateField;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>DateField</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class DateFieldTableBase extends EverythingTable {

  private Column<Integer> col_id = null;
  private Column<Date> col_datefield = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public DateFieldTableBase(
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
            return ((DateField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((DateField)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((DateField)g).getIdField();
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
            return ((DateField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((DateField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((DateField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((DateField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_datefield =
        new Column<Date>(this, "datefield",
                   new DatePoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((DateField)g).getDatefield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((DateField)g).setDatefield((Date)cooked);
          }

          public Field<Date> asField(Persistent g) {
            return ((DateField)g).getDatefieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Date Field";
          }

          protected int defaultDisplayOrder() {
            return 5;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((DateField)g).getDatefield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((DateField)g).setDatefield_unsafe((Date)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((DateField)g).getDatefield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((DateField)g).setDatefield((Date)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>DateField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Datefield</code> <code>Column</code> for this 
  * <code>DateField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the datefield <code>Column</code>
  */
  public final Column<Date> getDatefieldColumn() {
    return col_datefield;
  }


 /**
  * Retrieve the <code>DateField</code> as a <code>DateField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public DateField getDateFieldObject(Integer troid) {
    return (DateField)getObject(troid);
  }


 /**
  * Retrieve the <code>DateField</code> 
  * as a <code>DateField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public DateField getDateFieldObject(int troid) {
    return (DateField)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new DateField();
  }
  protected String defaultDisplayName() {
    return "Date Field";
  }

  protected String defaultDescription() {
    return "A table with only a date field in it";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 20;
  }
}

