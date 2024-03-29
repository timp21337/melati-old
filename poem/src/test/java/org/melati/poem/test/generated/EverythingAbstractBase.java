// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingAbstractTable;
import org.melati.poem.test.EverythingDatabaseTables;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>EverythingAbstract</code> Object.
 *
 * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class EverythingAbstractBase extends JdbcPersistent {


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
  * Retrieves the  <code>EverythingAbstractTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the EverythingAbstractTable
  */
  public EverythingAbstractTable getEverythingAbstractTable() {
    return (EverythingAbstractTable)getTable();
  }

  private EverythingAbstractTable _getEverythingAbstractTable() {
    return (EverythingAbstractTable)getTable();
  }

  // Fields in this table 
 /**
  * Binaryfield 
  */
  protected byte[] binaryfield;
 /**
  * String Field 
  */
  protected String stringfield;
 /**
  * Password Field 
  */
  protected String passwordfield;
 /**
  * Boolean Field 
  */
  protected Boolean booleanfield;
 /**
  * Date Field 
  */
  protected Date datefield;
 /**
  * Double Field 
  */
  protected Double doublefield;
 /**
  * Integer Field 
  */
  protected Integer integerfield;
 /**
  * Long Field 
  */
  protected Long longfield;
 /**
  * BigDecimal Field 
  */
  protected BigDecimal bigdecimalfield;
 /**
  * Timestamp Field 
  */
  protected Timestamp timestampfield;


 /**
  * Retrieves the <code>Binaryfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the byte[] binaryfield
  */
  public byte[] getBinaryfield_unsafe() {
    return binaryfield;
  }


 /**
  * Sets the <code>Binaryfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBinaryfield_unsafe(byte[] cooked) {
    binaryfield = cooked;
  }

 /**
  * Retrieves the Binaryfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Binaryfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public byte[] getBinaryfield()
      throws AccessPoemException {
    readLock();
    return getBinaryfield_unsafe();
  }


 /**
  * Sets the <code>Binaryfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
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
    _getEverythingAbstractTable().getBinaryfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setBinaryfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Binaryfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the byte[] binaryfield
  */
  public Field<byte[]> getBinaryfieldField() throws AccessPoemException {
    Column<byte[]> c = _getEverythingAbstractTable().getBinaryfieldColumn();
    return new Field<byte[]>((byte[])c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Stringfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String stringfield
  */
  public String getStringfield_unsafe() {
    return stringfield;
  }


 /**
  * Sets the <code>Stringfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setStringfield_unsafe(String cooked) {
    stringfield = cooked;
  }

 /**
  * Retrieves the Stringfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Stringfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public String getStringfield()
      throws AccessPoemException {
    readLock();
    return getStringfield_unsafe();
  }


 /**
  * Sets the <code>Stringfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setStringfield(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getStringfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setStringfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Stringfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String stringfield
  */
  public Field<String> getStringfieldField() throws AccessPoemException {
    Column<String> c = _getEverythingAbstractTable().getStringfieldColumn();
    return new Field<String>((String)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Passwordfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String passwordfield
  */
  public String getPasswordfield_unsafe() {
    return passwordfield;
  }


 /**
  * Sets the <code>Passwordfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setPasswordfield_unsafe(String cooked) {
    passwordfield = cooked;
  }

 /**
  * Retrieves the Passwordfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Passwordfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public String getPasswordfield()
      throws AccessPoemException {
    readLock();
    return getPasswordfield_unsafe();
  }


 /**
  * Sets the <code>Passwordfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setPasswordfield(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getPasswordfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setPasswordfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Passwordfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String passwordfield
  */
  public Field<String> getPasswordfieldField() throws AccessPoemException {
    Column<String> c = _getEverythingAbstractTable().getPasswordfieldColumn();
    return new Field<String>((String)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Booleanfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Boolean booleanfield
  */
  public Boolean getBooleanfield_unsafe() {
    return booleanfield;
  }


 /**
  * Sets the <code>Booleanfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBooleanfield_unsafe(Boolean cooked) {
    booleanfield = cooked;
  }

 /**
  * Retrieves the Booleanfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Booleanfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public Boolean getBooleanfield()
      throws AccessPoemException {
    readLock();
    return getBooleanfield_unsafe();
  }


 /**
  * Sets the <code>Booleanfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBooleanfield(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getBooleanfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setBooleanfield_unsafe(cooked);
  }

 /**
  * Sets the <code>Booleanfield</code> value, with checking, 
  * from a <code>boolean</code>, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.BooleanFieldDef#generateBaseMethods 
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
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Boolean booleanfield
  */
  public Field<Boolean> getBooleanfieldField() throws AccessPoemException {
    Column<Boolean> c = _getEverythingAbstractTable().getBooleanfieldColumn();
    return new Field<Boolean>((Boolean)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Datefield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Date datefield
  */
  public Date getDatefield_unsafe() {
    return datefield;
  }


 /**
  * Sets the <code>Datefield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setDatefield_unsafe(Date cooked) {
    datefield = cooked;
  }

 /**
  * Retrieves the Datefield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Datefield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public Date getDatefield()
      throws AccessPoemException {
    readLock();
    return getDatefield_unsafe();
  }


 /**
  * Sets the <code>Datefield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setDatefield(Date cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getDatefieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setDatefield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Datefield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Date datefield
  */
  public Field<Date> getDatefieldField() throws AccessPoemException {
    Column<Date> c = _getEverythingAbstractTable().getDatefieldColumn();
    return new Field<Date>((Date)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Doublefield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Double doublefield
  */
  public Double getDoublefield_unsafe() {
    return doublefield;
  }


 /**
  * Sets the <code>Doublefield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setDoublefield_unsafe(Double cooked) {
    doublefield = cooked;
  }

 /**
  * Retrieves the Doublefield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Doublefield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public Double getDoublefield()
      throws AccessPoemException {
    readLock();
    return getDoublefield_unsafe();
  }


 /**
  * Sets the <code>Doublefield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setDoublefield(Double cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getDoublefieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setDoublefield_unsafe(cooked);
  }

 /**
  * Sets the <code>Doublefield</code> value, with checking, for this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.DoubleFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setDoublefield(double cooked)
      throws AccessPoemException, ValidationPoemException {
    setDoublefield(new Double(cooked));
  }


 /**
  * Retrieves the <code>Doublefield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Double doublefield
  */
  public Field<Double> getDoublefieldField() throws AccessPoemException {
    Column<Double> c = _getEverythingAbstractTable().getDoublefieldColumn();
    return new Field<Double>((Double)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Integerfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer integerfield
  */
  public Integer getIntegerfield_unsafe() {
    return integerfield;
  }


 /**
  * Sets the <code>Integerfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setIntegerfield_unsafe(Integer cooked) {
    integerfield = cooked;
  }

 /**
  * Retrieves the Integerfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Integerfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public Integer getIntegerfield()
      throws AccessPoemException {
    readLock();
    return getIntegerfield_unsafe();
  }


 /**
  * Sets the <code>Integerfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setIntegerfield(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getIntegerfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setIntegerfield_unsafe(cooked);
  }

 /**
  * Sets the <code>Integerfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.IntegerFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code>
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setIntegerfield(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setIntegerfield(new Integer(cooked));
  }


 /**
  * Retrieves the <code>Integerfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer integerfield
  */
  public Field<Integer> getIntegerfieldField() throws AccessPoemException {
    Column<Integer> c = _getEverythingAbstractTable().getIntegerfieldColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Longfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Long longfield
  */
  public Long getLongfield_unsafe() {
    return longfield;
  }


 /**
  * Sets the <code>Longfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setLongfield_unsafe(Long cooked) {
    longfield = cooked;
  }

 /**
  * Retrieves the Longfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Longfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public Long getLongfield()
      throws AccessPoemException {
    readLock();
    return getLongfield_unsafe();
  }


 /**
  * Sets the <code>Longfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setLongfield(Long cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getLongfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setLongfield_unsafe(cooked);
  }

 /**
  * Sets the <code>Longfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.LongFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code>
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setLongfield(long cooked)
      throws AccessPoemException, ValidationPoemException {
    setLongfield(new Long(cooked));
  }


 /**
  * Retrieves the <code>Longfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Long longfield
  */
  public Field<Long> getLongfieldField() throws AccessPoemException {
    Column<Long> c = _getEverythingAbstractTable().getLongfieldColumn();
    return new Field<Long>((Long)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Bigdecimalfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the BigDecimal bigdecimalfield
  */
  public BigDecimal getBigdecimalfield_unsafe() {
    return bigdecimalfield;
  }


 /**
  * Sets the <code>Bigdecimalfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBigdecimalfield_unsafe(BigDecimal cooked) {
    bigdecimalfield = cooked;
  }

 /**
  * Retrieves the Bigdecimalfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Bigdecimalfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public BigDecimal getBigdecimalfield()
      throws AccessPoemException {
    readLock();
    return getBigdecimalfield_unsafe();
  }


 /**
  * Sets the <code>Bigdecimalfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBigdecimalfield(BigDecimal cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getBigdecimalfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setBigdecimalfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Bigdecimalfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the BigDecimal bigdecimalfield
  */
  public Field<BigDecimal> getBigdecimalfieldField() throws AccessPoemException {
    Column<BigDecimal> c = _getEverythingAbstractTable().getBigdecimalfieldColumn();
    return new Field<BigDecimal>((BigDecimal)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Timestampfield</code> value, without locking, 
  * for this <code>EverythingAbstract</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Timestamp timestampfield
  */
  public Timestamp getTimestampfield_unsafe() {
    return timestampfield;
  }


 /**
  * Sets the <code>Timestampfield</code> value directly, without checking, 
  * for this EverythingAbstract <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setTimestampfield_unsafe(Timestamp cooked) {
    timestampfield = cooked;
  }

 /**
  * Retrieves the Timestampfield value, with locking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Timestampfield</code> for this 
  *         <code>EverythingAbstract</code> <code>Persistent</code>  
  */

  public Timestamp getTimestampfield()
      throws AccessPoemException {
    readLock();
    return getTimestampfield_unsafe();
  }


 /**
  * Sets the <code>Timestampfield</code> value, with checking, for this 
  * <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setTimestampfield(Timestamp cooked)
      throws AccessPoemException, ValidationPoemException {
    _getEverythingAbstractTable().getTimestampfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setTimestampfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Timestampfield</code> value as a <code>Field</code>
  * from this <code>EverythingAbstract</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Timestamp timestampfield
  */
  public Field<Timestamp> getTimestampfieldField() throws AccessPoemException {
    Column<Timestamp> c = _getEverythingAbstractTable().getTimestampfieldColumn();
    return new Field<Timestamp>((Timestamp)c.getRaw(this), c);
  }

}

