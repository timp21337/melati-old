/* * $Revision$ * */

package org.melati.poem.test;
import junit.framework.TestCase;
import java.sql.Date;
import org.melati.poem.DatePoemType;
/**
 * @author tim.pizey
 *  
 */
public class DatePoemTypeTest extends TestCase {  public void testToDsdType() {    DatePoemType t = new DatePoemType(true);    assertTrue(t.toDsdType().equals("Date"));  }  public void testRawOfString() {    DatePoemType t = new DatePoemType(true);    Date d1 = (Date) t.rawOfString("12122001");    Date d2 = (Date) t.rawOfString("2001-12-12");    assertTrue(d1.equals(d2));    assertTrue(!d1.equals(null));    assertTrue(!d2.equals(null));    Date d3 = (Date) t.rawOfString(null);    assertTrue(d3 == null);    try {      t.rawOfString("");      fail("Should throw IllegalArgumentException for empty string");    } catch (IllegalArgumentException success) {      success = null; // shut PMD up    }    try {      t.rawOfString("1999-2-2");      fail("Should throw IllegalArgumentException for malformed date 1999-2-2");    } catch (IllegalArgumentException success) {      success = null; // shut PMD up    }  }  /*   *    * Class under test for String toString()   *     */  public void testToString() {    DatePoemType t = new DatePoemType(true);    assertTrue(t.toString().equals("nullable DATE (org.melati.poem.DatePoemType)"));    DatePoemType t2 = new DatePoemType(false);    assertTrue(t2.toString().equals("DATE (org.melati.poem.DatePoemType)"));  }  public void testEquals() {    DatePoemType t = new DatePoemType(true);    assertTrue(t.rawOfString("2001-12-12").equals(t.rawOfString("2001-12-12")));    assertTrue(t.rawOfString("12122001").equals(t.rawOfString("2001-12-12")));    assertTrue(t.rawOfString("12122001").equals(t.rawOfString("2001-12-12")));    assertTrue(t.rawOfString("02022001").equals(t.rawOfString("2001-02-02")));    assertTrue(t.rawOfString("02022001").equals(t.rawOfString("2001-02-02")));  }}

