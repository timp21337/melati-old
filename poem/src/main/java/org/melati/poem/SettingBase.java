// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.util.*;

public class SettingBase extends Persistent {

  public PoemDatabase getPoemDatabase() {
    return (PoemDatabase)getDatabase();}
  public SettingTable getSettingTable() {
    return (SettingTable)getTable();
  }

  private SettingTable _getSettingTable() {
    return (SettingTable)getTable();
  }

  Integer id;
  String name;
  String value;
  String displayname;
  String description;

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
    _getSettingTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public final Field getIdField() throws AccessPoemException {
    return _getSettingTable().getIdColumn().asField(this);
  }

  public String getName_unsafe() {
    return name;
  }

  public void setName_unsafe(String cooked) {
    name = cooked;
  }

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }

  public void setName(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getSettingTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public final Field getNameField() throws AccessPoemException {
    return _getSettingTable().getNameColumn().asField(this);
  }

  public String getValue_unsafe() {
    return value;
  }

  public void setValue_unsafe(String cooked) {
    value = cooked;
  }

  public String getValue()
      throws AccessPoemException {
    readLock();
    return getValue_unsafe();
  }

  public void setValue(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getSettingTable().getValueColumn().getType().assertValidCooked(cooked);
    writeLock();
    setValue_unsafe(cooked);
  }

  public final Field getValueField() throws AccessPoemException {
    return _getSettingTable().getValueColumn().asField(this);
  }

  public String getDisplayname_unsafe() {
    return displayname;
  }

  public void setDisplayname_unsafe(String cooked) {
    displayname = cooked;
  }

  public String getDisplayname()
      throws AccessPoemException {
    readLock();
    return getDisplayname_unsafe();
  }

  public void setDisplayname(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getSettingTable().getDisplaynameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDisplayname_unsafe(cooked);
  }

  public final Field getDisplaynameField() throws AccessPoemException {
    return _getSettingTable().getDisplaynameColumn().asField(this);
  }

  public String getDescription_unsafe() {
    return description;
  }

  public void setDescription_unsafe(String cooked) {
    description = cooked;
  }

  public String getDescription()
      throws AccessPoemException {
    readLock();
    return getDescription_unsafe();
  }

  public void setDescription(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getSettingTable().getDescriptionColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDescription_unsafe(cooked);
  }

  public final Field getDescriptionField() throws AccessPoemException {
    return _getSettingTable().getDescriptionColumn().asField(this);
  }
}
