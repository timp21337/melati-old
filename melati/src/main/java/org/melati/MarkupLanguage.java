/*
 * $Source$
 * $Revision$
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

package org.melati;

import java.util.*;
import java.io.*;
import java.text.*;
import org.webmacro.*;
import org.webmacro.engine.*;
import org.webmacro.resource.*;
import org.webmacro.servlet.*;
import org.webmacro.broker.*;
import org.melati.util.*;
import org.melati.poem.*;
import org.melati.templets.*;

public abstract class MarkupLanguage {

  private String name;
  private Context webContext;
  private TempletLoader templetLoader;
  private MelatiLocale locale;
  private Object melati;

  public MarkupLanguage(String name, Context webContext,
                        TempletLoader templetLoader, MelatiLocale locale) {
    this.name = name;
    this.webContext = webContext;
    this.templetLoader = templetLoader;
    this.locale = locale;
    melati = webContext.get("melati"); // FIXME hack
  }

  protected MarkupLanguage(String name, MarkupLanguage other) {
    this(name, other.webContext, other.templetLoader, other.locale);
  }

  public String getName() {
    return name;
  }

  public abstract String rendered(String s);

  public String rendered(String s, int limit) {
    return rendered(s.length() < limit + 3 ? s : s.substring(0, limit) + "...");
  }

  public String rendered(Object o) throws WebMacroException {
    if (o instanceof JSDynamicTree)
      return rendered((JSDynamicTree)o);
    if (o instanceof Persistent)
      return rendered(((Persistent)o).displayString(locale, DateFormat.MEDIUM));
    if (o instanceof Exception)
      return rendered((Exception)o);

    return rendered(o.toString());
  }

  public String rendered(JSDynamicTree tree) throws WebMacroException {
    Object otree = webContext.get("tree");
    webContext.put("tree",tree);
    String results = templetExpansion(templet("org.melati.util.JSDynamicTree"));
    webContext.put("tree", otree);
    return results;
  }
  
  public String rendered(Field field, int style, int limit)
      throws WebMacroException {
    try {
      return rendered(field.getCookedString(locale, style), limit);
    }
    catch (AccessPoemException e) {
      VariableExceptionHandler handler =
          (VariableExceptionHandler)webContext.get(Variable.EXCEPTION_HANDLER);
      if (handler != null)
        return rendered(handler.handle(null, webContext, e));
      else
        throw e;
    }
  }

  public String rendered(Field field, int style) throws WebMacroException {
    return rendered(field, style, 10000000);
  }

  public String renderedShort(Field field) throws WebMacroException {
    return rendered(field, DateFormat.SHORT);
  }

  public String renderedMedium(Field field) throws WebMacroException {
    return rendered(field, DateFormat.MEDIUM);
  }

  public String renderedLong(Field field) throws WebMacroException {
    return rendered(field, DateFormat.LONG);
  }

  public String renderedFull(Field field) throws WebMacroException {
    return rendered(field, DateFormat.FULL);
  }

  public String rendered(Field field) throws WebMacroException {
    return renderedMedium(field);
  }

  public String renderedStart(Field field) throws WebMacroException {
    return rendered(field, DateFormat.MEDIUM, 50);
  }

  /**
   * This is just <TT>rendered</TT> for now, but it is guaranteed
   * always to evaluate to a plain old string suitable for
   * (<I>e.g.</I>) putting in a <TT>&lt;TEXTAREA&gt;</TT>, which
   * <TT>rendered</TT> might not.
   */

  public String renderedString(Field field) throws WebMacroException {
    return rendered(field);
  }

  public Template templet(String templetName) throws WebMacroException {
    return templetLoader.templet(webContext.getBroker(), this, templetName);
  }

  public String templetExpansion(Template template) throws WebMacroException {
    return (String)template.evaluate(webContext);
  }

  //
  // =========
  //  Widgets
  // =========
  //

  public String input(Field field)
      throws UnsupportedTypeException, WebMacroException {
    return input(field, null, "", false);
  }

  public String inputAs(Field field, String templetName)
      throws UnsupportedTypeException, WebMacroException {
    return input(field, templetName, "", false);
  }

  public String searchInput(Field field, String nullValue)
      throws UnsupportedTypeException, WebMacroException {
    return input(field, null, nullValue, true);
  }

  protected String expandedTemplet(Template templet, Hashtable vars)
      throws WebMacroException {
    vars.put("ml", this);
    if (melati != null)
      vars.put("melati", melati);

    webContext.push(vars);

    try {
      return (String)templet.evaluate(webContext);
    }
    finally {
      webContext.pop();
    }
  }

  protected String input(Field field, String templetName,
			 String nullValue, boolean overrideNullable) 
      throws UnsupportedTypeException, WebMacroException {

    try {
      field.getRaw();
    }
    catch (AccessPoemException e) {
      VariableExceptionHandler handler =
          (VariableExceptionHandler)webContext.get(Variable.EXCEPTION_HANDLER);
      if (handler != null)
        return rendered(handler.handle(null, webContext, e));
      else
        throw e;
    }

    Template templet =
        templetName == null ?
          templetLoader.templet(webContext.getBroker(), this, field) :
          templetLoader.templet(webContext.getBroker(), this, templetName);

    Hashtable vars = new Hashtable();

    if (overrideNullable) {
      field = field.withNullable(true);
      vars.put("nullValue", nullValue);
    }

    vars.put("field", field);

    return expandedTemplet(templet, vars);
  }

  public final String rendered(Exception e) throws WebMacroException {
    try {
      Hashtable vars = new Hashtable();
      vars.put("exception", e);
      Template templet =
          templetLoader.templet(webContext.getBroker(), this, e.getClass());
      return expandedTemplet(templet, vars);
    }
    catch (Exception f) {
      try {
        System.err.println("MarkupLanguage failed to render an exception:");
        f.printStackTrace();
        return "[" + rendered(e.toString()) + "]";
      }
      catch (Exception g) {
        return "[UNRENDERABLE EXCEPTION!]";
      }
    }
  }
}
