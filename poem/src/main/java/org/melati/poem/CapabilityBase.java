// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

import java.util.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.util.*;

public class CapabilityBase extends Persistent {

  public PoemDatabase getPoemDatabase() {
    return (PoemDatabase)getDatabase();}
  public CapabilityTable getCapabilityTable() {
    return (CapabilityTable)getTable();
  }

  private CapabilityTable _getCapabilityTable() {
    return (CapabilityTable)getTable();
  }

  Integer id;
  String name;

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
    _getCapabilityTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public final Field getIdField() throws AccessPoemException {
    return _getCapabilityTable().getIdColumn().asField(this);
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
    _getCapabilityTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public final Field getNameField() throws AccessPoemException {
    return _getCapabilityTable().getNameColumn().asField(this);
  }
}
