// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

public class ColumnInfoBase extends Persistent {

  public ColumnInfoTable getColumnInfoTable() {
    return (ColumnInfoTable)getTable();
  }

  Integer id;
  Integer tableinfo;
  String name;
  String displayname;
  String description;
  Integer displayorder;
  Boolean usereditable;
  Boolean recorddisplay;
  Boolean summarydisplay;
  Boolean primarydisplay;
  Boolean searchcriterion;
  Integer displayorderpriority;
  Integer type;
  Boolean nullable;
  Boolean indexed;
  Boolean unique;
  Integer size;
  Integer width;
  Integer height;
  String renderinfo;

  public Integer getId_unsafe() {
    return id;
  }

  public void setId_unsafe(Integer value) {
    id = value;
  }

  public Integer getId()
      throws AccessPoemException {
    readLock();
    return getId_unsafe();
  }

  public void setId(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getIdColumn().getType().assertValidValue(value);
    writeLock();
    setId_unsafe(value);
  }

  public final void setId(int value)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(value));
  }

  public final Field getIdField() throws AccessPoemException {
    return getColumnInfoTable().getIdColumn().asField(this);
  }

  public Integer getTableinfo_unsafe() {
    return tableinfo;
  }

  public void setTableinfo_unsafe(Integer value) {
    tableinfo = value;
  }

  public Integer getTableinfoTroid()
      throws AccessPoemException {
    readLock();
    return getTableinfo_unsafe();
  }

  public void setTableinfoTroid(Integer ident)
      throws AccessPoemException {
    getColumnInfoTable().getTableinfoColumn().getType().assertValidIdent(ident);
    writeLock();
    setTableinfo_unsafe(ident);
  }

  public TableInfo getTableinfo()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getTableinfoTroid();
    return troid == null ? null :
        ((PoemDatabase)getDatabase()).getTableInfoTable().getTableInfoObject(troid);
  }

  public void setTableinfo(TableInfo value)
      throws AccessPoemException {
    setTableinfoTroid(value == null ? null : value.troid());
  }

  public final Field getTableinfoField() throws AccessPoemException {
    return getColumnInfoTable().getTableinfoColumn().asField(this);
  }

  public String getName_unsafe() {
    return name;
  }

  public void setName_unsafe(String value) {
    name = value;
  }

  public String getName()
      throws AccessPoemException {
    readLock();
    return getName_unsafe();
  }

  public void setName(String value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getNameColumn().getType().assertValidValue(value);
    writeLock();
    setName_unsafe(value);
  }

  public final Field getNameField() throws AccessPoemException {
    return getColumnInfoTable().getNameColumn().asField(this);
  }

  public String getDisplayname_unsafe() {
    return displayname;
  }

  public void setDisplayname_unsafe(String value) {
    displayname = value;
  }

  public String getDisplayname()
      throws AccessPoemException {
    readLock();
    return getDisplayname_unsafe();
  }

  public void setDisplayname(String value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getDisplaynameColumn().getType().assertValidValue(value);
    writeLock();
    setDisplayname_unsafe(value);
  }

  public final Field getDisplaynameField() throws AccessPoemException {
    return getColumnInfoTable().getDisplaynameColumn().asField(this);
  }

  public String getDescription_unsafe() {
    return description;
  }

  public void setDescription_unsafe(String value) {
    description = value;
  }

  public String getDescription()
      throws AccessPoemException {
    readLock();
    return getDescription_unsafe();
  }

  public void setDescription(String value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getDescriptionColumn().getType().assertValidValue(value);
    writeLock();
    setDescription_unsafe(value);
  }

  public final Field getDescriptionField() throws AccessPoemException {
    return getColumnInfoTable().getDescriptionColumn().asField(this);
  }

  public Integer getDisplayorder_unsafe() {
    return displayorder;
  }

  public void setDisplayorder_unsafe(Integer value) {
    displayorder = value;
  }

  public Integer getDisplayorder()
      throws AccessPoemException {
    readLock();
    return getDisplayorder_unsafe();
  }

  public void setDisplayorder(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getDisplayorderColumn().getType().assertValidValue(value);
    writeLock();
    setDisplayorder_unsafe(value);
  }

  public final void setDisplayorder(int value)
      throws AccessPoemException, ValidationPoemException {
    setDisplayorder(new Integer(value));
  }

  public final Field getDisplayorderField() throws AccessPoemException {
    return getColumnInfoTable().getDisplayorderColumn().asField(this);
  }

  public Boolean getUsereditable_unsafe() {
    return usereditable;
  }

  public void setUsereditable_unsafe(Boolean value) {
    usereditable = value;
  }

  public Boolean getUsereditable()
      throws AccessPoemException {
    readLock();
    return getUsereditable_unsafe();
  }

  public void setUsereditable(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getUsereditableColumn().getType().assertValidValue(value);
    writeLock();
    setUsereditable_unsafe(value);
  }

  public final void setUsereditable(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setUsereditable(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getUsereditableField() throws AccessPoemException {
    return getColumnInfoTable().getUsereditableColumn().asField(this);
  }

  public Boolean getRecorddisplay_unsafe() {
    return recorddisplay;
  }

  public void setRecorddisplay_unsafe(Boolean value) {
    recorddisplay = value;
  }

  public Boolean getRecorddisplay()
      throws AccessPoemException {
    readLock();
    return getRecorddisplay_unsafe();
  }

  public void setRecorddisplay(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getRecorddisplayColumn().getType().assertValidValue(value);
    writeLock();
    setRecorddisplay_unsafe(value);
  }

  public final void setRecorddisplay(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setRecorddisplay(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getRecorddisplayField() throws AccessPoemException {
    return getColumnInfoTable().getRecorddisplayColumn().asField(this);
  }

  public Boolean getSummarydisplay_unsafe() {
    return summarydisplay;
  }

  public void setSummarydisplay_unsafe(Boolean value) {
    summarydisplay = value;
  }

  public Boolean getSummarydisplay()
      throws AccessPoemException {
    readLock();
    return getSummarydisplay_unsafe();
  }

  public void setSummarydisplay(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getSummarydisplayColumn().getType().assertValidValue(value);
    writeLock();
    setSummarydisplay_unsafe(value);
  }

  public final void setSummarydisplay(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setSummarydisplay(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getSummarydisplayField() throws AccessPoemException {
    return getColumnInfoTable().getSummarydisplayColumn().asField(this);
  }

  public Boolean getPrimarydisplay_unsafe() {
    return primarydisplay;
  }

  public void setPrimarydisplay_unsafe(Boolean value) {
    primarydisplay = value;
  }

  public Boolean getPrimarydisplay()
      throws AccessPoemException {
    readLock();
    return getPrimarydisplay_unsafe();
  }

  public void setPrimarydisplay(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getPrimarydisplayColumn().getType().assertValidValue(value);
    writeLock();
    setPrimarydisplay_unsafe(value);
  }

  public final void setPrimarydisplay(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setPrimarydisplay(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getPrimarydisplayField() throws AccessPoemException {
    return getColumnInfoTable().getPrimarydisplayColumn().asField(this);
  }

  public Boolean getSearchcriterion_unsafe() {
    return searchcriterion;
  }

  public void setSearchcriterion_unsafe(Boolean value) {
    searchcriterion = value;
  }

  public Boolean getSearchcriterion()
      throws AccessPoemException {
    readLock();
    return getSearchcriterion_unsafe();
  }

  public void setSearchcriterion(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getSearchcriterionColumn().getType().assertValidValue(value);
    writeLock();
    setSearchcriterion_unsafe(value);
  }

  public final void setSearchcriterion(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setSearchcriterion(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getSearchcriterionField() throws AccessPoemException {
    return getColumnInfoTable().getSearchcriterionColumn().asField(this);
  }

  public Integer getDisplayorderpriority_unsafe() {
    return displayorderpriority;
  }

  public void setDisplayorderpriority_unsafe(Integer value) {
    displayorderpriority = value;
  }

  public Integer getDisplayorderpriority()
      throws AccessPoemException {
    readLock();
    return getDisplayorderpriority_unsafe();
  }

  public void setDisplayorderpriority(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getDisplayorderpriorityColumn().getType().assertValidValue(value);
    writeLock();
    setDisplayorderpriority_unsafe(value);
  }

  public final void setDisplayorderpriority(int value)
      throws AccessPoemException, ValidationPoemException {
    setDisplayorderpriority(new Integer(value));
  }

  public final Field getDisplayorderpriorityField() throws AccessPoemException {
    return getColumnInfoTable().getDisplayorderpriorityColumn().asField(this);
  }

  public Integer getType_unsafe() {
    return type;
  }

  public void setType_unsafe(Integer value) {
    type = value;
  }

  public Integer getTypeCode()
      throws AccessPoemException {
    readLock();
    return getType_unsafe();
  }

  public void setTypeCode(Integer ident)
      throws AccessPoemException {
    getColumnInfoTable().getTypeColumn().getType().assertValidIdent(ident);
    writeLock();
    setType_unsafe(ident);
  }

  public PoemTypeFactory getType()
      throws AccessPoemException {
    Integer code = getTypeCode();
    return code == null ? null :
        PoemTypeFactory.forCode(getDatabase(), code.intValue());
  }

  public void setType(PoemTypeFactory value)
      throws AccessPoemException {
    setTypeCode(value == null ? null : value.code);
  }

  public final Field getTypeField() throws AccessPoemException {
    return getColumnInfoTable().getTypeColumn().asField(this);
  }

  public Boolean getNullable_unsafe() {
    return nullable;
  }

  public void setNullable_unsafe(Boolean value) {
    nullable = value;
  }

  public Boolean getNullable()
      throws AccessPoemException {
    readLock();
    return getNullable_unsafe();
  }

  public void setNullable(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getNullableColumn().getType().assertValidValue(value);
    writeLock();
    setNullable_unsafe(value);
  }

  public final void setNullable(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setNullable(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getNullableField() throws AccessPoemException {
    return getColumnInfoTable().getNullableColumn().asField(this);
  }

  public Boolean getIndexed_unsafe() {
    return indexed;
  }

  public void setIndexed_unsafe(Boolean value) {
    indexed = value;
  }

  public Boolean getIndexed()
      throws AccessPoemException {
    readLock();
    return getIndexed_unsafe();
  }

  public void setIndexed(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getIndexedColumn().getType().assertValidValue(value);
    writeLock();
    setIndexed_unsafe(value);
  }

  public final void setIndexed(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setIndexed(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getIndexedField() throws AccessPoemException {
    return getColumnInfoTable().getIndexedColumn().asField(this);
  }

  public Boolean getUnique_unsafe() {
    return unique;
  }

  public void setUnique_unsafe(Boolean value) {
    unique = value;
  }

  public Boolean getUnique()
      throws AccessPoemException {
    readLock();
    return getUnique_unsafe();
  }

  public void setUnique(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getUniqueColumn().getType().assertValidValue(value);
    writeLock();
    setUnique_unsafe(value);
  }

  public final void setUnique(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setUnique(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getUniqueField() throws AccessPoemException {
    return getColumnInfoTable().getUniqueColumn().asField(this);
  }

  public Integer getSize_unsafe() {
    return size;
  }

  public void setSize_unsafe(Integer value) {
    size = value;
  }

  public Integer getSize()
      throws AccessPoemException {
    readLock();
    return getSize_unsafe();
  }

  public void setSize(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getSizeColumn().getType().assertValidValue(value);
    writeLock();
    setSize_unsafe(value);
  }

  public final void setSize(int value)
      throws AccessPoemException, ValidationPoemException {
    setSize(new Integer(value));
  }

  public final Field getSizeField() throws AccessPoemException {
    return getColumnInfoTable().getSizeColumn().asField(this);
  }

  public Integer getWidth_unsafe() {
    return width;
  }

  public void setWidth_unsafe(Integer value) {
    width = value;
  }

  public Integer getWidth()
      throws AccessPoemException {
    readLock();
    return getWidth_unsafe();
  }

  public void setWidth(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getWidthColumn().getType().assertValidValue(value);
    writeLock();
    setWidth_unsafe(value);
  }

  public final void setWidth(int value)
      throws AccessPoemException, ValidationPoemException {
    setWidth(new Integer(value));
  }

  public final Field getWidthField() throws AccessPoemException {
    return getColumnInfoTable().getWidthColumn().asField(this);
  }

  public Integer getHeight_unsafe() {
    return height;
  }

  public void setHeight_unsafe(Integer value) {
    height = value;
  }

  public Integer getHeight()
      throws AccessPoemException {
    readLock();
    return getHeight_unsafe();
  }

  public void setHeight(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getHeightColumn().getType().assertValidValue(value);
    writeLock();
    setHeight_unsafe(value);
  }

  public final void setHeight(int value)
      throws AccessPoemException, ValidationPoemException {
    setHeight(new Integer(value));
  }

  public final Field getHeightField() throws AccessPoemException {
    return getColumnInfoTable().getHeightColumn().asField(this);
  }

  public String getRenderinfo_unsafe() {
    return renderinfo;
  }

  public void setRenderinfo_unsafe(String value) {
    renderinfo = value;
  }

  public String getRenderinfo()
      throws AccessPoemException {
    readLock();
    return getRenderinfo_unsafe();
  }

  public void setRenderinfo(String value)
      throws AccessPoemException, ValidationPoemException {
    getColumnInfoTable().getRenderinfoColumn().getType().assertValidValue(value);
    writeLock();
    setRenderinfo_unsafe(value);
  }

  public final Field getRenderinfoField() throws AccessPoemException {
    return getColumnInfoTable().getRenderinfoColumn().asField(this);
  }
}
