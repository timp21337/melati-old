package org.melati.util;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReconstructedHttpServletRequest implements HttpServletRequest {

  private HttpServletRequestParameters oldParams;
  private HttpServletRequest newRequest;

  public ReconstructedHttpServletRequest(
      HttpServletRequestParameters oldParams, HttpServletRequest newRequest)
          throws ReconstructedHttpServletRequestMismatchException {
    if (!oldParams.requestURL.equals(
             HttpUtils.getRequestURL(newRequest).toString()) ||
        !(oldParams.queryString == null ?
              newRequest.getQueryString() == null :
              oldParams.queryString.equals(newRequest.getQueryString())) ||
        oldParams.session != newRequest.getSession(false))
      throw new ReconstructedHttpServletRequestMismatchException(oldParams,
                                                                 newRequest);

    this.oldParams = oldParams;
    this.newRequest = newRequest;
  }

  public void setNewRequest(HttpServletRequest newRequest) {
    this.newRequest = newRequest;
  }

  public int getContentLength() {
    return newRequest.getContentLength();
  }

  public String getContentType() {
    return newRequest.getContentType();
  }

  public String getProtocol() {
    return newRequest.getProtocol();
  }

  public String getScheme() {
    return newRequest.getScheme();
  }

  public String getServerName() {
    return newRequest.getServerName();
  }

  public int getServerPort() {
    return newRequest.getServerPort();
  }

  public String getRemoteAddr() {
    return newRequest.getRemoteAddr();
  }

  public String getRemoteHost() {
    return newRequest.getRemoteHost();
  }

  public String getRealPath(String path) {
    return newRequest.getRealPath(path);
  }

  public ServletInputStream getInputStream() throws IOException {
    return newRequest.getInputStream();
  }

  /**
   * From the <B>old</B> request.
   */

  public String getParameter(String name) {
    String[] vals = (String[])oldParams.parameters.get(name);
    return vals == null ? null : vals[0];
  }

  /**
   * From the <B>old</B> request.
   */

  public String[] getParameterValues(String name) {
    return (String[])oldParams.parameters.get(name);
  }

  /**
   * From the <B>old</B> request.
   */

  public Enumeration getParameterNames() {
    return oldParams.parameters.keys();
  }

  public Object getAttribute(String name) {
    return newRequest.getAttribute(name);
  }

  public BufferedReader getReader() throws IOException {
    return newRequest.getReader();
  }

  public String getCharacterEncoding() {
    return newRequest.getCharacterEncoding();
  }

  public Cookie[] getCookies() {
    return newRequest.getCookies();
  }

  /**
   * From the <B>old</B> request.
   */

  public String getMethod() {
    return oldParams.method;
  }

  public String getRequestURI() {
    return newRequest.getRequestURI();
  }

  public String getServletPath() {
    return newRequest.getServletPath();
  }

  public String getPathInfo() {
    return newRequest.getPathInfo();
  }

  public String getPathTranslated() {
    return newRequest.getPathTranslated();
  }

  public String getQueryString() {
    return newRequest.getQueryString();
  }

  public String getRemoteUser() {
    return newRequest.getRemoteUser();
  }

  public String getAuthType() {
    return newRequest.getAuthType();
  }

  public String getHeader(String name) {
    return newRequest.getHeader(name);
  }

  public int getIntHeader(String name) {
    return newRequest.getIntHeader(name);
  }

  public long getDateHeader(String name) {
    return newRequest.getDateHeader(name);
  }

  public Enumeration getHeaderNames() {
    return newRequest.getHeaderNames();
  }

  public HttpSession getSession(boolean create) {
    return newRequest.getSession(create);
  }

  public String getRequestedSessionId() {
    return newRequest.getRequestedSessionId();
  }

  public boolean isRequestedSessionIdValid() {
    return newRequest.isRequestedSessionIdValid();
  }

  public boolean isRequestedSessionIdFromCookie() {
    return newRequest.isRequestedSessionIdFromCookie();
  }

  public boolean isRequestedSessionIdFromUrl() {
    return newRequest.isRequestedSessionIdFromUrl();
  }
}
