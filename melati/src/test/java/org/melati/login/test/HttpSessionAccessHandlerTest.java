/**
 *
 */
package org.melati.login.test;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.melati.login.HttpSessionAccessHandler;
import org.melati.util.EmptyEnumeration;
import org.melati.util.HttpServletRequestParameters;

import com.mockobjects.constraint.Constraint;
import com.mockobjects.constraint.IsEqual;
import com.mockobjects.constraint.IsInstanceOf;
import com.mockobjects.dynamic.Mock;
import com.mockobjects.dynamic.OrderedMock;

/**
 * @author timp
 *
 */
public class HttpSessionAccessHandlerTest extends AccessHandlerTestAbstract {

  /**
   * @param name
   */
  public HttpSessionAccessHandlerTest(String name) {
    super(name);
  }

  public void setUp() throws Exception {
    super.setUp();
    Mock mockSession = new Mock(HttpSession.class);
    mockSession.expectAndReturn("getId", null); 
    mockSession.expectAndReturn("getId", null); 
    mockSession.expectAndReturn("getId", null); 
    Mock mockHttpServletRequest = new Mock(HttpServletRequest.class); 
    mockHttpServletRequest.expectAndReturn( "getParameterNames", new EmptyEnumeration()); 
    mockHttpServletRequest.expectAndReturn("getContextPath", null);
    mockHttpServletRequest.expectAndReturn("getServletPath", null);
    mockHttpServletRequest.expectAndReturn("getPathInfo", null);
    mockHttpServletRequest.expectAndReturn("getQueryString", null);
    mockHttpServletRequest.expectAndReturn("getMethod", null);
    mockHttpServletRequest.expectAndReturn("getSession", Boolean.TRUE, mockSession.proxy());
    mockHttpServletRequest.expectAndReturn("getParameterNames", new EmptyEnumeration()); 
    mockHttpServletRequest.expectAndReturn("getContextPath", null);
    mockHttpServletRequest.expectAndReturn("getServletPath", null);
    mockHttpServletRequest.expectAndReturn("getPathInfo", null);
    mockHttpServletRequest.expectAndReturn("getQueryString", null);
    mockHttpServletRequest.expectAndReturn("getMethod", null);
    mockHttpServletRequest.expectAndReturn("getSession", Boolean.TRUE, mockSession.proxy());
    mockHttpServletRequest.expectAndReturn("getSession", Boolean.TRUE, mockSession.proxy());
    mockHttpServletRequest.expectAndReturn("getParameterNames", new EmptyEnumeration()); 
    mockHttpServletRequest.expectAndReturn("getContextPath", null);
    mockHttpServletRequest.expectAndReturn("getServletPath", null);
    mockHttpServletRequest.expectAndReturn("getPathInfo", null);
    mockHttpServletRequest.expectAndReturn("getQueryString", null);
    mockHttpServletRequest.expectAndReturn("getMethod", null);
    mockHttpServletRequest.expectAndReturn("getSession", Boolean.TRUE, mockSession.proxy());
    mockHttpServletRequest.expectAndReturn("getParameterNames", new EmptyEnumeration()); 
    mockHttpServletRequest.expectAndReturn("getContextPath", null);
    mockHttpServletRequest.expectAndReturn("getServletPath", null);
    mockHttpServletRequest.expectAndReturn("getPathInfo", null);
    mockHttpServletRequest.expectAndReturn("getQueryString", null);
    mockHttpServletRequest.expectAndReturn("getMethod", null);
    mockHttpServletRequest.expectAndReturn("getParameterNames", new EmptyEnumeration()); 
    mockHttpServletRequest.expectAndReturn("getParameterNames", new EmptyEnumeration()); 
    mockSession.expect("setAttribute", new Constraint []  {new IsEqual("org.melati.login.Login.triggeringRequestParameters"), 
        new IsInstanceOf(HttpServletRequestParameters.class)}); 
    mockSession.expect("setAttribute", new Constraint []  {new IsEqual("org.melati.login.Login.triggeringException"), 
        new IsInstanceOf(org.melati.poem.AccessPoemException.class)}); 
    mockSession.expect("getAttribute", "org.melati.login.HttpSessionAccessHandler.overlayParameters"); 
    mockSession.expect("getAttribute", "org.melati.login.HttpSessionAccessHandler.user"); 
    
    mockHttpServletRequest.expectAndReturn("getSession", Boolean.TRUE, mockSession.proxy());
    mockHttpServletRequest.expectAndReturn("getCookies", null);
    Mock mockHttpServletResponse = new OrderedMock(HttpServletResponse.class, "Response with non-default name"); 
    mockHttpServletResponse.expect("sendRedirect",new IsInstanceOf(String.class));
    //mockSession.expectAndReturn("getAttribute", "org.melati.login.HttpSessionAccessHandler.overlayParameters", 
    //    new HttpServletRequestParameters((HttpServletRequest)mockHttpServletRequest.proxy())); 
    
    mockSession.expectAndReturn("setAttribute", "org.melati.login.Login.triggeringRequestParameters", 
        new HttpServletRequestParameters((HttpServletRequest)mockHttpServletRequest.proxy())); 
    m.setRequest((HttpServletRequest)mockHttpServletRequest.proxy());
    m.setResponse((HttpServletResponse)mockHttpServletResponse.proxy());
  }

  /**
   * Create the AccessHandler and set its input stream.
   *
   * @see org.melati.login.test.AccessHandlerTestAbstract#setAccessHandler()
   */
  public void setAccessHandler() {
    HttpSessionAccessHandler ah = new HttpSessionAccessHandler();
    it = ah;
  }

}