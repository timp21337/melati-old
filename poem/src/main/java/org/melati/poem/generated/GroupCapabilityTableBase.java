// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Capability;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Group;
import org.melati.poem.GroupCapability;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.PoemTable;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>groupCapability</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class GroupCapabilityTableBase extends PoemTable {

  private Column<Integer> col_id = null;
  private Column<Integer> col_group = null;
  private Column<Integer> col_capability = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public GroupCapabilityTableBase(
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
            return ((GroupCapability)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((GroupCapability)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((GroupCapability)g).getIdField();
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
            return ((GroupCapability)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupCapability)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupCapability)g).setId((Integer)raw);
          }
        });

    defineColumn(col_group =
        new Column<Integer>(this, "group",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getGroupTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupCapability)g).getGroup();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((GroupCapability)g).setGroup((Group)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((GroupCapability)g).getGroupField();
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "The Group which has the capability";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getGroup_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupCapability)g).setGroup_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getGroupTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupCapability)g).setGroupTroid((Integer)raw);
          }
        });

    defineColumn(col_capability =
        new Column<Integer>(this, "capability",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getCapabilityTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupCapability)g).getCapability();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((GroupCapability)g).setCapability((Capability)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((GroupCapability)g).getCapabilityField();
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "The capability";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getCapability_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupCapability)g).setCapability_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getCapabilityTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((GroupCapability)g).setCapabilityTroid((Integer)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>groupCapability</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Group</code> <code>Column</code> for this 
  * <code>groupCapability</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the group <code>Column</code>
  */
  public final Column<Integer> getGroupColumn() {
    return col_group;
  }


 /**
  * Retrieves the <code>Capability</code> <code>Column</code> for this 
  * <code>groupCapability</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the capability <code>Column</code>
  */
  public final Column<Integer> getCapabilityColumn() {
    return col_capability;
  }


 /**
  * Retrieve the <code>GroupCapability</code> as a <code>GroupCapability</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public GroupCapability getGroupCapabilityObject(Integer troid) {
    return (GroupCapability)getObject(troid);
  }


 /**
  * Retrieve the <code>GroupCapability</code> 
  * as a <code>GroupCapability</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public GroupCapability getGroupCapabilityObject(int troid) {
    return (GroupCapability)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new GroupCapability();
  }
  protected String defaultDisplayName() {
    return "Group capability";
  }

  protected String defaultDescription() {
    return "A record that Users belonging to a given Group possess a given Capability";
  }

  protected String defaultCategory() {
    return "User";
  }

  protected int defaultDisplayOrder() {
    return 2050;
  }
}

