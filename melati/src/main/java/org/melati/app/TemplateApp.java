/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2005 Tim Pizey
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
 *     Tim Pizey <timp@paneris.org>
 *     http://paneris.org/~timp
 */

package org.melati.app;

import org.melati.Melati;
import org.melati.util.MelatiException;
import org.melati.template.TemplateEngine;
import org.melati.template.TemplateContext;

/**
 * Base class to use Melati with a Template Engine as an application.
 * To create your own application simply extend this class, 
 * overriding the {@link #doTemplateRequest} method.
 *
 * @author Tim Pizey
 * $Revision$
 */
public abstract class TemplateApp extends PoemApp {

  // the template engine
  protected TemplateEngine templateEngine;

  /**
   * Inititialise the template engine.
   *
   * @throws MelatiException if the TemplateEngine has a problem
   */
  public void init() throws MelatiException {
    super.init();
      templateEngine = melatiConfig.getTemplateEngine();
      if (templateEngine != null)
        templateEngine.init(melatiConfig);
  }

  /**
   * Set the TemplateEngine and TemplateContext in our Melati.
   *
   * @param melati the current Melati
   * @throws Exception if anything goes wrong
   */
  protected void prePoemSession(Melati melati) throws Exception {
    melati.setTemplateEngine(templateEngine);
    melati.setTemplateContext(templateEngine.getTemplateContext(melati));
  }

  protected void doPoemRequest(Melati melati) throws Exception {
    TemplateContext templateContext = melati.getTemplateContext();
    templateContext.put("melati", melati);

    String templateName = doTemplateRequest(melati,templateContext);

    templateName = addExtension(templateName);
    templateEngine.expandTemplate(melati.getWriter(), 
                                  templateName,
                                  templateContext);
  }
  
  /**
   * The template extension is added in an overridable method
   * to allow the application developer to specify their own template
   * extensions.
   */
  protected String addExtension(String templateName) {
    return templateName + templateEngine.templateExtension();
  }
 
  /**
   * Override this method to build up your own output.
   *
   * @param melati the current {@link Melati}
   * @param templateContext the current {@link TemplateContext}
   * @return a Template name, possibly excluding extension.
   */
  protected abstract String doTemplateRequest(Melati melati, 
                                              TemplateContext templateContext)
      throws Exception;
}
