package org.melati.example.contacts;

import org.melati.example.contacts.generated.ContactBase;
import java.util.Vector;
import java.util.Enumeration;
import org.melati.servlet.MelatiContext;
import org.melati.poem.User;
import org.melati.poem.PoemThread;
import org.melati.util.Treeable;
import org.melati.util.EnumUtils;

/**
 * A <code>Contact</code> object, embellished from the original, 
 * Melati POEM generated, programmer modifiable stub.
 * 
 * <p> 
 * Description: 
 *   A Contact. 
 * </p>
 * 
 * <table> 
 * <tr><th colspan='3'>
 * Field summary for SQL table <code>Contact</code>
 * </th></tr>
 * <tr><th>Name</th><th>Type</th><th>Description</th></tr>
 * <tr><td> id </td><td> Integer </td><td> &nbsp; </td></tr> 
 * <tr><td> name </td><td> String </td><td> Contact Name </td></tr> 
 * <tr><td> owner </td><td> Contact </td><td> Contact who owns this contact 
 * </td></tr> 
 * <tr><td> address </td><td> String </td><td> Contact Address </td></tr> 
 * <tr><td> updates </td><td> Integer </td><td> How many times has this 
 * record been updated? </td></tr> 
 * <tr><td> lastupdated </td><td> Date </td><td> When was this last updated? 
 * </td></tr> 
 * <tr><td> lastupdateuser </td><td> User </td><td> Who last updated this? 
 * </td></tr> 
 * </table> 
 * 
 * @generator org.melati.poem.prepro.TableDef#generateMainJava 
 */
public class Contact extends ContactBase {

 /**
  * Constructor 
  * for a <code>Persistent</code> <code>Contact</code> object.
  * <p>
  * Description: 
  *   A Contact. 
  * </p>
  * 
  * @generator org.melati.poem.prepro.TableDef#generateMainJava 
  */
  public Contact() { }

  // programmer's domain-specific code here
  public boolean isIn(Category category) {
     ContactsDatabase db = (ContactsDatabase)getContactsDatabaseTables();
     String sql = db.quotedName("contact") + " = " + getTroid() + " AND " +
       db.quotedName("category") + " = " + category.getTroid();
     return db.getContactCategoryTable().exists(sql);
  }
  
    protected void writeLock() {
      super.writeLock();
      setLastupdated_unsafe(new java.sql.Date(new java.util.Date().getTime()));
      setLastupdateuser_unsafe(((User)PoemThread.accessToken()).getTroid());
      Integer count = getUpdates();
      if (count == null) count = new Integer(0);
      setUpdates_unsafe(new Integer(count.intValue()+1));
    }
    

  public String getLogicalDatabase
  (MelatiContext melatiContext, String logicalDatabase) {
    return "contacts";
  }
    
  public Treeable[] getChildren() {
    return (Contact.arrayOf(getContactTable().getOwnerColumn().
                                                   selectionWhereEq(troid())));
  }
  
  public static Treeable[] arrayOf(Vector v) {
    Treeable[] arr;
    synchronized (v) {
      arr = new Treeable[v.size()];
      v.copyInto(arr);
    }

    return arr;
  }

  public static Treeable[] arrayOf(Enumeration e) {
    Vector v = EnumUtils.vectorOf(e);
    return arrayOf(v);
  }

}
