// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.melati.poem.AccessPoemException;
import org.melati.poem.CachedSelection;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.GroupCapability;
import org.melati.poem.GroupMembership;
import org.melati.poem.GroupTable;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.util.EmptyEnumeration;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>Group</code> Object.
 *
 * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class GroupBase extends JdbcPersistent {


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
  * Retrieves the  <code>GroupTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the GroupTable
  */
  public GroupTable getGroupTable() {
    return (GroupTable)getTable();
  }

  private GroupTable _getGroupTable() {
    return (GroupTable)getTable();
  }

  // Fields in this table 
 /**
  * id - The Table Row Object ID 
  */
  protected Integer id;
 /**
  * name - A human-readable name for the group 
  */
  protected String name;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>Group</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this Group <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>Group</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>Group</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Group</code> <code>Persistent</code>.
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
    _getGroupTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Group</code> <code>Persistent</code>.
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
  * from this <code>Group</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field<Integer> getIdField() throws AccessPoemException {
    Column<Integer> c = _getGroupTable().getIdColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Name</code> value, without locking, 
  * for this <code>Group</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String name
  */
  public String getName_unsafe() {
    return name;
  }


 /**
  * Sets the <code>Name</code> value directly, without checking, 
  * for this Group <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setName_unsafe(String cooked) {
    name = cooked;
  }

 /**
  * Retrieves the Name value, with locking, for this 
  * <code>Group</code> <code>Persistent</code>.
  * Field description: 
  *   A human-readable name for the group 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Name</code> for this 
  *         <code>Group</code> <code>Persistent</code>  
  */

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }


 /**
  * Sets the <code>Name</code> value, with checking, for this 
  * <code>Group</code> <code>Persistent</code>.
  * Field description: 
  *   A human-readable name for the group 
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
    _getGroupTable().getNameColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Name</code> value as a <code>Field</code>
  * from this <code>Group</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String name
  */
  public Field<String> getNameField() throws AccessPoemException {
    Column<String> c = _getGroupTable().getNameColumn();
    return new Field<String>((String)c.getRaw(this), c);
  }

  private CachedSelection<GroupMembership> groupGroupMemberships = null;
  /** References to this Group in the GroupMembership table via its group field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<GroupMembership> getGroupGroupMemberships() {
    if (getTroid() == null)
      return new EmptyEnumeration<GroupMembership>();
    else {
      if (groupGroupMemberships == null)
        groupGroupMemberships =
          getPoemDatabaseTables().getGroupMembershipTable().getGroupColumn().cachedSelectionWhereEq(getTroid());
      return groupGroupMemberships.objects();
    }
  }


  /** References to this Group in the GroupMembership table via its group field, as a List.*/
  public List<GroupMembership> getGroupGroupMembershipList() {
    return Collections.list(getGroupGroupMemberships());
  }



  private CachedSelection<GroupCapability> groupGroupCapabilitys = null;
  /** References to this Group in the GroupCapability table via its group field.*/
  @SuppressWarnings("unchecked")
  public Enumeration<GroupCapability> getGroupGroupCapabilitys() {
    if (getTroid() == null)
      return new EmptyEnumeration<GroupCapability>();
    else {
      if (groupGroupCapabilitys == null)
        groupGroupCapabilitys =
          getPoemDatabaseTables().getGroupCapabilityTable().getGroupColumn().cachedSelectionWhereEq(getTroid());
      return groupGroupCapabilitys.objects();
    }
  }


  /** References to this Group in the GroupCapability table via its group field, as a List.*/
  public List<GroupCapability> getGroupGroupCapabilityList() {
    return Collections.list(getGroupGroupCapabilitys());
  }



}

