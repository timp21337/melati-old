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
 */

package org.melati.template.velocity;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import org.melati.Melati;
import org.melati.MelatiConfig;
import org.melati.poem.AccessPoemException;
import org.melati.template.TemplateEngine;
import org.melati.template.TemplateContext;
import org.melati.template.TemplateEngineException;
import org.melati.template.NotFoundException;
import org.melati.util.MelatiWriter;

import org.apache.velocity.runtime.Runtime;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 * Interface for a Template engine for use with Melati
 */
public class VelocityTemplateEngine implements TemplateEngine {

  /**
   * This is the string that is looked for when getInitParameter is
   * called.
   */
  private static final String INIT_PROPS_KEY = "velocity.properties";
  public static final String FORM = "Form";

  /**
   * Inititialise the Engine
   */
  public void init(MelatiConfig melatiConfig) throws TemplateEngineException {
    try {
      Properties props = loadConfiguration(melatiConfig);
      Velocity.init( props );
    } catch (Exception e) {
      throw new TemplateEngineException(e);
    }
  }

  protected Properties loadConfiguration(MelatiConfig melatiConfig) 
                               throws IOException, FileNotFoundException {
        
//    String propsFile = config.getInitParameter(INIT_PROPS_KEY);
    /*
     * This will attempt to find the location of the properties
     * file from the relative path to the WAR archive (ie:
     * docroot). Since JServ returns null for getRealPath()
     * because it was never implemented correctly, then we know we
     * will not have an issue with using it this way. I don't know
     * if this will break other servlet engines, but it probably
     * shouldn't since WAR files are the future anyways.
     */
                                     /*
    if (propsFile != null) {
      String realPath = config.getServletContext().getRealPath(propsFile);
      if ( realPath != null ) propsFile = realPath;
      p.load( new FileInputStream(propsFile) );
    }
    // FIXME work out how to set this some other way
 */
    Properties p = new Properties();
    p.setProperty("file.resource.loader.path", 
                  melatiConfig.getTemplatePath());
    p.setProperty("file.resource.loader.class", 
                  "org.melati.template.velocity.WebMacroFileResourceLoader");
    return p;
  }

  /**
   * get the template context for velocity
   */
  public TemplateContext getTemplateContext(Melati melati) {
    VelocityContext context = new VelocityContext();
    org.melati.template.velocity.HttpServletRequestWrap req = 
      new org.melati.template.velocity.HttpServletRequestWrap(
            melati.getRequest());
    context.put(VelocityTemplateContext.REQUEST, req);
    context.put(FORM, req);
    context.put(VelocityTemplateContext.RESPONSE, 
                             melati.getResponse());
    return new VelocityTemplateContext(context);
  }
  
  public Object getPassbackVariableExceptionHandler() {
    return new PassbackMethodExceptionEventHandler();
  }

  /**
   * the name of the template engine (used to find the templets)
   */
  public String getName() {
    return "webmacro";
  }

  /**
  * the extension of the templates used by this template engine)
  */
  public String templateExtension() {
    return ".vm";
  }

  /**
   * the underlying engine - for velocity there is none!
   */
  public Object getEngine() {
    return null;
  }

  public MelatiWriter getServletWriter(HttpServletResponse response, 
                                       boolean buffered) 
      throws IOException {
    if (buffered) {
      return new MelatiBufferedVelocityWriter(response);
    } else {
      return new MelatiVelocityWriter(response);
    }
  }

  public MelatiWriter getStringWriter(String encoding) 
          throws IOException {
    return new MelatiBufferedVelocityWriter(encoding);
  }

  /**
   * Get a template given it's name.
   */
  public org.melati.template.Template template(String templateName)
                             throws NotFoundException {
      try {                                  
        return new VelocityTemplate(Runtime.getTemplate(templateName));
      } catch (ResourceNotFoundException e) {
        if (templateName.endsWith(templateExtension())) {
          // have a go at loading the webmacro template, and converting it!
          templateName = templateName.substring(0,templateName.lastIndexOf
                                                (templateExtension())) + ".wm";
          try {                                  
            return new VelocityTemplate(Runtime.getTemplate(templateName));
          } catch (Exception f) {
            throw new NotFoundException(f);
          }
        } else {
          throw new NotFoundException(e);
        }
      } catch (Exception e) {
        throw new NotFoundException(e);
      }
  }

  /**
   * Expand the Template against the context.
   */
  public void expandTemplate(MelatiWriter out, 
                             String templateName, 
                             TemplateContext templateContext)
              throws TemplateEngineException {
    try {
      expandTemplate (out, template (templateName), templateContext);
    } catch (NotFoundException e) {
      throw new TemplateEngineException(e);
    }
  }

  /**
   * Expand the Template against the context.
   */
  public void expandTemplate(MelatiWriter out,
                             org.melati.template.Template template, 
                             TemplateContext templateContext)
              throws TemplateEngineException {
    try {
      template.write (out, templateContext, this);
    } catch (TemplateEngineException problem) {
      Exception underlying = problem.subException;
      if (underlying instanceof AccessPoemException) {
        throw (AccessPoemException)underlying;
      }
      if (underlying instanceof MethodInvocationException) {
        Throwable caught = ((MethodInvocationException)underlying).
                                getWrappedThrowable();
        if (caught instanceof AccessPoemException) {
          throw (AccessPoemException)caught;
        }
      }
      throw problem;
    }
  }
}
