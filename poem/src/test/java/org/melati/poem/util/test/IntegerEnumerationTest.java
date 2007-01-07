/**
 * 
 */
package org.melati.util.test;

import org.melati.util.IntegerEnumeration;

import junit.framework.TestCase;

/**
 * @author timp
 * @since 7 Jan 2007
 *
 */
public class IntegerEnumerationTest extends TestCase {

  /**
   * @param name
   */
  public IntegerEnumerationTest(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * @see junit.framework.TestCase#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();
  }

  /**
   * {@inheritDoc}
   * @see junit.framework.TestCase#tearDown()
   */
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test method for {@link org.melati.util.IntegerEnumeration#IntegerEnumeration(int, int)}.
   */
  public void testIntegerEnumerationZeros() {
    IntegerEnumeration it = new IntegerEnumeration(0,0);
    int count = 0;
    while(it.hasMoreElements()) {
      count++;
    }
    assertEquals(0, count);
  }
  public void testIntegerEnumeration() {
    IntegerEnumeration it = new IntegerEnumeration(0,1);
    int count = 0;
    while(it.hasMoreElements()) {
      assertEquals(new Integer(0),it.nextElement());
      count++;
    }
    assertEquals(1, count);
  }
  public void testIntegerEnumerationMax() {
    int max = 9;
    IntegerEnumeration it = new IntegerEnumeration(max - 5, max);
    int count = 0;
    while(it.hasMoreElements()) {
      it.nextElement();
      count++;
    }
    assertEquals(5, count);
  }

}
