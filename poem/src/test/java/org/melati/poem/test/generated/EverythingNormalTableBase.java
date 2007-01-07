// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import org.melati.poem.AccessPoemException;
import org.melati.poem.BigDecimalPoemType;
import org.melati.poem.BinaryPoemType;
import org.melati.poem.BooleanPoemType;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DatePoemType;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DeletedPoemType;
import org.melati.poem.DisplayLevel;
import org.melati.poem.DoublePoemType;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.LongPoemType;
import org.melati.poem.PasswordPoemType;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.Table;
import org.melati.poem.TimestampPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EverythingNormal;
import org.melati.poem.test.TestDatabaseTables;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>EverythingNormal</code>.
 *
 * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class EverythingNormalTableBase extends Table {

  private Column col_id = null;
  private Column col_binaryfield = null;
  private Column col_stringfield = null;
  private Column col_passwordfield = null;
  private Column col_booleanfield = null;
  private Column col_datefield = null;
  private Column col_doublefield = null;
  private Column col_integerfield = null;
  private Column col_longfield = null;
  private Column col_bigdecimalfield = null;
  private Column col_timestampfield = null;
  private Column col_deletedfield = null;

 /**
  * Constructor. 
  * 
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public EverythingNormalTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Constructor.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @throws PoemException    if anything goes wrong
  */
  public EverythingNormalTableBase(
      Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }


 /**
  * Get the database tables.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public TestDatabaseTables getTestDatabaseTables() {
    return (TestDatabaseTables)getDatabase();
  }

  protected void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Id";
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          protected boolean defaultIndexed() {
            return true;
          }

          protected boolean defaultUnique() {
            return true;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setId((Integer)raw);
          }
        });

    defineColumn(col_binaryfield =
        new Column(this, "binaryfield",
                   new BinaryPoemType(true, 13),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getBinaryfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setBinaryfield((byte[])cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getBinaryfieldField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected String defaultDisplayName() {
            return "Binaryfield";
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getBinaryfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setBinaryfield_unsafe((byte[])raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getBinaryfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setBinaryfield((byte[])raw);
          }
        });

    defineColumn(col_stringfield =
        new Column(this, "stringfield",
                   new StringPoemType(true, 23),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getStringfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setStringfield((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getStringfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "String Field";
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 3;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getStringfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setStringfield_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getStringfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setStringfield((String)raw);
          }
        });

    defineColumn(col_passwordfield =
        new Column(this, "passwordfield",
                   new PasswordPoemType(true, 23),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getPasswordfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setPasswordfield((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getPasswordfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Password Field";
          }

          protected int defaultDisplayOrder() {
            return 3;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 3;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getPasswordfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setPasswordfield_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getPasswordfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setPasswordfield((String)raw);
          }
        });

    defineColumn(col_booleanfield =
        new Column(this, "booleanfield",
                   new BooleanPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getBooleanfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setBooleanfield((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getBooleanfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Boolean Field";
          }

          protected int defaultDisplayOrder() {
            return 4;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getBooleanfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setBooleanfield_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getBooleanfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setBooleanfield((Boolean)raw);
          }
        });

    defineColumn(col_datefield =
        new Column(this, "datefield",
                   new DatePoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getDatefield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setDatefield((Date)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getDatefieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Date Field";
          }

          protected int defaultDisplayOrder() {
            return 5;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getDatefield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setDatefield_unsafe((Date)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getDatefield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setDatefield((Date)raw);
          }
        });

    defineColumn(col_doublefield =
        new Column(this, "doublefield",
                   new DoublePoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getDoublefield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setDoublefield((Double)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getDoublefieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Double Field";
          }

          protected int defaultDisplayOrder() {
            return 6;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getDoublefield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setDoublefield_unsafe((Double)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getDoublefield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setDoublefield((Double)raw);
          }
        });

    defineColumn(col_integerfield =
        new Column(this, "integerfield",
                   new IntegerPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getIntegerfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setIntegerfield((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getIntegerfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Integer Field";
          }

          protected int defaultDisplayOrder() {
            return 7;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getIntegerfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setIntegerfield_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getIntegerfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setIntegerfield((Integer)raw);
          }
        });

    defineColumn(col_longfield =
        new Column(this, "longfield",
                   new LongPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getLongfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setLongfield((Long)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getLongfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Long Field";
          }

          protected int defaultDisplayOrder() {
            return 8;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getLongfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setLongfield_unsafe((Long)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getLongfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setLongfield((Long)raw);
          }
        });

    defineColumn(col_bigdecimalfield =
        new Column(this, "bigdecimalfield",
                   new BigDecimalPoemType(true, 22, 2),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getBigdecimalfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setBigdecimalfield((BigDecimal)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getBigdecimalfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "BigDecimal Field";
          }

          protected int defaultDisplayOrder() {
            return 9;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getBigdecimalfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setBigdecimalfield_unsafe((BigDecimal)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getBigdecimalfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setBigdecimalfield((BigDecimal)raw);
          }
        });

    defineColumn(col_timestampfield =
        new Column(this, "timestampfield",
                   new TimestampPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getTimestampfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setTimestampfield((Timestamp)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getTimestampfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Timestamp Field";
          }

          protected int defaultDisplayOrder() {
            return 10;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getTimestampfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setTimestampfield_unsafe((Timestamp)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getTimestampfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setTimestampfield((Timestamp)raw);
          }
        });

    defineColumn(col_deletedfield =
        new Column(this, "deletedfield",
                   new DeletedPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EverythingNormal)g).getDeletedfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EverythingNormal)g).setDeletedfield((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((EverythingNormal)g).getDeletedfieldField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Deleted Field";
          }

          protected int defaultDisplayOrder() {
            return 11;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getDeletedfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setDeletedfield_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EverythingNormal)g).getDeletedfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EverythingNormal)g).setDeletedfield((Boolean)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Binaryfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the binaryfield <code>Column</code>
  */
  public final Column getBinaryfieldColumn() {
    return col_binaryfield;
  }


 /**
  * Retrieves the <code>Stringfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the stringfield <code>Column</code>
  */
  public final Column getStringfieldColumn() {
    return col_stringfield;
  }


 /**
  * Retrieves the <code>Passwordfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the passwordfield <code>Column</code>
  */
  public final Column getPasswordfieldColumn() {
    return col_passwordfield;
  }


 /**
  * Retrieves the <code>Booleanfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the booleanfield <code>Column</code>
  */
  public final Column getBooleanfieldColumn() {
    return col_booleanfield;
  }


 /**
  * Retrieves the <code>Datefield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the datefield <code>Column</code>
  */
  public final Column getDatefieldColumn() {
    return col_datefield;
  }


 /**
  * Retrieves the <code>Doublefield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the doublefield <code>Column</code>
  */
  public final Column getDoublefieldColumn() {
    return col_doublefield;
  }


 /**
  * Retrieves the <code>Integerfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the integerfield <code>Column</code>
  */
  public final Column getIntegerfieldColumn() {
    return col_integerfield;
  }


 /**
  * Retrieves the <code>Longfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the longfield <code>Column</code>
  */
  public final Column getLongfieldColumn() {
    return col_longfield;
  }


 /**
  * Retrieves the <code>Bigdecimalfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the bigdecimalfield <code>Column</code>
  */
  public final Column getBigdecimalfieldColumn() {
    return col_bigdecimalfield;
  }


 /**
  * Retrieves the <code>Timestampfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the timestampfield <code>Column</code>
  */
  public final Column getTimestampfieldColumn() {
    return col_timestampfield;
  }


 /**
  * Retrieves the <code>Deletedfield</code> <code>Column</code> for this 
  * <code>EverythingNormal</code> <code>Table</code>.
  * 
  * @generator org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the deletedfield <code>Column</code>
  */
  public final Column getDeletedfieldColumn() {
    return col_deletedfield;
  }


 /**
  * Retrieve the <code>EverythingNormal</code> as a <code>EverythingNormal</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public EverythingNormal getEverythingNormalObject(Integer troid) {
    return (EverythingNormal)getObject(troid);
  }


 /**
  * Retrieve the <code>EverythingNormal</code> 
  * as a <code>EverythingNormal</code>.
  *
  * @generator org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public EverythingNormal getEverythingNormalObject(int troid) {
    return (EverythingNormal)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new EverythingNormal();
  }
  protected String defaultDisplayName() {
    return "EverythingNormal";
  }

  protected String defaultDescription() {
    return "Every datatype in one table";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 60;
  }
}

