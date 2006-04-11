/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2003 Tim Joyce
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
 * Tim Joyce <timj@paneris.org>
 *
 */

package org.melati.util.test;

import org.melati.util.StringUtils;

import junit.framework.TestCase;

/**
 * A test for the org.melati.util.StringUtil class.
 *
 * @author TimJ@paneris.org
 */
public class StringUtilsTest extends TestCase {

  /**
   * Constructor for StringUtil.
   * @param arg0
   */
  public StringUtilsTest(String arg0) {
    super(arg0);
  }

  public void testIsQuotedNull() {
    assertTrue(!StringUtils.isQuoted(null));
  }

  public void testIsQuotedBlank() {
    assertTrue(!StringUtils.isQuoted(""));
  }

  public void testIsQuotedNot() {
    assertTrue(!StringUtils.isQuoted("a"));
  }

  public void testIsQuotedDouble() {
    assertTrue(StringUtils.isQuoted("\"a\""));
  }

  public void testIsQuotedSingle() {
    assertTrue(StringUtils.isQuoted("\'a\'"));
  }

  public void testUnNulled() {
    String expected = "a";
    String actual = StringUtils.unNulled("a");
    assertEquals(expected, actual);
  }

  public void testUnNulledNull() {
    String expected = "";
    String actual = StringUtils.unNulled(null);
    assertEquals(expected, actual);
  }

  public void testCapitalised() {
    assertEquals("Capitalised", StringUtils.capitalised("capitalised"));
  }

}
