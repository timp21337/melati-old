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

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.melati.Melati;
import org.melati.login.AccessHandler;
import org.melati.poem.AccessPoemException;
import org.melati.poem.PoemThread;
import org.melati.poem.PoemTask;
import org.melati.poem.AccessToken;
import org.melati.util.DatabaseInitException;
import org.melati.util.StringUtils;

/**
 * Base class to use Poem with Servlets.
 * Simply extend this class, override the doPoemRequest method if
 * you are going to use a template engine, please take a look at TemplateServlet
 */

/**
 * <A NAME=pathinfoscan>By default, the path info of the URL by which the
 * servlet was called up is examined to determine the `logical name' of the
 * Melati POEM database to which the servlet should connect, and possibly a
 * table within that database, an object within that table, and a `method' to
 * apply to that object.</A>  The URL is expected to take one of the following
 * forms:
 *
 * <BLOCKQUOTE><TT>
 *     http://<I>h</I>/<I>s</I>/<I>db</I>/
 * <BR>http://<I>h</I>/<I>s</I>/<I>db</I>/<I>meth</I>
 * <BR>http://<I>h</I>/<I>s</I>/<I>db</I>/<I>tbl</I>/<I>meth</I>
 * <BR>http://<I>h</I>/<I>s</I>/<I>db</I>/<I>tbl</I>/<I>troid</I>/<I>meth</I>
 * </TT></BLOCKQUOTE>
 *
 * and the following components are broken out of the path info and passed to
 * your application code in the <TT>melati</TT> parameter (which is also
 * copied automatically into <TT>context</TT> so that it is easily available
 * in templates):
 *
 * <TABLE>
 *   <TR>
 *     <TD><TT><I>h</I></TT></TD>
 *     <TD>host name, such as <TT>www.melati.org</TT></TD>
 *   </TR>
 *   <TR>
 *     <TD><TT><I>s</I></TT></TD>
 *     <TD>
 *       servlet-determining part, such as
 *       <TT>melati/org.melati.admin.Admin</TT>
 *     </TD>
 *   </TR>
 *   <TR>
 *     <TD><TT><I>db</I></TT></TD>
 *     <TD>
 *       The first element of the path info is taken to be the `logical name'
 *       of the Melati POEM database to which the servlet should connect.  It
 *       is mapped onto JDBC connection details via the config file
 *       <TT>org.melati.LogicalDatabase.properties</TT>, of which there is an
 *       example in the source tree.  This is automatically made available in
 *       templates as <TT>$melati.Database</TT>.
 *     </TD>
 *   <TR>
 *     <TD><TT><I>tbl</I></TT></TD>
 *     <TD>
 *       The DBMS name of a table with which the servlet is concerned:
 *       perhaps it is meant to list its contents.  This is automatically
 *       made available in templates as <TT>$melati.Table</TT>.
 *     </TD>
 *   </TR>
 *   <TR>
 *     <TD><TT><I>troid</I></TT></TD>
 *     <TD>
 *       The POEM `troid' (table row identifier, or row-unique integer) of a
 *       row within <TT><I>tbl</I></TT> with which the servlet is concerned:
 *       perhaps it is meant to display it.  This is automatically made
 *       available in templates as <TT>$melati.Object</TT>.
 *     </TD>
 *   </TR>
 *   <TR>
 *     <TD><TT><I>meth</I></TT></TD>
 *     <TD>
 *       A freeform string telling your servlet what it is meant to do.  This
 *       is automatically made available in templates as
 *       <TT>$melati.Method</TT>.
 *     </TD>
 *   </TR>
 * </TABLE>
 *
 * You can change the way these things are determined by overriding
 * <TT>melatiContext</TT>.
 *
 * <LI>
 *
 * Any POEM database operations you perform will be done with the access
 * rights of the POEM <TT>User</TT> associated with the servlet session.  If
 * there is no established servlet session, the current user will be set to
 * the default `guest' user.  If this method terminates with an
 * <TT>AccessPoemException</TT>, indicating that you have attempted something
 * which you aren't entitled to do, the user will be prompted to log in, and
 * the original request will be retried.  The precise mechanism used for
 * login is <A HREF=#loginmechanism>configurable</A>.
 *
 * <LI>
 *
 * No changes made to the database by other concurrently executing threads
 * will be visible to you (in the sense that once you have seen a particular
 * version of a record, you will always subsequently see the same one), and
 * your own changes will not be made permanent until this method completes
 * successfully or you perform an explicit <TT>PoemThread.commit()</TT>.  If
 * it terminates with an exception or you issue a
 * <TT>PoemThread.rollback()</TT>, your changes will be lost.
 *
 * <LI>
 *
 * <A NAME=loginmechanism>It's possible to configure how your
 * <TT>PoemServlet</TT>-derived servlets implement user login.</A> If the
 * properties file <TT><A
 * HREF=../../../../org.melati.MelatiServlet.properties>org.melati.MelatiServlet.properties</A></TT>
 * exists and contains a setting
 * <TT>org.melati.MelatiServlet.accessHandler=<I>foo</I></TT>, then
 * <TT><I>foo</I></TT> is taken to be the name of a class implementing the
 * <TT>AccessHandler</TT> interface.  The default is
 * <TT>HttpSessionAccessHandler</TT>, which stores the user id in the servlet
 * session, and redirects to the <TT>Login</TT> servlet to throw up
 * templated login screens.  If instead you specify
 * <TT>HttpBasicAuthenticationAccessHandler</TT>, the user id is maintained
 * using HTTP Basic Authentication (RFC2068 �11.1, the mechanism commonly
 * used to password-protect static pages), and the task of popping up login
 * dialogs is delegated to the browser.  The advantage of the former method
 * is that the user gets a more informative interface which is more under the
 * designer's control; the advantage of the latter method is that no cookies
 * or URL rewriting are required---for instance it is probably more
 * appropriate for WAP phones.  Both methods involve sending the user's
 * password in plain text across the public network.
 *
 * </UL>
 *
 * @param melati      a source of information about the Melati database
 *                    context (database, table, object) and utility objects
 *                    like error handlers
 *
 * @see org.melati.poem.Database#guestAccessToken
 * @see org.melati.poem.PoemThread#commit
 * @see org.melati.poem.PoemThread#rollback
 * @see #melatiContext
 * @see AccessHandler
 * @see HttpSessionAccessHandler
 * @see Login
 * @see HttpBasicAuthenticationAccessHandler
 */

