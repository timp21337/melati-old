package org.melati.template.test;

import org.melati.template.ClassNameTempletLoader;
import org.melati.template.WMLAttributeMarkupLanguage;
import org.melati.template.WMLMarkupLanguage;
import org.melati.util.MelatiLocale;


/**
 * Test the HTMLMarkupLanguage and its AttributeMarkupLanguage.
 * 
 * @author timp
 * @since 18-May-2006
 */
public class WMLMarkupLanguageTest extends MarkupLanguageTestAbstract {

  /**
   * @see MarkupLanguageAbstract#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();
    ml = new WMLMarkupLanguage(
            m, 
            new ClassNameTempletLoader(), 
            MelatiLocale.HERE);
    aml = new WMLAttributeMarkupLanguage((WMLMarkupLanguage)ml);
    m.setMarkupLanguage(ml);
    assertEquals(ml, m.getMarkupLanguage());    
    m.setMarkupLanguage(ml);
    assertEquals(ml, m.getMarkupLanguage());    
    }

  
  /**
   * Test method for getName.
   * 
   * @see org.melati.template.MarkupLanguage#getName()
   */
  public void testGetName() {
    assertEquals("wml", ml.getName());
    assertEquals("wml_attr", aml.getName());
  }


}
