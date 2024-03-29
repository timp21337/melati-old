// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.LongFieldTable;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>LongField</code> Object.
 *
 * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class LongFieldBase extends JdbcPersistent {


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
  * Retrieves the  <code>LongFieldTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * see org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the LongFieldTable
  */
  public LongFieldTable getLongFieldTable() {
    return (LongFieldTable)getTable();
  }

  private LongFieldTable _getLongFieldTable() {
    return (LongFieldTable)getTable();
  }

  // Fields in this table 
 /**
  * Id 
  */
  protected Integer id;
 /**
  * Long Field 
  */
  protected Long longfield;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>LongField</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this LongField <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>LongField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>LongField</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>LongField</code> <code>Persistent</code>.
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
    _getLongFieldTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>LongField</code> <code>Persistent</code>.
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
  * from this <code>LongField</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field<Integer> getIdField() throws AccessPoemException {
    Column<Integer> c = _getLongFieldTable().getIdColumn();
    return new Field<Integer>((Integer)c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Longfield</code> value, without locking, 
  * for this <code>LongField</code> <code>Persistent</code>.
  *
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Long longfield
  */
  public Long getLongfield_unsafe() {
    return longfield;
  }


 /**
  * Sets the <code>Longfield</code> value directly, without checking, 
  * for this LongField <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setLongfield_unsafe(Long cooked) {
    longfield = cooked;
  }

 /**
  * Retrieves the Longfield value, with locking, for this 
  * <code>LongField</code> <code>Persistent</code>.
  * 
  * Generated by org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Longfield</code> for this 
  *         <code>LongField</code> <code>Persistent</code>  
  */

  public Long getLongfield()
      throws AccessPoemException {
    readLock();
    return getLongfield_unsafe();
  }


 /**
  * Sets the <code>Longfield</code> value, with checking, for this 
  * <code>LongField</code> <code>Persistent</code>.
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
    _getLongFieldTable().getLongfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setLongfield_unsafe(cooked);
  }

 /**
  * Sets the <code>Longfield</code> value, with checking, for this 
  * <code>LongField</code> <code>Persistent</code>.
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
  * from this <code>LongField</code> <code>Persistent</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Long longfield
  */
  public Field<Long> getLongfieldField() throws AccessPoemException {
    Column<Long> c = _getLongFieldTable().getLongfieldColumn();
    return new Field<Long>((Long)c.getRaw(this), c);
  }

}

