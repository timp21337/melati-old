/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2000 Tim Joyce
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
 *     Tim Joyce <timj@paneris.org>
 */

package org.melati.template.webmacro;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import org.melati.util.MelatiWriter;

import org.webmacro.FastWriter;

/**
 * This provides an interface for objects that output from melati
 */

public class MelatiFastWriter extends MelatiWriter {

  protected OutputStream outputStream;
  
  public MelatiFastWriter(HttpServletResponse response) 
      throws IOException {
    this(response.getOutputStream(), response.getCharacterEncoding());
  }
  
  public MelatiFastWriter(OutputStream output, String encoding)
      throws IOException {
    // need to make this accessable to subcalsses
    outputStream = output;
//    out = new FastWriter(output, encoding);
    out = FastWriter.getInstance(output, encoding);
  }

  public FastWriter getPeer() {
    // as we can write to the underlying peer, the Flusher may not get started
    // so we should start it here
    startFlushing();
    return (FastWriter)out;
  }

   public static void main(String arg[]) {

      System.out.println("----START----");
      try {
         MelatiFastWriter fw = new MelatiFastWriter(System.out, "UTF8");
         for (int i = 0; i < arg.length; i++) {
            fw.write(arg[i].toCharArray());
         }
         fw.flush();
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println("----DONE----");

   }

}
