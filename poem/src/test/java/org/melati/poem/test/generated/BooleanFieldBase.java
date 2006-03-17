// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.BooleanFieldTable;
import org.melati.poem.test.TestDatabaseTables;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>BooleanField</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
 */
public abstract class BooleanFieldBase extends Persistent {


 /**
  * Retrieves the Database object.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the database
  */
  public TestDatabaseTables getTestDatabaseTables() {
    return (TestDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>BooleanFieldTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the BooleanFieldTable
  */
  public BooleanFieldTable getBooleanFieldTable() {
    return (BooleanFieldTable)getTable();
  }

  private BooleanFieldTable _getBooleanFieldTable() {
    return (BooleanFieldTable)getTable();
  }

  // Fields in this table 
 /**
  * Id 
  */
  protected Integer id;
 /**
  * Boolean Field 
  */
  protected Boolean booleanfield;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>BooleanField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this BooleanField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>BooleanField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>BooleanField</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>BooleanField</code> <code>Persistent</code>.
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
    _getBooleanFieldTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>BooleanField</code> <code>Persistent</code>.
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
  * from this <code>BooleanField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field getIdField() throws AccessPoemException {
    Column c = _getBooleanFieldTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Booleanfield</code> value, without locking, 
  * for this <code>BooleanField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Boolean booleanfield
  */
  public Boolean getBooleanfield_unsafe() {
    return booleanfield;
  }


 /**
  * Sets the <code>Booleanfield</code> value directly, without checking, 
  * for this BooleanField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBooleanfield_unsafe(Boolean cooked) {
    booleanfield = cooked;
  }

 /**
  * Retrieves the Booleanfield value, with locking, for this 
  * <code>BooleanField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Booleanfield</code> for this 
  *         <code>BooleanField</code> <code>Persistent</code>  
  */

  public Boolean getBooleanfield()
      throws AccessPoemException {
    readLock();
    return getBooleanfield_unsafe();
  }


 /**
  * Sets the <code>Booleanfield</code> value, with checking, for this 
  * <code>BooleanField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBooleanfield(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getBooleanFieldTable().getBooleanfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setBooleanfield_unsafe(cooked);
  }

 /**
  * Sets the <code>Booleanfield</code> value, with checking, 
  * from a <code>boolean</code>, for this 
  * <code>BooleanField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.BooleanFieldDef#generateBaseMethods 
  * @param cooked  a <code>boolean</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setBooleanfield(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setBooleanfield(cooked ? Boolean.TRUE : Boolean.FALSE);
  }


 /**
  * Retrieves the <code>Booleanfield</code> value as a <code>Field</code>
  * from this <code>BooleanField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Boolean booleanfield
  */
  public Field getBooleanfieldField() throws AccessPoemException {
    Column c = _getBooleanFieldTable().getBooleanfieldColumn();
    return new Field(c.getRaw(this), c);
  }
}

