// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

public class UserTableBase extends Table {

  private Column col_id = null;
  private Column col_login = null;
  private Column col_password = null;
  private Column col_name = null;

  public UserTableBase(Database database, String name) throws PoemException {
    super(database, name, DefinitionSource.dsd);
  }

  protected void init() throws PoemException {
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setId((Integer)cooked);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 0;
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

    defineColumn(col_login =
        new Column(this, "login", new StringPoemType(false, 20), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getLogin();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setLogin((String)cooked);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "The user's login name";
          }

          protected boolean defaultUnique() {
            return true;
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
        new Column(this, "password", new StringPoemType(false, 20), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getPassword();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setPassword((String)cooked);
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "The user's password";
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

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setName((String)cooked);
          }

          protected boolean defaultPrimaryDisplay() {
            return true;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "Full name";
          }

          protected int defaultDisplayOrder() {
            return 3;
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
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getLoginColumn() {
    return col_login;
  }

  public final Column getPasswordColumn() {
    return col_password;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public User getUserObject(Integer troid) {
    return (User)getObject(troid);
  }

  public User getUserObject(int troid) {
    return (User)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new User();
  }
  protected String defaultDescription() {
    return "A registered user of the database";
  }

  protected boolean defaultRememberAllTroids() {
    return true;
  }

  protected int defaultDisplayOrder() {
    return 3;
  }
}
