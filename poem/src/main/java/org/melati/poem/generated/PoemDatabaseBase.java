// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.UserTable;
import org.melati.poem.GroupTable;
import org.melati.poem.CapabilityTable;
import org.melati.poem.GroupMembershipTable;
import org.melati.poem.GroupCapabilityTable;
import org.melati.poem.TableCategoryTable;
import org.melati.poem.TableInfoTable;
import org.melati.poem.ValueInfoTable;
import org.melati.poem.ColumnInfoTable;
import org.melati.poem.SettingTable;

/**
 * Melati POEM generated base class
 */
public class PoemDatabaseBase extends Database {

  private UserTable tab_user = null;
  private GroupTable tab_group = null;
  private CapabilityTable tab_capability = null;
  private GroupMembershipTable tab_groupmembership = null;
  private GroupCapabilityTable tab_groupcapability = null;
  private TableCategoryTable tab_tablecategory = null;
  private TableInfoTable tab_tableinfo = null;
  private ColumnInfoTable tab_columninfo = null;
  private SettingTable tab_setting = null;

  protected PoemDatabaseBase() {
    redefineTable(tab_user = new UserTable(this, "user", DefinitionSource.dsd));
    redefineTable(tab_group = new GroupTable(this, "group", DefinitionSource.dsd));
    redefineTable(tab_capability = new CapabilityTable(this, "capability", DefinitionSource.dsd));
    redefineTable(tab_groupmembership = new GroupMembershipTable(this, "groupmembership", DefinitionSource.dsd));
    redefineTable(tab_groupcapability = new GroupCapabilityTable(this, "groupcapability", DefinitionSource.dsd));
    redefineTable(tab_tablecategory = new TableCategoryTable(this, "tablecategory", DefinitionSource.dsd));
    redefineTable(tab_tableinfo = new TableInfoTable(this, "tableinfo", DefinitionSource.dsd));
    redefineTable(tab_columninfo = new ColumnInfoTable(this, "columninfo", DefinitionSource.dsd));
    redefineTable(tab_setting = new SettingTable(this, "setting", DefinitionSource.dsd));
  }

  public UserTable getUserTable() {
    return tab_user;
  }

  public GroupTable getGroupTable() {
    return tab_group;
  }

  public CapabilityTable getCapabilityTable() {
    return tab_capability;
  }

  public GroupMembershipTable getGroupMembershipTable() {
    return tab_groupmembership;
  }

  public GroupCapabilityTable getGroupCapabilityTable() {
    return tab_groupcapability;
  }

  public TableCategoryTable getTableCategoryTable() {
    return tab_tablecategory;
  }

  public TableInfoTable getTableInfoTable() {
    return tab_tableinfo;
  }


  public ColumnInfoTable getColumnInfoTable() {
    return tab_columninfo;
  }

  public SettingTable getSettingTable() {
    return tab_setting;
  }
}
