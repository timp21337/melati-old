// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.AccessPoemException;
import org.melati.poem.ValidationPoemException;


import org.melati.poem.UserTable;
import org.melati.poem.PoemDatabaseTables;

/**
 * Melati POEM generated base class for persistent User.
 * Field summary for SQL table user:
 *   id
 *   name
 *   login
 *   password
 *
 */
public abstract class UserBase extends Persistent {

  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  public UserTable getUserTable() {
    return (UserTable)getTable();
  }

  private UserTable _getUserTable() {
    return (UserTable)getTable();
  }

  protected Integer id;
  protected String name;
  protected String login;
  protected String password;

  public Integer getId_unsafe() {
    return id;
  }

  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }

  public void setId(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public Field getIdField() throws AccessPoemException {
    Column c = _getUserTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }

  public String getName_unsafe() {
    return name;
  }

  public void setName_unsafe(String cooked) {
    name = cooked;
  }

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }

  public void setName(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public Field getNameField() throws AccessPoemException {
    Column c = _getUserTable().getNameColumn();
    return new Field(c.getRaw(this), c);
  }

  public String getLogin_unsafe() {
    return login;
  }

  public void setLogin_unsafe(String cooked) {
    login = cooked;
  }

  public String getLogin()
      throws AccessPoemException {
    readLock();
    return getLogin_unsafe();
  }

  public void setLogin(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getLoginColumn().getType().assertValidCooked(cooked);
    writeLock();
    setLogin_unsafe(cooked);
  }

  public Field getLoginField() throws AccessPoemException {
    Column c = _getUserTable().getLoginColumn();
    return new Field(c.getRaw(this), c);
  }

  public String getPassword_unsafe() {
    return password;
  }

  public void setPassword_unsafe(String cooked) {
    password = cooked;
  }

  public String getPassword()
      throws AccessPoemException {
    readLock();
    return getPassword_unsafe();
  }

  public void setPassword(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getUserTable().getPasswordColumn().getType().assertValidCooked(cooked);
    writeLock();
    setPassword_unsafe(cooked);
  }

  public Field getPasswordField() throws AccessPoemException {
    Column c = _getUserTable().getPasswordColumn();
    return new Field(c.getRaw(this), c);
  }
}
