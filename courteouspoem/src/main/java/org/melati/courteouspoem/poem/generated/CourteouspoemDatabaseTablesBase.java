// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.courteouspoem.poem.generated;


// 10 tables in database
import org.melati.poem.UserTable;
import org.melati.poem.GroupTable;
import org.melati.poem.CapabilityTable;
import org.melati.poem.GroupMembershipTable;
import org.melati.poem.GroupCapabilityTable;
import org.melati.poem.TableCategoryTable;
import org.melati.poem.TableInfoTable;
// abstract import org.melati.poem.ValueInfoTable;
import org.melati.poem.ColumnInfoTable;
import org.melati.poem.SettingTable;

/**
 * Melati POEM generated base interface to the tables in 
 * org.melati.courteouspoem.poem.
 */
public interface CourteouspoemDatabaseTablesBase {


 /**
  * Retrieves the <code>UserTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the UserTable from this database
  */
  UserTable getUserTable();

 /**
  * Retrieves the <code>GroupTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the GroupTable from this database
  */
  GroupTable getGroupTable();

 /**
  * Retrieves the <code>CapabilityTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the CapabilityTable from this database
  */
  CapabilityTable getCapabilityTable();

 /**
  * Retrieves the <code>GroupMembershipTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the GroupMembershipTable from this database
  */
  GroupMembershipTable getGroupMembershipTable();

 /**
  * Retrieves the <code>GroupCapabilityTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the GroupCapabilityTable from this database
  */
  GroupCapabilityTable getGroupCapabilityTable();

 /**
  * Retrieves the <code>TableCategoryTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the TableCategoryTable from this database
  */
  TableCategoryTable getTableCategoryTable();

 /**
  * Retrieves the <code>TableInfoTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the TableInfoTable from this database
  */
  TableInfoTable getTableInfoTable();

 /**
  * Retrieves the <code>ColumnInfoTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the ColumnInfoTable from this database
  */
  ColumnInfoTable getColumnInfoTable();

 /**
  * Retrieves the <code>SettingTable</code> table.
  * 
  * see org.melati.poem.prepro.TableDef#generateTableAccessorDefnJava 
  * @return the SettingTable from this database
  */
  SettingTable getSettingTable();
}


