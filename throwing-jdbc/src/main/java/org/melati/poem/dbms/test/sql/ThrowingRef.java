/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2008 Tim Pizey
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
 *     Tim Pizey <timp At paneris.org>
 *     http://paneris.org/~timp
 */

package org.melati.poem.dbms.test.sql;

import java.sql.Ref;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author timp
 * @since 5 Feb 2008
 *
 */
public class ThrowingRef extends Thrower implements Ref {

  final static String className = ThrowingRef.class.getName() + ".";
  
  public static void startThrowing(String methodName) {
    Thrower.startThrowing(className  +  methodName);
  }
  public static void startThrowingAfter(String methodName, int goes) {
    Thrower.startThrowingAfter(className  +  methodName, goes);
  }
  public static void stopThrowing(String methodName) {
    Thrower.stopThrowing(className  +  methodName);
  }
  public static boolean shouldThrow(String methodName) { 
    return Thrower.shouldThrow(className  +  methodName);
  }

  Ref it = null;
  

  /**
   * Constructor.
   */
  public ThrowingRef(Ref r) {
    it = r;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#getBaseTypeName()
   */
  @Override
  public String getBaseTypeName() throws SQLException {
    if (shouldThrow("getBaseTypeName"))
      throw new SQLException("Ref bombed");
    return it.getBaseTypeName();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#getObject()
   */
  @Override
  public Object getObject() throws SQLException {
    if (shouldThrow("getObject"))
      throw new SQLException("Ref bombed");
    return it.getObject();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#getObject(java.util.Map)
   */
  @Override
  public Object getObject(Map<String, Class<?>> map) throws SQLException {
    if (shouldThrow("getObject"))
      throw new SQLException("Ref bombed");
    return it.getObject();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#setObject(java.lang.Object)
   */
  @Override
  public void setObject(Object value) throws SQLException {
    if (shouldThrow("setObject"))
      throw new SQLException("Ref bombed");
    it.setObject(value);
  }

}
