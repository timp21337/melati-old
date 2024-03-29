// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.BinaryFieldTable;
import org.melati.poem.test.EverythingDatabaseTables;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>BinaryField</code> Object.
 *
 * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class BinaryFieldBase extends JdbcPersistent {


 /**
  * Retrieves the Database object.
  * 
  * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the database
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>BinaryFieldTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the BinaryFieldTable
  */
  public BinaryFieldTable getBinaryFieldTable() {
    return (BinaryFieldTable)getTable();
  }

  private BinaryFieldTable _getBinaryFieldTable() {
    return (BinaryFieldTable)getTable();
  }

  // Fields in this table 
 /**
  * Id 
  */
  protected Integer id;
 /**
  * Binaryfield 
  */
  protected byte[] binaryfield;
 /**
  * Binaryfield 
  */
  protected byte[] unlimited;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>BinaryField</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this BinaryField <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>BinaryField</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
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
    _getBinaryFieldTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
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
  * from this <code>BinaryField</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field<Integer> getIdField() throws AccessPoemException {
    Column<Integer> c = _getBinaryFieldTable().getIdColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Binaryfield</code> value, without locking, 
  * for this <code>BinaryField</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the byte[] binaryfield
  */
  public byte[] getBinaryfield_unsafe() {
    return binaryfield;
  }


 /**
  * Sets the <code>Binaryfield</code> value directly, without checking, 
  * for this BinaryField <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBinaryfield_unsafe(byte[] cooked) {
    binaryfield = cooked;
  }

 /**
  * Retrieves the Binaryfield value, with locking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Binaryfield</code> for this 
  *         <code>BinaryField</code> <code>Persistent</code>  
  */

  public byte[] getBinaryfield()
      throws AccessPoemException {
    readLock();
    return getBinaryfield_unsafe();
  }


 /**
  * Sets the <code>Binaryfield</code> value, with checking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBinaryfield(byte[] cooked)
      throws AccessPoemException, ValidationPoemException {
    _getBinaryFieldTable().getBinaryfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setBinaryfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Binaryfield</code> value as a <code>Field</code>
  * from this <code>BinaryField</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the byte[] binaryfield
  */
  public Field<byte[]> getBinaryfieldField() throws AccessPoemException {
    Column<byte[]> c = _getBinaryFieldTable().getBinaryfieldColumn();
    return new Field<byte[]>((byte[])c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Unlimited</code> value, without locking, 
  * for this <code>BinaryField</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the byte[] unlimited
  */
  public byte[] getUnlimited_unsafe() {
    return unlimited;
  }


 /**
  * Sets the <code>Unlimited</code> value directly, without checking, 
  * for this BinaryField <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setUnlimited_unsafe(byte[] cooked) {
    unlimited = cooked;
  }

 /**
  * Retrieves the Unlimited value, with locking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Unlimited</code> for this 
  *         <code>BinaryField</code> <code>Persistent</code>  
  */

  public byte[] getUnlimited()
      throws AccessPoemException {
    readLock();
    return getUnlimited_unsafe();
  }


 /**
  * Sets the <code>Unlimited</code> value, with checking, for this 
  * <code>BinaryField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setUnlimited(byte[] cooked)
      throws AccessPoemException, ValidationPoemException {
    _getBinaryFieldTable().getUnlimitedColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setUnlimited_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Unlimited</code> value as a <code>Field</code>
  * from this <code>BinaryField</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the byte[] unlimited
  */
  public Field<byte[]> getUnlimitedField() throws AccessPoemException {
    Column<byte[]> c = _getBinaryFieldTable().getUnlimitedColumn();
    return new Field<byte[]>((byte[])c.getRaw(this), c);
  }

}

