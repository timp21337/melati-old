// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.util.*;

public class PoemDatabaseBase extends Database {

  private UserTable tab_user = null;
  private GroupTable tab_group = null;
  private CapabilityTable tab_capability = null;
  private GroupMembershipTable tab_groupmembership = null;
  private GroupCapabilityTable tab_groupcapability = null;
  private TableInfoTable tab_tableinfo = null;
  private ColumnInfoTable tab_columninfo = null;
  private TableCategoryTable tab_tablecategory = null;
  private SettingTable tab_setting = null;

  protected PoemDatabaseBase() {
    redefineTable(tab_user = new UserTable(this, "user", DefinitionSource.dsd));
    redefineTable(tab_group = new GroupTable(this, "group", DefinitionSource.dsd));
    redefineTable(tab_capability = new CapabilityTable(this, "capability", DefinitionSource.dsd));
    redefineTable(tab_groupmembership = new GroupMembershipTable(this, "groupmembership", DefinitionSource.dsd));
    redefineTable(tab_groupcapability = new GroupCapabilityTable(this, "groupcapability", DefinitionSource.dsd));
    redefineTable(tab_tableinfo = new TableInfoTable(this, "tableinfo", DefinitionSource.dsd));
    redefineTable(tab_columninfo = new ColumnInfoTable(this, "columninfo", DefinitionSource.dsd));
    redefineTable(tab_tablecategory = new TableCategoryTable(this, "tablecategory", DefinitionSource.dsd));
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

  public TableInfoTable getTableInfoTable() {
    return tab_tableinfo;
  }

  public ColumnInfoTable getColumnInfoTable() {
    return tab_columninfo;
  }

  public TableCategoryTable getTableCategoryTable() {
    return tab_tablecategory;
  }

  public SettingTable getSettingTable() {
    return tab_setting;
  }
}
