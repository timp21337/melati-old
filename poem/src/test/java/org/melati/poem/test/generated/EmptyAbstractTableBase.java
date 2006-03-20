// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import org.melati.poem.Persistent;
import org.melati.poem.test.EmptyAbstractTableTable;
import org.melati.poem.test.TestDatabaseTables;


/**
 * Melati POEM generated abstract base class for a <code>Persistent</code> 
 * <code>EmptyAbstractTable</code> Object.
 *
 * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
 */
public abstract class EmptyAbstractTableBase extends Persistent {


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
  * Retrieves the  <code>EmptyAbstractTableTable</code> table 
  * which this <code>Persistent</code> is from.
  * 
  * @generator org.melati.poem.prepro.TableDef#generateBaseJava 
  * @return the EmptyAbstractTableTable
  */
  public EmptyAbstractTableTable getEmptyAbstractTableTable() {
    return (EmptyAbstractTableTable)getTable();
  }


  // Fields in this table 
}

