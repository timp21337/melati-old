// Do not edit this file!  It was generated by Melati Poem's DSD preprocessor.

package org.melati.poem;

class GroupBase extends Persistent {

  public final GroupData dataSnapshot()
      throws AccessPoemException {
    return (GroupData)_dataSnapshot();
  }

  protected final GroupData dataForReading()
      throws AccessPoemException {
    return (GroupData)_dataForReading();
  }

  protected final GroupData dataForWriting()
      throws AccessPoemException {
    return (GroupData)_dataForWriting();
  }

  public GroupTable getGroupTable() {
    return (GroupTable)getTable();
  }

  public Integer getId()
      throws AccessPoemException {
    return dataForReading().id;
  }

  public void setId(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getGroupTable().getIdColumn().getType().assertValidValue(value);
    dataForWriting().id = value;
  }

  public final void setId(int value)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(value));
  }

  public final Field getIdField() throws AccessPoemException {
    return getGroupTable().getIdColumn().asField(this);
  }

  public String getName()
      throws AccessPoemException {
    return dataForReading().name;
  }

  public void setName(String value)
      throws AccessPoemException, ValidationPoemException {
    getGroupTable().getNameColumn().getType().assertValidValue(value);
    dataForWriting().name = value;
  }

  public final Field getNameField() throws AccessPoemException {
    return getGroupTable().getNameColumn().asField(this);
  }
}
