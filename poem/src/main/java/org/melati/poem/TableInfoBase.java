// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import org.melati.util.*;

public class TableInfoBase extends Persistent {

  public TableInfoTable getTableInfoTable() {
    return (TableInfoTable)getTable();
  }

  private TableInfoTable _getTableInfoTable() {
    return (TableInfoTable)getTable();
  }

  Integer id;
  String name;
  String displayname;
  String description;
  Integer displayorder;
  Integer defaultcanread;
  Integer defaultcanwrite;
  Integer cancreate;
  Integer cachelimit;
  Boolean seqcached;
  Integer category;

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
    _getTableInfoTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public final Field getIdField() throws AccessPoemException {
    return _getTableInfoTable().getIdColumn().asField(this);
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
    _getTableInfoTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public final Field getNameField() throws AccessPoemException {
    return _getTableInfoTable().getNameColumn().asField(this);
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
    _getTableInfoTable().getDisplaynameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDisplayname_unsafe(cooked);
  }

  public final Field getDisplaynameField() throws AccessPoemException {
    return _getTableInfoTable().getDisplaynameColumn().asField(this);
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
    _getTableInfoTable().getDescriptionColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDescription_unsafe(cooked);
  }

  public final Field getDescriptionField() throws AccessPoemException {
    return _getTableInfoTable().getDescriptionColumn().asField(this);
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
    _getTableInfoTable().getDisplayorderColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDisplayorder_unsafe(cooked);
  }

  public final void setDisplayorder(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setDisplayorder(new Integer(cooked));
  }

  public final Field getDisplayorderField() throws AccessPoemException {
    return _getTableInfoTable().getDisplayorderColumn().asField(this);
  }

  public Integer getDefaultcanread_unsafe() {
    return defaultcanread;
  }

  public void setDefaultcanread_unsafe(Integer cooked) {
    defaultcanread = cooked;
  }

  public Integer getDefaultcanreadTroid()
      throws AccessPoemException {
    readLock();
    return getDefaultcanread_unsafe();
  }

  public void setDefaultcanreadTroid(Integer raw)
      throws AccessPoemException {
    getTableInfoTable().getDefaultcanreadColumn().getType().assertValidRaw(raw);
    writeLock();
    setDefaultcanread_unsafe(raw);
  }

  public Capability getDefaultcanread()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getDefaultcanreadTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getCapabilityTable().getCapabilityObject(troid);
  }

  public void setDefaultcanread(Capability cooked)
      throws AccessPoemException {
    setDefaultcanreadTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getDefaultcanreadField() throws AccessPoemException {
    return _getTableInfoTable().getDefaultcanreadColumn().asField(this);
  }

  public Integer getDefaultcanwrite_unsafe() {
    return defaultcanwrite;
  }

  public void setDefaultcanwrite_unsafe(Integer cooked) {
    defaultcanwrite = cooked;
  }

  public Integer getDefaultcanwriteTroid()
      throws AccessPoemException {
    readLock();
    return getDefaultcanwrite_unsafe();
  }

  public void setDefaultcanwriteTroid(Integer raw)
      throws AccessPoemException {
    getTableInfoTable().getDefaultcanwriteColumn().getType().assertValidRaw(raw);
    writeLock();
    setDefaultcanwrite_unsafe(raw);
  }

  public Capability getDefaultcanwrite()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getDefaultcanwriteTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getCapabilityTable().getCapabilityObject(troid);
  }

  public void setDefaultcanwrite(Capability cooked)
      throws AccessPoemException {
    setDefaultcanwriteTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getDefaultcanwriteField() throws AccessPoemException {
    return _getTableInfoTable().getDefaultcanwriteColumn().asField(this);
  }

  public Integer getCancreate_unsafe() {
    return cancreate;
  }

  public void setCancreate_unsafe(Integer cooked) {
    cancreate = cooked;
  }

  public Integer getCancreateTroid()
      throws AccessPoemException {
    readLock();
    return getCancreate_unsafe();
  }

  public void setCancreateTroid(Integer raw)
      throws AccessPoemException {
    getTableInfoTable().getCancreateColumn().getType().assertValidRaw(raw);
    writeLock();
    setCancreate_unsafe(raw);
  }

  public Capability getCancreate()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCancreateTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getCapabilityTable().getCapabilityObject(troid);
  }

  public void setCancreate(Capability cooked)
      throws AccessPoemException {
    setCancreateTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getCancreateField() throws AccessPoemException {
    return _getTableInfoTable().getCancreateColumn().asField(this);
  }

  public Integer getCachelimit_unsafe() {
    return cachelimit;
  }

  public void setCachelimit_unsafe(Integer cooked) {
    cachelimit = cooked;
  }

  public Integer getCachelimit()
      throws AccessPoemException {
    readLock();
    return getCachelimit_unsafe();
  }

  public void setCachelimit(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getTableInfoTable().getCachelimitColumn().getType().assertValidCooked(cooked);
    writeLock();
    setCachelimit_unsafe(cooked);
  }

  public final void setCachelimit(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setCachelimit(new Integer(cooked));
  }

  public final Field getCachelimitField() throws AccessPoemException {
    return _getTableInfoTable().getCachelimitColumn().asField(this);
  }

  public Boolean getSeqcached_unsafe() {
    return seqcached;
  }

  public void setSeqcached_unsafe(Boolean cooked) {
    seqcached = cooked;
  }

  public Boolean getSeqcached()
      throws AccessPoemException {
    readLock();
    return getSeqcached_unsafe();
  }

  public void setSeqcached(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getTableInfoTable().getSeqcachedColumn().getType().assertValidCooked(cooked);
    writeLock();
    setSeqcached_unsafe(cooked);
  }

  public final void setSeqcached(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setSeqcached(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getSeqcachedField() throws AccessPoemException {
    return _getTableInfoTable().getSeqcachedColumn().asField(this);
  }

  public Integer getCategory_unsafe() {
    return category;
  }

  public void setCategory_unsafe(Integer cooked) {
    category = cooked;
  }

  public Integer getCategoryTroid()
      throws AccessPoemException {
    readLock();
    return getCategory_unsafe();
  }

  public void setCategoryTroid(Integer raw)
      throws AccessPoemException {
    getTableInfoTable().getCategoryColumn().getType().assertValidRaw(raw);
    writeLock();
    setCategory_unsafe(raw);
  }

  public TableCategory getCategory()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getCategoryTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getTableCategoryTable().getTableCategoryObject(troid);
  }

  public void setCategory(TableCategory cooked)
      throws AccessPoemException {
    setCategoryTroid(cooked == null ? null : cooked.troid());
  }

  public final Field getCategoryField() throws AccessPoemException {
    return _getTableInfoTable().getCategoryColumn().asField(this);
  }
}
