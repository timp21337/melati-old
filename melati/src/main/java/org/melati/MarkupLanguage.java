package org.melati;

import org.webmacro.engine.*;
import org.webmacro.resource.*;
import org.webmacro.servlet.*;
import org.webmacro.broker.*;
import org.melati.poem.*;
import java.io.*;

public abstract class MarkupLanguage {

  private String name;
  private WebContext webContext;

  public MarkupLanguage(String name, WebContext webContext) {
    this.name = name;
    this.webContext = webContext;
  }

  public String getName() {
    return name;
  }

  public abstract String rendered(String s);

  // 
  // =========
  //  Widgets
  // =========
  // 

  protected String defaultTempletName(BooleanPoemType type) {
    return "tickbox.wm";
  }

  protected String defaultTempletName(StringPoemType type) {
    return type.getHeight() > 1 ? "textarea-String.wm" : "textfield-String.wm";
  }

  protected String defaultTempletName(IntegerPoemType type) {
    return "textfield-Integer.wm";
  }

  protected String defaultTempletName(DoublePoemType type) {
    return "textfield-Double.wm";
  }

  protected String defaultTempletName(ReferencePoemType type) {
    return "reference.wm";
  }

  protected String defaultTempletName(PoemType type)
      throws UnsupportedTypeException {
    // FIXME do something more OO, or would that be a bit laboured?
    if (type instanceof TroidPoemType)
      return defaultTempletName((TroidPoemType)type);
    else if (type instanceof ReferencePoemType)
      return defaultTempletName((ReferencePoemType)type);
    else if (type instanceof BooleanPoemType)
      return defaultTempletName((BooleanPoemType)type);
    else if (type instanceof IntegerPoemType)
      return defaultTempletName((IntegerPoemType)type);
    else if (type instanceof StringPoemType)
      return defaultTempletName((StringPoemType)type);
    else if (type instanceof DoublePoemType)
      return defaultTempletName((DoublePoemType)type);
    else
      throw new UnsupportedTypeException(this, type);
  }

  protected String templetsPath() {
    return "templets" + File.separatorChar + getName();
  }

  protected String templetPath(Field field)
      throws UnsupportedTypeException {
    return
        templetsPath() + File.separatorChar +
            (field.getRenderInfo() == null
               ? defaultTempletName(field.getType())
               : field.getRenderInfo());
  }

  public String input(Field field)
      throws ResourceUnavailableException, UnsupportedTypeException {
    Template templet =
        (Template)webContext.getBroker().getValue(TemplateProvider.TYPE,
                                                  templetPath(field));
    webContext.put("obj", field);
    try {
      return (String)templet.evaluate(webContext);
    }
    finally {
      webContext.remove("obj");
    }
  } 
}
