// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import org.melati.util.*;

public class GroupCapabilityBase extends Persistent {

  public GroupCapabilityTable getGroupCapabilityTable() {
    return (GroupCapabilityTable)getTable();
  }

  private GroupCapabilityTable _getGroupCapabilityTable() {
    return (GroupCapabilityTable)getTable();
  }

  Integer id;
  Integer group;
  Integer capability;

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
    _getGroupCapabilityTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public final Field getIdField() throws AccessPoemException {
    return _getGroupCapabilityTable().getIdColumn().asField(this);
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
    getGroupCapabilityTable().getGroupColumn().getType().assertValidRaw(raw);
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
    return _getGroupCapabilityTable().getGroupColumn().asField(this);
  }

  public Integer getCapability_unsafe() {
    return capability;
  }

  public void setCapability_unsafe(Integer cooked) {
    capability = cooked;
  }

  public Integer getCapabilityTroid()
      throws AccessPoemException {
    readLock();
    return getCapability_unsafe();
  }

  public void setCapabilityTroid(Integer raw)
      throws AccessPoemException {
    getGroupCapabilityTable().getCapabilityColumn().getType().assertValidRaw(raw);
    writeLock();
    setCapability_unsafe(raw);
  }

  public Capability getCapability()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCapabilityTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getCapabilityTable().getCapabilityObject(troid);
  }

  public void setCapability(Capability cooked)
      throws AccessPoemException {
    setCapabilityTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getCapabilityField() throws AccessPoemException {
    return _getGroupCapabilityTable().getCapabilityColumn().asField(this);
  }
}
