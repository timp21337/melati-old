// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.melati.poem.AccessPoemException;
import org.melati.poem.CachedSelection;
import org.melati.poem.CapabilityTable;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.GroupCapability;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.TableInfo;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.util.EmptyEnumeration;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>Capability</code> Object.
 *
 * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class CapabilityBase extends JdbcPersistent {


 /**
  * Retrieves the Database object.
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the database
  */
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>CapabilityTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the CapabilityTable
  */
  public CapabilityTable getCapabilityTable() {
    return (CapabilityTable)getTable();
  }

  private CapabilityTable _getCapabilityTable() {
    return (CapabilityTable)getTable();
  }

  // Fields in this table 
 /**
  * id - The Table Row Object ID 
  */
  protected Integer id;
 /**
  * name - A human-readable name for the Capability 
  */
  protected String name;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>Capability</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this Capability <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>Capability</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>Capability</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Capability</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
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
    _getCapabilityTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Capability</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
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
  * from this <code>Capability</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field<Integer> getIdField() throws AccessPoemException {
    Column<Integer> c = _getCapabilityTable().getIdColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Name</code> value, without locking, 
  * for this <code>Capability</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String name
  */
  public String getName_unsafe() {
    return name;
  }


 /**
  * Sets the <code>Name</code> value directly, without checking, 
  * for this Capability <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setName_unsafe(String cooked) {
    name = cooked;
  }

 /**
  * Retrieves the Name value, with locking, for this 
  * <code>Capability</code> <code>Persistent</code>.
  * Field description: 
  *   A human-readable name for the Capability 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Name</code> for this 
  *         <code>Capability</code> <code>Persistent</code>  
  */

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }


 /**
  * Sets the <code>Name</code> value, with checking, for this 
  * <code>Capability</code> <code>Persistent</code>.
  * Field description: 
  *   A human-readable name for the Capability 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setName(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getCapabilityTable().getNameColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Name</code> value as a <code>Field</code>
  * from this <code>Capability</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String name
  */
  public Field<String> getNameField() throws AccessPoemException {
    Column<String> c = _getCapabilityTable().getNameColumn();
    return new Field<String>((String)c.getRaw(this), c);
  }

  private CachedSelection<GroupCapability> capabilityGroupCapabilitys = null;
  /** References to this in the GroupCapability table via its capability field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<GroupCapability> getCapabilityGroupCapabilitys() {
    if (getTroid() == null)
      return new EmptyEnumeration<GroupCapability>();
    else {
      if (capabilityGroupCapabilitys == null)
        capabilityGroupCapabilitys =
          getPoemDatabaseTables().getGroupCapabilityTable().getCapabilityColumn().cachedSelectionWhereEq(getTroid());
      return capabilityGroupCapabilitys.objects();
    }
  }


  /** References to this in the GroupCapability table via its capability field, as a List.*/
  public List<GroupCapability> getCapabilityGroupCapabilitysList() {
    return Collections.list(getCapabilityGroupCapabilitys());
  }



  private CachedSelection<TableInfo> defaultcanreadTableInfos = null;
  /** References to this in the TableInfo table via its defaultcanread field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<TableInfo> getDefaultcanreadTableInfos() {
    if (getTroid() == null)
      return new EmptyEnumeration<TableInfo>();
    else {
      if (defaultcanreadTableInfos == null)
        defaultcanreadTableInfos =
          getPoemDatabaseTables().getTableInfoTable().getDefaultcanreadColumn().cachedSelectionWhereEq(getTroid());
      return defaultcanreadTableInfos.objects();
    }
  }


  /** References to this in the TableInfo table via its defaultcanread field, as a List.*/
  public List<TableInfo> getDefaultcanreadTableInfosList() {
    return Collections.list(getDefaultcanreadTableInfos());
  }



  private CachedSelection<TableInfo> defaultcanwriteTableInfos = null;
  /** References to this in the TableInfo table via its defaultcanwrite field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<TableInfo> getDefaultcanwriteTableInfos() {
    if (getTroid() == null)
      return new EmptyEnumeration<TableInfo>();
    else {
      if (defaultcanwriteTableInfos == null)
        defaultcanwriteTableInfos =
          getPoemDatabaseTables().getTableInfoTable().getDefaultcanwriteColumn().cachedSelectionWhereEq(getTroid());
      return defaultcanwriteTableInfos.objects();
    }
  }


  /** References to this in the TableInfo table via its defaultcanwrite field, as a List.*/
  public List<TableInfo> getDefaultcanwriteTableInfosList() {
    return Collections.list(getDefaultcanwriteTableInfos());
  }



  private CachedSelection<TableInfo> defaultcandeleteTableInfos = null;
  /** References to this in the TableInfo table via its defaultcandelete field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<TableInfo> getDefaultcandeleteTableInfos() {
    if (getTroid() == null)
      return new EmptyEnumeration<TableInfo>();
    else {
      if (defaultcandeleteTableInfos == null)
        defaultcandeleteTableInfos =
          getPoemDatabaseTables().getTableInfoTable().getDefaultcandeleteColumn().cachedSelectionWhereEq(getTroid());
      return defaultcandeleteTableInfos.objects();
    }
  }


  /** References to this in the TableInfo table via its defaultcandelete field, as a List.*/
  public List<TableInfo> getDefaultcandeleteTableInfosList() {
    return Collections.list(getDefaultcandeleteTableInfos());
  }



  private CachedSelection<TableInfo> cancreateTableInfos = null;
  /** References to this in the TableInfo table via its cancreate field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<TableInfo> getCancreateTableInfos() {
    if (getTroid() == null)
      return new EmptyEnumeration<TableInfo>();
    else {
      if (cancreateTableInfos == null)
        cancreateTableInfos =
          getPoemDatabaseTables().getTableInfoTable().getCancreateColumn().cachedSelectionWhereEq(getTroid());
      return cancreateTableInfos.objects();
    }
  }


  /** References to this in the TableInfo table via its cancreate field, as a List.*/
  public List<TableInfo> getCancreateTableInfosList() {
    return Collections.list(getCancreateTableInfos());
  }



}

