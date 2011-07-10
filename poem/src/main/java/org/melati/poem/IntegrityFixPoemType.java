/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2000 William Chesters
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * Melati is free software; Permission is granted to copy, distribute
 * and/or modify this software under the terms either:
 *
 * a) the GNU General Public License as published by the Free Software
 *    Foundation; either version 2 of the License, or (at your option)
 *    any later version,
 *
 *    or
 *
 * b) any version of the Melati Software License, as published
 *    at http://melati.org
 *
 * You should have received a copy of the GNU General Public License and
 * the Melati Software License along with this program;
 * if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA to obtain the
 * GNU General Public License and visit http://melati.org to obtain the
 * Melati Software License.
 *
 * Feel free to contact the Developers of Melati (http://melati.org),
 * if you would like to work out a different arrangement than the options
 * outlined here.  It is our intention to allow Melati to be used by as
 * wide an audience as possible.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Contact details for copyright holder:
 *
 *     William Chesters <williamc At paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 */

package org.melati.poem;

import java.util.Enumeration;
import org.melati.poem.util.IntegerEnumeration;

/**
 * A type for {@link IntegrityFix}s.
 */
public class IntegrityFixPoemType extends IndexPoemType {

  /**
   * Constructor.
   * @param nullable whether may be null
   */
  public IntegrityFixPoemType(boolean nullable) {
    super(nullable);
  }

  protected Enumeration<Integer> _possibleRaws() {
    return new IntegerEnumeration(0, StandardIntegrityFix.count());
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.AtomPoemType#_assertValidCooked(java.lang.Object)
   */
  protected void _assertValidCooked(Object cooked)
      throws ValidationPoemException {
    // This may need to be broadened to IntegrityFixPoemType 
    if (!(cooked instanceof StandardIntegrityFix))
      throw new TypeMismatchPoemException(cooked, this);
  }

  protected Object _cookedOfRaw(Object raw) throws NoSuchRowPoemException {
    return StandardIntegrityFix.forIndex(((Integer)raw).intValue());
  }

  protected Integer _rawOfCooked(Object cooked) {
    return ((StandardIntegrityFix)cooked).getIndex();
  }

  protected String _stringOfCooked(Object cooked,
                                   PoemLocale locale, int style)
      throws PoemException {
    return ((StandardIntegrityFix)cooked).getName();
  }

  protected boolean _canRepresent(SQLPoemType<?> other) {
    return other instanceof IntegrityFixPoemType;
  }

  protected void _saveColumnInfo(ColumnInfo columnInfo)
      throws AccessPoemException {
    columnInfo.setTypefactory(PoemTypeFactory.INTEGRITYFIX);
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.BasePoemType#toString()
   */
  public String toString() {
    return "integrity fix (" + super.toString() + ")";
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.PoemType#toDsdType()
   */
  public String toDsdType() {
    return "IntegrityFix";
  }

}
