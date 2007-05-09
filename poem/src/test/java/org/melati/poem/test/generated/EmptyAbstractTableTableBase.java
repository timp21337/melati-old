// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;

import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.PoemException;
import org.melati.poem.test.EmptyAbstractTable;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>EmptyAbstractTable</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class EmptyAbstractTableTableBase extends EverythingTable {


 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public EmptyAbstractTableTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Constructor.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @throws PoemException    if anything goes wrong
  */
  public EmptyAbstractTableTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
  }


 /**
  * Retrieve the <code>EmptyAbstractTable</code> as a <code>EmptyAbstractTable</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public EmptyAbstractTable getEmptyAbstractTableObject(Integer troid) {
    return (EmptyAbstractTable)getObject(troid);
  }


 /**
  * Retrieve the <code>EmptyAbstractTable</code> 
  * as a <code>EmptyAbstractTable</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public EmptyAbstractTable getEmptyAbstractTableObject(int troid) {
    return (EmptyAbstractTable)getObject(troid);
  }
  protected String defaultDisplayName() {
    return "Empty Abstract";
  }

  protected String defaultDescription() {
    return "Empty abstract table to create a stub";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 50;
  }
}

