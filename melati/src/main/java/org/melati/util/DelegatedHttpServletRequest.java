package org.melati.util;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.reflect.*;
import org.melati.util.servletcompat.*;

public class DelegatedHttpServletRequest implements HttpServletRequest {
  protected HttpServletRequest peer;
  public DelegatedHttpServletRequest(HttpServletRequest peer) {
    this.peer = peer;
  }
  public java.lang.String getAuthType() {
    return peer.getAuthType();
  }
  public javax.servlet.http.Cookie[] getCookies() {
    return peer.getCookies();
  }
  public long getDateHeader(java.lang.String a) {
    return peer.getDateHeader(a);
  }
  public java.lang.String getHeader(java.lang.String a) {
    return peer.getHeader(a);
  }
  public java.util.Enumeration getHeaderNames() {
    return peer.getHeaderNames();
  }
  public int getIntHeader(java.lang.String a) {
    return peer.getIntHeader(a);
  }
  public java.lang.String getMethod() {
    return peer.getMethod();
  }
  public java.lang.String getPathInfo() {
    return peer.getPathInfo();
  }
  public java.lang.String getPathTranslated() {
    return peer.getPathTranslated();
  }
  public java.lang.String getQueryString() {
    return peer.getQueryString();
  }
  public java.lang.String getRemoteUser() {
    return peer.getRemoteUser();
  }
  public java.lang.String getRequestURI() {
    return peer.getRequestURI();
  }
  public java.lang.String getRequestedSessionId() {
    return peer.getRequestedSessionId();
  }
  public java.lang.String getServletPath() {
    return peer.getServletPath();
  }
  public javax.servlet.http.HttpSession getSession(boolean a) {
    return peer.getSession(a);
  }
  public boolean isRequestedSessionIdFromUrl() {
    return peer.isRequestedSessionIdFromUrl();
  }
  public boolean isRequestedSessionIdValid() {
    return peer.isRequestedSessionIdValid();
  }
  public java.lang.Object getAttribute(java.lang.String a) {
    return peer.getAttribute(a);
  }
  public java.lang.String getCharacterEncoding() {
    return peer.getCharacterEncoding();
  }
  public int getContentLength() {
    return peer.getContentLength();
  }
  public java.lang.String getContentType() {
    return peer.getContentType();
  }
  public javax.servlet.ServletInputStream getInputStream() throws java.io.IOException {
    return peer.getInputStream();
  }
  public java.lang.String getParameter(java.lang.String a) {
    return peer.getParameter(a);
  }
  public java.util.Enumeration getParameterNames() {
    return peer.getParameterNames();
  }
  public java.lang.String[] getParameterValues(java.lang.String a) {
    return peer.getParameterValues(a);
  }
  public java.lang.String getProtocol() {
    return peer.getProtocol();
  }
  public java.io.BufferedReader getReader() throws java.io.IOException {
    return peer.getReader();
  }
  public java.lang.String getRealPath(java.lang.String a) {
    return peer.getRealPath(a);
  }
  public java.lang.String getRemoteAddr() {
    return peer.getRemoteAddr();
  }
  public java.lang.String getRemoteHost() {
    return peer.getRemoteHost();
  }
  public java.lang.String getScheme() {
    return peer.getScheme();
  }
  public java.lang.String getServerName() {
    return peer.getServerName();
  }
  public int getServerPort() {
    return peer.getServerPort();
  }

  /**
   * @deprecated in Servlet API 2.2
   */

  public boolean isRequestedSessionIdFromCookie() {
    return peer.isRequestedSessionIdFromCookie();
  }

  /**
   * Servlet API 2.2 extensions
   */

  public java.security.Principal getUserPrincipal() {
    return HttpServletRequestCompat.getUserPrincipal(peer);
  }
  public java.lang.String getContextPath() {
    return HttpServletRequestCompat.getContextPath(peer);
  }
  public java.util.Enumeration getHeaders(java.lang.String a) {
    return HttpServletRequestCompat.getHeaders(peer, a);
  }
  public javax.servlet.http.HttpSession getSession() {
    return HttpServletRequestCompat.getSession(peer);
  }
  public boolean isRequestedSessionIdFromURL() {
    return HttpServletRequestCompat.isRequestedSessionIdFromURL(peer);
  }
  public boolean isUserInRole(java.lang.String a) {
    return HttpServletRequestCompat.isUserInRole(peer, a);
  }
  public Enumeration getAttributeNames() {
    return HttpServletRequestCompat.getAttributeNames(peer);
  }
  public Locale getLocale()  {
    return HttpServletRequestCompat.getLocale(peer);
  }
  public Enumeration getLocales() {
    return HttpServletRequestCompat.getLocales(peer);
  }
  public RequestDispatcher getRequestDispatcher(String arg) {
    return HttpServletRequestCompat.getRequestDispatcher(peer, arg);
  }
  public boolean isSecure() {
    return HttpServletRequestCompat.isSecure(peer);
  }
  public void removeAttribute(String arg) {
    HttpServletRequestCompat.removeAttribute(peer, arg);
  }
  public void setAttribute(String arg1, Object arg2) {
    HttpServletRequestCompat.setAttribute(peer, arg1, arg2);
  }
}
