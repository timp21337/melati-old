// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Capability;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.NoSuchRowPoemException;
import org.melati.poem.Persistent;
import org.melati.poem.User;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.ProtectedTable;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>Protected</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
 */
public abstract class ProtectedBase extends Persistent {


 /**
  * Retrieves the Database object.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the database
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>ProtectedTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the ProtectedTable
  */
  public ProtectedTable getProtectedTable() {
    return (ProtectedTable)getTable();
  }

  private ProtectedTable _getProtectedTable() {
    return (ProtectedTable)getTable();
  }

  // Fields in this table 
 /**
  * id 
  */
  protected Integer id;
 /**
  * spy - Spy 
  */
  protected Integer spy;
 /**
  * mission - Secret mission 
  */
  protected String mission;
 /**
  * canRead - Capability required to read this row  
  */
  protected Integer canRead;
 /**
  * canWrite - Capability required to write this row  
  */
  protected Integer canWrite;
 /**
  * canDelete - Capability required to delete this row  
  */
  protected Integer canDelete;
 /**
  * canSelect - Capability required to select this row  
  */
  protected Integer canSelect;
 /**
  * deleted - Whether this record is existant  
  */
  protected Boolean deleted;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>Protected</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setId(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getProtectedTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.IntegerFieldDef#generateBaseMethods 
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
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field getIdField() throws AccessPoemException {
    Column c = _getProtectedTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Spy</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer spy
  */
  public Integer getSpy_unsafe() {
    return spy;
  }


 /**
  * Sets the <code>Spy</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setSpy_unsafe(Integer cooked) {
    spy = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getSpyTroid()
      throws AccessPoemException {
    readLock();
    return getSpy_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setSpyTroid(Integer raw)
      throws AccessPoemException {
    setSpy(raw == null ? null : 
        getEverythingDatabaseTables().getUserTable().getUserObject(raw));
  }


 /**
  * Retrieves the <code>Spy</code> object referred to.
  *  
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>Spy</code> as a <code>User</code> 
  */
  public User getSpy()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getSpyTroid();
    return troid == null ? null :
        getEverythingDatabaseTables().getUserTable().getUserObject(troid);
  }


 /**
  * Set the Spy.
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>User</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setSpy(User cooked)
      throws AccessPoemException {
    _getProtectedTable().
      getSpyColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setSpy_unsafe(null);
    else {
      cooked.existenceLock();
      setSpy_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>Spy</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer spy
  */
  public Field getSpyField() throws AccessPoemException {
    Column c = _getProtectedTable().getSpyColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Mission</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String mission
  */
  public String getMission_unsafe() {
    return mission;
  }


 /**
  * Sets the <code>Mission</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setMission_unsafe(String cooked) {
    mission = cooked;
  }

 /**
  * Retrieves the Mission value, with locking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * Field description: 
  *   Secret mission 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Mission</code> for this 
  *         <code>Protected</code> <code>Persistent</code>  
  */

  public String getMission()
      throws AccessPoemException {
    readLock();
    return getMission_unsafe();
  }


 /**
  * Sets the <code>Mission</code> value, with checking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * Field description: 
  *   Secret mission 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setMission(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getProtectedTable().getMissionColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setMission_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Mission</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String mission
  */
  public Field getMissionField() throws AccessPoemException {
    Column c = _getProtectedTable().getMissionColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>CanRead</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer canRead
  */
  public Integer getCanRead_unsafe() {
    return canRead;
  }


 /**
  * Sets the <code>CanRead</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setCanRead_unsafe(Integer cooked) {
    canRead = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getCanReadTroid()
      throws AccessPoemException {
    readLock();
    return getCanRead_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setCanReadTroid(Integer raw)
      throws AccessPoemException {
    setCanRead(raw == null ? null : 
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(raw));
  }


 /**
  * Retrieves the <code>CanRead</code> object referred to.
  *  
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>CanRead</code> as a <code>Capability</code> 
  */
  public Capability getCanRead()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCanReadTroid();
    return troid == null ? null :
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(troid);
  }


 /**
  * Set the CanRead.
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>Capability</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setCanRead(Capability cooked)
      throws AccessPoemException {
    _getProtectedTable().
      getCanReadColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setCanRead_unsafe(null);
    else {
      cooked.existenceLock();
      setCanRead_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>CanRead</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer canRead
  */
  public Field getCanReadField() throws AccessPoemException {
    Column c = _getProtectedTable().getCanReadColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>CanWrite</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer canWrite
  */
  public Integer getCanWrite_unsafe() {
    return canWrite;
  }


 /**
  * Sets the <code>CanWrite</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setCanWrite_unsafe(Integer cooked) {
    canWrite = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getCanWriteTroid()
      throws AccessPoemException {
    readLock();
    return getCanWrite_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setCanWriteTroid(Integer raw)
      throws AccessPoemException {
    setCanWrite(raw == null ? null : 
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(raw));
  }


 /**
  * Retrieves the <code>CanWrite</code> object referred to.
  *  
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>CanWrite</code> as a <code>Capability</code> 
  */
  public Capability getCanWrite()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCanWriteTroid();
    return troid == null ? null :
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(troid);
  }


 /**
  * Set the CanWrite.
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>Capability</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setCanWrite(Capability cooked)
      throws AccessPoemException {
    _getProtectedTable().
      getCanWriteColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setCanWrite_unsafe(null);
    else {
      cooked.existenceLock();
      setCanWrite_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>CanWrite</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer canWrite
  */
  public Field getCanWriteField() throws AccessPoemException {
    Column c = _getProtectedTable().getCanWriteColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>CanDelete</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer canDelete
  */
  public Integer getCanDelete_unsafe() {
    return canDelete;
  }


 /**
  * Sets the <code>CanDelete</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setCanDelete_unsafe(Integer cooked) {
    canDelete = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getCanDeleteTroid()
      throws AccessPoemException {
    readLock();
    return getCanDelete_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setCanDeleteTroid(Integer raw)
      throws AccessPoemException {
    setCanDelete(raw == null ? null : 
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(raw));
  }


 /**
  * Retrieves the <code>CanDelete</code> object referred to.
  *  
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>CanDelete</code> as a <code>Capability</code> 
  */
  public Capability getCanDelete()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCanDeleteTroid();
    return troid == null ? null :
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(troid);
  }


 /**
  * Set the CanDelete.
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>Capability</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setCanDelete(Capability cooked)
      throws AccessPoemException {
    _getProtectedTable().
      getCanDeleteColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setCanDelete_unsafe(null);
    else {
      cooked.existenceLock();
      setCanDelete_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>CanDelete</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer canDelete
  */
  public Field getCanDeleteField() throws AccessPoemException {
    Column c = _getProtectedTable().getCanDeleteColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>CanSelect</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer canSelect
  */
  public Integer getCanSelect_unsafe() {
    return canSelect;
  }


 /**
  * Sets the <code>CanSelect</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setCanSelect_unsafe(Integer cooked) {
    canSelect = cooked;
  }

 /**
  * Retrieves the Table Row Object ID. 
  *
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @return the TROID as an <code>Integer</code> 
  */

  public Integer getCanSelectTroid()
      throws AccessPoemException {
    readLock();
    return getCanSelect_unsafe();
  }


 /**
  * Sets the Table Row Object ID. 
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param raw  a Table Row Object Id 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  */
  public void setCanSelectTroid(Integer raw)
      throws AccessPoemException {
    setCanSelect(raw == null ? null : 
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(raw));
  }


 /**
  * Retrieves the <code>CanSelect</code> object referred to.
  *  
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer read access rights 
  * @throws NoSuchRowPoemException  
  *         if the <code>Persistent</code> has yet to be allocated a TROID 
  * @return the <code>CanSelect</code> as a <code>Capability</code> 
  */
  public Capability getCanSelect()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCanSelectTroid();
    return troid == null ? null :
        getEverythingDatabaseTables().getCapabilityTable().getCapabilityObject(troid);
  }


 /**
  * Set the CanSelect.
  * 
  * @generator org.melati.poem.prepro.ReferenceFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>Capability</code>
  * @throws AccessPoemException  
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  */
  public void setCanSelect(Capability cooked)
      throws AccessPoemException {
    _getProtectedTable().
      getCanSelectColumn().
        getType().assertValidCooked(cooked);
    writeLock();
    if (cooked == null)
      setCanSelect_unsafe(null);
    else {
      cooked.existenceLock();
      setCanSelect_unsafe(cooked.troid());
    }
  }


 /**
  * Retrieves the <code>CanSelect</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer canSelect
  */
  public Field getCanSelectField() throws AccessPoemException {
    Column c = _getProtectedTable().getCanSelectColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Deleted</code> value, without locking, 
  * for this <code>Protected</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Boolean deleted
  */
  public Boolean getDeleted_unsafe() {
    return deleted;
  }


 /**
  * Sets the <code>Deleted</code> value directly, without checking, 
  * for this Protected <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setDeleted_unsafe(Boolean cooked) {
    deleted = cooked;
  }

 /**
  * Retrieves the Deleted value, with locking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * Field description: 
  *   Whether this record is existant  
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Deleted</code> for this 
  *         <code>Protected</code> <code>Persistent</code>  
  */

  public Boolean getDeleted()
      throws AccessPoemException {
    readLock();
    return getDeleted_unsafe();
  }


 /**
  * Sets the <code>Deleted</code> value, with checking, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * Field description: 
  *   Whether this record is existant  
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setDeleted(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getProtectedTable().getDeletedColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setDeleted_unsafe(cooked);
  }

 /**
  * Sets the <code>Deleted</code> value, with checking, 
  * from a <code>boolean</code>, for this 
  * <code>Protected</code> <code>Persistent</code>.
  * Field description: 
  *   Whether this record is existant  
  * 
  * 
  * @generator org.melati.poem.prepro.BooleanFieldDef#generateBaseMethods 
  * @param cooked  a <code>boolean</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setDeleted(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setDeleted(cooked ? Boolean.TRUE : Boolean.FALSE);
  }


 /**
  * Retrieves the <code>Deleted</code> value as a <code>Field</code>
  * from this <code>Protected</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Boolean deleted
  */
  public Field getDeletedField() throws AccessPoemException {
    Column c = _getProtectedTable().getDeletedColumn();
    return new Field(c.getRaw(this), c);
  }
}

