// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.*;
import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;

public class ColumnInfoBase extends ValueInfo {

  public PoemDatabase getPoemDatabase() {
    return (PoemDatabase)getDatabase();
  }

  public ColumnInfoTable getColumnInfoTable() {
    return (ColumnInfoTable)getTable();
  }

  private ColumnInfoTable _getColumnInfoTable() {
    return (ColumnInfoTable)getTable();
  }

  Integer id;
  Integer tableinfo;
  String name;
  Integer displayorder;
  Boolean usercreateable;
  Integer displaylevel;
  Integer searchability;
  Integer displayorderpriority;
  Boolean indexed;
  Boolean unique;

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
    _getColumnInfoTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public Field getIdField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getIdColumn());
  }

  public Integer getTableinfo_unsafe() {
    return tableinfo;
  }

  public void setTableinfo_unsafe(Integer cooked) {
    tableinfo = cooked;
  }

  public Integer getTableinfoTroid()
      throws AccessPoemException {
    readLock();
    return getTableinfo_unsafe();
  }

  public void setTableinfoTroid(Integer raw)
      throws AccessPoemException {
    getColumnInfoTable().getTableinfoColumn().getType().assertValidRaw(raw);
    writeLock();
    setTableinfo_unsafe(raw);
  }

  public TableInfo getTableinfo()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getTableinfoTroid();
    return troid == null ? null :
        getPoemDatabase().getTableInfoTable().getTableInfoObject(troid);
  }

  public void setTableinfo(TableInfo cooked)
      throws AccessPoemException {
    setTableinfoTroid(cooked == null ? null : cooked.troid());
  }

  public Field getTableinfoField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getTableinfoColumn());
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
    _getColumnInfoTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public Field getNameField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getNameColumn());
  }

  public Integer getDisplayorder_unsafe() {
    return displayorder;
  }

  public void setDisplayorder_unsafe(Integer cooked) {
    displayorder = cooked;
  }

  public Integer getDisplayorder()
      throws AccessPoemException {
    readLock();
    return getDisplayorder_unsafe();
  }

  public void setDisplayorder(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getDisplayorderColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDisplayorder_unsafe(cooked);
  }

  public final void setDisplayorder(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setDisplayorder(new Integer(cooked));
  }

  public Field getDisplayorderField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getDisplayorderColumn());
  }

  public Boolean getUsercreateable_unsafe() {
    return usercreateable;
  }

  public void setUsercreateable_unsafe(Boolean cooked) {
    usercreateable = cooked;
  }

  public Boolean getUsercreateable()
      throws AccessPoemException {
    readLock();
    return getUsercreateable_unsafe();
  }

  public void setUsercreateable(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getUsercreateableColumn().getType().assertValidCooked(cooked);
    writeLock();
    setUsercreateable_unsafe(cooked);
  }

  public final void setUsercreateable(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setUsercreateable(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public Field getUsercreateableField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getUsercreateableColumn());
  }

  public Integer getDisplaylevel_unsafe() {
    return displaylevel;
  }

  public void setDisplaylevel_unsafe(Integer cooked) {
    displaylevel = cooked;
  }

  public Integer getDisplaylevelIndex()
      throws AccessPoemException {
    readLock();
    return getDisplaylevel_unsafe();
  }

  public void setDisplaylevelIndex(Integer raw)
      throws AccessPoemException {
    getColumnInfoTable().getDisplaylevelColumn().getType().assertValidRaw(raw);
    writeLock();
    setDisplaylevel_unsafe(raw);
  }

  public DisplayLevel getDisplaylevel()
      throws AccessPoemException {
    Integer index = getDisplaylevelIndex();
    return index == null ? null :
        DisplayLevel.forIndex(index.intValue());
  }

  public void setDisplaylevel(DisplayLevel cooked)
      throws AccessPoemException {
    setDisplaylevelIndex(cooked == null ? null : cooked.index);
  }

  public Field getDisplaylevelField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getDisplaylevelColumn());
  }

  public Integer getSearchability_unsafe() {
    return searchability;
  }

  public void setSearchability_unsafe(Integer cooked) {
    searchability = cooked;
  }

  public Integer getSearchabilityIndex()
      throws AccessPoemException {
    readLock();
    return getSearchability_unsafe();
  }

  public void setSearchabilityIndex(Integer raw)
      throws AccessPoemException {
    getColumnInfoTable().getSearchabilityColumn().getType().assertValidRaw(raw);
    writeLock();
    setSearchability_unsafe(raw);
  }

  public Searchability getSearchability()
      throws AccessPoemException {
    Integer index = getSearchabilityIndex();
    return index == null ? null :
        Searchability.forIndex(index.intValue());
  }

  public void setSearchability(Searchability cooked)
      throws AccessPoemException {
    setSearchabilityIndex(cooked == null ? null : cooked.index);
  }

  public Field getSearchabilityField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getSearchabilityColumn());
  }

  public Integer getDisplayorderpriority_unsafe() {
    return displayorderpriority;
  }

  public void setDisplayorderpriority_unsafe(Integer cooked) {
    displayorderpriority = cooked;
  }

  public Integer getDisplayorderpriority()
      throws AccessPoemException {
    readLock();
    return getDisplayorderpriority_unsafe();
  }

  public void setDisplayorderpriority(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getDisplayorderpriorityColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDisplayorderpriority_unsafe(cooked);
  }

  public final void setDisplayorderpriority(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setDisplayorderpriority(new Integer(cooked));
  }

  public Field getDisplayorderpriorityField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getDisplayorderpriorityColumn());
  }

  public Boolean getIndexed_unsafe() {
    return indexed;
  }

  public void setIndexed_unsafe(Boolean cooked) {
    indexed = cooked;
  }

  public Boolean getIndexed()
      throws AccessPoemException {
    readLock();
    return getIndexed_unsafe();
  }

  public void setIndexed(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getIndexedColumn().getType().assertValidCooked(cooked);
    writeLock();
    setIndexed_unsafe(cooked);
  }

  public final void setIndexed(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setIndexed(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public Field getIndexedField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getIndexedColumn());
  }

  public Boolean getUnique_unsafe() {
    return unique;
  }

  public void setUnique_unsafe(Boolean cooked) {
    unique = cooked;
  }

  public Boolean getUnique()
      throws AccessPoemException {
    readLock();
    return getUnique_unsafe();
  }

  public void setUnique(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getUniqueColumn().getType().assertValidCooked(cooked);
    writeLock();
    setUnique_unsafe(cooked);
  }

  public final void setUnique(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setUnique(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public Field getUniqueField() throws AccessPoemException {
    return Field.of(this, _getColumnInfoTable().getUniqueColumn());
  }
}