public abstract class PoemServlet extends ConfigServlet
{
  /**
   * Process the request.
   */
  protected void doConfiguredRequest (final Melati melatiIn)
  throws ServletException, IOException {

    // Set up a POEM session and call the application code

    // dearie me, what a lot of hoops to jump through
    // at the end of the day Java is terribly poorly suited to this kind of
    // lambda idiom :(

    final PoemServlet _this = this;

    melatiIn.getDatabase().inSession (
    AccessToken.root, new PoemTask() {
      public void run () {
        try {
          Melati melati =
          melatiIn.getConfig().getAccessHandler().establishUser(melatiIn);
          try {
            _this.doPoemRequest(melatiIn);
          }
          catch (Exception e) {
            _handleException (melatiIn,e);
          }
        } catch (Exception e) {
          try {
            // we have to log this here, otherwise we loose the stacktrace
            error(melatiIn.getResponse(),e);
            throw new TrappedException(e.toString ());
          } catch (IOException f) {
            throw new TrappedException(f.toString ());
          }
        }
      }
    }
    );
  }

  // default method to handle an exception withut a template engine
  protected void handleException (Melati melati, Exception exception)
  throws Exception {

    if (exception instanceof AccessPoemException) {
      melati.getConfig().getAccessHandler().handleAccessException
      (melati,(AccessPoemException)exception);
    }
    else throw exception;
  }

  protected final void _handleException(Melati melati, Exception exception) 
  throws Exception {
    try {
      handleException(melati, exception);
    }
    catch (Exception e) {
      PoemThread.rollback();
      throw e;
    }
  }

  protected MelatiContext melatiContext(Melati melati)
  throws PathInfoException {
    MelatiContext it = new MelatiContext();
    String[] parts = melati.getPathInfoParts();

    // set it to something in order to provoke meaningful error
    it.logicalDatabase = "";
    if (parts.length > 0) {
      it.logicalDatabase = parts[0];
      if (parts.length == 2) it.method = parts[1];
      if (parts.length == 3) {
        it.table = parts[1];
        it.method = parts[2];
      }
      if (parts.length == 4) {
        it.table = parts[1];
        it.method = parts[3];
        try {
          it.troid = new Integer (parts[2]);
        } catch (NumberFormatException e) {
          throw new PathInfoException (melati.getRequest().getPathInfo(),e);
        }
      }
    }
    return it;
  }

/*
 * this is provided for convenience, so you don't have to specify the 
 * logicaldatabase on the pathinfo.  this is a very good idea when
 * writing your appications where you are typically only accessing
 * a single database
 *
 * simply override melatiContext(Melati melati) thus:
 *
 * protected MelatiContext melatiContext(Melati melati)
 * throws PathInfoException {
 *   return melatiContextWithLDB(melati,"<your logical database name>");
 * }
 *
 */
  protected MelatiContext melatiContextWithLDB
  (Melati melati, String logicalDatabase) throws PathInfoException {
    MelatiContext it = new MelatiContext();
    String[] parts = melati.getPathInfoParts();

    // set it to something in order to provoke meaningful error
    it.logicalDatabase = logicalDatabase;
    if (parts.length > 0) {
      if (parts.length == 1) it.method = parts[0];
      if (parts.length == 2) {
        it.table = parts[0];
        it.method = parts[1];
      }
      if (parts.length == 3) {
        it.table = parts[0];
        it.method = parts[2];
        try {
          it.troid = new Integer (parts[1]);
        } catch (NumberFormatException e) {
          throw new PathInfoException (melati.getRequest().getPathInfo(),e);
        }
      }
    }
    return it;
  }

  /**
   * Override the method to build up your output
   * @param melati
   * @return String
   */
  protected abstract void doPoemRequest(Melati melati) throws Exception;

}





