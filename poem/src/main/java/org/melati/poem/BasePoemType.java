package org.melati.poem;

import java.util.*;
import java.sql.*;
import org.melati.util.*;

public abstract class BasePoemType implements PoemType, Cloneable {
  private int sqlTypeCode;
  private boolean nullable;
  private int width;
  private int height;

  private Comparable low = null, limit = null;

  BasePoemType(int sqlTypeCode, boolean nullable, int width, int height) {
    this.sqlTypeCode = sqlTypeCode;
    this.nullable = nullable;
    this.width = width;
    this.height = height;
  }

  BasePoemType(int sqlTypeCode, boolean nullable, int width) {
    this(sqlTypeCode, nullable, width, 1);
  }

  BasePoemType(int sqlTypeCode, boolean nullable) {
    this(sqlTypeCode, nullable, 8);
  }

  protected void setRawRange(Comparable low, Comparable limit) {
    this.low = low;
    this.limit = limit;
  }

  protected Comparable getLowRaw() {
    return low;
  }

  protected Comparable getLimitRaw() {
    return limit;
  }

  protected abstract void _assertValidRaw(Object raw)
      throws ValidationPoemException;

  private void assertRawInRange(Object raw) {
    // Range check.  Since we can't do this with multiple inheritance, we
    // provide it as a facility even in types for which it is meaningless.

    Comparable asComparable;
    try {
      asComparable = (Comparable)raw;
    }
    catch (ClassCastException e) {
      throw new NotComparablePoemException(raw, this);
    }

    if ((low != null && low.compareTo(asComparable) > 0) ||
        (limit != null && limit.compareTo(asComparable) <= 0))
      throw new ValidationPoemException(
          this, raw, new OutsideRangePoemException(low, limit, raw));
  }

  public final void assertValidRaw(Object raw)
      throws ValidationPoemException {
    if (raw == null) {
      if (!nullable)
        throw new NullTypeMismatchPoemException(this);
    }
    else {
      if (low != null || limit != null)
        assertRawInRange(raw);
      _assertValidRaw(raw);
    }
  }

  public final void doubleCheckValidRaw(Object raw) {
    try {
      assertValidRaw(raw);
    }
    catch (ValidationPoemException e) {
      throw new UnexpectedValidationPoemException(e);
    }
  }

  protected abstract Object _getRaw(ResultSet rs, int col)
      throws SQLException;

  public final Object getRaw(ResultSet rs, int col)
      throws ValidationPoemException {
    Object o;
    try {
      o = _getRaw(rs, col);
    }
    catch (SQLException e) {
      throw new SQLSeriousPoemException(e);
    }

    assertValidRaw(o);
    return o;
  }

  protected abstract void _setRaw(PreparedStatement ps, int col,
                                    Object raw)
      throws SQLException;

  public final void setRaw(PreparedStatement ps, int col, Object raw) {
    doubleCheckValidRaw(raw);
    try {
      if (raw == null)
        ps.setNull(col, sqlTypeCode());
      else
        _setRaw(ps, col, raw);
    }
    catch (SQLException e) {
      throw new SQLSeriousPoemException(e);
    }
  }

  protected Enumeration _possibleRaws() {
    return null;
  }
  
  public Enumeration possibleRaws() {
    Enumeration them = _possibleRaws();
    return them == null ? null :
                   getNullable() ? new ConsEnumeration(null, them) :
                   them;
  }

  protected abstract String _stringOfRaw(Object raw);

  public final String stringOfRaw(Object raw)
      throws ValidationPoemException {
    assertValidRaw(raw);
    return _stringOfRaw(raw);
  }

  protected abstract Object _rawOfString(String string)
      throws ParsingPoemException;

  public final Object rawOfString(String string)
      throws ParsingPoemException, ValidationPoemException {
    Object raw = _rawOfString(string);
    assertValidRaw(raw);
    return raw;
  }

  protected abstract void _assertValidCooked(Object cooked)
      throws ValidationPoemException;

  public final void assertValidCooked(Object cooked)
      throws ValidationPoemException {
    if (cooked == null) {
      if (!nullable)
        throw new NullTypeMismatchPoemException(this);
    }
    else {
      _assertValidCooked(cooked);
      if (low != null || limit != null)
        assertRawInRange(_rawOfCooked(cooked));
    }
  }

  public final void doubleCheckValidCooked(Object cooked) {
    try {
      assertValidCooked(cooked);
    }
    catch (ValidationPoemException e) {
      throw new UnexpectedValidationPoemException(e);
    }
  }

  protected abstract Object _cookedOfRaw(Object raw) throws PoemException;

  public final Object cookedOfRaw(Object raw) throws PoemException {
    doubleCheckValidRaw(raw);
    return raw == null ? null : _cookedOfRaw(raw);
  }

  protected abstract Object _rawOfCooked(Object raw) throws PoemException;

  public final Object rawOfCooked(Object cooked) {
    doubleCheckValidCooked(cooked);
    return cooked == null ? null : _rawOfCooked(cooked);
  }

  protected abstract String _stringOfCooked(Object cooked,
                                           MelatiLocale locale, int style)
      throws PoemException;

  public final String stringOfCooked(Object cooked,
                                    MelatiLocale locale, int style)
      throws PoemException {
    doubleCheckValidCooked(cooked);
    return cooked == null ? "" : _stringOfCooked(cooked, locale, style);
  }

  public final boolean getNullable() {
    return nullable;
  }

  public final int sqlTypeCode() {
    return sqlTypeCode;
  }

  public final int getWidth() {
    return width;
  }

  public final int getHeight() {
    return height;
  }

  protected abstract String _sqlDefinition();

  public final String sqlDefinition() {
    return _sqlDefinition() + (nullable ? "" : " NOT NULL");
  }

  protected abstract boolean _canBe(PoemType other);

  public final boolean canBe(PoemType other) {
    // FIXME takes no account of range---need to decide on semantics for this,
    // is it subset (inclusion) or some other notion of storability?
    return
        other.sqlTypeCode() == sqlTypeCode &&
        other.getNullable() == nullable &&
        _canBe(other);
  }

  public final PoemType withNullable(boolean nullable) {
    if (this.nullable == nullable)
      return this;
    else {
      BasePoemType it = (BasePoemType)clone();
      it.nullable = nullable;
      return it;
    }
  }

  protected abstract void _saveColumnInfo(ColumnInfo info)
      throws AccessPoemException;

  public void saveColumnInfo(ColumnInfo info) throws AccessPoemException {
    info.setNullable(nullable);
    info.setSize(0);
    info.setWidth(width);
    info.setHeight(height);
    _saveColumnInfo(info);
  }

  protected String _quotedRaw(Object raw) {
    return raw.toString();
  }

  public String quotedRaw(Object raw) throws ValidationPoemException {
    assertValidRaw(raw);
    return raw == null ? "NULL" : _quotedRaw(raw);
  }

  public String toString() {
    return sqlDefinition();
  }

  public static PoemType ofColumnInfo(Database database, ColumnInfo info) {
    return
        PoemTypeFactory.forCode(database,
                                info.type.intValue()).typeOf(database, info);
  }

  // 
  // --------
  //  Object
  // --------
  // 

  protected Object clone() {
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException e) {
      throw new PoemBugPoemException();
    }
  }
}
