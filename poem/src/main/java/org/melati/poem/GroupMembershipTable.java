package org.melati.poem;

public class GroupMembershipTable extends GroupMembershipTableBase {

  public GroupMembershipTable(Database database, String name) throws PoemException {
    super(database, name);
  }

  void postInitialise() {
    super.postInitialise();
    if (info.getDefaultcanwrite() == null)
      info.setDefaultcanwrite(getDatabase().administerCapability());
    if (info.getCancreate() == null)
      info.setCancreate(getDatabase().administerCapability());
  }
}
