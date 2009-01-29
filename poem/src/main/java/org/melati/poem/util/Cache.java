/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2000 William Chesters
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * Melati is free software; Permission is granted to copy, distribute
 * and/or modify this software under the terms either:
 *
 * a) the GNU General Public License as published by the Free Software
 *    Foundation; either version 2 of the License, or (at your option)
 *    any later version,
 *
 *    or
 *
 * b) any version of the Melati Software License, as published
 *    at http://melati.org
 *
 * You should have received a copy of the GNU General Public License and
 * the Melati Software License along with this program;
 * if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA to obtain the
 * GNU General Public License and visit http://melati.org to obtain the
 * Melati Software License.
 *
 * Feel free to contact the Developers of Melati (http://melati.org),
 * if you would like to work out a different arrangement than the options
 * outlined here.  It is our intention to allow Melati to be used by as
 * wide an audience as possible.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Contact details for copyright holder:
 *
 *     William Chesters <williamc At paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 */

package org.melati.poem.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import org.melati.poem.PoemException;

/**
 * A store of known objects.
 * 
 * The cache cannot contain nulls, as there would be no mechanism to 
 * distinguish between a held null value and an unheld value.
 */
public final class Cache {

 /** A <code>key:value</code> pair. */
  private interface Node {
    /** The key. */
    Object key();
    /** The value. */
    Object value();
  }

 /** A <code>node</code> in a linked list. */
  private static class HeldNode implements Node {
    Object key;
    Object value;
    HeldNode nextMRU = null; // Next Most Recently Used node
    HeldNode prevMRU = null; // Previous Most Recently Used node

    HeldNode(Object key, Object value) {
      this.key = key;
      this.value = value;
    }

    synchronized void putBefore(HeldNode nextMRU_P) {

      //
      // Before:
      //
      //   11 -A-> 00 -B-> 22      33 -E-> 44
      //   11 <-C- 00 <-D- 22      33 <-F- 44
      //
      // After:
      //
      //   11 -G-> 22              33 -I-> 00 -J-> 44
      //   11 <-H- 22              33 <-K- 00 <-L- 44
      //
      // What has to happen:
      //
      //   A => G if 1 exists
      //   B => J
      //   C => K
      //   D => H if 2 exists
      //   E => I if 3 exists
      //   F => L if 4 exists
      //

      if (this.nextMRU != null)                   // 2 exists
        this.nextMRU.prevMRU = prevMRU;           // D => H using C

      if (prevMRU != null)                        // 1 exists
        prevMRU.nextMRU = this.nextMRU;           // A => G using B

      if (nextMRU_P != null) {                    // 4 exists
        if (nextMRU_P.prevMRU != null)            // 3 exists
          nextMRU_P.prevMRU.nextMRU = this;       // E => I
        prevMRU = nextMRU_P.prevMRU;              // C => K using F
        nextMRU_P.prevMRU = this;                 // F => L
      }
      else
        prevMRU = null;                           // C => K
      this.nextMRU = nextMRU_P;                   // B => J
    }

    /**
     * {@inheritDoc}
     * @see org.melati.poem.util.Cache.Node#key()
     */
    public Object key() {
      return key;
    }

    /**
     * {@inheritDoc}
     * @see org.melati.poem.util.Cache.Node#value()
     */
    public Object value() {
      return value;
    }
  }

 /** A node that has been dropped. */
  private static class DroppedNode extends SoftReference implements Node {

    Object key;

    /**
     * Constructor.
     * @param key cache key
     * @param value Cache object
     * @param queue reference queue
     */
    DroppedNode(Object key, Object value, ReferenceQueue queue) {
      super(value, queue);
      this.key = key;
    }

    /**
     * {@inheritDoc}
     * @see org.melati.poem.util.Cache.Node#key()
     */
    public Object key() {
      return key;
    }

    /**
     * {@inheritDoc}
     * @see org.melati.poem.util.Cache.Node#value()
     */
    public Object value() {
      return this.get();
    }
  }

  private Hashtable table = new Hashtable();
  private HeldNode theMRU = null, theLRU = null;
  private int heldNodes = 0;
  private int maxSize;
  private int droppedEver = 0;

  private ReferenceQueue collectedValuesQueue = new ReferenceQueue();

  // invariants:
  //   if theMRU != null, theMRU.prevMRU == null
  //   if theLRU != null, theLRU.nextMRU == null
  //   following theMRU gives you the same elements as following theLRU
  //       in the opposite order
  //   everything in the[ML]RU is in table as a HeldNode, and vv.
  //   heldNodes == length of the[ML]RU

  /**
   * Thrown if one or more problems are discovered with cache consistency.
   */
  public class InconsistencyException extends PoemException {

    /**serialVersionUID */
    private static final long serialVersionUID = 1832694552964508864L;
    
    /** A Vector of problems. */
    public Vector probs;

    /** Constructor. */
    public InconsistencyException(Vector probs) {
      this.probs = probs;
    }

    /**
     * {@inheritDoc}
     */
    public String getMessage() {
      return EnumUtils.concatenated("\n", probs.elements());
    }
  }

  /**
   * @return a Vector of problematic nodes 
   */
  private Vector invariantBreaches() {
    Vector probs = new Vector();

    if (theMRU != null && theMRU.prevMRU != null)
      probs.addElement("theMRU.prevMRU == " + theMRU.prevMRU);
    if (theLRU != null && theLRU.nextMRU != null)
      probs.addElement("theLRU.nextMRU == " + theLRU.nextMRU);

    Object[] held = new Object[heldNodes];
    Hashtable heldHash = new Hashtable();

    int countML = 0;
    for (HeldNode n = theMRU; n != null; n = n.nextMRU, ++countML) {
      if (table.get(n.key()) != n)
        probs.addElement("table.get(" + n + ".key()) == " + table.get(n.key()));
      if (countML < heldNodes)
        held[countML] = n;
      heldHash.put(n, Boolean.TRUE);
    }

    if (countML != heldNodes)
      probs.addElement(countML + " nodes in MRU->LRU not " + heldNodes);

    Hashtable keys = new Hashtable();
    int countLM = 0;
    for (HeldNode n = theLRU; n != null; n = n.prevMRU, ++countLM) {
      HeldNode oldn = (HeldNode)keys.get(n.key());
      if (oldn != null)
        probs.addElement("key " + n.key() + " duplicated in " + n + " and " +
                         oldn);
      keys.put(n.key(), n);

      if (table.get(n.key()) != n)
        probs.addElement("table.get(" + n + ".key()) == " + table.get(n.key()));
      if (countLM < heldNodes) {
        int o = heldNodes - (1 + countLM);
        if (n != held[o])
          probs.addElement("lm[" + countLM + "] == " + n + " != ml[" +
                           o + "] == " + held[o]);
      }
    }

    for (Enumeration nodes = table.elements(); nodes.hasMoreElements();) {
      Node n = (Node)nodes.nextElement();
      if (n instanceof HeldNode && !heldHash.containsKey(n))
        probs.addElement(n + " in table but not MRU->LRU");
    }

    if (countLM != heldNodes)
      probs.addElement(countLM + " nodes in LRU->MRU not " + heldNodes);

    return probs;
  }

  private void assertInvariant() {
     Vector probs = invariantBreaches();
     if (probs.size() != 0)
       throw new InconsistencyException(probs);
  }

  /**
   * Constructor with maximum size.
   * @param maxSize maximum size cache may grow to 
   */
  public Cache(int maxSize) {
    setSize(maxSize);
  }

  /**
   * Set maximum size of Cache.
   * @param maxSize maximum size cache may grow to 
   */
  public void setSize(int maxSize) {
    if (maxSize < 0)
      throw new IllegalArgumentException();
    this.maxSize = maxSize;
  }

  /**
   * Get maximum size of Cache.
   */
  public int getSize() {
    return maxSize;
  }

  private synchronized void gc() {
    DroppedNode dropped;
    while ((dropped = (DroppedNode)collectedValuesQueue.poll()) != null) {
      table.remove(dropped.key);
      ++droppedEver;
    }
  }

  /**
   * Reduce number of units held in the cache, without changing 
   * its size.
   * 
   * This is intended for cache maintenance, enabling only the 
   * most frequently used items to remain in the cache, whilst 
   * the others are dropped. 
   * 
   * @param maxSizeP maximum number of units to hold 
   */
  public synchronized void trim(int maxSizeP) {
    gc();

    HeldNode n = theLRU;
    while (n != null && heldNodes > maxSizeP) {
      HeldNode nn = n.prevMRU;
      n.putBefore(null);
      table.put(n.key, new DroppedNode(n.key, n.value, collectedValuesQueue));
      --heldNodes;
      n = nn;
    }

    if (n == null) {
      theLRU = null;
      theMRU = null;
    } else
      theLRU = n;

    assertInvariant();
  }

  /**
   * Remove from cache.
   * 
   * If key is not in the cache then does nothing. 
   * 
   * @param key cache key field
   */
  public synchronized void delete(Object key) {
    Node n = (Node)table.get(key);
    if (n == null)
      return;

    if (n instanceof HeldNode) {
      HeldNode h = (HeldNode)n;

      if (theLRU == h)
        theLRU = h.prevMRU;
      if (theMRU == h)
        theMRU = h.nextMRU;

      h.putBefore(null);

      --heldNodes;
    }

    table.remove(key);

    assertInvariant();
  }

  /**
   * Add an Object to the cache. 
   * 
   * @param key the Object to use as a lookup
   * @param value the Object to put in the cache
   */
  public synchronized void put(Object key, Object value) {
    if (key == null || value == null)
      throw new NullPointerException();

    trim(maxSize);

    if (maxSize == 0)
      table.put(key, new DroppedNode(key, value, collectedValuesQueue));
    else {
      HeldNode node = new HeldNode(key, value);

      Object previous = table.put(key, node);
      if (previous != null) {
        // Return cache to previous state
        table.put(key, previous);
        throw new CacheDuplicationException();
      }

      node.putBefore(theMRU);
      theMRU = node;
      if (theLRU == null) theLRU = node;

      ++heldNodes;

      assertInvariant();
    }
  }

  /**
   * Return an object from the Cache, null if not found.
   * @param key the cache key
   * @return the object of null if not in cache
   */
  public synchronized Object get(Object key) {

    gc();

    Node node = (Node)table.get(key);
    if (node == null)
      return null;
    else {
      HeldNode held;
      if (node instanceof HeldNode) {
        held = (HeldNode)node;
        if (held != theMRU) {
          if (held == theLRU)
            theLRU = held.prevMRU;
          held.putBefore(theMRU);
          theMRU = held;
        }
      } else {
        held = new HeldNode(key, node.value());
        table.put(key, held);
        ++heldNodes;
        held.putBefore(theMRU);
        theMRU = held;
        if (theLRU == null)
          theLRU = held;
        trim(maxSize);
      }

      assertInvariant();
      return held.value;
    }
  }

  /**
   * Apply function to all items in cache.
   * @param f Procedure to apply to all members of cache
   */
  public synchronized void iterate(Procedure f) {
    gc();
    for (Enumeration n = table.elements(); n.hasMoreElements();) {
      Object value = ((Node)n.nextElement()).value();
      if (value != null)
        f.apply(value);
    }
  }

  /**
   * Retieve an Enumeration of items held.
   * @return  an Enumeration of items held
   */
  public Enumeration getReport() {
    return new ConsEnumeration(
               heldNodes + " held, " + table.size() + " total ",
               invariantBreaches().elements());
  }

  /**
   * A class which enables reporting upon the state of the <code>Cache</code>.
   */
  public final class Info {

    private Info() {}

    /**
     * @return an Enumeration of objects held
     */
    public Enumeration getHeldElements() {
      gc();
      return new MappedEnumeration(
          new FilteredEnumeration(table.elements()) {
            public boolean isIncluded(Object o) {
              return o instanceof HeldNode;
            }
          }) {
        public Object mapped(Object o) {
          return ((Node)o).value();
        }
      };
    }

    /**
     * @return an Enumeration of elements dropped from the cache
     */
    public Enumeration getDroppedElements() {
      gc();
      return new MappedEnumeration(
          new FilteredEnumeration(table.elements()) {
            public boolean isIncluded(Object o) {
              return o instanceof DroppedNode;
            }
          }) {
        public Object mapped(Object o) {
          return ((Node)o).value();
        }
      };
    }

    /**
     * @return an enumeration of held objects
     */
    public Enumeration getReport() {
      return Cache.this.getReport();
    }
  }

  /**
   * @return a new Info object
   */
  public Info getInfo() {
    return new Info();
  }

  /**
   * Dump to syserr.
   */
  public void dumpAnalysis() {
    for (Enumeration l = getReport(); l.hasMoreElements();)
      System.err.println(l.nextElement());
  }
}




