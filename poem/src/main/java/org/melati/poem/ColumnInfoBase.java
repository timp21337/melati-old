// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import org.melati.util.*;

public class ColumnInfoBase extends Persistent {

  public PoemDatabase getPoemDatabase() {
    return (PoemDatabase)getDatabase();}
  public ColumnInfoTable getColumnInfoTable() {
    return (ColumnInfoTable)getTable();
  }

  private ColumnInfoTable _getColumnInfoTable() {
    return (ColumnInfoTable)getTable();
  }

  Integer id;
  Integer tableinfo;
  String name;
  String displayname;
  String description;
  Integer displayorder;
  Boolean usereditable;
  Boolean usercreateable;
  Boolean recorddisplay;
  Boolean summarydisplay;
  Boolean primarydisplay;
  Boolean searchcriterion;
  Boolean primarycriterion;
  Integer displayorderpriority;
  Integer type;
  Boolean nullable;
  Boolean indexed;
  Boolean unique;
  Integer size;
  Integer width;
  Integer height;
  String renderinfo;
  String rangelow_string;
  String rangelimit_string;

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

  public final Field getIdField() throws AccessPoemException {
    return _getColumnInfoTable().getIdColumn().asField(this);
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

  public final Field getTableinfoField() throws AccessPoemException {
    return _getColumnInfoTable().getTableinfoColumn().asField(this);
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

  public final Field getNameField() throws AccessPoemException {
    return _getColumnInfoTable().getNameColumn().asField(this);
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
    _getColumnInfoTable().getDisplaynameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDisplayname_unsafe(cooked);
  }

  public final Field getDisplaynameField() throws AccessPoemException {
    return _getColumnInfoTable().getDisplaynameColumn().asField(this);
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
    _getColumnInfoTable().getDescriptionColumn().getType().assertValidCooked(cooked);
    writeLock();
    setDescription_unsafe(cooked);
  }

  public final Field getDescriptionField() throws AccessPoemException {
    return _getColumnInfoTable().getDescriptionColumn().asField(this);
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

  public final Field getDisplayorderField() throws AccessPoemException {
    return _getColumnInfoTable().getDisplayorderColumn().asField(this);
  }

  public Boolean getUsereditable_unsafe() {
    return usereditable;
  }

  public void setUsereditable_unsafe(Boolean cooked) {
    usereditable = cooked;
  }

  public Boolean getUsereditable()
      throws AccessPoemException {
    readLock();
    return getUsereditable_unsafe();
  }

  public void setUsereditable(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getUsereditableColumn().getType().assertValidCooked(cooked);
    writeLock();
    setUsereditable_unsafe(cooked);
  }

  public final void setUsereditable(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setUsereditable(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getUsereditableField() throws AccessPoemException {
    return _getColumnInfoTable().getUsereditableColumn().asField(this);
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

  public final Field getUsercreateableField() throws AccessPoemException {
    return _getColumnInfoTable().getUsercreateableColumn().asField(this);
  }

  public Boolean getRecorddisplay_unsafe() {
    return recorddisplay;
  }

  public void setRecorddisplay_unsafe(Boolean cooked) {
    recorddisplay = cooked;
  }

  public Boolean getRecorddisplay()
      throws AccessPoemException {
    readLock();
    return getRecorddisplay_unsafe();
  }

  public void setRecorddisplay(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getRecorddisplayColumn().getType().assertValidCooked(cooked);
    writeLock();
    setRecorddisplay_unsafe(cooked);
  }

  public final void setRecorddisplay(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setRecorddisplay(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getRecorddisplayField() throws AccessPoemException {
    return _getColumnInfoTable().getRecorddisplayColumn().asField(this);
  }

  public Boolean getSummarydisplay_unsafe() {
    return summarydisplay;
  }

  public void setSummarydisplay_unsafe(Boolean cooked) {
    summarydisplay = cooked;
  }

  public Boolean getSummarydisplay()
      throws AccessPoemException {
    readLock();
    return getSummarydisplay_unsafe();
  }

  public void setSummarydisplay(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getSummarydisplayColumn().getType().assertValidCooked(cooked);
    writeLock();
    setSummarydisplay_unsafe(cooked);
  }

  public final void setSummarydisplay(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setSummarydisplay(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getSummarydisplayField() throws AccessPoemException {
    return _getColumnInfoTable().getSummarydisplayColumn().asField(this);
  }

  public Boolean getPrimarydisplay_unsafe() {
    return primarydisplay;
  }

  public void setPrimarydisplay_unsafe(Boolean cooked) {
    primarydisplay = cooked;
  }

  public Boolean getPrimarydisplay()
      throws AccessPoemException {
    readLock();
    return getPrimarydisplay_unsafe();
  }

  public void setPrimarydisplay(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getPrimarydisplayColumn().getType().assertValidCooked(cooked);
    writeLock();
    setPrimarydisplay_unsafe(cooked);
  }

  public final void setPrimarydisplay(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setPrimarydisplay(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getPrimarydisplayField() throws AccessPoemException {
    return _getColumnInfoTable().getPrimarydisplayColumn().asField(this);
  }

  public Boolean getSearchcriterion_unsafe() {
    return searchcriterion;
  }

  public void setSearchcriterion_unsafe(Boolean cooked) {
    searchcriterion = cooked;
  }

  public Boolean getSearchcriterion()
      throws AccessPoemException {
    readLock();
    return getSearchcriterion_unsafe();
  }

  public void setSearchcriterion(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getSearchcriterionColumn().getType().assertValidCooked(cooked);
    writeLock();
    setSearchcriterion_unsafe(cooked);
  }

  public final void setSearchcriterion(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setSearchcriterion(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getSearchcriterionField() throws AccessPoemException {
    return _getColumnInfoTable().getSearchcriterionColumn().asField(this);
  }

  public Boolean getPrimarycriterion_unsafe() {
    return primarycriterion;
  }

  public void setPrimarycriterion_unsafe(Boolean cooked) {
    primarycriterion = cooked;
  }

  public Boolean getPrimarycriterion()
      throws AccessPoemException {
    readLock();
    return getPrimarycriterion_unsafe();
  }

  public void setPrimarycriterion(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getPrimarycriterionColumn().getType().assertValidCooked(cooked);
    writeLock();
    setPrimarycriterion_unsafe(cooked);
  }

  public final void setPrimarycriterion(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setPrimarycriterion(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getPrimarycriterionField() throws AccessPoemException {
    return _getColumnInfoTable().getPrimarycriterionColumn().asField(this);
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

  public final Field getDisplayorderpriorityField() throws AccessPoemException {
    return _getColumnInfoTable().getDisplayorderpriorityColumn().asField(this);
  }

  public Integer getType_unsafe() {
    return type;
  }

  public void setType_unsafe(Integer cooked) {
    type = cooked;
  }

  public Integer getTypeCode()
      throws AccessPoemException {
    readLock();
    return getType_unsafe();
  }

  public void setTypeCode(Integer raw)
      throws AccessPoemException {
    getColumnInfoTable().getTypeColumn().getType().assertValidRaw(raw);
    writeLock();
    setType_unsafe(raw);
  }

  public PoemTypeFactory getType()
      throws AccessPoemException {
    Integer code = getTypeCode();
    return code == null ? null :
        PoemTypeFactory.forCode(getDatabase(), code.intValue());
  }

  public void setType(PoemTypeFactory cooked)
      throws AccessPoemException {
    setTypeCode(cooked == null ? null : cooked.code);
  }

  public final Field getTypeField() throws AccessPoemException {
    return _getColumnInfoTable().getTypeColumn().asField(this);
  }

  public Boolean getNullable_unsafe() {
    return nullable;
  }

  public void setNullable_unsafe(Boolean cooked) {
    nullable = cooked;
  }

  public Boolean getNullable()
      throws AccessPoemException {
    readLock();
    return getNullable_unsafe();
  }

  public void setNullable(Boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getNullableColumn().getType().assertValidCooked(cooked);
    writeLock();
    setNullable_unsafe(cooked);
  }

  public final void setNullable(boolean cooked)
      throws AccessPoemException, ValidationPoemException {
    setNullable(cooked ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getNullableField() throws AccessPoemException {
    return _getColumnInfoTable().getNullableColumn().asField(this);
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

  public final Field getIndexedField() throws AccessPoemException {
    return _getColumnInfoTable().getIndexedColumn().asField(this);
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

  public final Field getUniqueField() throws AccessPoemException {
    return _getColumnInfoTable().getUniqueColumn().asField(this);
  }

  public Integer getSize_unsafe() {
    return size;
  }

  public void setSize_unsafe(Integer cooked) {
    size = cooked;
  }

  public Integer getSize()
      throws AccessPoemException {
    readLock();
    return getSize_unsafe();
  }

  public void setSize(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getSizeColumn().getType().assertValidCooked(cooked);
    writeLock();
    setSize_unsafe(cooked);
  }

  public final void setSize(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setSize(new Integer(cooked));
  }

  public final Field getSizeField() throws AccessPoemException {
    return _getColumnInfoTable().getSizeColumn().asField(this);
  }

  public Integer getWidth_unsafe() {
    return width;
  }

  public void setWidth_unsafe(Integer cooked) {
    width = cooked;
  }

  public Integer getWidth()
      throws AccessPoemException {
    readLock();
    return getWidth_unsafe();
  }

  public void setWidth(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getWidthColumn().getType().assertValidCooked(cooked);
    writeLock();
    setWidth_unsafe(cooked);
  }

  public final void setWidth(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setWidth(new Integer(cooked));
  }

  public final Field getWidthField() throws AccessPoemException {
    return _getColumnInfoTable().getWidthColumn().asField(this);
  }

  public Integer getHeight_unsafe() {
    return height;
  }

  public void setHeight_unsafe(Integer cooked) {
    height = cooked;
  }

  public Integer getHeight()
      throws AccessPoemException {
    readLock();
    return getHeight_unsafe();
  }

  public void setHeight(Integer cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getHeightColumn().getType().assertValidCooked(cooked);
    writeLock();
    setHeight_unsafe(cooked);
  }

  public final void setHeight(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setHeight(new Integer(cooked));
  }

  public final Field getHeightField() throws AccessPoemException {
    return _getColumnInfoTable().getHeightColumn().asField(this);
  }

  public String getRenderinfo_unsafe() {
    return renderinfo;
  }

  public void setRenderinfo_unsafe(String cooked) {
    renderinfo = cooked;
  }

  public String getRenderinfo()
      throws AccessPoemException {
    readLock();
    return getRenderinfo_unsafe();
  }

  public void setRenderinfo(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getRenderinfoColumn().getType().assertValidCooked(cooked);
    writeLock();
    setRenderinfo_unsafe(cooked);
  }

  public final Field getRenderinfoField() throws AccessPoemException {
    return _getColumnInfoTable().getRenderinfoColumn().asField(this);
  }

  public String getRangelow_string_unsafe() {
    return rangelow_string;
  }

  public void setRangelow_string_unsafe(String cooked) {
    rangelow_string = cooked;
  }

  public String getRangelow_string()
      throws AccessPoemException {
    readLock();
    return getRangelow_string_unsafe();
  }

  public void setRangelow_string(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getRangelow_stringColumn().getType().assertValidCooked(cooked);
    writeLock();
    setRangelow_string_unsafe(cooked);
  }

  public final Field getRangelow_stringField() throws AccessPoemException {
    return _getColumnInfoTable().getRangelow_stringColumn().asField(this);
  }

  public String getRangelimit_string_unsafe() {
    return rangelimit_string;
  }

  public void setRangelimit_string_unsafe(String cooked) {
    rangelimit_string = cooked;
  }

  public String getRangelimit_string()
      throws AccessPoemException {
    readLock();
    return getRangelimit_string_unsafe();
  }

  public void setRangelimit_string(String cooked)
      throws AccessPoemException, ValidationPoemException {
    _getColumnInfoTable().getRangelimit_stringColumn().getType().assertValidCooked(cooked);
    writeLock();
    setRangelimit_string_unsafe(cooked);
  }

  public final Field getRangelimit_stringField() throws AccessPoemException {
    return _getColumnInfoTable().getRangelimit_stringColumn().asField(this);
  }
}
