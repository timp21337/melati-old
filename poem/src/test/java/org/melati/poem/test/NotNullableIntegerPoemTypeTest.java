/**
 * 
 */
package org.melati.poem.test;

import org.melati.poem.DisplayLevelPoemType;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.SQLPoemType;
import org.melati.poem.TypeMismatchPoemException;

/**
 * @author timp
 * @since 21 Dec 2006
 *
 */
public class NotNullableIntegerPoemTypeTest extends SQLPoemTypeTest {

  /**
   * 
   */
  public NotNullableIntegerPoemTypeTest() {
  }

  /**
   * @param name
   */
  public NotNullableIntegerPoemTypeTest(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.test.SQLPoemTypeTest#setObjectUnderTest()
   */
  void setObjectUnderTest() {
    it = new IntegerPoemType(false);
  }

  /**
   * Test method for {@link org.melati.poem.PoemType#canRepresent(org.melati.poem.PoemType)}.
   */
  public void testCanRepresent() {
    assertTrue(it.canRepresent(new DisplayLevelPoemType()) instanceof IntegerPoemType);
  }

  /**
   * Only way to get doubleChecked to throw. 
   * {@inheritDoc}
   * @see org.melati.poem.test.SQLPoemTypeTest#testRawOfCooked()
   */
  public void testRawOfCooked() {
    super.testRawOfCooked();
    try { 
      it.rawOfCooked(new Long(0));
      fail("should have blown up");
    } catch (TypeMismatchPoemException e) { 
      e = null;
    }
  }

  /**
   * Test method for {@link org.melati.poem.SQLType#quotedRaw(java.lang.Object)}.
   */
  public void testQuotedRaw() {
    assertEquals(((SQLPoemType)it).sqlDefaultValue() , 
        ((SQLPoemType)it).quotedRaw(((SQLPoemType)it).rawOfString(((SQLPoemType)it).sqlDefaultValue())));

  }
  
}
