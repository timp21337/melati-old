package org.melati;

import java.util.*;
import java.io.*;
import org.melati.*;
import org.melati.poem.*;
import org.webmacro.util.*;
import org.webmacro.servlet.*;
import org.webmacro.engine.*;
import org.webmacro.resource.TemplateProvider;
import org.webmacro.broker.ResourceUnavailableException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public abstract class MelatiServlet extends WMServlet {

  /**
   * Melati's main entry point.  Override this to do WebMacro-like things and
   * return a WebMacro template---like <TT>WMServlet.handle</TT>.
   *
   * <UL>
   * <LI>
   *
   * Any POEM database operations you perform will be done with the access
   * rights of the POEM <TT>User</TT> associated with the servlet session.
   * [FIXME once this has been implemented, hopefully tomorrow.]  If there is
   * no established servlet session, the current user will be set to the
   * default `guest' user [or for now to the `root' access token].  If this
   * method terminates with an <TT>AccessPoemException</TT>, indicating that
   * you have attempted something which you aren't entitled to do, the
   * <TT>loginTemplate</TT> method will be invoked instead; once the user has
   * logged in, the original request will be retried [when that's implemented].
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
   * </UL>
   *
   * @see org.melati.poem.Database#guestUser
   * @see #loginTemplate
   * @see org.melati.poem.PoemThread#commit
   * @see org.melati.poem.PoemThread#rollback
   */

  protected abstract Template template(WebContext context)
      throws PoemException, HandlerException;

  protected String loginTemplateName() {
    return "Login.wm";
  }

  protected Template loginTemplate(WebContext context)
      throws PoemException, HandlerException {
    try {
      return (Template)context.getBroker().getValue(TemplateProvider.TYPE,
                                                    loginTemplateName());
    }
    catch (ResourceUnavailableException e) {
      throw new HandlerException(e.toString());
    }
  }

  /**
   * WebMacro's main entry point, overridden <TT>final</TT>ly.  It sets up
   * Melati's environment and invokes its entry point, `<TT>template</TT>'.
   *
   * @see #template
   */

  protected final Template handle(WebContext context) throws HandlerException {
    context.put("melati", new Melati(context));

    // HttpSession session = context.getSession();
    // User user = (User)session.getValue("user");
    // PoemThread.setAccessToken(user == null ? guest: user);

    try {
      try {
        return template(context);
      }
      catch (AccessPoemException e) {
        return loginTemplate(context);
      }
    }
    catch (Exception e) {
      throw new HandlerException(e.toString());
    }
  }

  private void reallyService(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    super.service(request, response);
  }

  public void service(final ServletRequest plainRequest,
                      final ServletResponse response)
      throws ServletException, IOException {

    final HttpServletRequest request = (HttpServletRequest)plainRequest;

    String pathInfo = request.getPathInfo();
    String subPathInfo = null;
    String logicalDatabaseName = null;
    if (pathInfo != null) {
      int slash = pathInfo.indexOf('/');
      if (slash != -1) {
        int slash2 = pathInfo.indexOf('/', slash + 1);
        logicalDatabaseName =
            slash2 == -1 ? pathInfo.substring(slash + 1) :
                           pathInfo.substring(slash + 1, slash2);
        subPathInfo = slash2 == -1 ? null : pathInfo.substring(slash2 + 1);
      }
    }

    // dearie me, what a lot of hoops to jump through
    // at the end of the day Java is terribly poorly suited to this kind of
    // lambda idiom :(

    final MelatiServlet _this = this;

    Database database;
    try {
      database = LogicalDatabase.named(logicalDatabaseName);
    }
    catch (DatabaseInitException e) {
      e.printStackTrace();
      throw new ServletException(e.toString());
    }

    final String[] problem = new String[1];

    try {
      database.inSession(
          AccessToken.root,
          new PoemTask() {
            public void run() {
              try {
                _this.reallyService(request, response);
              }
              catch (Exception e) {
                // FIXME oops we have to do this in-session!  This is because
                // some PoemExceptions generate their messages on the fly from
                // Persistents that can't be interrogated outside a database
                // session.  Indeed the toString() can actually generate a
                // further exception.  Not very satisfactory.

                problem[0] = e.toString();
                e.printStackTrace();
              }
            }
          });
    }
    catch (Exception e) {
      throw new ServletException(e.toString());
    }

    if (problem[0] != null)
      throw new ServletException(problem[0]);
  }
}
