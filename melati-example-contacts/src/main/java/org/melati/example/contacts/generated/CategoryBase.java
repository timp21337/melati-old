// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.doc.example.contacts.generated;

import org.melati.doc.example.contacts.*;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.poem.*;

public abstract class CategoryBase extends Persistent {

  public ContactsDatabaseTables getContactsDatabaseTables() {
    return (ContactsDatabaseTables)getDatabase();
  }

  public CategoryTable getCategoryTable() {
    return (CategoryTable)getTable();
  }

  private CategoryTable _getCategoryTable() {
    return (CategoryTable)getTable();
  }

  protected Integer id;
  protected String name;

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
    _getCategoryTable().getIdColumn().getType().assertValidCooked(cooked);
    writeLock();
    setId_unsafe(cooked);
  }

  public final void setId(int cooked)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(cooked));
  }

  public Field getIdField() throws AccessPoemException {
    Column c = _getCategoryTable().getIdColumn();
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
    _getCategoryTable().getNameColumn().getType().assertValidCooked(cooked);
    writeLock();
    setName_unsafe(cooked);
  }

  public Field getNameField() throws AccessPoemException {
    Column c = _getCategoryTable().getNameColumn();
    return new Field(c.getRaw(this), c);
  }
}
