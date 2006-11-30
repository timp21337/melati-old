/**
 * 
 */
package org.melati.poem.test;

import java.text.DateFormat;

import org.melati.poem.AccessPoemException;
import org.melati.poem.BaseFieldAttributes;
import org.melati.poem.Field;
import org.melati.poem.IntegerPoemType;
import org.melati.poem.StringPoemType;
import org.melati.util.MelatiLocale;

/**
 * @author timp
 * @since 30/11/2006
 */
public class FieldTest extends PoemTestCase {

  Field stringField = null;
  Field integerField = null;
  /**
   * Constructor for FieldTest.
   * @param name
   */
  public FieldTest(String name) {
    super(name);
  }

  /**
   * @see PoemTestCase#setUp()
   */
  protected void setUp()
      throws Exception {
    super.setUp();
    stringField = new Field("stringfield", new BaseFieldAttributes("stringName",
        "String Display Name", "String description",
        StringPoemType.nullableInstance,
        20,    // width
        1,     // height
        null,  // render info
        false, // indexed
        true,  // userEditable
        true   // user createbale
        ));
    integerField = new Field(new Integer(1), new BaseFieldAttributes("integerName",
        "Integer Display Name", "Integer description",
        IntegerPoemType.nullableInstance,
        20,    // width
        1,     // height
        null,  // render info
        false, // indexed
        true,  // userEditable
        true   // user createbale
        ));
  }

  /**
   * @see PoemTestCase#tearDown()
   */
  protected void tearDown()
      throws Exception {
    super.tearDown();
  }

  /**
   * @see org.melati.poem.Field.Field(Object, FieldAttributes)
   */
  public void testFieldObjectFieldAttributes() {
    
  }

  /**
   * @see org.melati.poem.Field.Field(AccessPoemException, FieldAttributes)
   */
  public void testFieldAccessPoemExceptionFieldAttributes() {
    Field f = new Field(new AccessPoemException(), stringField);
    try {
      f.getRaw();
      fail("Should have blown up");
    } catch (AccessPoemException e) {
      e = null;
    }
    try {
      f.getRawString();
      fail("Should have blown up");
    } catch (AccessPoemException e) {
      e = null;
    }
    try {
      f.getCooked();
      fail("Should have blown up");
    } catch (AccessPoemException e) {
      e = null;
    }
    try {
      f.getCookedString(MelatiLocale.HERE, DateFormat.MEDIUM);
      fail("Should have blown up");
    } catch (AccessPoemException e) {
      e = null;
    }
    try {
      f.sameRawAs(integerField);
      fail("Should have blown up");
    } catch (AccessPoemException e) {
      e = null;
    }
  }

  /**
   * @see org.melati.poem.Field.clone()
   */
  public void testClone() {
    Field s2 = (Field)stringField.clone();
    assertFalse(s2.equals(stringField));
    assertEquals(stringField.getName(), s2.getName());

    Field i2 = (Field)integerField.clone();
    assertFalse(i2.equals(integerField));
    assertEquals(integerField.getName(), i2.getName());
  }

  /**
   * @see org.melati.poem.Field.getName()
   */
  public void testGetName() {
    assertEquals("stringName", stringField.getName());
    assertEquals("integerName", integerField.getName());
  }

  /**
   * @see org.melati.poem.Field.getDisplayName()
   */
  public void testGetDisplayName() {
    assertEquals("String Display Name", stringField.getDisplayName());
    assertEquals("Integer Display Name", integerField.getDisplayName());
  }

  /**
   * @see org.melati.poem.Field.getDescription()
   */
  public void testGetDescription() {
    assertEquals("String description", stringField.getDescription());
    assertEquals("Integer description", integerField.getDescription());

  }

  /**
   * @see org.melati.poem.Field.getType()
   */
  public void testGetType() {
    assertEquals(StringPoemType.nullableInstance, stringField.getType());
    assertEquals(IntegerPoemType.nullableInstance, integerField.getType());

  }

