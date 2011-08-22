// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.example.contacts.generated;


import java.sql.Date;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.melati.example.contacts.Contact;
import org.melati.example.contacts.ContactCategory;
import org.melati.example.contacts.ContactTable;
import org.melati.example.contacts.ContactsDatabaseTables;
import org.melati.poem.AccessPoemException;
import org.melati.poem.CachedSelection;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.NoSuchRowPoemException;
import org.melati.poem.User;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.util.EmptyEnumeration;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>Contact</code> Object.
 *
 * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class ContactBase extends JdbcPersistent {


 /**
  * Retrieves the Database object.
  * 
  * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the database
  */
  public ContactsDatabaseTables getContactsDatabaseTables() {
    return (ContactsDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>ContactTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the ContactTable
  */
  public ContactTable getContactTable() {
    return (ContactTable)getTable();
  }

  private ContactTable _getContactTable() {
    return (ContactTable)getTable();
  }

  // Fields in this table 
 /**
  * id 
  */
  protected Integer id;
 /**
  * name - Contact Name 
  */
  protected String name;
 /**
  * owner - Contact who owns this contact 
  */
  protected Integer owner;
 /**
  * address - Contact Address 
  */
  protected String address;
 /**
  * updates - How many times has this record been updated? 
  */
  protected Integer updates;
 /**
  * lastupdated - When was this last updated? 
  */
  protected Date lastupdated;
 /**
  * lastupdateuser - Who last updated this? 
  */
  protected Integer lastupdateuser;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>Contact</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setId(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getContactTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.IntegerFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code>
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }


 /**
  * Retrieves the <code>Id</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field<Integer> getIdField() throws AccessPoemException {
    Column<Integer> c = _getContactTable().getIdColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Name</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String name
  */
  public String getName_unsafe() {
    return name;
  }


 /**
  * Sets the <code>Name</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setName_unsafe(String cooked) {
    name = cooked;
  }

 /**
  * Retrieves the Name value, with locking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   Contact Name 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Name</code> for this 
  *         <code>Contact</code> <code>Persistent</code>  
  */

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }


 /**
  * Sets the <code>Name</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   Contact Name 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setName(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getContactTable().getNameColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Name</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String name
  */
  public Field<String> getNameField() throws AccessPoemException {
    Column<String> c = _getContactTable().getNameColumn();
    return new Field<String>((String)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Owner</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer owner
  */
  public Integer getOwner_unsafe() {
    return owner;
  }


 /**
  * Sets the <code>Owner</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setOwner_unsafe(Integer cooked) {
    owner = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getOwnerTroid()
      throws AccessPoemException {
    readLock();
    return getOwner_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setOwnerTroid(Integer raw)
      throws AccessPoemException {
    setOwner(raw == null ? null : 
        getContactsDatabaseTables().getContactTable().getContactObject(raw));
  }


 /**
  * Retrieves the <code>Owner</code> object referred to.
  *  
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>Owner</code> as a <code>Contact</code> 
  */
  public Contact getOwner()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getOwnerTroid();
    return troid == null ? null :
        getContactsDatabaseTables().getContactTable().getContactObject(troid);
  }


 /**
  * Set the Owner.
  * 
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>Contact</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setOwner(Contact cooked)
      throws AccessPoemException {
    _getContactTable().
      getOwnerColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setOwner_unsafe(null);
    else {
      cooked.existenceLock();
      setOwner_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>Owner</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer owner
  */
  public Field<Integer> getOwnerField() throws AccessPoemException {
    Column<Integer> c = _getContactTable().getOwnerColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Address</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String address
  */
  public String getAddress_unsafe() {
    return address;
  }


 /**
  * Sets the <code>Address</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setAddress_unsafe(String cooked) {
    address = cooked;
  }

 /**
  * Retrieves the Address value, with locking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   Contact Address 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Address</code> for this 
  *         <code>Contact</code> <code>Persistent</code>  
  */

  public String getAddress()
      throws AccessPoemException {
    readLock();
    return getAddress_unsafe();
  }


 /**
  * Sets the <code>Address</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   Contact Address 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setAddress(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getContactTable().getAddressColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setAddress_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Address</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String address
  */
  public Field<String> getAddressField() throws AccessPoemException {
    Column<String> c = _getContactTable().getAddressColumn();
    return new Field<String>((String)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Updates</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer updates
  */
  public Integer getUpdates_unsafe() {
    return updates;
  }


 /**
  * Sets the <code>Updates</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setUpdates_unsafe(Integer cooked) {
    updates = cooked;
  }

 /**
  * Retrieves the Updates value, with locking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   How many times has this record been updated? 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Updates</code> for this 
  *         <code>Contact</code> <code>Persistent</code>  
  */

  public Integer getUpdates()
      throws AccessPoemException {
    readLock();
    return getUpdates_unsafe();
  }


 /**
  * Sets the <code>Updates</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   How many times has this record been updated? 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setUpdates(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getContactTable().getUpdatesColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setUpdates_unsafe(cooked);
  }

 /**
  * Sets the <code>Updates</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   How many times has this record been updated? 
  * 
  * 
  * Generated by org.melati.poem.prepro.IntegerFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code>
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setUpdates(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setUpdates(new Integer(cooked));
  }


 /**
  * Retrieves the <code>Updates</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer updates
  */
  public Field<Integer> getUpdatesField() throws AccessPoemException {
    Column<Integer> c = _getContactTable().getUpdatesColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Lastupdated</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Date lastupdated
  */
  public Date getLastupdated_unsafe() {
    return lastupdated;
  }


 /**
  * Sets the <code>Lastupdated</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setLastupdated_unsafe(Date cooked) {
    lastupdated = cooked;
  }

 /**
  * Retrieves the Lastupdated value, with locking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   When was this last updated? 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Lastupdated</code> for this 
  *         <code>Contact</code> <code>Persistent</code>  
  */

  public Date getLastupdated()
      throws AccessPoemException {
    readLock();
    return getLastupdated_unsafe();
  }


 /**
  * Sets the <code>Lastupdated</code> value, with checking, for this 
  * <code>Contact</code> <code>Persistent</code>.
  * Field description: 
  *   When was this last updated? 
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setLastupdated(Date cooked)
      throws AccessPoemException, ValidationPoemException {
    _getContactTable().getLastupdatedColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setLastupdated_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Lastupdated</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Date lastupdated
  */
  public Field<Date> getLastupdatedField() throws AccessPoemException {
    Column<Date> c = _getContactTable().getLastupdatedColumn();
    return new Field<Date>((Date)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Lastupdateuser</code> value, without locking, 
  * for this <code>Contact</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer lastupdateuser
  */
  public Integer getLastupdateuser_unsafe() {
    return lastupdateuser;
  }


 /**
  * Sets the <code>Lastupdateuser</code> value directly, without checking, 
  * for this Contact <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setLastupdateuser_unsafe(Integer cooked) {
    lastupdateuser = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getLastupdateuserTroid()
      throws AccessPoemException {
    readLock();
    return getLastupdateuser_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setLastupdateuserTroid(Integer raw)
      throws AccessPoemException {
    setLastupdateuser(raw == null ? null : 
        getContactsDatabaseTables().getUserTable().getUserObject(raw));
  }


 /**
  * Retrieves the <code>Lastupdateuser</code> object referred to.
  *  
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>Lastupdateuser</code> as a <code>User</code> 
  */
  public User getLastupdateuser()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getLastupdateuserTroid();
    return troid == null ? null :
        getContactsDatabaseTables().getUserTable().getUserObject(troid);
  }


 /**
  * Set the Lastupdateuser.
  * 
  * Generated by org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>User</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setLastupdateuser(User cooked)
      throws AccessPoemException {
    _getContactTable().
      getLastupdateuserColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setLastupdateuser_unsafe(null);
    else {
      cooked.existenceLock();
      setLastupdateuser_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>Lastupdateuser</code> value as a <code>Field</code>
  * from this <code>Contact</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer lastupdateuser
  */
  public Field<Integer> getLastupdateuserField() throws AccessPoemException {
    Column<Integer> c = _getContactTable().getLastupdateuserColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }

  private CachedSelection<Contact> ownerContacts = null;
  /** References to this Contact in the Contact table via its owner field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<Contact> getOwnerContacts() {
    if (getTroid() == null)
      return new EmptyEnumeration<Contact>();
    else {
      if (ownerContacts == null)
        ownerContacts =
          getContactsDatabaseTables().getContactTable().getOwnerColumn().cachedSelectionWhereEq(getTroid());
      return ownerContacts.objects();
    }
  }


  /** References to this Contact in the Contact table via its owner field, as a List.*/
  public List<Contact> getOwnerContactList() {
    return Collections.list(getOwnerContacts());
  }



  private CachedSelection<ContactCategory> contactContactCategorys = null;
  /** References to this Contact in the ContactCategory table via its contact field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<ContactCategory> getContactContactCategorys() {
    if (getTroid() == null)
      return new EmptyEnumeration<ContactCategory>();
    else {
      if (contactContactCategorys == null)
        contactContactCategorys =
          getContactsDatabaseTables().getContactCategoryTable().getContactColumn().cachedSelectionWhereEq(getTroid());
      return contactContactCategorys.objects();
    }
  }


  /** References to this Contact in the ContactCategory table via its contact field, as a List.*/
  public List<ContactCategory> getContactContactCategoryList() {
    return Collections.list(getContactContactCategorys());
  }



}

