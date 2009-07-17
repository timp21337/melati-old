// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.example.contacts.generated;

import org.melati.poem.PoemDatabase;
import org.melati.poem.DefinitionSource;
import org.melati.poem.UserTable;
import org.melati.poem.GroupTable;
import org.melati.poem.CapabilityTable;
import org.melati.poem.GroupMembershipTable;
import org.melati.poem.GroupCapabilityTable;
import org.melati.poem.TableCategoryTable;
import org.melati.poem.TableInfoTable;
import org.melati.poem.ColumnInfoTable;
import org.melati.poem.SettingTable;
import org.melati.example.contacts.ContactTable;
import org.melati.example.contacts.CategoryTable;
import org.melati.example.contacts.ContactCategoryTable;

/**
 * Melati POEM generated Database base class.
 */
public class ContactsDatabaseBase extends PoemDatabase {

  private UserTable tab_user = null;
  private GroupTable tab_group = null;
  private CapabilityTable tab_capability = null;
  private GroupMembershipTable tab_groupmembership = null;
  private GroupCapabilityTable tab_groupcapability = null;
  private TableCategoryTable tab_tablecategory = null;
  private TableInfoTable tab_tableinfo = null;
  private ColumnInfoTable tab_columninfo = null;
  private SettingTable tab_setting = null;
  private ContactTable tab_contact = null;
  private CategoryTable tab_category = null;
  private ContactCategoryTable tab_contactcategory = null;

  protected ContactsDatabaseBase() {
    redefineTable(tab_user = new UserTable(this, "user", DefinitionSource.dsd));
    redefineTable(tab_group = new GroupTable(this, "group", DefinitionSource.dsd));
    redefineTable(tab_capability = new CapabilityTable(this, "capability", DefinitionSource.dsd));
    redefineTable(tab_groupmembership = new GroupMembershipTable(this, "groupmembership", DefinitionSource.dsd));
    redefineTable(tab_groupcapability = new GroupCapabilityTable(this, "groupcapability", DefinitionSource.dsd));
    redefineTable(tab_tablecategory = new TableCategoryTable(this, "tablecategory", DefinitionSource.dsd));
    redefineTable(tab_tableinfo = new TableInfoTable(this, "tableinfo", DefinitionSource.dsd));
    redefineTable(tab_columninfo = new ColumnInfoTable(this, "columninfo", DefinitionSource.dsd));
    redefineTable(tab_setting = new SettingTable(this, "setting", DefinitionSource.dsd));
    redefineTable(tab_contact = new ContactTable(this, "contact", DefinitionSource.dsd));
    redefineTable(tab_category = new CategoryTable(this, "category", DefinitionSource.dsd));
    redefineTable(tab_contactcategory = new ContactCategoryTable(this, "contactcategory", DefinitionSource.dsd));
  }


 /**
  * Retrieves the UserTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the UserTable from this database
  */
  public UserTable getUserTable() {
    return tab_user;
  }


 /**
  * Retrieves the GroupTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupTable from this database
  */
  public GroupTable getGroupTable() {
    return tab_group;
  }


 /**
  * Retrieves the CapabilityTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the CapabilityTable from this database
  */
  public CapabilityTable getCapabilityTable() {
    return tab_capability;
  }


 /**
  * Retrieves the GroupMembershipTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupMembershipTable from this database
  */
  public GroupMembershipTable getGroupMembershipTable() {
    return tab_groupmembership;
  }


 /**
  * Retrieves the GroupCapabilityTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupCapabilityTable from this database
  */
  public GroupCapabilityTable getGroupCapabilityTable() {
    return tab_groupcapability;
  }


 /**
  * Retrieves the TableCategoryTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TableCategoryTable from this database
  */
  public TableCategoryTable getTableCategoryTable() {
    return tab_tablecategory;
  }


 /**
  * Retrieves the TableInfoTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TableInfoTable from this database
  */
  public TableInfoTable getTableInfoTable() {
    return tab_tableinfo;
  }



 /**
  * Retrieves the ColumnInfoTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ColumnInfoTable from this database
  */
  public ColumnInfoTable getColumnInfoTable() {
    return tab_columninfo;
  }


 /**
  * Retrieves the SettingTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the SettingTable from this database
  */
  public SettingTable getSettingTable() {
    return tab_setting;
  }


 /**
  * Retrieves the ContactTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ContactTable from this database
  */
  public ContactTable getContactTable() {
    return tab_contact;
  }


 /**
  * Retrieves the CategoryTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the CategoryTable from this database
  */
  public CategoryTable getCategoryTable() {
    return tab_category;
  }


 /**
  * Retrieves the ContactCategoryTable table.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ContactCategoryTable from this database
  */
  public ContactCategoryTable getContactCategoryTable() {
    return tab_contactcategory;
  }
}


