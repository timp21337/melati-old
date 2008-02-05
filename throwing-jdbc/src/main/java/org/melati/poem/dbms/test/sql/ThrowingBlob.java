/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2008 Tim Pizey
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
 *     Tim Pizey <timp At paneris.org>
 *     http://paneris.org/~timp
 */

package org.melati.poem.dbms.test.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;

/**
 * @author timp
 * @since 5 Feb 2008
 *
 */
public class ThrowingBlob extends Thrower implements Blob {

  final static String className = ThrowingBlob.class.getName() + ".";
  
  public static void startThrowing(String methodName) {
    Thrower.startThrowing(className  +  methodName);
  }
  public static void startThrowingAfter(String methodName, int goes) {
    Thrower.startThrowingAfter(className  +  methodName, goes);
  }
  public static void stopThrowing(String methodName) {
    Thrower.stopThrowing(className  +  methodName);
  }
  public static boolean shouldThrow(String methodName) { 
    return Thrower.shouldThrow(className  +  methodName);
  }

  Blob it = null;
  

  /**
   * Constructor.
   */
  public ThrowingBlob(Blob b) {
    it = b;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#free()
   */
  @Override
  public void free() throws SQLException {
    if (shouldThrow("free"))
      throw new SQLException("Blob bombed");
    it.free();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#getBinaryStream()
   */
  @Override
  public InputStream getBinaryStream() throws SQLException {
    if (shouldThrow("getBinaryStream"))
      throw new SQLException("Blob bombed");
    return it.getBinaryStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#getBinaryStream(long, long)
   */
  @Override
  public InputStream getBinaryStream(long pos, long length) throws SQLException {
    if (shouldThrow("getBinaryStream"))
      throw new SQLException("Blob bombed");
    return it.getBinaryStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#getBytes(long, int)
   */
  @Override
  public byte[] getBytes(long pos, int length) throws SQLException {
    if (shouldThrow("getBytes"))
      throw new SQLException("Blob bombed");
    return it.getBytes(pos, length);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#length()
   */
  @Override
  public long length() throws SQLException {
    if (shouldThrow("length"))
      throw new SQLException("Blob bombed");
    return it.length();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#position(byte[], long)
   */
  @Override
  public long position(byte[] pattern, long start) throws SQLException {
    if (shouldThrow("position"))
      throw new SQLException("Blob bombed");
    return it.position(pattern, start);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#position(java.sql.Blob, long)
   */
  @Override
  public long position(Blob pattern, long start) throws SQLException {
    if (shouldThrow("position"))
      throw new SQLException("Blob bombed");
    return it.position(pattern, start);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#setBinaryStream(long)
   */
  @Override
  public OutputStream setBinaryStream(long pos) throws SQLException {
    if (shouldThrow("setBinaryStream"))
      throw new SQLException("Blob bombed");
    return it.setBinaryStream(pos);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#setBytes(long, byte[])
   */
  @Override
  public int setBytes(long pos, byte[] bytes) throws SQLException {
    if (shouldThrow("setBytes"))
      throw new SQLException("Blob bombed");
    return it.setBytes(pos, bytes);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#setBytes(long, byte[], int, int)
   */
  @Override
  public int setBytes(long pos, byte[] bytes, int offset, int len)
          throws SQLException {
    if (shouldThrow("setBytes"))
      throw new SQLException("Blob bombed");
    return it.setBytes(pos, bytes, offset, len);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#truncate(long)
   */
  @Override
  public void truncate(long len) throws SQLException {
    if (shouldThrow("truncate"))
      throw new SQLException("Blob bombed");
    it.truncate(len);
  }

}
