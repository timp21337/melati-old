/*
 * $Source$
 * $Revision$
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * -------------------------------------
 *  Copyright (C) 2000 William Chesters
 * -------------------------------------
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * A copy of the GPL should be in the file org/melati/COPYING in this tree.
 * Or see http://melati.org/License.html.
 *
 * Contact details for copyright holder:
 *
 *     William Chesters <williamc@paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 *
 *
 * ------
 *  Note
 * ------
 *
 * I will assign copyright to PanEris (http://paneris.org) as soon as
 * we have sorted out what sort of legal existence we need to have for
 * that to make sense.  When WebMacro's "Simple Public License" is
 * finalised, we'll offer it as an alternative license for Melati.
 * In the meantime, if you want to use Melati on non-GPL terms,
 * contact me!
 */

package org.melati.poem;

import java.util.*;
import java.sql.*;
import org.melati.util.*;
import org.melati.poem.dbms.*;

public abstract class AtomPoemType extends BasePoemType {

  private String sqlTypeName;

  public AtomPoemType(int sqlTypeCode, String sqlTypeName, boolean nullable) {
    super(sqlTypeCode, nullable);
    this.sqlTypeName = sqlTypeName;
  }

  protected String _stringOfRaw(Object raw) {
    return raw.toString();
  }

  protected void _assertValidCooked(Object cooked)
      throws ValidationPoemException {
    _assertValidRaw(cooked);
  }

  protected Object _cookedOfRaw(Object raw) throws PoemException {
    return raw;
  }

  protected Object _rawOfCooked(Object cooked) {
    return cooked;
  }

  protected String _stringOfCooked(Object cooked,
				   MelatiLocale locale, int style) {
    return _stringOfRaw(_rawOfCooked(cooked));
  }

  protected String _sqlDefinition(Dbms dbms) {
      try {
        return dbms.getSqlDefinition(sqlTypeName);
      } catch (SQLException e) {
        throw new SQLSeriousPoemException(e);
      }
  }

  protected String _toString() {
    return sqlTypeName;
  }
}
