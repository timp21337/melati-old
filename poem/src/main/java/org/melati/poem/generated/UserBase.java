// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.UserTable;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>User</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class UserBase extends JdbcPersistent {


 /**
  * Retrieves the Database object.
  * 
  * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the database
  */
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>UserTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the UserTable
  */
  public UserTable getUserTable() {
    return (UserTable)getTable();
  }

  private UserTable _getUserTable() {
    return (UserTable)getTable();
  }

  // Fields in this table 
 /**
  * id - The Table Row Object ID 
  */
  protected Integer id;
 /**
  * Full name - The user's real name 
  */
  protected String name;
 /**
  * login - The user's login name 
  */
  protected String login;
 /**
  * password - The user's password 
  */
  protected String password;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>User</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this User <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>User</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setId(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
  * 
  * @generator org.melati.poem.prepro.IntegerFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code>
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }


 /**
  * Retrieves the <code>Id</code> value as a <code>Field</code>
  * from this <code>User</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field getIdField() throws AccessPoemException {
    Column c = _getUserTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Name</code> value, without locking, 
  * for this <code>User</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String name
  */
  public String getName_unsafe() {
    return name;
  }


 /**
  * Sets the <code>Name</code> value directly, without checking, 
  * for this User <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setName_unsafe(String cooked) {
    name = cooked;
  }

 /**
  * Retrieves the Name value, with locking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The user's real name 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Name</code> for this 
  *         <code>User</code> <code>Persistent</code>  
  */

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }


 /**
  * Sets the <code>Name</code> value, with checking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The user's real name 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setName(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getNameColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Name</code> value as a <code>Field</code>
  * from this <code>User</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String name
  */
  public Field getNameField() throws AccessPoemException {
    Column c = _getUserTable().getNameColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Login</code> value, without locking, 
  * for this <code>User</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String login
  */
  public String getLogin_unsafe() {
    return login;
  }


 /**
  * Sets the <code>Login</code> value directly, without checking, 
  * for this User <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setLogin_unsafe(String cooked) {
    login = cooked;
  }

 /**
  * Retrieves the Login value, with locking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The user's login name 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Login</code> for this 
  *         <code>User</code> <code>Persistent</code>  
  */

  public String getLogin()
      throws AccessPoemException {
    readLock();
    return getLogin_unsafe();
  }


 /**
  * Sets the <code>Login</code> value, with checking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The user's login name 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setLogin(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getLoginColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setLogin_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Login</code> value as a <code>Field</code>
  * from this <code>User</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String login
  */
  public Field getLoginField() throws AccessPoemException {
    Column c = _getUserTable().getLoginColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Password</code> value, without locking, 
  * for this <code>User</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String password
  */
  public String getPassword_unsafe() {
    return password;
  }


 /**
  * Sets the <code>Password</code> value directly, without checking, 
  * for this User <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setPassword_unsafe(String cooked) {
    password = cooked;
  }

 /**
  * Retrieves the Password value, with locking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The user's password 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Password</code> for this 
  *         <code>User</code> <code>Persistent</code>  
  */

  public String getPassword()
      throws AccessPoemException {
    readLock();
    return getPassword_unsafe();
  }


 /**
  * Sets the <code>Password</code> value, with checking, for this 
  * <code>User</code> <code>Persistent</code>.
  * Field description: 
  *   The user's password 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setPassword(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getPasswordColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setPassword_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Password</code> value as a <code>Field</code>
  * from this <code>User</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String password
  */
  public Field getPasswordField() throws AccessPoemException {
    Column c = _getUserTable().getPasswordColumn();
    return new Field(c.getRaw(this), c);
  }
}

