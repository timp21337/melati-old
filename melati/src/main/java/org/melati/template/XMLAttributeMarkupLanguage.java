/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2006 Tim Pizey
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
 *     tim Pizey <timp At paneris.org>
 *     http://paneris.org/~timp
 */

package org.melati.template;

import java.io.IOException;
import org.melati.poem.AccessPoemException;

/**
 * A XML based markup language suitable for markup within an attribute tag.
 * XML has same entities as HTML.
 * 
 */
public class XMLAttributeMarkupLanguage extends XMLMarkupLanguage
    implements MarkupLanguage, AttributeMarkupLanguage {


  /**
   * Constructor.
   * @param xml MarkupLanguage we are the AttributeMarkupupLanguage for
   */
  public XMLAttributeMarkupLanguage(XMLMarkupLanguage xml) {
    super("xml_attr", xml);
  }

  /**
   * AccessPoemException is handled differently in an Attribute 
   * than it is in the main body of a page.
   * {@inheritDoc}
   * @see org.melati.template.AttributeMarkupLanguage#rendered(org.melati.poem.AccessPoemException)
   */
  public String rendered(AccessPoemException e) throws IOException {
    try {
      melati.getWriter().write("[Access denied to ");
      render(e.token);
      melati.getWriter().write("]");
    }
    catch (Exception g) {
      melati.getWriter().write("[UNRENDERABLE EXCEPTION!]");
    }

    return "";
  }
}
