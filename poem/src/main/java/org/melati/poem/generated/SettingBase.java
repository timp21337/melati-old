// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.*;
import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;

public abstract class SettingBase extends ValueInfo {

  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  public SettingTable getSettingTable() {
    return (SettingTable)getTable();
  }

  private SettingTable _getSettingTable() {
    return (SettingTable)getTable();
  }

  protected Integer id;
  protected String name;
  protected String value;

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

  public Field getIdField() throws AccessPoemException {
    Column c = _getSettingTable().getIdColumn();
    return new Field(c.getRaw(this), c);
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

  public Field getNameField() throws AccessPoemException {
    Column c = _getSettingTable().getNameColumn();
    return new Field(c.getRaw(this), c);
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

  public Field getValueField() throws AccessPoemException {
    Column c = _getSettingTable().getValueColumn();
    return new Field(c.getRaw(this), c);
  }
}
