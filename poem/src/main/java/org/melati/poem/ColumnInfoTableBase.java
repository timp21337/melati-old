// Do not edit this file!  It was generated by Melati Poem's DSD preprocessor.

package org.melati.poem;

public class ColumnInfoTableBase extends Table {

  private Column col_id = null;
  private Column col_tableinfo = null;
  private Column col_name = null;
  private Column col_displayname = null;
  private Column col_description = null;
  private Column col_displayorder = null;
  private Column col_usereditable = null;
  private Column col_displayable = null;
  private Column col_primarydisplay = null;
  private Column col_displayorderpriority = null;
  private Column col_type = null;
  private Column col_nullable = null;
  private Column col_size = null;
  private Column col_width = null;
  private Column col_height = null;
  private Column col_renderinfo = null;

  public ColumnInfoTableBase(Database database, String name) throws PoemException {
    super(database, name, DefinitionSource.dsd);
  }

  protected void init() throws PoemException {
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).id;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).id = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getId();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setId((Integer)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getId();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setId((Integer)ident);
          }
        });

    defineColumn(col_tableinfo =
        new Column(this, "tableinfo", new ReferencePoemType(getDatabase().getTableInfoTable(), false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).tableinfo;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).tableinfo = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getTableinfo();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setTableinfo((TableInfo)value);
          }

          protected String defaultDisplayName() {
            return "Owning table";
          }

          protected String defaultDescription() {
            return "The table to which the field belongs";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getTableinfoTroid();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setTableinfoTroid((Integer)ident);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 50), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((ColumnInfoData)data).name;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).name = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getName();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setName((String)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected String defaultDescription() {
            return "A code-name for the field";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getName();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setName((String)ident);
          }
        });

    defineColumn(col_displayname =
        new Column(this, "displayname", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((ColumnInfoData)data).displayname;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).displayname = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplayname();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplayname((String)value);
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

          protected String defaultDescription() {
            return "A user-friendly name for the field";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayname();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayname((String)ident);
          }
        });

    defineColumn(col_description =
        new Column(this, "description", new StringPoemType(true, -1), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((ColumnInfoData)data).description;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).description = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDescription();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDescription((String)value);
          }

          protected String defaultDescription() {
            return "A brief description of the field's function";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDescription();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setDescription((String)ident);
          }
        });

    defineColumn(col_displayorder =
        new Column(this, "displayorder", new IntegerPoemType(true), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).displayorder;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).displayorder = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplayorder();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplayorder((Integer)value);
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "Display order";
          }

          protected String defaultDescription() {
            return "A rank determining where the field appears in lists";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayorder();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayorder((Integer)ident);
          }
        });

    defineColumn(col_usereditable =
        new Column(this, "usereditable", new BooleanPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Boolean)((ColumnInfoData)data).usereditable;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).usereditable = (Boolean)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getUsereditable();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setUsereditable((Boolean)value);
          }

          protected String defaultDisplayName() {
            return "User-editable";
          }

          protected String defaultDescription() {
            return "Whether it makes sense for the user to update the field's value";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getUsereditable();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setUsereditable((Boolean)ident);
          }
        });

    defineColumn(col_displayable =
        new Column(this, "displayable", new BooleanPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Boolean)((ColumnInfoData)data).displayable;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).displayable = (Boolean)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplayable();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplayable((Boolean)value);
          }

          protected String defaultDisplayName() {
            return "User-viewable";
          }

          protected String defaultDescription() {
            return "Whether it makes sense for the user to the field's value";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayable();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayable((Boolean)ident);
          }
        });

    defineColumn(col_primarydisplay =
        new Column(this, "primarydisplay", new BooleanPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Boolean)((ColumnInfoData)data).primarydisplay;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).primarydisplay = (Boolean)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getPrimarydisplay();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setPrimarydisplay((Boolean)value);
          }

          protected String defaultDisplayName() {
            return "Primary display field";
          }

          protected String defaultDescription() {
            return "Whether the field is used as a short representation of the whole record";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getPrimarydisplay();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setPrimarydisplay((Boolean)ident);
          }
        });

    defineColumn(col_displayorderpriority =
        new Column(this, "displayorderpriority", new IntegerPoemType(true), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).displayorderpriority;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).displayorderpriority = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getDisplayorderpriority();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setDisplayorderpriority((Integer)value);
          }

          protected String defaultDisplayName() {
            return "Display order priority";
          }

          protected String defaultDescription() {
            return "If present, the level at which lists of records are sorted by the field";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getDisplayorderpriority();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setDisplayorderpriority((Integer)ident);
          }
        });

    defineColumn(col_type =
        new Column(this, "type", new ColumnTypePoemType(getDatabase()), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).type;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).type = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getType();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setType((PoemTypeFactory)value);
          }

          protected String defaultDescription() {
            return "The field's Melati type";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getTypeCode();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setTypeCode((Integer)ident);
          }
        });

    defineColumn(col_nullable =
        new Column(this, "nullable", new BooleanPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Boolean)((ColumnInfoData)data).nullable;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).nullable = (Boolean)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getNullable();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setNullable((Boolean)value);
          }

          protected String defaultDescription() {
            return "Whether the field can be empty";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getNullable();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setNullable((Boolean)ident);
          }
        });

    defineColumn(col_size =
        new Column(this, "size", new IntegerPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).size;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).size = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getSize();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setSize((Integer)value);
          }

          protected String defaultDescription() {
            return "For character fields, the maximum number of characters that can be stored";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getSize();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setSize((Integer)ident);
          }
        });

    defineColumn(col_width =
        new Column(this, "width", new IntegerPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).width;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).width = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getWidth();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setWidth((Integer)value);
          }

          protected String defaultDisplayName() {
            return "Input-box width";
          }

          protected String defaultDescription() {
            return "A sensible width for text boxes used for entering the field, where appropriate";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getWidth();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setWidth((Integer)ident);
          }
        });

    defineColumn(col_height =
        new Column(this, "height", new IntegerPoemType(false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((ColumnInfoData)data).height;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).height = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getHeight();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setHeight((Integer)value);
          }

          protected String defaultDisplayName() {
            return "Input-box height";
          }

          protected String defaultDescription() {
            return "A sensible height for text boxes used for entering the field, where appropriate";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getHeight();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setHeight((Integer)ident);
          }
        });

    defineColumn(col_renderinfo =
        new Column(this, "renderinfo", new StringPoemType(true, -1), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((ColumnInfoData)data).renderinfo;
          }

          public void setIdent(Data data, Object ident) {
            ((ColumnInfoData)data).renderinfo = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ColumnInfo)g).getRenderinfo();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((ColumnInfo)g).setRenderinfo((String)value);
          }

          protected String defaultDisplayName() {
            return "Rendering information";
          }

          protected String defaultDescription() {
            return "The name of the Melati templet (if not the default) to use for input controls for the field";
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((ColumnInfo)g).getRenderinfo();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((ColumnInfo)g).setRenderinfo((String)ident);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getTableinfoColumn() {
    return col_tableinfo;
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

  public final Column getUsereditableColumn() {
    return col_usereditable;
  }

  public final Column getDisplayableColumn() {
    return col_displayable;
  }

  public final Column getPrimarydisplayColumn() {
    return col_primarydisplay;
  }

  public final Column getDisplayorderpriorityColumn() {
    return col_displayorderpriority;
  }

  public final Column getTypeColumn() {
    return col_type;
  }

  public final Column getNullableColumn() {
    return col_nullable;
  }

  public final Column getSizeColumn() {
    return col_size;
  }

  public final Column getWidthColumn() {
    return col_width;
  }

  public final Column getHeightColumn() {
    return col_height;
  }

  public final Column getRenderinfoColumn() {
    return col_renderinfo;
  }

  public ColumnInfo getColumnInfoObject(Integer troid) {
    return (ColumnInfo)getObject(troid);
  }

  public ColumnInfo getColumnInfoObject(int troid) {
    return (ColumnInfo)getObject(troid);
  }

  protected Persistent newPersistent() {
    return new ColumnInfo();
  }

  protected Data _newData() {
    return new ColumnInfoData();
  }
  protected String defaultDisplayName() {
    return "Column";
  }

  protected String defaultDescription() {
    return "Configuration information about a column in the database";
  }

}
