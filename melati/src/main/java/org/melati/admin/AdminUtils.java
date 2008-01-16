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
package org.melati.admin;


import org.melati.Melati;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Field;
import org.melati.poem.Persistent;
import org.melati.poem.Table;
import org.melati.poem.Treeable;
import org.melati.poem.util.ArrayUtils;
import org.melati.template.MarkupLanguage;
import org.melati.util.HttpServletRequestCompat;
import org.melati.util.JSStaticTree;
import org.melati.util.Tree;

/**
 * A utility object for placing in a <code>ServletTemplateContext</code>.
 */
public class AdminUtils {
  
  private String contextPath;
  private String servletUrl;
  private String staticURL;
  private String logicalDatabase;
  
  /**
   *  Constructor. 
   */
  public AdminUtils(Melati melati) {
    this(melati.getRequest() == null ? null : HttpServletRequestCompat.getContextPath(melati.getRequest()),
         melati.getRequest() == null ? null : melati.getRequest().getServletPath(),
         melati.getConfig().getStaticURL() ,
         melati.getPoemContext().getLogicalDatabase());    
  }

  /**
   *  Constructor. 
   */
  private AdminUtils(String contextPath, String servlet, 
                    String staticURL, String logicalDatabase) {
    this.contextPath = contextPath;
    this.servletUrl = contextPath + servlet;
    this.staticURL = staticURL;
    this.logicalDatabase = logicalDatabase;
    // HACK if we are using 2.0 Servlet API then zone is
    // included in servlet and contextPath is null
    if (contextPath == "") {
      this.contextPath = servlet.substring(0, servlet.lastIndexOf("/"));
    }
  }
  
  /**
   * @return the stylesheet for screen media  
   */
  public String getScreenStylesheetURL() { 
    return staticURL + "/admin.css";
  }
  
  /**
   * @param melati the melati
   * @param name of template
   * @return name prepended with ldb, table and troid if not null
   */
  public String getURL(Melati melati, String name) { 
    String url = servletUrl + "/" + logicalDatabase;
    if (melati.getTable() != null)
      url += "/" + melati.getTable().getName();
    if (melati.getObject() != null)
      url += "/" + melati.getObject().getTroid();
    return url + "/" + name;
  }
  
  
  /** @return The Main URL. */
  public String MainURL(String ld) {
    String url = servletUrl + "/" + ld;
    return url + "/Main";
  }
  
  /** @return The Top URL. */
  public String TopURL(Melati melati) {
    String url = servletUrl + "/" + logicalDatabase;
    if (melati.getTable() != null)
      url += "/" + melati.getTable().getName();
    if (melati.getObject() != null)
      url += "/" + melati.getObject().getTroid();
    return url + "/Top";
  }
  
  /**
   * @return The Bottom URL.
   */
  public String BottomURL(Table table, Melati melati) {
    return  servletUrl + "/" + logicalDatabase + 
        "/" + table.getName() +
        (melati.getObject() != null && melati.getTable() != null && 
            melati.getTable() == table ? "/" + melati.getObject().getTroid() : "") + 
        "/Bottom";
  }
  /**
   * @return The Left URL.
   */
  public String LeftURL(Melati melati) {
    return servletUrl + "/" + logicalDatabase + 
        "/" + melati.getTable().getName() + 
        (melati.getObject() == null ? "" : "/" + melati.getObject().getTroid()) + 
        "/Left";
  }
  
  /**
   * @return The Right URL.
   */
  public String RightURL(Persistent object) throws AccessPoemException {
    return servletUrl + "/" + logicalDatabase + "/" + object.getTable().getName()
            + "/" + object.troid() + "/Right";
  }

  /**
   * @return The Right URL.
   */
  public String RightURL(Melati melati) throws AccessPoemException {
    return servletUrl + "/" + logicalDatabase + 
    (melati.getTable() == null ? "" : "/" + melati.getTable().getName()) + 
    (melati.getObject() == null ? "" : "/" + melati.getObject().getTroid()) + 
        "/Right";
  }

  /**
   * @return The Primary Select URL.
   */
  public String PrimarySelectURL(Melati melati) {
    return servletUrl + "/" + logicalDatabase + "/" + 
        melati.getTable().getName() + 
        (melati.getObject() == null ? "" : "/" + melati.getObject().getTroid()) + 
        "/PrimarySelect";
  }

