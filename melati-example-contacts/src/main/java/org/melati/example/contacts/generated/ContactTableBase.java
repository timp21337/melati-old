// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.example.contacts.generated;


import java.sql.Date;
import org.melati.example.contacts.Contact;
import org.melati.example.contacts.ContactsDatabaseTables;
import org.melati.example.contacts.ContactsTable;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DatePoemType;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.User;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>Contact</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class ContactTableBase extends ContactsTable {

  private Column<Integer> col_id = null;
  private Column<String> col_name = null;
  private Column<Integer> col_owner = null;
  private Column<String> col_address = null;
  private Column<Integer> col_updates = null;
  private Column<Date> col_lastupdated = null;
  private Column<Integer> col_lastupdateuser = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public ContactTableBase(
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
  public ContactsDatabaseTables getContactsDatabaseTables() {
    return (ContactsDatabaseTables)getDatabase();
  }

  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column<Integer>(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Contact)g).getIdField();
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
            return ((Contact)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column<String>(this, "name",
                   new StringPoemType(false, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setName((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((Contact)g).getNameField();
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
            return "Contact Name";
          }

          protected int defaultWidth() {
            return 20;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setName((String)raw);
          }
        });

    defineColumn(col_owner =
        new Column<Integer>(this, "owner",
                   new ReferencePoemType(getContactsDatabaseTables().
                                             getContactTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getOwner();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setOwner((Contact)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Contact)g).getOwnerField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "Contact who owns this contact";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getOwner_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setOwner_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getOwnerTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setOwnerTroid((Integer)raw);
          }
        });

    defineColumn(col_address =
        new Column<String>(this, "address",
                   new StringPoemType(false, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getAddress();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setAddress((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((Contact)g).getAddressField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 3;
          }

          protected String defaultDescription() {
            return "Contact Address";
          }

          protected int defaultWidth() {
            return 40;
          }

          protected int defaultHeight() {
            return 5;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getAddress_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setAddress_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getAddress();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setAddress((String)raw);
          }
        });

    defineColumn(col_updates =
        new Column<Integer>(this, "updates",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getUpdates();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setUpdates((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Contact)g).getUpdatesField();
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
            return 4;
          }

          protected String defaultDescription() {
            return "How many times has this record been updated?";
          }

          protected int defaultWidth() {
            return 5;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getUpdates_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setUpdates_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getUpdates();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setUpdates((Integer)raw);
          }
        });

    defineColumn(col_lastupdated =
        new Column<Date>(this, "lastupdated",
                   new DatePoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getLastupdated();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setLastupdated((Date)cooked);
          }

          public Field<Date> asField(Persistent g) {
            return ((Contact)g).getLastupdatedField();
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
            return 5;
          }

          protected String defaultDescription() {
            return "When was this last updated?";
          }

          protected String defaultRenderinfo() {
            return "org.melati.poem.DatePoemType-dropdown";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getLastupdated_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setLastupdated_unsafe((Date)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getLastupdated();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setLastupdated((Date)raw);
          }
        });

    defineColumn(col_lastupdateuser =
        new Column<Integer>(this, "lastupdateuser",
                   new ReferencePoemType(getContactsDatabaseTables().
                                             getUserTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Contact)g).getLastupdateuser();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Contact)g).setLastupdateuser((User)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Contact)g).getLastupdateuserField();
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
            return Searchability.yes;
          }

          protected int defaultDisplayOrder() {
            return 6;
          }

          protected String defaultDescription() {
            return "Who last updated this?";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getLastupdateuser_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setLastupdateuser_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Contact)g).getLastupdateuserTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Contact)g).setLastupdateuserTroid((Integer)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column<String> getNameColumn() {
    return col_name;
  }


 /**
  * Retrieves the <code>Owner</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the owner <code>Column</code>
  */
  public final Column<Integer> getOwnerColumn() {
    return col_owner;
  }


 /**
  * Retrieves the <code>Address</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the address <code>Column</code>
  */
  public final Column<String> getAddressColumn() {
    return col_address;
  }


 /**
  * Retrieves the <code>Updates</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the updates <code>Column</code>
  */
  public final Column<Integer> getUpdatesColumn() {
    return col_updates;
  }


 /**
  * Retrieves the <code>Lastupdated</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the lastupdated <code>Column</code>
  */
  public final Column<Date> getLastupdatedColumn() {
    return col_lastupdated;
  }


 /**
  * Retrieves the <code>Lastupdateuser</code> <code>Column</code> for this 
  * <code>Contact</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the lastupdateuser <code>Column</code>
  */
  public final Column<Integer> getLastupdateuserColumn() {
    return col_lastupdateuser;
  }


 /**
  * Retrieve the <code>Contact</code> as a <code>Contact</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public Contact getContactObject(Integer troid) {
    return (Contact)getObject(troid);
  }


 /**
  * Retrieve the <code>Contact</code> 
  * as a <code>Contact</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public Contact getContactObject(int troid) {
    return (Contact)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new Contact();
  }
  protected String defaultDescription() {
    return "A Contact";
  }

  protected String defaultCategory() {
    return "Data";
  }

  protected int defaultDisplayOrder() {
    return 10;
  }
}

