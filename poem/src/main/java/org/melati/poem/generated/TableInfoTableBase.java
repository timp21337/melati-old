// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.Capability;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.PoemTable;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.StandardIntegrityFix;
import org.melati.poem.StringPoemType;
import org.melati.poem.TableCategory;
import org.melati.poem.TableInfo;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>TableInfo</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class TableInfoTableBase extends PoemTable {

  private Column col_id = null;
  private Column col_name = null;
  private Column col_displayname = null;
  private Column col_description = null;
  private Column col_displayorder = null;
  private Column col_defaultcanread = null;
  private Column col_defaultcanwrite = null;
  private Column col_defaultcandelete = null;
  private Column col_cancreate = null;
  private Column col_cachelimit = null;
  private Column col_seqcached = null;
  private Column col_category = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public TableInfoTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          protected String defaultDescription() {
            return "The Table Row Object ID";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name",
                   new StringPoemType(false, 50),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setName((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getNameField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "A code-name for the table";
          }

          protected boolean defaultUnique() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setName((String)raw);
          }
        });

    defineColumn(col_displayname =
        new Column(this, "displayname",
                   new StringPoemType(false, 60),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDisplayname();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDisplayname((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getDisplaynameField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected String defaultDisplayName() {
            return "Display name";
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "A user-friendly name for the table";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDisplayname_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDisplayname_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDisplayname();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDisplayname((String)raw);
          }
        });

    defineColumn(col_description =
        new Column(this, "description",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDescription();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDescription((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getDescriptionField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 3;
          }

          protected String defaultDescription() {
            return "A brief description of the table's function";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDescription_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDescription_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDescription();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDescription((String)raw);
          }
        });

    defineColumn(col_displayorder =
        new Column(this, "displayorder",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDisplayorder();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDisplayorder((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getDisplayorderField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "Display order";
          }

          protected int defaultDisplayOrder() {
            return 4;
          }

          protected String defaultDescription() {
            return "A rank determining where the table appears in the list of all tables";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDisplayorder_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDisplayorder_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDisplayorder();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDisplayorder((Integer)raw);
          }
        });

    defineColumn(col_defaultcanread =
        new Column(this, "defaultcanread",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getCapabilityTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDefaultcanread();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDefaultcanread((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getDefaultcanreadField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Default `read' capability";
          }

          protected int defaultDisplayOrder() {
            return 5;
          }

          protected String defaultDescription() {
            return "The capability required, by default, for reading the table's records";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcanread_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcanread_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcanreadTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcanreadTroid((Integer)raw);
          }

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.clear;
          }
        });

    defineColumn(col_defaultcanwrite =
        new Column(this, "defaultcanwrite",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getCapabilityTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDefaultcanwrite();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDefaultcanwrite((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getDefaultcanwriteField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Default `write' capability";
          }

          protected int defaultDisplayOrder() {
            return 6;
          }

          protected String defaultDescription() {
            return "The capability required, by default, for updating the table's records";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcanwrite_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcanwrite_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcanwriteTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcanwriteTroid((Integer)raw);
          }

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.clear;
          }
        });

    defineColumn(col_defaultcandelete =
        new Column(this, "defaultcandelete",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getCapabilityTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDefaultcandelete();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDefaultcandelete((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getDefaultcandeleteField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Default `delete' capability";
          }

          protected int defaultDisplayOrder() {
            return 7;
          }

          protected String defaultDescription() {
            return "The capability required, by default, for deleting the table's records";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcandelete_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcandelete_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcandeleteTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcandeleteTroid((Integer)raw);
          }

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.clear;
          }
        });

    defineColumn(col_cancreate =
        new Column(this, "cancreate",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getCapabilityTable(), true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getCancreate();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setCancreate((Capability)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getCancreateField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Default `create' capability";
          }

          protected int defaultDisplayOrder() {
            return 8;
          }

          protected String defaultDescription() {
            return "The capability required, by default, for creating records in the table";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCancreate_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setCancreate_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCancreateTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setCancreateTroid((Integer)raw);
          }

          public StandardIntegrityFix defaultIntegrityFix() {
            return StandardIntegrityFix.clear;
          }
        });

    defineColumn(col_cachelimit =
        new Column(this, "cachelimit",
                   new IntegerPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getCachelimit();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setCachelimit((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getCachelimitField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Cache size limit";
          }

          protected int defaultDisplayOrder() {
            return 9;
          }

          protected String defaultDescription() {
            return "The maximum number of records from the table to keep in the cache";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCachelimit_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setCachelimit_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCachelimit();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setCachelimit((Integer)raw);
          }
        });

    defineColumn(col_seqcached =
        new Column(this, "seqcached",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getSeqcached();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setSeqcached((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getSeqcachedField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Record sequence cached";
          }

          protected int defaultDisplayOrder() {
            return 10;
          }

          protected String defaultDescription() {
            return "Whether the display sequence for the table's records is cached";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getSeqcached_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setSeqcached_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getSeqcached();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setSeqcached((Boolean)raw);
          }
        });

    defineColumn(col_category =
        new Column(this, "category",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getTableCategoryTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getCategory();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setCategory((TableCategory)cooked);
          }

          public Field asField(Persistent g) {
            return ((TableInfo)g).getCategoryField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected int defaultDisplayOrder() {
            return 11;
          }

          protected String defaultDescription() {
            return "Which category the table falls into";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCategory_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setCategory_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCategoryTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((TableInfo)g).setCategoryTroid((Integer)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column getNameColumn() {
    return col_name;
  }


 /**
  * Retrieves the <code>Displayname</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the displayname <code>Column</code>
  */
  public final Column getDisplaynameColumn() {
    return col_displayname;
  }


 /**
  * Retrieves the <code>Description</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the description <code>Column</code>
  */
  public final Column getDescriptionColumn() {
    return col_description;
  }


 /**
  * Retrieves the <code>Displayorder</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the displayorder <code>Column</code>
  */
  public final Column getDisplayorderColumn() {
    return col_displayorder;
  }


 /**
  * Retrieves the <code>Defaultcanread</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the defaultcanread <code>Column</code>
  */
  public final Column getDefaultcanreadColumn() {
    return col_defaultcanread;
  }


 /**
  * Retrieves the <code>Defaultcanwrite</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the defaultcanwrite <code>Column</code>
  */
  public final Column getDefaultcanwriteColumn() {
    return col_defaultcanwrite;
  }


 /**
  * Retrieves the <code>Defaultcandelete</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the defaultcandelete <code>Column</code>
  */
  public final Column getDefaultcandeleteColumn() {
    return col_defaultcandelete;
  }


 /**
  * Retrieves the <code>Cancreate</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the cancreate <code>Column</code>
  */
  public final Column getCancreateColumn() {
    return col_cancreate;
  }


 /**
  * Retrieves the <code>Cachelimit</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the cachelimit <code>Column</code>
  */
  public final Column getCachelimitColumn() {
    return col_cachelimit;
  }


 /**
  * Retrieves the <code>Seqcached</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the seqcached <code>Column</code>
  */
  public final Column getSeqcachedColumn() {
    return col_seqcached;
  }


 /**
  * Retrieves the <code>Category</code> <code>Column</code> for this 
  * <code>TableInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the category <code>Column</code>
  */
  public final Column getCategoryColumn() {
    return col_category;
  }


 /**
  * Retrieve the <code>TableInfo</code> as a <code>TableInfo</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public TableInfo getTableInfoObject(Integer troid) {
    return (TableInfo)getObject(troid);
  }


 /**
  * Retrieve the <code>TableInfo</code> 
  * as a <code>TableInfo</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public TableInfo getTableInfoObject(int troid) {
    return (TableInfo)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new TableInfo();
  }
  protected String defaultDisplayName() {
    return "Table";
  }

  protected String defaultDescription() {
    return "Configuration information about a table in the database";
  }

  protected boolean defaultRememberAllTroids() {
    return true;
  }

  protected Integer defaultCacheLimit() {
    return new Integer(999999999);
  }

  protected String defaultCategory() {
    return "System";
  }

  protected int defaultDisplayOrder() {
    return 3010;
  }
}

