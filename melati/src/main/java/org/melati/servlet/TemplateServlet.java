/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2000 Tim Joyce
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
 *     Tim Joyce <timj@paneris.org>
 *     http://paneris.org/
 *     68 Sandbanks Rd, Poole, Dorset. BH14 8BY. UK
 */

package org.melati.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletConfig;

import org.melati.Melati;
import org.melati.template.TemplateEngine;
import org.melati.template.TemplateContext;
import org.melati.template.MultipartTemplateContext;
import org.melati.template.TemplateEngineException;

/**
 * Base class to use Melati with a Template Engine.
 * Simply extend this class, override the doTemplateRequest method
 *
 * @author Tim Joyce
 * $Revision$
 */

public abstract class TemplateServlet extends PoemServlet {

  // the template engine
  protected TemplateEngine templateEngine;

  /**
   * Inititialise WebMacro.
   *
   * @param ServletConfig
   */

  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    try {
      templateEngine = melatiConfig.getTemplateEngine();
      if (templateEngine != null)
        templateEngine.init();
    } catch (TemplateEngineException e) {
      // log it to system.err as ServletExceptions go to the
      // servlet runner log (eg jserv.log), and don't have a stack trace!
      e.printStackTrace(System.err);
      throw new ServletException(e.toString());
    }
  }

  /**
   * Set the TemplateEngine and TemplateContext in our Melati.
   * This allows us to parse any uploaded files before we enter
   * our PoemSession (so we don't hang on to transactions
   * unnecessarily).
   */

  protected void prePoemSession(Melati melatiIn) throws Exception {
    // for this request, set the Initialised Template Engine
    melatiIn.setTemplateEngine(templateEngine);
    TemplateContext templateContext =
                        templateEngine.getTemplateContext(melatiIn);

    // If we have an multipart form, we use a different template context
    // which allows us to access the uploaded files as well as fields.
    String contentType = melatiIn.getRequest().getHeader("content-type");
    if (contentType != null &&
        contentType.substring(0,19).equalsIgnoreCase("multipart/form-data")) {
      templateContext =
        new MultipartTemplateContext(melatiIn, templateContext);
    }

    melatiIn.setTemplateContext(templateContext);
  }

  protected void doPoemRequest(Melati melati) throws Exception {
    TemplateContext templateContext = melati.getTemplateContext();
    templateContext.put("melati",melati);

    String templateName = doTemplateRequest(melati,templateContext);

    // only expand a template if we have one (it could be a redirect)
    if (templateName != null) {
      templateName = addExtension(templateName);
      templateEngine.expandTemplate(melati.getWriter(), 
                                    templateName,
                                    templateContext);
    }
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
   * Override the method to build up your output.
   *
   * @param melatiContext
   * @return an object with all you need to do the template expansion
   */

  protected abstract String doTemplateRequest(Melati melati, 
                                              TemplateContext templateContext)
      throws Exception ;
}
