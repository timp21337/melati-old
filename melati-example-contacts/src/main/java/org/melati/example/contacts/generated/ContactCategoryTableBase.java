// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.example.contacts.generated;

import org.melati.example.contacts.Category;
import org.melati.example.contacts.Contact;
import org.melati.example.contacts.ContactCategory;
import org.melati.example.contacts.ContactsDatabaseTables;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.StandardIntegrityFix;
import org.melati.poem.Table;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for table ContactCategory.
 * Field summary for SQL table contactcategory:
 *   id
 *   category
 *   contact
 *
 */

public class ContactCategoryTableBase extends Table {

  private Column col_id = null;
  private Column col_category = null;
  private Column col_contact = null;

  public ContactCategoryTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }

  public ContactCategoryTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public ContactsDatabaseTables getContactsDatabaseTables() {
    return (ContactsDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ContactCategory)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ContactCategory)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ContactCategory)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ContactCategory)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ContactCategory)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ContactCategory)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ContactCategory)g).setId((Integer)raw);
          }
        });

    defineColumn(col_category =
        new Column(this, "category",
                   new ReferencePoemType(getContactsDatabaseTables().
                                             getCategoryTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ContactCategory)g).getCategory();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ContactCategory)g).setCategory((Category)cooked);
          }

          public Field asField(Persistent g) {
            return ((ContactCategory)g).getCategoryField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "Category";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ContactCategory)g).getCategory_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ContactCategory)g).setCategory_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ContactCategory)g).getCategoryTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ContactCategory)g).setCategoryTroid((Integer)raw);
          }

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.delete;
          }
        });

    defineColumn(col_contact =
        new Column(this, "contact",
                   new ReferencePoemType(getContactsDatabaseTables().
                                             getContactTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ContactCategory)g).getContact();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ContactCategory)g).setContact((Contact)cooked);
          }

          public Field asField(Persistent g) {
            return ((ContactCategory)g).getContactField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "Contact";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ContactCategory)g).getContact_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ContactCategory)g).setContact_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ContactCategory)g).getContactTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ContactCategory)g).setContactTroid((Integer)raw);
          }

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.delete;
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getCategoryColumn() {
    return col_category;
  }

  public final Column getContactColumn() {
    return col_contact;
  }

  public ContactCategory getContactCategoryObject(Integer troid) {
    return (ContactCategory)getObject(troid);
  }

  public ContactCategory getContactCategoryObject(int troid) {
    return (ContactCategory)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new ContactCategory();
  }
  protected String defaultDescription() {
    return "Contacts Categories";
  }

  protected String defaultCategory() {
    return "Data";
  }

  protected int defaultDisplayOrder() {
    return 10;
  }
}
