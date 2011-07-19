// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import java.math.BigDecimal;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.BigdecimalFieldTable;
import org.melati.poem.test.EverythingDatabaseTables;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>BigdecimalField</code> Object.
 *
 * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class BigdecimalFieldBase extends JdbcPersistent {


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
  * Retrieves the  <code>BigdecimalFieldTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the BigdecimalFieldTable
  */
  public BigdecimalFieldTable getBigdecimalFieldTable() {
    return (BigdecimalFieldTable)getTable();
  }

  private BigdecimalFieldTable _getBigdecimalFieldTable() {
    return (BigdecimalFieldTable)getTable();
  }

  // Fields in this table 
 /**
  * Id 
  */
  protected Integer id;
 /**
  * BigDecimal Field 
  */
  protected BigDecimal bigdecimalfield;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>BigdecimalField</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this BigdecimalField <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>BigdecimalField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>BigdecimalField</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>BigdecimalField</code> <code>Persistent</code>.
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
    _getBigdecimalFieldTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>BigdecimalField</code> <code>Persistent</code>.
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
  * from this <code>BigdecimalField</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field<Integer> getIdField() throws AccessPoemException {
    Column<Integer> c = _getBigdecimalFieldTable().getIdColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Bigdecimalfield</code> value, without locking, 
  * for this <code>BigdecimalField</code> <code>Persistent</code>.
  *
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the BigDecimal bigdecimalfield
  */
  public BigDecimal getBigdecimalfield_unsafe() {
    return bigdecimalfield;
  }


 /**
  * Sets the <code>Bigdecimalfield</code> value directly, without checking, 
  * for this BigdecimalField <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setBigdecimalfield_unsafe(BigDecimal cooked) {
    bigdecimalfield = cooked;
  }

 /**
  * Retrieves the Bigdecimalfield value, with locking, for this 
  * <code>BigdecimalField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Bigdecimalfield</code> for this 
  *         <code>BigdecimalField</code> <code>Persistent</code>  
  */

  public BigDecimal getBigdecimalfield()
      throws AccessPoemException {
    readLock();
    return getBigdecimalfield_unsafe();
  }


 /**
  * Sets the <code>Bigdecimalfield</code> value, with checking, for this 
  * <code>BigdecimalField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setBigdecimalfield(BigDecimal cooked)
      throws AccessPoemException, ValidationPoemException {
    _getBigdecimalFieldTable().getBigdecimalfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setBigdecimalfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Bigdecimalfield</code> value as a <code>Field</code>
  * from this <code>BigdecimalField</code> <code>Persistent</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the BigDecimal bigdecimalfield
  */
  public Field<BigDecimal> getBigdecimalfieldField() throws AccessPoemException {
    Column<BigDecimal> c = _getBigdecimalFieldTable().getBigdecimalfieldColumn();
    return new Field<BigDecimal>((BigDecimal)c.getRaw(this), c);
  }

}

