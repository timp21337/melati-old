// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

// 10 tables in database
import org.melati.poem.UserTable;
import org.melati.poem.GroupTable;
import org.melati.poem.CapabilityTable;
import org.melati.poem.GroupMembershipTable;
import org.melati.poem.GroupCapabilityTable;
import org.melati.poem.TableCategoryTable;
import org.melati.poem.TableInfoTable;
import org.melati.poem.ColumnInfoTable;
import org.melati.poem.SettingTable;

/**
 * Melati POEM generated interface
 */
public interface PoemDatabaseTablesBase {

  UserTable getUserTable();
  GroupTable getGroupTable();
  CapabilityTable getCapabilityTable();
  GroupMembershipTable getGroupMembershipTable();
  GroupCapabilityTable getGroupCapabilityTable();
  TableCategoryTable getTableCategoryTable();
  TableInfoTable getTableInfoTable();
  ColumnInfoTable getColumnInfoTable();
  SettingTable getSettingTable();
}
