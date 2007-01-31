package org.melati.template.test;

import org.melati.PoemContext;
import org.melati.poem.test.Node;
import org.melati.template.ClassNameTempletLoader;
import org.melati.template.HTMLAttributeMarkupLanguage;
import org.melati.template.HTMLMarkupLanguage;
import org.melati.util.JSStaticTree;
import org.melati.poem.PoemLocale;
import org.melati.util.Tree;


/**
 * Test the HTMLMarkupLanguage and its AttributeMarkupLanguage.
 * 
 * @author timp
 * @since 18-May-2006
 */
public class HTMLMarkupLanguageTest extends MarkupLanguageTestAbstract {
  
  /**
   * @see MarkupLanguageAbstract#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();
    ml = new HTMLMarkupLanguage(
            m, 
            new ClassNameTempletLoader(), 
            PoemLocale.HERE);
    aml = new HTMLAttributeMarkupLanguage((HTMLMarkupLanguage)ml);
    m.setMarkupLanguage(ml);
    assertEquals(ml, m.getMarkupLanguage());    
  }
  
  /**
   * Test method for getName.
   * 
   * @see org.melati.template.MarkupLanguage#getName()
   */
  public void testGetName() {
    assertEquals("html", ml.getName());
    assertEquals("html_attr", aml.getName());
  }

  /**
   * Test method for rendered(Treeable).
   * 
   * @see org.melati.template.MarkupLanguage#rendered(Object)
   */
  public void testRenderedTreeable() {
    try {

      Node parent = (Node)getDb().getTable("node").newPersistent();
      parent.setName("Mum");
      parent.makePersistent();
      Node  kid1 = (Node)getDb().getTable("node").newPersistent();
      kid1.setName("K1");
      kid1.setParent(parent);
      kid1.makePersistent();
      Node  kid2 = (Node)getDb().getTable("node").newPersistent();
      kid2.setName("K2");
      kid2.setParent(parent);
      kid2.makePersistent();
      Tree testTree = new Tree(parent);
      JSStaticTree tree = new JSStaticTree(testTree, "/melati-static/admin");
      m.setPoemContext(new PoemContext());
      
      String renderedTree = ml.rendered(tree);
      System.err.println(renderedTree);
      assertTrue(renderedTree.indexOf("init") != -1);
    } catch (Exception e) {
      e.printStackTrace();
      fail();
    }
    
  }
  
}
