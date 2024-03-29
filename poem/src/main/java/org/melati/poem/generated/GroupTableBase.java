// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Group;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.PoemTable;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>group</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class GroupTableBase extends PoemTable {

  private Column<Integer> col_id = null;
  private Column<String> col_name = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public GroupTableBase(
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
            return ((Group)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Group)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Group)g).getIdField();
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
            return ((Group)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Group)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Group)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Group)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column<String>(this, "name",
                   new StringPoemType(false, 60),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Group)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Group)g).setName((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((Group)g).getNameField();
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

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "A human-readable name for the group";
          }

          protected boolean defaultUnique() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Group)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Group)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Group)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Group)g).setName((String)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>group</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>group</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column<String> getNameColumn() {
    return col_name;
  }


 /**
  * Retrieve the <code>Group</code> as a <code>Group</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public Group getGroupObject(Integer troid) {
    return (Group)getObject(troid);
  }


 /**
  * Retrieve the <code>Group</code> 
  * as a <code>Group</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public Group getGroupObject(int troid) {
    return (Group)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new Group();
  }
  protected String defaultDescription() {
    return "A Group to which registered Users of the database can belong";
  }

  protected boolean defaultRememberAllTroids() {
    return true;
  }

  protected String defaultCategory() {
    return "User";
  }

  protected int defaultDisplayOrder() {
    return 2020;
  }
}

