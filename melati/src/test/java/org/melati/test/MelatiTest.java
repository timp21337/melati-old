package org.melati.test;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.melati.Melati;
import org.melati.MelatiConfig;
import org.melati.PoemContext;
import org.melati.poem.Field;
import org.melati.template.webmacro.PassbackEvaluationExceptionHandler;
import org.melati.util.CharsetException;
import org.melati.util.MelatiBugMelatiException;
import org.melati.util.MelatiException;
import org.melati.util.MelatiStringWriter;
import org.melati.util.MelatiWriter;
import org.melati.servlet.test.MockServletRequest;

import junit.framework.TestCase;

/**
 * Test Melati.
 * 
 * @author timp
 * @since 30/05/2006
 */
public class MelatiTest extends TestCase {

  /**
   * Constructor for MelatiTest.
   * @param name
   */
  public MelatiTest(String name) {
    super(name);
  }

  /**
   * @see TestCase#setUp()
   */
  protected void setUp()
      throws Exception {
    super.setUp();
  }

  /**
   * @see TestCase#tearDown()
   */
  protected void tearDown()
      throws Exception {
    super.tearDown();
  }

  protected PoemContext poemContext(Melati melati) throws MelatiException { 
    PoemContext it = new PoemContext();
   return it;
 }
  
  
  /**
   * @see org.melati.Melati#Melati(MelatiConfig, HttpServletRequest, HttpServletResponse)
   */
  public void testMelatiMelatiConfigHttpServletRequestHttpServletResponse() {

  }

  /**
   * @see org.melati.Melati#Melati(MelatiConfig, MelatiWriter)
   */
  public void testMelatiMelatiConfigMelatiWriter() {

  }

  /**
   * @see org.melati.Melati#getRequest()
   */
  public void testGetRequest() {

  }

  /**
   * @see org.melati.Melati#setRequest(HttpServletRequest)
   */
  public void testSetRequest() {

  }

  /**
   * @see org.melati.Melati#getResponse()
   */
  public void testGetResponse() {

  }

  /**
   * @see org.melati.Melati#setPoemContext(PoemContext)
   */
  public void testSetPoemContext() {

  }

  /**
   * @see org.melati.Melati#loadTableAndObject()
   */
  public void testLoadTableAndObject() {

  }

  /**
   * @see org.melati.Melati#getPoemContext()
   */
  public void testGetPoemContext() {

  }

  /**
   * @see org.melati.Melati#getDatabase()
   */
  public void testGetDatabase() {

  }

  /**
   * @see org.melati.Melati#getKnownDatabaseNames()
   */
  public void testGetKnownDatabaseNames() {
    MelatiConfig mc = null;
    PoemContext pc = null;
    Melati m = null;
    try {
      mc = new MelatiConfig();
      m = new Melati(mc, new MelatiStringWriter());
      pc = poemContext(m);
      m.setPoemContext(pc);
      Vector known = m.getKnownDatabaseNames();
      // Fails when run in single thread 
      //assertEquals(0, known.size());
      pc.setLogicalDatabase("melatijunit");
      m.setPoemContext(pc);
      m.loadTableAndObject();
      known = m.getKnownDatabaseNames();
      // Fails when run in single thread 
      //assertEquals(1, known.size());
      assertTrue(known.size() > 0);
    } catch (MelatiException e) {
      e.printStackTrace();
      fail();
    }
  }

  /**
   * @see org.melati.Melati#getTable()
   */
  public void testGetTable() {

  }

  /**
   * @see org.melati.Melati#getObject()
   */
  public void testGetObject() {

  }

  /**
   * @see org.melati.Melati#getMethod()
   */
  public void testGetMethod() {

  }

  /**
   * @see org.melati.Melati#setTemplateEngine(TemplateEngine)
   */
  public void testSetTemplateEngine() {

  }

  /**
   * @see org.melati.Melati#getTemplateEngine()
   */
  public void testGetTemplateEngine() {

  }

  /**
   * @see org.melati.Melati#setTemplateContext(TemplateContext)
   */
  public void testSetTemplateContext() {

  }

  /**
   * @see org.melati.Melati#getTemplateContext()
   */
  public void testGetTemplateContext() {

  }

  /**
   * @see org.melati.Melati#getServletTemplateContext()
   */
  public void testGetServletTemplateContext() {

  }

  /**
   * @see org.melati.Melati#getConfig()
   */
  public void testGetConfig() {

  }

  /**
   * @see org.melati.Melati#getPathInfoParts()
   */
  public void testGetPathInfoParts() {

  }

  /**
   * @see org.melati.Melati#setArguments(String[])
   */
  public void testSetArguments() {

  }

  /**
   * @see org.melati.Melati#getArguments()
   */
  public void testGetArguments() {
    MelatiConfig mc = null;
    Melati m = null;
    try {
      mc = new MelatiConfig();
      m = new Melati(mc, new MelatiStringWriter());
      m.setPoemContext(poemContext(m));
    } catch (MelatiException e) {
      e.printStackTrace();
      fail();
    }
    assertNull(m.getArguments());
    m.setArguments(new String[] {"hello", "world"});
    assertEquals(2, m.getArguments().length);

  }

