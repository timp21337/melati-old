// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import org.melati.util.*;

public class GroupMembershipBase extends Persistent {

  public GroupMembershipTable getGroupMembershipTable() {
    return (GroupMembershipTable)getTable();
  }

  private GroupMembershipTable _getGroupMembershipTable() {
    return (GroupMembershipTable)getTable();
  }

  Integer id;
  Integer user;
  Integer group;

  public Integer getId_unsafe() {
    return id;
  }

  public void setId_unsafe(Integer cooked) {
    id = cooked;
  }

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }

  public void setId(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getGroupMembershipTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public final Field getIdField() throws AccessPoemException {
    return _getGroupMembershipTable().getIdColumn().asField(this);
  }

  public Integer getUser_unsafe() {
    return user;
  }

  public void setUser_unsafe(Integer cooked) {
    user = cooked;
  }

  public Integer getUserTroid()
      throws AccessPoemException {
    readLock();
    return getUser_unsafe();
  }

  public void setUserTroid(Integer raw)
      throws AccessPoemException {
    getGroupMembershipTable().getUserColumn().getType().assertValidRaw(raw);
    writeLock();
    setUser_unsafe(raw);
  }

  public User getUser()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getUserTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getUserTable().getUserObject(troid);
  }

  public void setUser(User cooked)
      throws AccessPoemException {
    setUserTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getUserField() throws AccessPoemException {
    return _getGroupMembershipTable().getUserColumn().asField(this);
  }

  public Integer getGroup_unsafe() {
    return group;
  }

  public void setGroup_unsafe(Integer cooked) {
    group = cooked;
  }

  public Integer getGroupTroid()
      throws AccessPoemException {
    readLock();
    return getGroup_unsafe();
  }

  public void setGroupTroid(Integer raw)
      throws AccessPoemException {
    getGroupMembershipTable().getGroupColumn().getType().assertValidRaw(raw);
    writeLock();
    setGroup_unsafe(raw);
  }

  public Group getGroup()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getGroupTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getGroupTable().getGroupObject(troid);
  }

  public void setGroup(Group cooked)
      throws AccessPoemException {
    setGroupTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getGroupField() throws AccessPoemException {
    return _getGroupMembershipTable().getGroupColumn().asField(this);
  }
}
