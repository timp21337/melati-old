/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2003 Samuel Goldstein
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
 *     Samuel Goldstein <samuel@1969.ws>
 *     http://www.1969.ws
 *     13101 W. Washington Blvd Suite 248, Los Angeles, CA 90066 USA
 */

package org.melati.poem;

/**
 * An extension of {@link AtomPoemType} which adds <code>precision</code> 
 * and <code>scale</code>.
 */
public abstract class FixedPointAtomPoemType extends AtomPoemType {

  private int precision;
  private int scale;

  public FixedPointAtomPoemType(
    int sqlTypeCode,
    String sqlTypeName,
    boolean nullable,
    int precision,
    int scale) {
    super(sqlTypeCode, sqlTypeName, nullable);
    this.precision = precision;
    this.scale = scale;
  }

  public int getTotalSize() {
    return precision + scale;
  }

  public FixedPointAtomPoemType withPrecisionAndScale(
    int newPrecision,
    int newScale) {
    if (newPrecision == getPrecision() && newScale == getScale())
      return this;

    FixedPointAtomPoemType it = (FixedPointAtomPoemType) clone();
    it.precision = newPrecision;
    it.scale = newScale;
    return it;
  }

  public int getPrecision() {
    return precision;
  }

  public int getScale() {
    return scale;
  }
  /**
   * @param i
   */
  public void setPrecision(int i) {
    precision = i;
  }

  /**
   * @param i
   */
  public void setScale(int i) {
    scale = i;
  }

}
