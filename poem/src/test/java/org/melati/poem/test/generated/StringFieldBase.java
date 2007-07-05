// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.StringFieldTable;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>StringField</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class StringFieldBase extends JdbcPersistent {


 /**
  * Retrieves the Database object.
  * 
  * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the database
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }


 /**
  * Retrieves the  <code>StringFieldTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the StringFieldTable
  */
  public StringFieldTable getStringFieldTable() {
    return (StringFieldTable)getTable();
  }

  private StringFieldTable _getStringFieldTable() {
    return (StringFieldTable)getTable();
  }

  // Fields in this table 
 /**
  * Id 
  */
  protected Integer id;
 /**
  * String Field 
  */
  protected String stringfield;
 /**
  * Unlimited String Field 
  */
  protected String unlimited;


 /**
  * Retrieves the <code>Id</code> value, without locking, 
  * for this <code>StringField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the Integer id
  */
  public Integer getId_unsafe() {
    return id;
  }


 /**
  * Sets the <code>Id</code> value directly, without checking, 
  * for this StringField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

 /**
  * Retrieves the Id value, with locking, for this 
  * <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Id</code> for this 
  *         <code>StringField</code> <code>Persistent</code>  
  */

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }


 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>StringField</code> <code>Persistent</code>.
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
    _getStringFieldTable().getIdColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

 /**
  * Sets the <code>Id</code> value, with checking, for this 
  * <code>StringField</code> <code>Persistent</code>.
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
  * from this <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the Integer id
  */
  public Field getIdField() throws AccessPoemException {
    Column c = _getStringFieldTable().getIdColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Stringfield</code> value, without locking, 
  * for this <code>StringField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String stringfield
  */
  public String getStringfield_unsafe() {
    return stringfield;
  }


 /**
  * Sets the <code>Stringfield</code> value directly, without checking, 
  * for this StringField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setStringfield_unsafe(String cooked) {
    stringfield = cooked;
  }

 /**
  * Retrieves the Stringfield value, with locking, for this 
  * <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Stringfield</code> for this 
  *         <code>StringField</code> <code>Persistent</code>  
  */

  public String getStringfield()
      throws AccessPoemException {
    readLock();
    return getStringfield_unsafe();
  }


 /**
  * Sets the <code>Stringfield</code> value, with checking, for this 
  * <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setStringfield(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getStringFieldTable().getStringfieldColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setStringfield_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Stringfield</code> value as a <code>Field</code>
  * from this <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String stringfield
  */
  public Field getStringfieldField() throws AccessPoemException {
    Column c = _getStringFieldTable().getStringfieldColumn();
    return new Field(c.getRaw(this), c);
  }


 /**
  * Retrieves the <code>Unlimited</code> value, without locking, 
  * for this <code>StringField</code> <code>Persistent</code>.
  *
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @return the String unlimited
  */
  public String getUnlimited_unsafe() {
    return unlimited;
  }


 /**
  * Sets the <code>Unlimited</code> value directly, without checking, 
  * for this StringField <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateBaseMethods 
  * @param cooked  the pre-validated value to set
  */
  public void setUnlimited_unsafe(String cooked) {
    unlimited = cooked;
  }

 /**
  * Retrieves the Unlimited value, with locking, for this 
  * <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights 
  * @return the value of the field <code>Unlimited</code> for this 
  *         <code>StringField</code> <code>Persistent</code>  
  */

  public String getUnlimited()
      throws AccessPoemException {
    readLock();
    return getUnlimited_unsafe();
  }


 /**
  * Sets the <code>Unlimited</code> value, with checking, for this 
  * <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.AtomFieldDef#generateBaseMethods  
  * @param cooked  a validated <code>int</code> 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @throws ValidationPoemException 
  *         if the value is not valid
  */
  public void setUnlimited(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getStringFieldTable().getUnlimitedColumn().
      getType().assertValidCooked(cooked);
    writeLock();
    setUnlimited_unsafe(cooked);
  }


 /**
  * Retrieves the <code>Unlimited</code> value as a <code>Field</code>
  * from this <code>StringField</code> <code>Persistent</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateFieldCreator 
  * @throws AccessPoemException 
  *         if the current <code>AccessToken</code> 
  *         does not confer write access rights
  * @return the String unlimited
  */
  public Field getUnlimitedField() throws AccessPoemException {
    Column c = _getStringFieldTable().getUnlimitedColumn();
    return new Field(c.getRaw(this), c);
  }
}

