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
import java.util.Vector;
import org.melati.util.EnumUtils;

/**
 * A cached instance of a {@link PreparedTailoredQuery}.
 *
 * @author WilliamC@paneris.org
 *
 */
public class CachedTailoredQuery extends PreparedTailoredQuery {

  private Vector results = null;
  private Vector firstRawResults = null;
  private long[] tableSerials;

  public CachedTailoredQuery(String modifier, 
                             Column[] selectedColumns, Table[] otherTables,
                             String whereClause, String orderByClause) {
    super(modifier, selectedColumns, otherTables, whereClause, orderByClause);
    tableSerials = new long[tables.length];
  }

  public CachedTailoredQuery(Column[] selectedColumns, Table[] otherTables,
                             String whereClause, String orderByClause) {
    this(null, selectedColumns, otherTables, whereClause, orderByClause);
  }

  protected boolean upToDate() {
    boolean is = true;

    PoemTransaction transaction = PoemThread.transaction();
    for (int t = 0; t < tables.length; ++t) {
      long currentSerial = tables[t].serial(transaction);
      if (tableSerials[t] != currentSerial) {
        is = false;
        tableSerials[t] = currentSerial;
      }
    }

    return is;
  }

  public Enumeration selection() {
    Vector resultsLocal = this.results;
    if (!upToDate() || resultsLocal == null) {
      this.results = EnumUtils.vectorOf(super.selection());
      resultsLocal = this.results;
    }
    return resultsLocal.elements();
  }

  public Enumeration selection_firstRaw()  {
    Vector firstRawResultsLocal = this.firstRawResults;
    if (!upToDate() || firstRawResultsLocal == null) {
      this.firstRawResults =
        EnumUtils.vectorOf(super.selection_firstRaw());
      firstRawResultsLocal = this.firstRawResults;
    }
    return firstRawResultsLocal.elements();
  }
}
