// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.PasswordPoemType;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.PoemTable;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.User;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>user</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class UserTableBase extends PoemTable {

  private Column<Integer> col_id = null;
  private Column<String> col_name = null;
  private Column<String> col_login = null;
  private Column<String> col_password = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public UserTableBase(
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
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column<Integer>(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((User)g).getIdField();
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
            return 10;
          }

          protected String defaultDescription() {
            return "The Table Row Object ID";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((User)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((User)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column<String>(this, "name",
                   new StringPoemType(false, 60),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setName((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((User)g).getNameField();
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

          protected String defaultDisplayName() {
            return "Full name";
          }

          protected int defaultDisplayOrder() {
            return 20;
          }

          protected String defaultDescription() {
            return "The user's real name";
          }

          protected boolean defaultIndexed() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((User)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((User)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setName((String)raw);
          }
        });

    defineColumn(col_login =
        new Column<String>(this, "login",
                   new StringPoemType(false, 255),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getLogin();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setLogin((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((User)g).getLoginField();
          }

          protected int defaultDisplayOrder() {
            return 30;
          }

          protected String defaultDescription() {
            return "The user's login name";
          }

          protected boolean defaultUnique() {
            return true;
          }

          protected int defaultWidth() {
            return 20;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((User)g).getLogin_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setLogin_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((User)g).getLogin();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setLogin((String)raw);
          }
        });

    defineColumn(col_password =
        new Column<String>(this, "password",
                   new PasswordPoemType(false, 20),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getPassword();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setPassword((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((User)g).getPasswordField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 40;
          }

          protected String defaultDescription() {
            return "The user's password";
          }

          protected int defaultWidth() {
            return 10;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((User)g).getPassword_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setPassword_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((User)g).getPassword();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((User)g).setPassword((String)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>user</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>user</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column<String> getNameColumn() {
    return col_name;
  }


 /**
  * Retrieves the <code>Login</code> <code>Column</code> for this 
  * <code>user</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the login <code>Column</code>
  */
  public final Column<String> getLoginColumn() {
    return col_login;
  }


 /**
  * Retrieves the <code>Password</code> <code>Column</code> for this 
  * <code>user</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the password <code>Column</code>
  */
  public final Column<String> getPasswordColumn() {
    return col_password;
  }


 /**
  * Retrieve the <code>User</code> as a <code>User</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public User getUserObject(Integer troid) {
    return (User)getObject(troid);
  }


 /**
  * Retrieve the <code>User</code> 
  * as a <code>User</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public User getUserObject(int troid) {
    return (User)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new User();
  }
  protected String defaultDescription() {
    return "A registered User of the database";
  }

  protected boolean defaultRememberAllTroids() {
    return true;
  }

  protected String defaultCategory() {
    return "User";
  }

  protected int defaultDisplayOrder() {
    return 2010;
  }
}

