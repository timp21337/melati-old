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
 *     William Chesters <williamc@paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 */

package org.melati.poem;

import java.util.Enumeration;
import org.melati.util.IntegerEnumeration;
import org.melati.util.MelatiLocale;

public class SearchabilityPoemType extends IntegerPoemType {

  public SearchabilityPoemType() {
    super(false);
  }

  public Enumeration possibleRaws() {
    return new IntegerEnumeration(0, Searchability.count());
  }

  protected void _assertValidCooked(Object cooked)
      throws ValidationPoemException {
    if (!(cooked instanceof Searchability))
      throw new TypeMismatchPoemException(cooked, this);
  }

  protected Object _cookedOfRaw(Object raw) throws NoSuchRowPoemException {
    return Searchability.forIndex(((Integer)raw).intValue());
  }

  protected Object _rawOfCooked(Object cooked) {
    return ((Searchability)cooked).index;
  }

  protected String _stringOfCooked(Object cooked,
                                   MelatiLocale locale, int style)
      throws PoemException {
    return ((Searchability)cooked).name;
  }

  protected boolean _canRepresent(PoemType other) {
    return other instanceof SearchabilityPoemType;
  }

  protected void _saveColumnInfo(ColumnInfo columnInfo)
      throws AccessPoemException {
    columnInfo.setTypefactory(PoemTypeFactory.SEARCHABILITY);
  }

  public String toString() {
    return "searchability (" + super.toString() + ")";
  }

   /**
   * The field type used in the Data Structure Definition language.
   */
  public String toDsdType() {
    return "Searchability";
  }
}
