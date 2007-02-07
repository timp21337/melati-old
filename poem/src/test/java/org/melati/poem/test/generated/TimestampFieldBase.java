// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import java.sql.Timestamp;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.TimestampFieldTable;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>TimestampField</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
 */
public abstract class TimestampFieldBase extends Persistent {


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
  * Retrieves the  <code>TimestampFieldTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the TimestampFieldTable
  */
  public TimestampFieldTable getTimestampFieldTable() {
    return (TimestampFieldTable)getTable();
  }

  private TimestampFieldTable _getTimestampFieldTable() {
    return (TimestampFieldTable)getTable();
  }

  // Fields in this table 
 /**
  * Id 
  */
  protected Integer id;
 /**
  * Timestamp Field 
  */
  protected Timestamp timestampfield;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>TimestampField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this TimestampField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>TimestampField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>TimestampField</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>TimestampField</code> <code>Persistent</code>.
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
    _getTimestampFieldTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>TimestampField</code> <code>Persistent</code>.
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
  * from this <code>TimestampField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field getIdField() throws AccessPoemException {
    Column c = _getTimestampFieldTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Timestampfield</code> value, without locking, 
  * for this <code>TimestampField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Timestamp timestampfield
  */
  public Timestamp getTimestampfield_unsafe() {
    return timestampfield;
  }


 /**
  * Sets the <code>Timestampfield</code> value directly, without checking, 
  * for this TimestampField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setTimestampfield_unsafe(Timestamp cooked) {
    timestampfield = cooked;
  }

 /**
  * Retrieves the Timestampfield value, with locking, for this 
  * <code>TimestampField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Timestampfield</code> for this 
  *         <code>TimestampField</code> <code>Persistent</code>  
  */

  public Timestamp getTimestampfield()
      throws AccessPoemException {
    readLock();
    return getTimestampfield_unsafe();
  }


 /**
  * Sets the <code>Timestampfield</code> value, with checking, for this 
  * <code>TimestampField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setTimestampfield(Timestamp cooked)
      throws AccessPoemException, ValidationPoemException {
    _getTimestampFieldTable().getTimestampfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setTimestampfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Timestampfield</code> value as a <code>Field</code>
  * from this <code>TimestampField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Timestamp timestampfield
  */
  public Field getTimestampfieldField() throws AccessPoemException {
    Column c = _getTimestampFieldTable().getTimestampfieldColumn();
    return new Field(c.getRaw(this), c);
  }
}

