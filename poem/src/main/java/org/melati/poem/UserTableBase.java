// Do not edit this file!  It was generated by Melati Poem's DSD preprocessor.

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
          public Object getIdent(Data data) {
            return (Integer)((UserData)data).id;
          }

          public void setIdent(Data data, Object ident) {
            ((UserData)data).id = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getId();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setId((Integer)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((User)g).getId();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((User)g).setId((Integer)ident);
          }
        });

    defineColumn(col_login =
        new Column(this, "login", new StringPoemType(false, 20), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((UserData)data).login;
          }

          public void setIdent(Data data, Object ident) {
            ((UserData)data).login = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getLogin();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setLogin((String)value);
          }

          protected String defaultDescription() {
            return "The user's login name";
          }

          protected boolean defaultUnique() {
            return false;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((User)g).getLogin();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((User)g).setLogin((String)ident);
          }
        });

    defineColumn(col_password =
        new Column(this, "password", new StringPoemType(false, 20), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((UserData)data).password;
          }

          public void setIdent(Data data, Object ident) {
            ((UserData)data).password = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getPassword();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setPassword((String)value);
          }

          protected String defaultDescription() {
            return "The user's password";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((User)g).getPassword();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((User)g).setPassword((String)ident);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((UserData)data).name;
          }

          public void setIdent(Data data, Object ident) {
            ((UserData)data).name = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((User)g).getName();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((User)g).setName((String)value);
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

          protected String defaultDescription() {
            return "The user's real name";
          }

          protected boolean defaultIndexed() {
            return true;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((User)g).getName();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((User)g).setName((String)ident);
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

  protected Persistent newPersistent() {
    return new User();
  }

  protected Data _newData() {
    return new UserData();
  }
  protected String defaultDescription() {
    return "A registered user of the database";
  }

}
