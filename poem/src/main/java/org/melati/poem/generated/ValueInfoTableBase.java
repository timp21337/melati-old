// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.generated;


import org.melati.poem.AccessPoemException;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.Column;
import org.melati.poem.ColumnTypePoemType;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.Persistent;
import org.melati.poem.PoemDatabaseTables;
import org.melati.poem.PoemException;
import org.melati.poem.PoemTable;
import org.melati.poem.PoemTypeFactory;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.ValueInfo;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>ValueInfo</code>.
 *
 * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class ValueInfoTableBase extends PoemTable {

  private Column col_displayname = null;
  private Column col_description = null;
  private Column col_usereditable = null;
  private Column col_typefactory = null;
  private Column col_nullable = null;
  private Column col_size = null;
  private Column col_width = null;
  private Column col_height = null;
  private Column col_precision = null;
  private Column col_scale = null;
  private Column col_renderinfo = null;
  private Column col_rangelow_string = null;
  private Column col_rangelimit_string = null;

 /**
  * Constructor. 
  * 
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public ValueInfoTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Get the database tables.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public PoemDatabaseTables getPoemDatabaseTables() {
    return (PoemDatabaseTables)getDatabase();
  }

  public void init() throws PoemException {
    super.init();
    defineColumn(col_displayname =
        new Column(this, "displayname",
                   new StringPoemType(false, 60),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getDisplayname();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setDisplayname((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getDisplaynameField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(2);
          }

          protected String defaultDisplayName() {
            return "Display name";
          }

          protected int defaultDisplayOrder() {
            return 100;
          }

          protected String defaultDescription() {
            return "A user-friendly name for the field";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getDisplayname_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setDisplayname_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getDisplayname();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setDisplayname((String)raw);
          }
        });

    defineColumn(col_description =
        new Column(this, "description",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getDescription();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setDescription((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getDescriptionField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 101;
          }

          protected String defaultDescription() {
            return "A brief description of the field's function";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getDescription_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setDescription_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getDescription();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setDescription((String)raw);
          }
        });

    defineColumn(col_usereditable =
        new Column(this, "usereditable",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getUsereditable();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setUsereditable((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getUsereditableField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "User-editable";
          }

          protected int defaultDisplayOrder() {
            return 200;
          }

          protected String defaultDescription() {
            return "Whether it makes sense for the user to update the field's value";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getUsereditable_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setUsereditable_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getUsereditable();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setUsereditable((Boolean)raw);
          }
        });

    defineColumn(col_typefactory =
        new Column(this, "typefactory",
                   new ColumnTypePoemType(getDatabase()),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getTypefactory();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setTypefactory((PoemTypeFactory)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getTypefactoryField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Type";
          }

          protected int defaultDisplayOrder() {
            return 201;
          }

          protected String defaultDescription() {
            return "The field's POEM type";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getTypefactory_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setTypefactory_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getTypefactoryCode();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setTypefactoryCode((Integer)raw);
          }
        });

    defineColumn(col_nullable =
        new Column(this, "nullable",
                   new BooleanPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getNullable();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setNullable((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getNullableField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected int defaultDisplayOrder() {
            return 202;
          }

          protected String defaultDescription() {
            return "Whether the field can be empty";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getNullable_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setNullable_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getNullable();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setNullable((Boolean)raw);
          }
        });

    defineColumn(col_size =
        new Column(this, "size",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getSize();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setSize((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getSizeField();
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
            return 203;
          }

          protected String defaultDescription() {
            return "For character fields, the maximum number of characters that can be stored, (-1 for unlimited)";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getSize_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setSize_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getSize();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setSize((Integer)raw);
          }
        });

    defineColumn(col_width =
        new Column(this, "width",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getWidth();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setWidth((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getWidthField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Input-box width";
          }

          protected int defaultDisplayOrder() {
            return 204;
          }

          protected String defaultDescription() {
            return "A sensible width for text boxes used for entering the field, where appropriate";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getWidth_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setWidth_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getWidth();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setWidth((Integer)raw);
          }
        });

    defineColumn(col_height =
        new Column(this, "height",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getHeight();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setHeight((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getHeightField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Input-box height";
          }

          protected int defaultDisplayOrder() {
            return 205;
          }

          protected String defaultDescription() {
            return "A sensible height for text boxes used for entering the field, where appropriate";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getHeight_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setHeight_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getHeight();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setHeight((Integer)raw);
          }
        });

    defineColumn(col_precision =
        new Column(this, "precision",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getPrecision();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setPrecision((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getPrecisionField();
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

          protected String defaultDisplayName() {
            return "Precision";
          }

          protected int defaultDisplayOrder() {
            return 206;
          }

          protected String defaultDescription() {
            return "Precision (total number of digits) for fixed-point numbers";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getPrecision_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setPrecision_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getPrecision();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setPrecision((Integer)raw);
          }
        });

    defineColumn(col_scale =
        new Column(this, "scale",
                   new IntegerPoemType(false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getScale();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setScale((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getScaleField();
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

          protected String defaultDisplayName() {
            return "Scale";
          }

          protected int defaultDisplayOrder() {
            return 207;
          }

          protected String defaultDescription() {
            return "Scale (number of digits after the decimal) for fixed-point numbers";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getScale_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setScale_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getScale();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setScale((Integer)raw);
          }
        });

    defineColumn(col_renderinfo =
        new Column(this, "renderinfo",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getRenderinfo();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setRenderinfo((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getRenderinfoField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Rendering information";
          }

          protected int defaultDisplayOrder() {
            return 208;
          }

          protected String defaultDescription() {
            return "The name of the Melati templet (if not the default) to use for input controls for the field";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getRenderinfo_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setRenderinfo_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getRenderinfo();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setRenderinfo((String)raw);
          }
        });

    defineColumn(col_rangelow_string =
        new Column(this, "rangelow_string",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getRangelow_string();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setRangelow_string((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getRangelow_stringField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Range: low";
          }

          protected int defaultDisplayOrder() {
            return 209;
          }

          protected String defaultDescription() {
            return "The low end of the range of permissible values for the field";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getRangelow_string_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setRangelow_string_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getRangelow_string();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setRangelow_string((String)raw);
          }
        });

    defineColumn(col_rangelimit_string =
        new Column(this, "rangelimit_string",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((ValueInfo)g).getRangelimit_string();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((ValueInfo)g).setRangelimit_string((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((ValueInfo)g).getRangelimit_stringField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.detail;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Range: limit";
          }

          protected int defaultDisplayOrder() {
            return 210;
          }

          protected String defaultDescription() {
            return "The (exclusive) limit of the range of permissible values for the field";
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getRangelimit_string_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setRangelimit_string_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((ValueInfo)g).getRangelimit_string();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((ValueInfo)g).setRangelimit_string((String)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Displayname</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the displayname <code>Column</code>
  */
  public final Column getDisplaynameColumn() {
    return col_displayname;
  }


 /**
  * Retrieves the <code>Description</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the description <code>Column</code>
  */
  public final Column getDescriptionColumn() {
    return col_description;
  }


 /**
  * Retrieves the <code>Usereditable</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the usereditable <code>Column</code>
  */
  public final Column getUsereditableColumn() {
    return col_usereditable;
  }


 /**
  * Retrieves the <code>Typefactory</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the typefactory <code>Column</code>
  */
  public final Column getTypefactoryColumn() {
    return col_typefactory;
  }


 /**
  * Retrieves the <code>Nullable</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the nullable <code>Column</code>
  */
  public final Column getNullableColumn() {
    return col_nullable;
  }


 /**
  * Retrieves the <code>Size</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the size <code>Column</code>
  */
  public final Column getSizeColumn() {
    return col_size;
  }


 /**
  * Retrieves the <code>Width</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the width <code>Column</code>
  */
  public final Column getWidthColumn() {
    return col_width;
  }


 /**
  * Retrieves the <code>Height</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the height <code>Column</code>
  */
  public final Column getHeightColumn() {
    return col_height;
  }


 /**
  * Retrieves the <code>Precision</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the precision <code>Column</code>
  */
  public final Column getPrecisionColumn() {
    return col_precision;
  }


 /**
  * Retrieves the <code>Scale</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the scale <code>Column</code>
  */
  public final Column getScaleColumn() {
    return col_scale;
  }


 /**
  * Retrieves the <code>Renderinfo</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the renderinfo <code>Column</code>
  */
  public final Column getRenderinfoColumn() {
    return col_renderinfo;
  }


 /**
  * Retrieves the <code>Rangelow_string</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the rangelow_string <code>Column</code>
  */
  public final Column getRangelow_stringColumn() {
    return col_rangelow_string;
  }


 /**
  * Retrieves the <code>Rangelimit_string</code> <code>Column</code> for this 
  * <code>ValueInfo</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the rangelimit_string <code>Column</code>
  */
  public final Column getRangelimit_stringColumn() {
    return col_rangelimit_string;
  }


 /**
  * Retrieve the <code>ValueInfo</code> as a <code>ValueInfo</code>.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public ValueInfo getValueInfoObject(Integer troid) {
    return (ValueInfo)getObject(troid);
  }


 /**
  * Retrieve the <code>ValueInfo</code> 
  * as a <code>ValueInfo</code>.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public ValueInfo getValueInfoObject(int troid) {
    return (ValueInfo)getObject(troid);
  }
  protected int defaultDisplayOrder() {
    return 7;
  }
}

