// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Group;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.Table;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>Group</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class GroupTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
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
  * Constructor.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @throws PoemException    if anything goes wrong
  */
  public GroupTableBase(
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
            return ((Group)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Group)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
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
        new Column(this, "name",
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

          public Field asField(Persistent g) {
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
  * <code>Group</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>Group</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column getNameColumn() {
    return col_name;
  }


 /**
  * Retrieve the <code>Group</code> as a <code>Group</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
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
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public Group getGroupObject(int troid) {
    return (Group)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Group();
  }
  protected String defaultDescription() {
    return "A group to which registered users of the database can belong";
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