  /**
   * @return The Selection URL.
   */
  public String SelectionURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            + "/Selection";
  }
  
  /**
   * @return The Selection Right URL.
   */
  public String SelectionRightURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            + "/SelectionRight";
  }

  /**
   * @return The Navigation URL.
   */
  public String NavigationURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            + "/Navigation";
  }
  
  /**
   * @return The Edit Header URL.
   */
  public String EditHeaderURL(Melati melati) throws AccessPoemException {
    if (melati.getObject() == null )
      return staticURL + "/blank.html";
    else
      return servletUrl + "/" + logicalDatabase + "/" + melati.getTable().getName()
            + "/" + melati.getObject().troid() + "/EditHeader";
  }

  /**
   * @return The Edit URL.
   */
  public String EditURL(Melati melati) throws AccessPoemException {
    if (melati.getObject() == null )
      return staticURL + "/blank.html";
    else
      return servletUrl + "/" + logicalDatabase + "/" + melati.getTable().getName()
            + "/" + melati.getObject().troid() + "/Edit";
  }

  /**
   * @return The Tree URL.
   */
  public String TreeURL(Persistent object) throws AccessPoemException {
    return servletUrl + "/" + logicalDatabase + "/" + object.getTable().getName()
            + "/" + object.troid() + "/Tree";
  }
  
  /**
   * @return The Tree URL.
   */
  public String TreeURL(Table table) throws AccessPoemException {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            +  "/Tree";
  }
  
  /**
   * @return The Tree Control URL.
   */
  public String TreeControlURL(Persistent object) throws AccessPoemException {
    return servletUrl + "/" + logicalDatabase + "/" + object.getTable().getName()
            + "/" + object.troid() + "/TreeControl";
  }

  /**
   * @return The Add URL.
   */
  public String AddURL(Table table) throws AccessPoemException {
    return servletUrl
            + "/"
            + logicalDatabase
            + "/"
            + (table instanceof org.melati.poem.ColumnInfoTable ? Admin.METHOD_CREATE_COLUMN
                    : table instanceof org.melati.poem.TableInfoTable ? Admin.METHOD_CREATE_TABLE
                            : table.getName() + "/" + Admin.METHOD_ADD_RECORD);
  }

  /**
   * @return The Popup URL.
   */
  public String PopUpURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName() + "/PopUp";
  }
  
  /**
   * @return The Selection Window URL.
   */
  public String SelectionWindowURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            + "/SelectionWindow";
  }

  /**
   * @return The Selection Window Primary Select URL.
   */
  public String SelectionWindowPrimarySelectURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            + "/SelectionWindowPrimarySelect";
  }

  /**
   * @return The Selection Window Selection URL.
   */
  public String SelectionWindowSelectionURL(Table table) {
    return servletUrl + "/" + logicalDatabase + "/" + table.getName()
            + "/SelectionWindowSelection";
  }
  
  /**
   * @return The Status URL.
   */
  public String StatusURL() {
    return contextPath + "/org.melati.admin.Status/" + logicalDatabase;
  }
  
  /**
   * @return The Session Analysis URL.
   */
  public String SessionURL() {
    return contextPath + "/org.melati.test.SessionAnalysisServlet";
  }
  
  /**
   * @return The URL for DSD generation. 
   */
  public String DsdURL() {
    return servletUrl + "/" + logicalDatabase + "/DSD";
  }
  
  /**
   * In an insert situation we will not have a Troid, so cannot pass it through.
   * If your upload handler depends on having a persistent, then you should
   * override your upload template so that it prevents uploading in an insert
   * situation.
   * 
   * @param table table object belongs to
   * @param object the Persistent we are dealing with
   * @param field the upload field
   * @return Upload Url
   */
  public String UploadURL(Table table, Persistent object, Field field) {
    return upload(table, object) + "/Upload?field=" + field.getName();
  }
  
  /**
   * Upload URL.
   * 
   * @param table table object belongs to
   * @param object the Persistent we are dealing with
   * @param field the upload field
   * @return Upload done URL
   */
  public String UploadHandlerURL(Table table, Persistent object, String field) {
    return upload(table, object) + "/UploadDone?field=" + field;
  }
  private String upload(Table table, Persistent object) {
    String url = servletUrl + "/" + logicalDatabase + "/" + table.getName();
    if (object != null)
      url += "/" + object.troid();
    return url;
  }
  
 
  /**
   * Render the specials directly to the output.
   *  
   * FIXME No longer rendering directly
   * 
   * @param melati the Melati
   * @param ml The MarkupLanguage we are using
   * @param object a Persistent to render the specials of 
   * @return an empty String
   * @throws Exception maybe
   */
  public String specialFacilities(Melati melati, MarkupLanguage ml,
          Persistent object) throws Exception {
  if (object instanceof AdminSpecialised)
    melati.getTemplateEngine().expandTemplate(melati.getWriter(),
          ((AdminSpecialised) object).adminSpecialFacilities(melati, ml),
          melati.getTemplateContext());
  return "";
  /*
  if (object instanceof AdminSpecialised)
      return melati.getTemplateEngine().expandedTemplate(
          melati.getTemplateEngine().template(
              ((AdminSpecialised) object).adminSpecialFacilities(melati, ml)),
              melati.getTemplateContext());
    else 
      return "";
    */
  }

  /**
   * @return Defaults to /MelatiStatic/admin
   */
  public String getStaticURL() {
    return staticURL;
  }

  /**
   *  Create a tree. 
   * @param node  a tree node
   * @return a tree with node as its root
   */
  public JSStaticTree createTree(Treeable node) {
    return new JSStaticTree(new Tree(node), getStaticURL());
  }
  
  /**
   *  Create a tree. 
   * @param node  a tree node
   * @return a tree with node as its root
   */
  public JSStaticTree createForest(Table table) {
    Object[] kids = ArrayUtils.arrayOf(table.selection());
    Treeable[] children = new Treeable[kids.length];
    for (int i = 0; i < kids.length; i++) {
      children[i] = (Treeable)kids[i];
    }
    return new JSStaticTree(children, getStaticURL());
  }
  
}
