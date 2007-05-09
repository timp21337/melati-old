// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;
import org.melati.poem.test.StringField;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>StringField</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class StringFieldTableBase extends EverythingTable {

  private Column col_id = null;
  private Column col_stringfield = null;
  private Column col_unlimited = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public StringFieldTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Constructor.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @throws PoemException    if anything goes wrong
  */
  public StringFieldTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((StringField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((StringField)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((StringField)g).getIdField();
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
            return ((StringField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((StringField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((StringField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((StringField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_stringfield =
        new Column(this, "stringfield",
                   new StringPoemType(true, 23),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((StringField)g).getStringfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((StringField)g).setStringfield((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((StringField)g).getStringfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "String Field";
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 3;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((StringField)g).getStringfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((StringField)g).setStringfield_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((StringField)g).getStringfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((StringField)g).setStringfield((String)raw);
          }
        });

    defineColumn(col_unlimited =
        new Column(this, "unlimited",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((StringField)g).getUnlimited();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((StringField)g).setUnlimited((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((StringField)g).getUnlimitedField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Unlimited String Field";
          }

          protected int defaultDisplayOrder() {
            return 3;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 3;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((StringField)g).getUnlimited_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((StringField)g).setUnlimited_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((StringField)g).getUnlimited();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((StringField)g).setUnlimited((String)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>StringField</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Stringfield</code> <code>Column</code> for this 
  * <code>StringField</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the stringfield <code>Column</code>
  */
  public final Column getStringfieldColumn() {
    return col_stringfield;
  }


 /**
  * Retrieves the <code>Unlimited</code> <code>Column</code> for this 
  * <code>StringField</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the unlimited <code>Column</code>
  */
  public final Column getUnlimitedColumn() {
    return col_unlimited;
  }


 /**
  * Retrieve the <code>StringField</code> as a <code>StringField</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public StringField getStringFieldObject(Integer troid) {
    return (StringField)getObject(troid);
  }


 /**
  * Retrieve the <code>StringField</code> 
  * as a <code>StringField</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public StringField getStringFieldObject(int troid) {
    return (StringField)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new StringField();
  }
  protected String defaultDisplayName() {
    return "String Field";
  }

  protected String defaultDescription() {
    return "A table with only a string field in it";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 12;
  }
}