  /**
   * @see org.melati.Melati#getSession()
   */
  public void testGetSession() {

  }

  /**
   * @see org.melati.Melati#getContextUtil(String)
   */
  public void testGetContextUtil() {
    MelatiConfig mc = null;
    Melati m = null;
    try {
      mc = new MelatiConfig();
      m = new Melati(mc, new MelatiStringWriter());
      m.setPoemContext(poemContext(m));
    } catch (MelatiException e) {
      e.printStackTrace();
      fail();
    }
    Object adminUtil = m.getContextUtil("org.melati.admin.AdminUtils");
    assertTrue(adminUtil instanceof org.melati.admin.AdminUtils);
    try { 
      m.getContextUtil("unknownClass");
      fail("Should have bombed");
    } catch (MelatiBugMelatiException e) { 
      e = null;
    }
  }

  /**
   * @see org.melati.Melati#getLogoutURL()
   * @throws Exception 
   */
  public void testGetLogoutURL() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest req = new MockServletRequest();
    req.setRequestURI("");
    m.setRequest(req);
    assertEquals("/mockServletPath/org.melati.login.Logout/null",m.getLogoutURL());
  }

  /**
   * @see org.melati.Melati#getLoginURL()
   * @throws Exception 
   */
  public void testGetLoginURL() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest req = new MockServletRequest();
    req.setRequestURI("");
    m.setRequest(req);
    assertEquals("/mockServletPath/org.melati.login.Login/null",m.getLoginURL());

  }

  /**
   * @see org.melati.Melati#getZoneURL()
   */
  public void testGetZoneURL() {

  }

  /**
   * Not used in Melati.
   * @throws Exception 
   * @see org.melati.Melati#getServletURL()
   */
  public void testGetServletURL() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest req = new MockServletRequest();
    req.setRequestURI("/");
    m.setRequest(req);
    assertEquals("http://localhost/mockServletPath/",m.getServletURL());
  }

  /**
   * @see org.melati.Melati#getJavascriptLibraryURL()
   */
  public void testGetJavascriptLibraryURL() {

  }

  /**
   * @throws Exception 
   * @see org.melati.Melati#getPoemLocale()
   */
  public void testGetPoemLocale() throws Exception {
    MelatiConfig mc = null;
    Melati m = null;
    mc = new MelatiConfig();
    m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    assertEquals("en_GB", m.getPoemLocale().toString());
    m.setRequest(new MockServletRequest());
    assertEquals("en_GB", m.getPoemLocale().toString());
    MockServletRequest msr = new MockServletRequest();
    msr.setHeader("Accept-Language","en-gb");
    m.setRequest(msr);
    assertEquals("en_GB", m.getPoemLocale().toString());
    msr.setHeader("Accept-Language","not");
    assertEquals("en_GB", m.getPoemLocale().toString());
    msr.setHeader("Accept-Language","en-us");
    assertEquals("en_US", m.getPoemLocale().toString());
    

  }

  /**
   * @see org.melati.Melati#getPoemLocale(String)
   */
  public void testGetPoemLocaleString() {
    assertNull(Melati.getPoemLocale(""));    
    assertNull(Melati.getPoemLocale(";"));    
    assertNull(Melati.getPoemLocale(";9"));    
    assertNull(Melati.getPoemLocale(";nine"));    
    assertNull(Melati.getPoemLocale("rubbish")); 
    assertNull(Melati.getPoemLocale("rubbish;9")); 
    assertNull(Melati.getPoemLocale("rubbish;nine")); 
    assertEquals("en_GB", Melati.getPoemLocale("EN-GB").toString());    
    assertEquals("en_GB", Melati.getPoemLocale("en-GB").toString());    
    assertEquals("en_GB", Melati.getPoemLocale("en-gb").toString());    
    assertEquals("en_GB", Melati.getPoemLocale("en-gb;").toString());    
    assertEquals("en_GB", Melati.getPoemLocale("en-gb;9").toString());    
    assertEquals("en_GB", Melati.getPoemLocale("en-gb;nine").toString());    
    
  }
  /**
   * @see org.melati.Melati#establishCharsets()
   */
  public void testEstablishCharsets() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    mock.setHeader("Accept-Charset", "");
    m.setRequest(mock);
    m.establishCharsets();

    mock.setHeader("Accept-Charset", "rubbish");
    m.setRequest(mock);
    try { 
      m.establishCharsets();
      fail("Should have blown up");
    } catch (CharsetException e) { 
      e = null;
    }

    mock.setHeader("Accept-Charset", "");
    mock.setCharacterEncoding(null);
    m.setRequest(mock);
    m.establishCharsets();
    
  }

  /**
   * @see org.melati.Melati#setResponseContentType(String)
   */
  public void testSetResponseContentType() {

  }

  /**
   * @see org.melati.Melati#setMarkupLanguage(MarkupLanguage)
   */
  public void testSetMarkupLanguage() {

  }

  /**
   * @see org.melati.Melati#getMarkupLanguage()
   */
  public void testGetMarkupLanguage() {
    MelatiConfig mc = null;
    Melati m = null;
    try {
      mc = new MelatiConfig();
      m = new Melati(mc, new MelatiStringWriter());
      m.setPoemContext(poemContext(m));
    } catch (MelatiException e) {
      e.printStackTrace();
      fail();
    }
    assertEquals("html/en_GB", m.getMarkupLanguage().toString());
    assertEquals("html_attr/en_GB", m.getMarkupLanguage().getAttr().toString());
  }

  /**
   * @see org.melati.Melati#getHTMLMarkupLanguage()
   */
  public void testGetHTMLMarkupLanguage() {

  }

  /**
   * @see org.melati.Melati#sameURLWith(String, String)
   */
  public void testSameURLWithStringString() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    mock.setRequestURI("page");
    m.setRequest(mock);

    assertEquals("page?noodles=1", m.sameURLWith("noodles","1"));
    assertEquals("page?noodles=1", m.sameURLWith("noodles"));
  }

  /**
   * @see org.melati.Melati#sameURLWith(String)
   */
  public void testSameURLWithString() {

  }

  /**
   * @see org.melati.Melati#getSameURL()
   */
  public void testGetSameURL() {

  }

  /**
   * @see org.melati.Melati#setBufferingOff()
   */
  public void testSetBufferingOff() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    m.setRequest(mock);
    m.setBufferingOff();
    m.setFlushingOn();
    MelatiWriter mw = m.getWriter();
    try {
      m.setBufferingOff();
      fail("Should have blown up");
    } catch (IOException e) {
      e = null;
    }
    try {
      m.setFlushingOn();
      fail("Should have blown up");
    } catch (IOException e) {
      e = null;
    }
    mw.flush();
    mw.close();
  }

  /**
   * @see org.melati.Melati#setFlushingOn()
   */
  public void testSetFlushingOn() {

  }

  /**
   * Not called in Melati.
   * @see org.melati.Melati#gotWriter()
   */
  public void testGotWriter() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    m.setRequest(mock);
    assertFalse(m.gotWriter());
    m.getWriter();
    assertTrue(m.gotWriter());
  }

  /**
   * @see org.melati.Melati#getURLQueryEncoding()
   */
  public void testGetURLQueryEncoding() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    m.setRequest(mock);
    assertEquals("ISO-8859-1", m.getURLQueryEncoding());
  }

  /**
   * @see org.melati.Melati#urlEncode(String)
   */
  public void testUrlEncode() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    m.setRequest(mock);
    assertEquals("", m.urlEncode(""));
    assertEquals("A+space+seperated+string", m.urlEncode("A space seperated string"));
    mock.setCharacterEncoding("Unsupported Encoding");
    m.setRequest(mock);
    assertEquals("A space seperated string", m.urlEncode("A space seperated string"));
  }

  /**
   * @see org.melati.Melati#getEncoding()
   */
  public void testGetEncoding() {

  }

  /**
   * @see org.melati.Melati#getWriter()
   */
  public void testGetWriter() {

  }

  /**
   * @see org.melati.Melati#getStringWriter()
   */
  public void testGetStringWriter() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    m.setRequest(mock);
    assertNull(m.getTemplateEngine());
    assertTrue(m.getStringWriter() instanceof MelatiStringWriter);
  }

  /**
   * @see org.melati.Melati#write()
   */
  public void testWrite() {

  }

  /**
   * @see org.melati.Melati#getPassbackVariableExceptionHandler()
   */
  public void testGetPassbackVariableExceptionHandler() throws Exception {
    MelatiConfig mc = new MelatiConfig();
    Melati m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    MockServletRequest mock = new MockServletRequest();
    m.setRequest(mock);
    assertNull(m.getTemplateEngine());
    try { 
      m.getPassbackVariableExceptionHandler();
      fail("Should have blown up");
    } catch (NullPointerException e) { 
      e = null;
    }
    m.setTemplateEngine(mc.getTemplateEngine());
    assertTrue(m.getPassbackVariableExceptionHandler() instanceof PassbackEvaluationExceptionHandler);
  }

  /**
   * FIXME this seems really odd
   * @see org.melati.Melati#setVariableExceptionHandler(Object)
   */
  public void testSetVariableExceptionHandler() throws Exception {
  }

  /**
   * @see org.melati.Melati#getUser()
   */
  public void testGetUser() throws Exception {
    MelatiConfig mc = null;
    Melati m = null;
    mc = new MelatiConfig();
    m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    assertNull(m.getUser());
  }

  /**
   * @see org.melati.Melati#isReferencePoemType(Field)
   */
  public void testIsReferencePoemType() throws Exception {
    MelatiConfig mc = null;
    Melati m = null;
    mc = new MelatiConfig();
    m = new Melati(mc, new MelatiStringWriter());
    m.setPoemContext(poemContext(m));
    try { 
      m.isReferencePoemType(null);
      fail("Should have blown up");
    } catch (NullPointerException e) { 
      e = null;
    }
  }

}
