package org.melati.poem.odmg.playing;

import org.odmg.*;

public class PlayingTest
{
  public static final void main(String[] argsIn)
    throws Exception
  {
    System.out.println("PlayingTest started:");

    Database db = org.melati.poem.odmg.ODMGFactory.getNewDatabase();

    Transaction tx = org.melati.poem.odmg.ODMGFactory.getNewTransaction(db);
    tx.begin();

    DCollection parents = (DCollection) db.lookup("Parent");

    Parent p = new Parent();
    p.setName("parent-"+parents.size());
    System.out.println("Adding parent: "+p.getName());
    
    parents.add(p);

    tx.commit();
    
    System.out.println("PlayingTest done:");
  }
}
