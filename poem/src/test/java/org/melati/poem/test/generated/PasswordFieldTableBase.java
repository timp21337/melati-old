// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.PasswordPoemType;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.Table;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.PasswordField;
import org.melati.poem.test.TestDatabaseTables;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>PasswordField</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class PasswordFieldTableBase extends Table {

  private Column col_id = null;
  private Column col_passwordfield = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public PasswordFieldTableBase(
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
  public PasswordFieldTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public TestDatabaseTables getTestDatabaseTables() {
    return (TestDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((PasswordField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((PasswordField)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((PasswordField)g).getIdField();
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
            return ((PasswordField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((PasswordField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((PasswordField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((PasswordField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_passwordfield =
        new Column(this, "passwordfield",
                   new PasswordPoemType(true, 23),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((PasswordField)g).getPasswordfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((PasswordField)g).setPasswordfield((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((PasswordField)g).getPasswordfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Password Field";
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
            return ((PasswordField)g).getPasswordfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((PasswordField)g).setPasswordfield_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((PasswordField)g).getPasswordfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((PasswordField)g).setPasswordfield((String)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>PasswordField</code> <code>Table</code>
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Passwordfield</code> <code>Column</code> for this 
  * <code>PasswordField</code> <code>Table</code>
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the passwordfield <code>Column</code>
  */
  public final Column getPasswordfieldColumn() {
    return col_passwordfield;
  }


 /**
  * Retrieve the <code>PasswordField</code> as a <code>PasswordField</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public PasswordField getPasswordFieldObject(Integer troid) {
    return (PasswordField)getObject(troid);
  }


 /**
  * Retrieve the <code>PasswordField</code> 
  * as a <code>PasswordField</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public PasswordField getPasswordFieldObject(int troid) {
    return (PasswordField)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new PasswordField();
  }
  protected String defaultDisplayName() {
    return "Password Field";
  }

  protected String defaultDescription() {
    return "A table with only a password field in it";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 15;
  }
}

