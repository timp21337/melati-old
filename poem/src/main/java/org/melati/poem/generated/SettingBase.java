// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.SettingTable;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.ValueInfo;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>Setting</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class SettingBase extends ValueInfo {


 /**
  * Retrieves the Database object.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the database
  */
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>SettingTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the SettingTable
  */
  public SettingTable getSettingTable() {
    return (SettingTable)getTable();
  }

  private SettingTable _getSettingTable() {
    return (SettingTable)getTable();
  }

  // Fields in this table 
 /**
  * id - The Table Row Object ID 
  */
  protected Integer id;
 /**
  * name - A code name for this setting 
  */
  protected String name;
 /**
  * value - The value of this setting 
  */
  protected String value;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>Setting</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this Setting <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>Setting</code> <code>Persistent</code>.
  * Field description: 
  *   The Table Row Object ID 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>Setting</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Setting</code> <code>Persistent</code>.
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
    _getSettingTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>Setting</code> <code>Persistent</code>.
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
  * from this <code>Setting</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field getIdField() throws AccessPoemException {
    Column c = _getSettingTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Name</code> value, without locking, 
  * for this <code>Setting</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String name
  */
  public String getName_unsafe() {
    return name;
  }


 /**
  * Sets the <code>Name</code> value directly, without checking, 
  * for this Setting <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setName_unsafe(String cooked) {
    name = cooked;
  }

 /**
  * Retrieves the Name value, with locking, for this 
  * <code>Setting</code> <code>Persistent</code>.
  * Field description: 
  *   A code name for this setting 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Name</code> for this 
  *         <code>Setting</code> <code>Persistent</code>  
  */

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }


 /**
  * Sets the <code>Name</code> value, with checking, for this 
  * <code>Setting</code> <code>Persistent</code>.
  * Field description: 
  *   A code name for this setting 
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
    _getSettingTable().getNameColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Name</code> value as a <code>Field</code>
  * from this <code>Setting</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String name
  */
  public Field getNameField() throws AccessPoemException {
    Column c = _getSettingTable().getNameColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Value</code> value, without locking, 
  * for this <code>Setting</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String value
  */
  public String getValue_unsafe() {
    return value;
  }


 /**
  * Sets the <code>Value</code> value directly, without checking, 
  * for this Setting <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setValue_unsafe(String cooked) {
    value = cooked;
  }

 /**
  * Retrieves the Value value, with locking, for this 
  * <code>Setting</code> <code>Persistent</code>.
  * Field description: 
  *   The value of this setting 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Value</code> for this 
  *         <code>Setting</code> <code>Persistent</code>  
  */

  public String getValue()
      throws AccessPoemException {
    readLock();
    return getValue_unsafe();
  }


 /**
  * Sets the <code>Value</code> value, with checking, for this 
  * <code>Setting</code> <code>Persistent</code>.
  * Field description: 
  *   The value of this setting 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setValue(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getSettingTable().getValueColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setValue_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Value</code> value as a <code>Field</code>
  * from this <code>Setting</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String value
  */
  public Field getValueField() throws AccessPoemException {
    Column c = _getSettingTable().getValueColumn();
    return new Field(c.getRaw(this), c);
  }
}

