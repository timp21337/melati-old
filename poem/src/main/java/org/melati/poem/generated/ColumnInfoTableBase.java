// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;

import org.melati.poem.AccessPoemException;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.Column;
import org.melati.poem.ColumnInfo;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.DisplayLevelPoemType;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.IntegrityFixPoemType;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.SearchabilityPoemType;
import org.melati.poem.StandardIntegrityFix;
import org.melati.poem.StringPoemType;
import org.melati.poem.TableInfo;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.ValueInfoTable;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>ColumnInfo</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class ColumnInfoTableBase extends ValueInfoTable {

  private Column col_id = null;
  private Column col_tableinfo = null;
  private Column col_name = null;
  private Column col_displayorder = null;
  private Column col_usercreateable = null;
  private Column col_displaylevel = null;
  private Column col_searchability = null;
  private Column col_displayorderpriority = null;
  private Column col_sortdescending = null;
  private Column col_indexed = null;
  private Column col_unique = null;
  private Column col_integrityfix = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public ColumnInfoTableBase(
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

  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setId((Integer)raw);
          }
        });

    defineColumn(col_tableinfo =
        new Column(this, "tableinfo",
                   new ReferencePoemType(getPoemDatabaseTables().
                                             getTableInfoTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getTableinfo();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setTableinfo((TableInfo)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getTableinfoField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "Owning table";
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "The table to which the field belongs";
          }

          protected String defaultRenderinfo() {
            return "SelectionWindow";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getTableinfo_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setTableinfo_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getTableinfoTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setTableinfoTroid((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column(this, "name",
                   new StringPoemType(false, 50),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setName((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getNameField();
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
            return 50;
          }

          protected String defaultDescription() {
            return "A code-name for the field";
          }

          protected boolean defaultIndexed() {
            return true;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setName((String)raw);
          }
        });

    defineColumn(col_displayorder =
        new Column(this, "displayorder",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplayorder();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplayorder((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getDisplayorderField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(1);
          }

          protected String defaultDisplayName() {
            return "Display order";
          }

          protected int defaultDisplayOrder() {
            return 51;
          }

          protected String defaultDescription() {
            return "A rank determining where the field appears in lists";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayorder_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayorder_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayorder();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayorder((Integer)raw);
          }
        });

    defineColumn(col_usercreateable =
        new Column(this, "usercreateable",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getUsercreateable();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setUsercreateable((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getUsercreateableField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "User-createable";
          }

          protected int defaultDisplayOrder() {
            return 52;
          }

          protected String defaultDescription() {
            return "Whether it makes sense for the user to initialise the field's value";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getUsercreateable_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setUsercreateable_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getUsercreateable();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setUsercreateable((Boolean)raw);
          }
        });

    defineColumn(col_displaylevel =
        new Column(this, "displaylevel",
                   new DisplayLevelPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplaylevel();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplaylevel((DisplayLevel)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getDisplaylevelField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Display level";
          }

          protected int defaultDisplayOrder() {
            return 53;
          }

          protected String defaultDescription() {
            return "A category determining what granularity of report the field appears in";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplaylevel_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplaylevel_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplaylevelIndex();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplaylevelIndex((Integer)raw);
          }
        });

    defineColumn(col_searchability =
        new Column(this, "searchability",
                   new SearchabilityPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getSearchability();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setSearchability((Searchability)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getSearchabilityField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 54;
          }

          protected String defaultDescription() {
            return "A category determining what level of searching this field supports";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getSearchability_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setSearchability_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getSearchabilityIndex();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setSearchabilityIndex((Integer)raw);
          }
        });

    defineColumn(col_displayorderpriority =
        new Column(this, "displayorderpriority",
                   new IntegerPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplayorderpriority();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplayorderpriority((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getDisplayorderpriorityField();
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Display order priority";
          }

          protected int defaultDisplayOrder() {
            return 55;
          }

          protected String defaultDescription() {
            return "If present, the level at which lists of records are sorted by the field";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayorderpriority_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayorderpriority_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayorderpriority();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayorderpriority((Integer)raw);
          }
        });

    defineColumn(col_sortdescending =
        new Column(this, "sortdescending",
                   new BooleanPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getSortdescending();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setSortdescending((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getSortdescendingField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Sort Descending";
          }

          protected int defaultDisplayOrder() {
            return 56;
          }

          protected String defaultDescription() {
            return "Whether when sorting by this column, the sort order should be reversed";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getSortdescending_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setSortdescending_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getSortdescending();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setSortdescending((Boolean)raw);
          }
        });

    defineColumn(col_indexed =
        new Column(this, "indexed",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getIndexed();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setIndexed((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getIndexedField();
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
            return 57;
          }

          protected String defaultDescription() {
            return "Whether the field is indexed (ignored if the field is marked `unique')";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getIndexed_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setIndexed_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getIndexed();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setIndexed((Boolean)raw);
          }
        });

    defineColumn(col_unique =
        new Column(this, "unique",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getUnique();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setUnique((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getUniqueField();
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
            return 58;
          }

          protected String defaultDescription() {
            return "Whether the field is unique (implies that it's `indexed')";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getUnique_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setUnique_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getUnique();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setUnique((Boolean)raw);
          }
        });

    defineColumn(col_integrityfix =
        new Column(this, "integrityfix",
                   new IntegrityFixPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getIntegrityfix();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setIntegrityfix((StandardIntegrityFix)cooked);
          }

          public Field asField(Persistent g) {
            return ((ColumnInfo)g).getIntegrityfixField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Integrity fix";
          }

          protected int defaultDisplayOrder() {
            return 59;
          }

          protected String defaultDescription() {
            return "How referential integrity is maintained, what to do when the object referred to is deleted";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getIntegrityfix_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setIntegrityfix_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getIntegrityfixIndex();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ColumnInfo)g).setIntegrityfixIndex((Integer)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Tableinfo</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the tableinfo <code>Column</code>
  */
  public final Column getTableinfoColumn() {
    return col_tableinfo;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column getNameColumn() {
    return col_name;
  }


 /**
  * Retrieves the <code>Displayorder</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the displayorder <code>Column</code>
  */
  public final Column getDisplayorderColumn() {
    return col_displayorder;
  }


 /**
  * Retrieves the <code>Usercreateable</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the usercreateable <code>Column</code>
  */
  public final Column getUsercreateableColumn() {
    return col_usercreateable;
  }


 /**
  * Retrieves the <code>Displaylevel</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the displaylevel <code>Column</code>
  */
  public final Column getDisplaylevelColumn() {
    return col_displaylevel;
  }


 /**
  * Retrieves the <code>Searchability</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the searchability <code>Column</code>
  */
  public final Column getSearchabilityColumn() {
    return col_searchability;
  }


 /**
  * Retrieves the <code>Displayorderpriority</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the displayorderpriority <code>Column</code>
  */
  public final Column getDisplayorderpriorityColumn() {
    return col_displayorderpriority;
  }


 /**
  * Retrieves the <code>Sortdescending</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the sortdescending <code>Column</code>
  */
  public final Column getSortdescendingColumn() {
    return col_sortdescending;
  }


 /**
  * Retrieves the <code>Indexed</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the indexed <code>Column</code>
  */
  public final Column getIndexedColumn() {
    return col_indexed;
  }


 /**
  * Retrieves the <code>Unique</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the unique <code>Column</code>
  */
  public final Column getUniqueColumn() {
    return col_unique;
  }


 /**
  * Retrieves the <code>Integrityfix</code> <code>Column</code> for this 
  * <code>ColumnInfo</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the integrityfix <code>Column</code>
  */
  public final Column getIntegrityfixColumn() {
    return col_integrityfix;
  }


 /**
  * Retrieve the <code>ColumnInfo</code> as a <code>ColumnInfo</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public ColumnInfo getColumnInfoObject(Integer troid) {
    return (ColumnInfo)getObject(troid);
  }


 /**
  * Retrieve the <code>ColumnInfo</code> 
  * as a <code>ColumnInfo</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public ColumnInfo getColumnInfoObject(int troid) {
    return (ColumnInfo)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new ColumnInfo();
  }
  protected String defaultDisplayName() {
    return "Column";
  }

  protected String defaultDescription() {
    return "Configuration information about a column in the database";
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
    return 3020;
  }
}

