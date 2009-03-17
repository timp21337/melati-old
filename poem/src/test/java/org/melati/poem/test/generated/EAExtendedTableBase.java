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
import org.melati.poem.DisplayLevel;
import org.melati.poem.DoublePoemType;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.LongPoemType;
import org.melati.poem.PasswordPoemType;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.TimestampPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.EAExtended;
import org.melati.poem.test.EverythingAbstractTable;
import org.melati.poem.test.EverythingDatabaseTables;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>EAExtended</code>.
 *
 * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class EAExtendedTableBase extends EverythingAbstractTable {

  private Column col_id = null;
  private Column col_binaryfield2 = null;
  private Column col_stringfield2 = null;
  private Column col_passwordfield2 = null;
  private Column col_booleanfield2 = null;
  private Column col_datefield2 = null;
  private Column col_doublefield2 = null;
  private Column col_integerfield2 = null;
  private Column col_longfield2 = null;
  private Column col_bigdecimalfield2 = null;
  private Column col_timestampfield2 = null;

 /**
  * Constructor. 
  * 
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public EAExtendedTableBase(
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
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }

  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setId((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getIdField();
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
            return Searchability.yes;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "Id";
          }

          protected int defaultDisplayOrder() {
            return 10;
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
            return ((EAExtended)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setId((Integer)raw);
          }
        });

    defineColumn(col_binaryfield2 =
        new Column(this, "binaryfield2",
                   new BinaryPoemType(true, 13),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getBinaryfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setBinaryfield2((byte[])cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getBinaryfield2Field();
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
            return "Binaryfield2";
          }

          protected int defaultDisplayOrder() {
            return 11;
          }

          protected String defaultDescription() {
            return "Second Binary Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getBinaryfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setBinaryfield2_unsafe((byte[])raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getBinaryfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setBinaryfield2((byte[])raw);
          }
        });

    defineColumn(col_stringfield2 =
        new Column(this, "stringfield2",
                   new StringPoemType(true, 23),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getStringfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setStringfield2((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getStringfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "String Field 2";
          }

          protected int defaultDisplayOrder() {
            return 20;
          }

          protected String defaultDescription() {
            return "Second String Field";
          }

          protected boolean defaultUnique() {
            return true;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 3;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getStringfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setStringfield2_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getStringfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setStringfield2((String)raw);
          }
        });

    defineColumn(col_passwordfield2 =
        new Column(this, "passwordfield2",
                   new PasswordPoemType(true, 23),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getPasswordfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setPasswordfield2((String)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getPasswordfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Password Field 2";
          }

          protected int defaultDisplayOrder() {
            return 13;
          }

          protected String defaultDescription() {
            return "Second Password Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getPasswordfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setPasswordfield2_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getPasswordfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setPasswordfield2((String)raw);
          }
        });

    defineColumn(col_booleanfield2 =
        new Column(this, "booleanfield2",
                   new BooleanPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getBooleanfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setBooleanfield2((Boolean)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getBooleanfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Boolean Field 2";
          }

          protected int defaultDisplayOrder() {
            return 14;
          }

          protected String defaultDescription() {
            return "Second Boolean Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getBooleanfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setBooleanfield2_unsafe((Boolean)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getBooleanfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setBooleanfield2((Boolean)raw);
          }
        });

    defineColumn(col_datefield2 =
        new Column(this, "datefield2",
                   new DatePoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getDatefield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setDatefield2((Date)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getDatefield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Date Field 2";
          }

          protected int defaultDisplayOrder() {
            return 15;
          }

          protected String defaultDescription() {
            return "Second Date Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getDatefield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setDatefield2_unsafe((Date)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getDatefield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setDatefield2((Date)raw);
          }
        });

    defineColumn(col_doublefield2 =
        new Column(this, "doublefield2",
                   new DoublePoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getDoublefield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setDoublefield2((Double)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getDoublefield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Double Field 2";
          }

          protected int defaultDisplayOrder() {
            return 16;
          }

          protected String defaultDescription() {
            return "Second Double Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getDoublefield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setDoublefield2_unsafe((Double)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getDoublefield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setDoublefield2((Double)raw);
          }
        });

    defineColumn(col_integerfield2 =
        new Column(this, "integerfield2",
                   new IntegerPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getIntegerfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setIntegerfield2((Integer)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getIntegerfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Integer Field 2";
          }

          protected int defaultDisplayOrder() {
            return 17;
          }

          protected String defaultDescription() {
            return "Second Integer Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getIntegerfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setIntegerfield2_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getIntegerfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setIntegerfield2((Integer)raw);
          }
        });

    defineColumn(col_longfield2 =
        new Column(this, "longfield2",
                   new LongPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getLongfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setLongfield2((Long)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getLongfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Long Field 2";
          }

          protected int defaultDisplayOrder() {
            return 18;
          }

          protected String defaultDescription() {
            return "Second Long Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getLongfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setLongfield2_unsafe((Long)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getLongfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setLongfield2((Long)raw);
          }
        });

    defineColumn(col_bigdecimalfield2 =
        new Column(this, "bigdecimalfield2",
                   new BigDecimalPoemType(true, 22, 2),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getBigdecimalfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setBigdecimalfield2((BigDecimal)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getBigdecimalfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "BigDecimal Field 2";
          }

          protected int defaultDisplayOrder() {
            return 19;
          }

          protected String defaultDescription() {
            return "Second BigDecimal Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getBigdecimalfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setBigdecimalfield2_unsafe((BigDecimal)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getBigdecimalfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setBigdecimalfield2((BigDecimal)raw);
          }
        });

    defineColumn(col_timestampfield2 =
        new Column(this, "timestampfield2",
                   new TimestampPoemType(true),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((EAExtended)g).getTimestampfield2();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((EAExtended)g).setTimestampfield2((Timestamp)cooked);
          }

          public Field asField(Persistent g) {
            return ((EAExtended)g).getTimestampfield2Field();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Timestamp Field 2";
          }

          protected int defaultDisplayOrder() {
            return 20;
          }

          protected String defaultDescription() {
            return "Second Timestamp Field";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getTimestampfield2_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setTimestampfield2_unsafe((Timestamp)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((EAExtended)g).getTimestampfield2();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((EAExtended)g).setTimestampfield2((Timestamp)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Binaryfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the binaryfield2 <code>Column</code>
  */
  public final Column getBinaryfield2Column() {
    return col_binaryfield2;
  }


 /**
  * Retrieves the <code>Stringfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the stringfield2 <code>Column</code>
  */
  public final Column getStringfield2Column() {
    return col_stringfield2;
  }


 /**
  * Retrieves the <code>Passwordfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the passwordfield2 <code>Column</code>
  */
  public final Column getPasswordfield2Column() {
    return col_passwordfield2;
  }


 /**
  * Retrieves the <code>Booleanfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the booleanfield2 <code>Column</code>
  */
  public final Column getBooleanfield2Column() {
    return col_booleanfield2;
  }


 /**
  * Retrieves the <code>Datefield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the datefield2 <code>Column</code>
  */
  public final Column getDatefield2Column() {
    return col_datefield2;
  }


 /**
  * Retrieves the <code>Doublefield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the doublefield2 <code>Column</code>
  */
  public final Column getDoublefield2Column() {
    return col_doublefield2;
  }


 /**
  * Retrieves the <code>Integerfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the integerfield2 <code>Column</code>
  */
  public final Column getIntegerfield2Column() {
    return col_integerfield2;
  }


 /**
  * Retrieves the <code>Longfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the longfield2 <code>Column</code>
  */
  public final Column getLongfield2Column() {
    return col_longfield2;
  }


 /**
  * Retrieves the <code>Bigdecimalfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the bigdecimalfield2 <code>Column</code>
  */
  public final Column getBigdecimalfield2Column() {
    return col_bigdecimalfield2;
  }


 /**
  * Retrieves the <code>Timestampfield2</code> <code>Column</code> for this 
  * <code>EAExtended</code> <code>Table</code>.
  * 
  * @see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the timestampfield2 <code>Column</code>
  */
  public final Column getTimestampfield2Column() {
    return col_timestampfield2;
  }


 /**
  * Retrieve the <code>EAExtended</code> as a <code>EAExtended</code>.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public EAExtended getEAExtendedObject(Integer troid) {
    return (EAExtended)getObject(troid);
  }


 /**
  * Retrieve the <code>EAExtended</code> 
  * as a <code>EAExtended</code>.
  *
  * @see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public EAExtended getEAExtendedObject(int troid) {
    return (EAExtended)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new EAExtended();
  }
  protected String defaultDisplayName() {
    return "Everything Abstract Extended";
  }

  protected String defaultDescription() {
    return "Every datatype inheritted from an abstract table and normally defined";
  }

  protected Integer defaultCacheLimit() {
    return new Integer(100);
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 80;
  }
}

