// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.Capability;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.Table;
import org.melati.poem.TroidPoemType;
import org.melati.poem.User;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.Protected;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>Protected</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class ProtectedTableBase extends Table {

  private Column col_id = null;
  private Column col_spy = null;
  private Column col_mission = null;
  private Column col_canRead = null;
  private Column col_canWrite = null;
  private Column col_canDelete = null;
  private Column col_canSelect = null;
  private Column col_deleted = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public ProtectedTableBase(
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
  public ProtectedTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setId((Integer)raw);
          }
        });

    defineColumn(col_spy =
        new Column(this, "spy",
                   new ReferencePoemType(getEverythingDatabaseTables().
                                             getUserTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getSpy();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setSpy((User)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getSpyField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "Spy";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getSpy_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setSpy_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getSpyTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setSpyTroid((Integer)raw);
          }
        });

    defineColumn(col_mission =
        new Column(this, "mission",
                   new StringPoemType(false, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getMission();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setMission((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getMissionField();
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
            return 2;
          }

          protected String defaultDescription() {
            return "Secret mission";
          }

          protected int defaultWidth() {
            return 20;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getMission_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setMission_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getMission();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setMission((String)raw);
          }
        });

    defineColumn(col_canRead =
        new Column(this, "canRead",
                   new ReferencePoemType(getEverythingDatabaseTables().
                                             getCapabilityTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getCanRead();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setCanRead((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getCanReadField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected int defaultDisplayOrder() {
            return 3;
          }

          protected String defaultDescription() {
            return "Capability required to read this row ";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanRead_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanRead_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanReadTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanReadTroid((Integer)raw);
          }
        });

    defineColumn(col_canWrite =
        new Column(this, "canWrite",
                   new ReferencePoemType(getEverythingDatabaseTables().
                                             getCapabilityTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getCanWrite();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setCanWrite((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getCanWriteField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected int defaultDisplayOrder() {
            return 4;
          }

          protected String defaultDescription() {
            return "Capability required to write this row ";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanWrite_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanWrite_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanWriteTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanWriteTroid((Integer)raw);
          }
        });

    defineColumn(col_canDelete =
        new Column(this, "canDelete",
                   new ReferencePoemType(getEverythingDatabaseTables().
                                             getCapabilityTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getCanDelete();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setCanDelete((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getCanDeleteField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected int defaultDisplayOrder() {
            return 5;
          }

          protected String defaultDescription() {
            return "Capability required to delete this row ";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanDelete_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanDelete_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanDeleteTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanDeleteTroid((Integer)raw);
          }
        });

    defineColumn(col_canSelect =
        new Column(this, "canSelect",
                   new ReferencePoemType(getEverythingDatabaseTables().
                                             getCapabilityTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getCanSelect();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setCanSelect((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getCanSelectField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected int defaultDisplayOrder() {
            return 6;
          }

          protected String defaultDescription() {
            return "Capability required to select this row ";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanSelect_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanSelect_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getCanSelectTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setCanSelectTroid((Integer)raw);
          }
        });

    defineColumn(col_deleted =
        new Column(this, "deleted",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Protected)g).getDeleted();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Protected)g).setDeleted((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((Protected)g).getDeletedField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected int defaultDisplayOrder() {
            return 7;
          }

          protected String defaultDescription() {
            return "Whether this record is existant ";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getDeleted_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setDeleted_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Protected)g).getDeleted();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Protected)g).setDeleted((Boolean)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Spy</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the spy <code>Column</code>
  */
  public final Column getSpyColumn() {
    return col_spy;
  }


 /**
  * Retrieves the <code>Mission</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the mission <code>Column</code>
  */
  public final Column getMissionColumn() {
    return col_mission;
  }


 /**
  * Retrieves the <code>CanRead</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the canRead <code>Column</code>
  */
  public final Column getCanReadColumn() {
    return col_canRead;
  }


 /**
  * Retrieves the <code>CanWrite</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the canWrite <code>Column</code>
  */
  public final Column getCanWriteColumn() {
    return col_canWrite;
  }


 /**
  * Retrieves the <code>CanDelete</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the canDelete <code>Column</code>
  */
  public final Column getCanDeleteColumn() {
    return col_canDelete;
  }


 /**
  * Retrieves the <code>CanSelect</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the canSelect <code>Column</code>
  */
  public final Column getCanSelectColumn() {
    return col_canSelect;
  }


 /**
  * Retrieves the <code>Deleted</code> <code>Column</code> for this 
  * <code>Protected</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the deleted <code>Column</code>
  */
  public final Column getDeletedColumn() {
    return col_deleted;
  }


 /**
  * Retrieve the <code>Protected</code> as a <code>Protected</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public Protected getProtectedObject(Integer troid) {
    return (Protected)getObject(troid);
  }


 /**
  * Retrieve the <code>Protected</code> 
  * as a <code>Protected</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public Protected getProtectedObject(int troid) {
    return (Protected)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Protected();
  }
  protected String defaultDescription() {
    return "A protected table";
  }

  protected String defaultCategory() {
    return "Data";
  }

  protected int defaultDisplayOrder() {
    return 90;
  }
}

