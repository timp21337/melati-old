// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

public class UserBase extends Persistent {

  public UserTable getUserTable() {
    return (UserTable)getTable();
  }

  Integer id;
  String login;
  String password;
  String name;

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
    getUserTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public final Field getIdField() throws AccessPoemException {
    return getUserTable().getIdColumn().asField(this);
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
    getUserTable().getLoginColumn().getType().assertValidCooked(cooked);
    writeLock();
    setLogin_unsafe(cooked);
  }

  public final Field getLoginField() throws AccessPoemException {
    return getUserTable().getLoginColumn().asField(this);
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
    getUserTable().getPasswordColumn().getType().assertValidCooked(cooked);
    writeLock();
    setPassword_unsafe(cooked);
  }

  public final Field getPasswordField() throws AccessPoemException {
    return getUserTable().getPasswordColumn().asField(this);
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
    getUserTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public final Field getNameField() throws AccessPoemException {
    return getUserTable().getNameColumn().asField(this);
  }
}
