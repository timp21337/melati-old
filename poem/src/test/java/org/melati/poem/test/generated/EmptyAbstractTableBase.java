// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.Persistent;
import org.melati.poem.test.EmptyAbstractTableTable;
import org.melati.poem.test.EverythingDatabaseTables;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>EmptyAbstractTable</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
 */
public abstract class EmptyAbstractTableBase extends Persistent {


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
  * Retrieves the  <code>EmptyAbstractTableTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generatePersistentBaseJava 
  * @return the EmptyAbstractTableTable
  */
  public EmptyAbstractTableTable getEmptyAbstractTableTable() {
    return (EmptyAbstractTableTable)getTable();
  }

  // There are no Fields in this table, only in its ancestors 
}

