package org.melati.poem.odmg.playing;

import org.odmg.*;
import java.util.*;

public class PlayingTest
{
  public static final void main(String[] argsIn)
    throws Exception
  {
    System.out.println("PlayingTest started:");

    Database db = org.melati.poem.odmg.ODMGFactory.getNewDatabase();
    System.out.println("Got a db = "+db);

    db.open("odmgplaying",Database.OPEN_READ_WRITE);

    Transaction tx = org.melati.poem.odmg.ODMGFactory.getNewTransaction(db);
    tx.begin();

    DCollection parents = (DCollection) db.lookup("parent");

    //clear out old crap
    parents.removeAll(parents);

    System.out.println("ADDING PARENTS");
    for (int i=0; i<10; i++)
    {
      Parent p = newParent();
      p.setName("parent-"+parents.size());
      System.out.println("Adding parent: "+p.getName()); 
      parents.add(p);
    }

    System.out.println("PARENTS DESCENDING");
    Iterator iter = parents.select("order by name desc");
    while (iter.hasNext())
    {
      Parent p = (Parent)iter.next();
      System.out.println("Parent:"+p.getName());
    }

    System.out.println("PARENTS UNDER 5 ASCENDING");
    iter = parents.select("where name<'parent-5' order by name asc");
    while (iter.hasNext())
    {
      Parent p = (Parent)iter.next();
      System.out.println("Parent:"+p.getName());
    }

    System.out.println("PARENTS UNDER 3 BARE");
    iter = parents.select("name<'parent-3'");
    while (iter.hasNext())
    {
      Parent p = (Parent)iter.next();
      System.out.println("Parent:"+p.getName());
    }

    System.out.println("PARENTS UNDER 2 WITH WHERE KEYWORD");
    iter = parents.select("where name<'parent-2'");
    while (iter.hasNext())
    {
      Parent p = (Parent)iter.next();
      System.out.println("Parent:"+p.getName());
    }

    System.out.println("ALL PARENTS");
    iter = parents.select("");
    while (iter.hasNext())
    {
      Parent p = (Parent)iter.next();
      System.out.println("Parent:"+p.getName());
    }

    tx.commit();
    
    System.out.println("PlayingTest done:");
  }

  private static final Parent newParent()
    throws Exception
  {
    return (Parent)org.melati.poem.odmg.ODMGFactory.getPoemDatabase().getTable("parent").newPersistent();
  }

}
