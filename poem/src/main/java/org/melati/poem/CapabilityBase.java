// Do not edit this file!  It was generated by Melati Poem's DSD preprocessor.

package org.melati.poem;

public class CapabilityBase extends Persistent {

  public final CapabilityData dataSnapshot()
      throws AccessPoemException {
    return (CapabilityData)_dataSnapshot();
  }

  protected final CapabilityData dataForReading()
      throws AccessPoemException {
    return (CapabilityData)_dataForReading();
  }

  protected final CapabilityData dataForWriting()
      throws AccessPoemException {
    return (CapabilityData)_dataForWriting();
  }

  public CapabilityTable getCapabilityTable() {
    return (CapabilityTable)getTable();
  }

  public Integer getId()
      throws AccessPoemException {
    return dataForReading().id;
  }

  public void setId(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getCapabilityTable().getIdColumn().getType().assertValidValue(value);
    dataForWriting().id = value;
  }

  public final void setId(int value)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(value));
  }

  public final Field getIdField() throws AccessPoemException {
    return getCapabilityTable().getIdColumn().asField(this);
  }

  public String getName()
      throws AccessPoemException {
    return dataForReading().name;
  }

  public void setName(String value)
      throws AccessPoemException, ValidationPoemException {
    getCapabilityTable().getNameColumn().getType().assertValidValue(value);
    dataForWriting().name = value;
  }

  public final Field getNameField() throws AccessPoemException {
    return getCapabilityTable().getNameColumn().asField(this);
  }
}
