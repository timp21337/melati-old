/**
 * 
 */
package org.melati.poem.test;

import java.util.Enumeration;
import java.util.NoSuchElementException;

import org.melati.poem.ResultSetEnumeration;

/**
 * @author timp
 * @since 22 Jan 2007
 *
 */
public class ResultSetEnumerationTest extends PoemTestCase {

  /**
   * Constructor.
   * @param name
   */
  public ResultSetEnumerationTest(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.test.PoemTestCase#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.test.PoemTestCase#tearDown()
   */
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test method for {@link org.melati.poem.ResultSetEnumeration#
   *    ResultSetEnumeration(java.sql.ResultSet)}.
   */
  public void testResultSetEnumeration() {
  }

  /**
   * Test method for {@link org.melati.poem.ResultSetEnumeration#hasMoreElements()}.
   */
  public void testHasMoreElements() {
    
  }

  /**
   * Test ov deviant useage.
   * Test method for {@link org.melati.poem.ResultSetEnumeration#nextElement()}.
   */
  public void testNextElement() {
    Enumeration rse = getDb().getUserTable().getLoginColumn().selectionWhereEq("_guest_");
    rse.nextElement();
    try { 
      rse.nextElement();
      fail("Should have blown up");
    } catch (NoSuchElementException e) { 
      e = null;
    }
    
  }

  /**
   * Test method for {@link org.melati.poem.ResultSetEnumeration#skip()}.
   */
  public void testSkip() {
    ResultSetEnumeration rse = (ResultSetEnumeration)getDb().getUserTable().getLoginColumn().selectionWhereEq("_guest_");
    rse.skip();
    try { 
      rse.nextElement();
      fail("Should have blown up");
    } catch (NoSuchElementException e) { 
      e = null;
    }    
    rse = (ResultSetEnumeration)getDb().getUserTable().getLoginColumn().selectionWhereEq("_guest_");
    rse.skip();
    try { 
      rse.skip();
      fail("Should have blown up");
    } catch (NoSuchElementException e) { 
      e = null;
    }    
  }

}
