// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.doc.example;

import org.melati.poem.*;

public class ProductTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;
  private Column col_price = null;

  public ProductTableBase(Database database, String name) throws PoemException {
    super(database, name, DefinitionSource.dsd);
  }

  protected void init() throws PoemException {
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Product)g).getId();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((Product)g).setId((Integer)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected int defaultDisplayOrder() {
            return 0;
          }

          public Object getIdent_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Product)g).getId_unsafe();
          }

          public void setIdent_unsafe(Persistent g, Object ident)
              throws AccessPoemException {
            ((Product)g).setId_unsafe((Integer)ident);
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((Product)g).getId();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((Product)g).setId((Integer)ident);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 25), DefinitionSource.dsd) { 
          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Product)g).getName();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((Product)g).setName((String)value);
          }

          protected boolean defaultPrimaryDisplay() {
            return true;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected int defaultDisplayOrder() {
            return 1;
          }

          protected String defaultDescription() {
            return "The product's name";
          }

          protected boolean defaultUnique() {
            return true;
          }

          public Object getIdent_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Product)g).getName_unsafe();
          }

          public void setIdent_unsafe(Persistent g, Object ident)
              throws AccessPoemException {
            ((Product)g).setName_unsafe((String)ident);
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((Product)g).getName();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((Product)g).setName((String)ident);
          }
        });

    defineColumn(col_price =
        new Column(this, "price", new DoublePoemType(false), DefinitionSource.dsd) { 
          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Product)g).getPrice();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((Product)g).setPrice((Double)value);
          }

          protected int defaultDisplayOrder() {
            return 2;
          }

          protected String defaultDescription() {
            return "The product's price";
          }

          public Object getIdent_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Product)g).getPrice_unsafe();
          }

          public void setIdent_unsafe(Persistent g, Object ident)
              throws AccessPoemException {
            ((Product)g).setPrice_unsafe((Double)ident);
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((Product)g).getPrice();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((Product)g).setPrice((Double)ident);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public final Column getPriceColumn() {
    return col_price;
  }

  public Product getProductObject(Integer troid) {
    return (Product)getObject(troid);
  }

  public Product getProductObject(int troid) {
    return (Product)getObject(troid);
  }

  protected Persistent _newPersistent() {
    return new Product();
  }
  protected String defaultDescription() {
    return "A product";
  }

  protected int defaultDisplayOrder() {
    return 2;
  }
}
