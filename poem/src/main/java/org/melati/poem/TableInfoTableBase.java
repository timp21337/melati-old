// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem;

public class TableInfoTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;
  private Column col_displayname = null;
  private Column col_description = null;
  private Column col_displayorder = null;
  private Column col_defaultcanread = null;
  private Column col_defaultcanwrite = null;
  private Column col_cancreate = null;
  private Column col_cachelimit = null;
  private Column col_seqcached = null;

  public TableInfoTableBase(Database database, String name) throws PoemException {
    super(database, name, DefinitionSource.dsd);
  }

  protected void init() throws PoemException {
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((TableInfoData)data).id;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).id = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getId();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setId((Integer)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getId();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setId((Integer)ident);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 50), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((TableInfoData)data).name;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).name = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getName();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setName((String)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
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

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getName();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setName((String)ident);
          }
        });

    defineColumn(col_displayname =
        new Column(this, "displayname", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((TableInfoData)data).displayname;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).displayname = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDisplayname();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDisplayname((String)value);
          }

          protected boolean defaultPrimaryDisplay() {
            return true;
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

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDisplayname();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setDisplayname((String)ident);
          }
        });

    defineColumn(col_description =
        new Column(this, "description", new StringPoemType(true, -1), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((TableInfoData)data).description;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).description = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDescription();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDescription((String)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 3;
          }

          protected String defaultDescription() {
            return "A brief description of the table's function";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDescription();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setDescription((String)ident);
          }
        });

    defineColumn(col_displayorder =
        new Column(this, "displayorder", new IntegerPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((TableInfoData)data).displayorder;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).displayorder = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDisplayorder();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDisplayorder((Integer)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
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

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDisplayorder();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setDisplayorder((Integer)ident);
          }
        });

    defineColumn(col_defaultcanread =
        new Column(this, "defaultcanread", new ReferencePoemType(getDatabase().getCapabilityTable(), true), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((TableInfoData)data).defaultcanread;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).defaultcanread = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDefaultcanread();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDefaultcanread((Capability)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
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

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcanreadTroid();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcanreadTroid((Integer)ident);
          }
        });

    defineColumn(col_defaultcanwrite =
        new Column(this, "defaultcanwrite", new ReferencePoemType(getDatabase().getCapabilityTable(), true), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((TableInfoData)data).defaultcanwrite;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).defaultcanwrite = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getDefaultcanwrite();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setDefaultcanwrite((Capability)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
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

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getDefaultcanwriteTroid();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setDefaultcanwriteTroid((Integer)ident);
          }
        });

    defineColumn(col_cancreate =
        new Column(this, "cancreate", new ReferencePoemType(getDatabase().getCapabilityTable(), true), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((TableInfoData)data).cancreate;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).cancreate = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getCancreate();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setCancreate((Capability)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
          }

          protected String defaultDisplayName() {
            return "Default `create' capability";
          }

          protected int defaultDisplayOrder() {
            return 7;
          }

          protected String defaultDescription() {
            return "The capability required, by default, for creating records in the table";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCancreateTroid();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setCancreateTroid((Integer)ident);
          }
        });

    defineColumn(col_cachelimit =
        new Column(this, "cachelimit", new IntegerPoemType(true), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((TableInfoData)data).cachelimit;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).cachelimit = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getCachelimit();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setCachelimit((Integer)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
          }

          protected String defaultDisplayName() {
            return "Cache size limit";
          }

          protected int defaultDisplayOrder() {
            return 8;
          }

          protected String defaultDescription() {
            return "The maximum number of records from the table to keep in the cache";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getCachelimit();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setCachelimit((Integer)ident);
          }
        });

    defineColumn(col_seqcached =
        new Column(this, "seqcached", new BooleanPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Boolean)((TableInfoData)data).seqcached;
          }

          public void setIdent(Data data, Object ident) {
            ((TableInfoData)data).seqcached = (Boolean)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((TableInfo)g).getSeqcached();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((TableInfo)g).setSeqcached((Boolean)value);
          }

          protected boolean defaultSummaryDisplay() {
            return false;
          }

          protected boolean defaultSearchCriterion() {
            return false;
          }

          protected String defaultDisplayName() {
            return "Record sequence cached";
          }

          protected int defaultDisplayOrder() {
            return 9;
          }

          protected String defaultDescription() {
            return "Whether the display sequence for the table's records is cached";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((TableInfo)g).getSeqcached();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((TableInfo)g).setSeqcached((Boolean)ident);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public final Column getDisplaynameColumn() {
    return col_displayname;
  }

  public final Column getDescriptionColumn() {
    return col_description;
  }

  public final Column getDisplayorderColumn() {
    return col_displayorder;
  }

  public final Column getDefaultcanreadColumn() {
    return col_defaultcanread;
  }

  public final Column getDefaultcanwriteColumn() {
    return col_defaultcanwrite;
  }

  public final Column getCancreateColumn() {
    return col_cancreate;
  }

  public final Column getCachelimitColumn() {
    return col_cachelimit;
  }

  public final Column getSeqcachedColumn() {
    return col_seqcached;
  }

  public TableInfo getTableInfoObject(Integer troid) {
    return (TableInfo)getObject(troid);
  }

  public TableInfo getTableInfoObject(int troid) {
    return (TableInfo)getObject(troid);
  }

  protected Persistent newPersistent() {
    return new TableInfo();
  }

  protected Data _newData() {
    return new TableInfoData();
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
    return null;
  }

  protected int defaultDisplayOrder() {
    return 0;
  }
}
