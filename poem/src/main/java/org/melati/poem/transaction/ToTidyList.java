package org.melati.util;

import java.util.*;
import java.io.*;

public class ToTidyList {

  private Vector objects = new Vector();

  private static void tidy(Object o) {
    try {
      if (o instanceof Reader)
        ((Reader)o).close();
      else if (o instanceof Writer)
        ((Writer)o).close();
      else if (o instanceof InputStream)
        ((InputStream)o).close();
      else if (o instanceof OutputStream)
        ((OutputStream)o).close();
    }
    catch (Exception e) {}
  }

  public synchronized void close() {
    for (int i = objects.size() - 1; i >= 0; --i)
      tidy(objects.elementAt(i));

    objects.setSize(0);
  }

  private void addObject(Object o) {
    objects.addElement(o);
  }

  public void add(Reader o) {
    addObject(o);
  } 

  public void add(Writer o) {
    addObject(o);
  } 

  public void add(InputStream o) {
    addObject(o);
  } 

  public void add(OutputStream o) {
    addObject(o);
  } 
}
