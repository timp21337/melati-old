// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Group;
import org.melati.poem.GroupMembership;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.StandardIntegrityFix;
import org.melati.poem.Table;
import org.melati.poem.TroidPoemType;
import org.melati.poem.User;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>GroupMembership</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class GroupMembershipTableBase extends Table {

  private Column col_id = null;
  private Column col_user = null;
  private Column col_group = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public GroupMembershipTableBase(
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
  public GroupMembershipTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
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

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          protected String defaultDescription() {
            return "The Table Row Object ID";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setId_unsafe((Integer)raw);
          }

 /**
  * Retrieves the Id value, 
  * without checking, of this <code>GroupMembership</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateColRawAccessors 
  * @param g  the <code>Persistent</code> to get the value from
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupMembership)g).getId();
          }


 /**
  * Sets the Id value, without checking, for this <code>GroupMembership</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateColRawAccessors 
  * @param g  the <code>Persistent</code> to modify
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupMembership)g).setId((Integer)raw);
          }
        });

    defineColumn(col_user =
        new Column(this, "user",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getUserTable(), false),
                   DefinitionSource.dsd) { 
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

          protected String defaultRenderinfo() {
            return "SelectionWindow";
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

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.delete;
          }
        });

    defineColumn(col_group =
        new Column(this, "group",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getGroupTable(), false),
                   DefinitionSource.dsd) { 
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


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>GroupMembership</code> <code>Table</code>
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>User</code> <code>Column</code> for this 
  * <code>GroupMembership</code> <code>Table</code>
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the user <code>Column</code>
  */
  public final Column getUserColumn() {
    return col_user;
  }


 /**
  * Retrieves the <code>Group</code> <code>Column</code> for this 
  * <code>GroupMembership</code> <code>Table</code>
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the group <code>Column</code>
  */
  public final Column getGroupColumn() {
    return col_group;
  }


 /**
  * Retrieve the <code>GroupMembership</code> as a <code>GroupMembership</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public GroupMembership getGroupMembershipObject(Integer troid) {
    return (GroupMembership)getObject(troid);
  }


 /**
  * Retrieve the <code>GroupMembership</code> 
  * as a <code>GroupMembership</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
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