  /**
   * @see org.melati.poem.Field.getIndexed()
   */
  public void testGetIndexed() {
    assertFalse(stringField.getIndexed());
    assertFalse(integerField.getIndexed());
  }

  /**
   * @see org.melati.poem.Field.getUserEditable()
   */
  public void testGetUserEditable() {
    assertTrue(stringField.getUserEditable());
    assertTrue(integerField.getUserEditable());
  }

  /**
   * @see org.melati.poem.Field.getUserCreateable()
   */
  public void testGetUserCreateable() {
    assertTrue(stringField.getUserCreateable());
    assertTrue(integerField.getUserCreateable());
  }

  /**
   * @see org.melati.poem.Field.getWidth()
   */
  public void testGetWidth() {
    assertEquals(20, stringField.getWidth());
    assertEquals(20, integerField.getWidth());
  }

  /**
   * @see org.melati.poem.Field.getHeight()
   */
  public void testGetHeight() {
    assertEquals(1, stringField.getHeight());
    assertEquals(1, integerField.getHeight());
  }

  /**
   * @see org.melati.poem.Field.getRenderInfo()
   */
  public void testGetRenderInfo() {
    assertNull(stringField.getRenderInfo());
    assertNull(integerField.getRenderInfo());
  }

  /**
   * @see org.melati.poem.Field.getRaw()
   */
  public void testGetRaw() {
    assertEquals("stringfield", stringField.getRaw());
    assertEquals(new Integer(1), integerField.getRaw());
  }

  /**
   * @see org.melati.poem.Field.getRawString()
   */
  public void testGetRawString() {
    assertEquals("stringfield", stringField.getRawString());
    assertEquals("1", integerField.getRawString());
  }

  /**
   * @see org.melati.poem.Field.getCooked()
   */
  public void testGetCooked() {
    assertEquals("stringfield", stringField.getCooked());
    assertEquals(new Integer(1), integerField.getCooked());
  }

  /**
   * @see org.melati.poem.Field.getCookedString(MelatiLocale, int)
   */
  public void testGetCookedString() {
    assertEquals("stringfield", stringField.getCookedString(MelatiLocale.HERE, DateFormat.MEDIUM));
    assertEquals("1", integerField.getCookedString(MelatiLocale.HERE, DateFormat.MEDIUM));
  }

  /**
   * @see org.melati.poem.Field.withRaw(Object)
   */
  public void testWithRaw() {

  }

  /**
   * @see org.melati.poem.Field.withNullable(boolean)
   */
  public void testWithNullable() {

  }

  /**
   * @see org.melati.poem.Field.withName(String)
   */
  public void testWithName() {

  }

  /**
   * @see org.melati.poem.Field.withDescription(String)
   */
  public void testWithDescription() {

  }

  /**
   * @see org.melati.poem.Field.getPossibilities()
   */
  public void testGetPossibilities() {

  }

  /**
   * @see org.melati.poem.Field.getFirst1000Possibilities()
   */
  public void testGetFirst1000Possibilities() {

  }

  /**
   * @see org.melati.poem.Field.sameRawAs(Field)
   */
  public void testSameRawAs() {

  }

  /**
   * @see org.melati.poem.Field.dump(PrintStream)
   */
  public void testDump() {

  }

  /**
   * @see org.melati.poem.Field.toString()
   */
  public void testToString() {

  }

  /**
   * @see org.melati.poem.Field.basic(Object, String, PoemType)
   */
  public void testBasic() {

  }

  /**
   * @see org.melati.poem.Field.string(String, String)
   */
  public void testString() {

  }

  /**
   * @see org.melati.poem.Field.integer(Integer, String)
   */
  public void testInteger() {

  }

  /**
   * @see org.melati.poem.Field.reference(Persistent, String)
   */
  public void testReferencePersistentString() {

  }

  /**
   * @see org.melati.poem.Field.reference(Table, String)
   */
  public void testReferenceTableString() {

  }

  /**
   * @see java.lang.Object.hashCode()
   */
  public void testHashCode() {

  }

  /**
   * @see java.lang.Object.equals(Object)
   */
  public void testEquals() {

  }

}