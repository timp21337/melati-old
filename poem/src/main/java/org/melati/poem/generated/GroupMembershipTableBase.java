// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.*;
import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.util.*;

public class GroupMembershipTableBase extends Table {

  private Column col_id = null;
  private Column col_user = null;
  private Column col_group = null;

  public GroupMembershipTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public GroupMembershipTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public PoemDatabase getPoemDatabase() {
    return (PoemDatabase)getDatabase();  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id", new TroidPoemType(getDatabase().getDbms()), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupMembership)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((GroupMembership)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((GroupMembership)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setId((Integer)raw);
          }
        });

    defineColumn(col_user =
        new Column(this, "user", new ReferencePoemType(((PoemDatabase)getDatabase()).getUserTable(), false, getDatabase().getDbms()), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupMembership)g).getUser();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((GroupMembership)g).setUser((User)cooked);
          }

          public Field asField(Persistent g) {
            return ((GroupMembership)g).getUserField();
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "User";
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "The user who belongs to the group";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getUser_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setUser_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getUserTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setUserTroid((Integer)raw);
          }
        });

    defineColumn(col_group =
        new Column(this, "group", new ReferencePoemType(((PoemDatabase)getDatabase()).getGroupTable(), false, getDatabase().getDbms()), DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupMembership)g).getGroup();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((GroupMembership)g).setGroup((Group)cooked);
          }

          public Field asField(Persistent g) {
            return ((GroupMembership)g).getGroupField();
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected String defaultDisplayName() {
            return "Group";
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "The group to which the user belongs";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getGroup_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setGroup_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getGroupTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setGroupTroid((Integer)raw);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getUserColumn() {
    return col_user;
  }

  public final Column getGroupColumn() {
    return col_group;
  }

  public GroupMembership getGroupMembershipObject(Integer troid) {
    return (GroupMembership)getObject(troid);
  }

  public GroupMembership getGroupMembershipObject(int troid) {
    return (GroupMembership)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new GroupMembership();
  }
  protected String defaultDisplayName() {
    return "Group membership";
  }

  protected String defaultDescription() {
    return "A record that a given user is a member of a given group";
  }

  protected String defaultCategory() {
    return "User";
  }

  protected int defaultDisplayOrder() {
    return 2040;
  }
}
