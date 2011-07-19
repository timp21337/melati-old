// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.ENExtendedTable;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingNormal;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>ENExtended</code> Object.
 *
 * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class ENExtendedBase extends EverythingNormal {


 /**
  * Retrieves the Database object.
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the database
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>ENExtendedTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the ENExtendedTable
  */
  public ENExtendedTable getENExtendedTable() {
    return (ENExtendedTable)getTable();
  }

  private ENExtendedTable _getENExtendedTable() {
    return (ENExtendedTable)getTable();
  }

  // Fields in this table 
 /**
  * Binaryfield2 - Second Binary Field 
  */
  protected byte[] binaryfield2;
 /**
  * String Field 2 - Second String Field 
  */
  protected String stringfield2;
 /**
  * Password Field 2 - Second Password Field 
  */
  protected String passwordfield2;
 /**
  * Boolean Field 2 - Second Boolean Field 
  */
  protected Boolean booleanfield2;
 /**
  * Date Field 2 - Second Date Field 
  */
  protected Date datefield2;
 /**
  * Double Field 2 - Second Double Field 
  */
  protected Double doublefield2;
 /**
  * Integer Field 2 - Second Integer Field 
  */
  protected Integer integerfield2;
 /**
  * Long Field 2 - Second Long Field 
  */
  protected Long longfield2;
 /**
  * BigDecimal Field 2 - Second BigDecimal Field 
  */
  protected BigDecimal bigdecimalfield2;
 /**
  * Timestamp Field 2 - Second Timestamp Field 
  */
  protected Timestamp timestampfield2;


 /**
  * Retrieves the <code>Binaryfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the byte[] binaryfield2
  */
  public byte[] getBinaryfield2_unsafe() {
    return binaryfield2;
  }


 /**
  * Sets the <code>Binaryfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBinaryfield2_unsafe(byte[] cooked) {
    binaryfield2 = cooked;
  }

 /**
  * Retrieves the Binaryfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Binary Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Binaryfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public byte[] getBinaryfield2()
      throws AccessPoemException {
    readLock();
    return getBinaryfield2_unsafe();
  }


 /**
  * Sets the <code>Binaryfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Binary Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBinaryfield2(byte[] cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getBinaryfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setBinaryfield2_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Binaryfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the byte[] binaryfield2
  */
  public Field<byte[]> getBinaryfield2Field() throws AccessPoemException {
    Column<byte[]> c = _getENExtendedTable().getBinaryfield2Column();
    return new Field<byte[]>((byte[])c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Stringfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String stringfield2
  */
  public String getStringfield2_unsafe() {
    return stringfield2;
  }


 /**
  * Sets the <code>Stringfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setStringfield2_unsafe(String cooked) {
    stringfield2 = cooked;
  }

 /**
  * Retrieves the Stringfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second String Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Stringfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public String getStringfield2()
      throws AccessPoemException {
    readLock();
    return getStringfield2_unsafe();
  }


 /**
  * Sets the <code>Stringfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second String Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setStringfield2(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getStringfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setStringfield2_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Stringfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String stringfield2
  */
  public Field<String> getStringfield2Field() throws AccessPoemException {
    Column<String> c = _getENExtendedTable().getStringfield2Column();
    return new Field<String>((String)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Passwordfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String passwordfield2
  */
  public String getPasswordfield2_unsafe() {
    return passwordfield2;
  }


 /**
  * Sets the <code>Passwordfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setPasswordfield2_unsafe(String cooked) {
    passwordfield2 = cooked;
  }

 /**
  * Retrieves the Passwordfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Password Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Passwordfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public String getPasswordfield2()
      throws AccessPoemException {
    readLock();
    return getPasswordfield2_unsafe();
  }


 /**
  * Sets the <code>Passwordfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Password Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setPasswordfield2(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getPasswordfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setPasswordfield2_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Passwordfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String passwordfield2
  */
  public Field<String> getPasswordfield2Field() throws AccessPoemException {
    Column<String> c = _getENExtendedTable().getPasswordfield2Column();
    return new Field<String>((String)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Booleanfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Boolean booleanfield2
  */
  public Boolean getBooleanfield2_unsafe() {
    return booleanfield2;
  }


 /**
  * Sets the <code>Booleanfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBooleanfield2_unsafe(Boolean cooked) {
    booleanfield2 = cooked;
  }

 /**
  * Retrieves the Booleanfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Boolean Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Booleanfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public Boolean getBooleanfield2()
      throws AccessPoemException {
    readLock();
    return getBooleanfield2_unsafe();
  }


 /**
  * Sets the <code>Booleanfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Boolean Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBooleanfield2(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getBooleanfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setBooleanfield2_unsafe(cooked);
  }

 /**
  * Sets the <code>Booleanfield2</code> value, with checking, 
  * from a <code>boolean</code>, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Boolean Field 
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

  public final void setBooleanfield2(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setBooleanfield2(cooked ? Boolean.TRUE : Boolean.FALSE);
  }


 /**
  * Retrieves the <code>Booleanfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Boolean booleanfield2
  */
  public Field<Boolean> getBooleanfield2Field() throws AccessPoemException {
    Column<Boolean> c = _getENExtendedTable().getBooleanfield2Column();
    return new Field<Boolean>((Boolean)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Datefield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Date datefield2
  */
  public Date getDatefield2_unsafe() {
    return datefield2;
  }


 /**
  * Sets the <code>Datefield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setDatefield2_unsafe(Date cooked) {
    datefield2 = cooked;
  }

 /**
  * Retrieves the Datefield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Date Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Datefield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public Date getDatefield2()
      throws AccessPoemException {
    readLock();
    return getDatefield2_unsafe();
  }


 /**
  * Sets the <code>Datefield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Date Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setDatefield2(Date cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getDatefield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setDatefield2_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Datefield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Date datefield2
  */
  public Field<Date> getDatefield2Field() throws AccessPoemException {
    Column<Date> c = _getENExtendedTable().getDatefield2Column();
    return new Field<Date>((Date)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Doublefield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Double doublefield2
  */
  public Double getDoublefield2_unsafe() {
    return doublefield2;
  }


 /**
  * Sets the <code>Doublefield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setDoublefield2_unsafe(Double cooked) {
    doublefield2 = cooked;
  }

 /**
  * Retrieves the Doublefield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Double Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Doublefield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public Double getDoublefield2()
      throws AccessPoemException {
    readLock();
    return getDoublefield2_unsafe();
  }


 /**
  * Sets the <code>Doublefield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Double Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setDoublefield2(Double cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getDoublefield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setDoublefield2_unsafe(cooked);
  }

 /**
  * Sets the <code>Doublefield2</code> value, with checking, for this <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Double Field 
  * 
  * 
  * @generator org.melati.poem.prepro.DoubleFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setDoublefield2(double cooked)
      throws AccessPoemException, ValidationPoemException {
    setDoublefield2(new Double(cooked));
  }


 /**
  * Retrieves the <code>Doublefield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Double doublefield2
  */
  public Field<Double> getDoublefield2Field() throws AccessPoemException {
    Column<Double> c = _getENExtendedTable().getDoublefield2Column();
    return new Field<Double>((Double)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Integerfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer integerfield2
  */
  public Integer getIntegerfield2_unsafe() {
    return integerfield2;
  }


 /**
  * Sets the <code>Integerfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setIntegerfield2_unsafe(Integer cooked) {
    integerfield2 = cooked;
  }

 /**
  * Retrieves the Integerfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Integer Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Integerfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public Integer getIntegerfield2()
      throws AccessPoemException {
    readLock();
    return getIntegerfield2_unsafe();
  }


 /**
  * Sets the <code>Integerfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Integer Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setIntegerfield2(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getIntegerfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setIntegerfield2_unsafe(cooked);
  }

 /**
  * Sets the <code>Integerfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Integer Field 
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

  public final void setIntegerfield2(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setIntegerfield2(new Integer(cooked));
  }


 /**
  * Retrieves the <code>Integerfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer integerfield2
  */
  public Field<Integer> getIntegerfield2Field() throws AccessPoemException {
    Column<Integer> c = _getENExtendedTable().getIntegerfield2Column();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Longfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Long longfield2
  */
  public Long getLongfield2_unsafe() {
    return longfield2;
  }


 /**
  * Sets the <code>Longfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setLongfield2_unsafe(Long cooked) {
    longfield2 = cooked;
  }

 /**
  * Retrieves the Longfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Long Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Longfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public Long getLongfield2()
      throws AccessPoemException {
    readLock();
    return getLongfield2_unsafe();
  }


 /**
  * Sets the <code>Longfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Long Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setLongfield2(Long cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getLongfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setLongfield2_unsafe(cooked);
  }

 /**
  * Sets the <code>Longfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Long Field 
  * 
  * 
  * @generator org.melati.poem.prepro.LongFieldDef#generateBaseMethods 
  * @param cooked  a validated <code>int</code>
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */

  public final void setLongfield2(long cooked)
      throws AccessPoemException, ValidationPoemException {
    setLongfield2(new Long(cooked));
  }


 /**
  * Retrieves the <code>Longfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Long longfield2
  */
  public Field<Long> getLongfield2Field() throws AccessPoemException {
    Column<Long> c = _getENExtendedTable().getLongfield2Column();
    return new Field<Long>((Long)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Bigdecimalfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the BigDecimal bigdecimalfield2
  */
  public BigDecimal getBigdecimalfield2_unsafe() {
    return bigdecimalfield2;
  }


 /**
  * Sets the <code>Bigdecimalfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBigdecimalfield2_unsafe(BigDecimal cooked) {
    bigdecimalfield2 = cooked;
  }

 /**
  * Retrieves the Bigdecimalfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second BigDecimal Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Bigdecimalfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public BigDecimal getBigdecimalfield2()
      throws AccessPoemException {
    readLock();
    return getBigdecimalfield2_unsafe();
  }


 /**
  * Sets the <code>Bigdecimalfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second BigDecimal Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBigdecimalfield2(BigDecimal cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getBigdecimalfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setBigdecimalfield2_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Bigdecimalfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the BigDecimal bigdecimalfield2
  */
  public Field<BigDecimal> getBigdecimalfield2Field() throws AccessPoemException {
    Column<BigDecimal> c = _getENExtendedTable().getBigdecimalfield2Column();
    return new Field<BigDecimal>((BigDecimal)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Timestampfield2</code> value, without locking, 
  * for this <code>ENExtended</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Timestamp timestampfield2
  */
  public Timestamp getTimestampfield2_unsafe() {
    return timestampfield2;
  }


 /**
  * Sets the <code>Timestampfield2</code> value directly, without checking, 
  * for this ENExtended <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setTimestampfield2_unsafe(Timestamp cooked) {
    timestampfield2 = cooked;
  }

 /**
  * Retrieves the Timestampfield2 value, with locking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Timestamp Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Timestampfield2</code> for this 
  *         <code>ENExtended</code> <code>Persistent</code>  
  */

  public Timestamp getTimestampfield2()
      throws AccessPoemException {
    readLock();
    return getTimestampfield2_unsafe();
  }


 /**
  * Sets the <code>Timestampfield2</code> value, with checking, for this 
  * <code>ENExtended</code> <code>Persistent</code>.
  * Field description: 
  *   Second Timestamp Field 
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setTimestampfield2(Timestamp cooked)
      throws AccessPoemException, ValidationPoemException {
    _getENExtendedTable().getTimestampfield2Column().
      getType().assertValidCooked(cooked);
    writeLock();
    setTimestampfield2_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Timestampfield2</code> value as a <code>Field</code>
  * from this <code>ENExtended</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Timestamp timestampfield2
  */
  public Field<Timestamp> getTimestampfield2Field() throws AccessPoemException {
    Column<Timestamp> c = _getENExtendedTable().getTimestampfield2Column();
    return new Field<Timestamp>((Timestamp)c.getRaw(this), c);
  }

}

