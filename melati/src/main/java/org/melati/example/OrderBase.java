// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.doc.example;

import org.melati.poem.*;

public class OrderBase extends Persistent {

  public final OrderData dataSnapshot()
      throws AccessPoemException {
    return (OrderData)_dataSnapshot();
  }

  protected final OrderData dataForReading()
      throws AccessPoemException {
    return (OrderData)_dataForReading();
  }

  protected final OrderData dataForWriting()
      throws AccessPoemException {
    return (OrderData)_dataForWriting();
  }

  public OrderTable getOrderTable() {
    return (OrderTable)getTable();
  }

  public Integer getId()
      throws AccessPoemException {
    return dataForReading().id;
  }

  public void setId(Integer value)
      throws AccessPoemException, ValidationPoemException {
    getOrderTable().getIdColumn().getType().assertValidValue(value);
    dataForWriting().id = value;
  }

  public final void setId(int value)
      throws AccessPoemException, ValidationPoemException {
    setId(new Integer(value));
  }

  public final Field getIdField() throws AccessPoemException {
    return getOrderTable().getIdColumn().asField(this);
  }

  public Integer getBuyerTroid()
      throws AccessPoemException {
    return dataForReading().buyer;
  }

  public void setBuyerTroid(Integer ident)
      throws AccessPoemException {
    dataForWriting().buyer = ident;
  }

  public Buyer getBuyer()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getBuyerTroid();
    return troid == null ? null :
        ((ExampleDatabase)getDatabase()).getBuyerTable().getBuyerObject(troid);
  }

  public void setBuyer(Buyer value)
      throws AccessPoemException {
    setBuyerTroid(value == null ? null : value.troid());
  }

  public final Field getBuyerField() throws AccessPoemException {
    return getOrderTable().getBuyerColumn().asField(this);
  }

  public Integer getProductTroid()
      throws AccessPoemException {
    return dataForReading().product;
  }

  public void setProductTroid(Integer ident)
      throws AccessPoemException {
    dataForWriting().product = ident;
  }

  public Product getProduct()
      throws AccessPoemException, NoSuchRowPoemException {
    Integer troid = getProductTroid();
    return troid == null ? null :
        ((ExampleDatabase)getDatabase()).getProductTable().getProductObject(troid);
  }

  public void setProduct(Product value)
      throws AccessPoemException {
    setProductTroid(value == null ? null : value.troid());
  }

  public final Field getProductField() throws AccessPoemException {
    return getOrderTable().getProductColumn().asField(this);
  }

  public Boolean getUrgent()
      throws AccessPoemException {
    return dataForReading().urgent;
  }

  public void setUrgent(Boolean value)
      throws AccessPoemException, ValidationPoemException {
    getOrderTable().getUrgentColumn().getType().assertValidValue(value);
    dataForWriting().urgent = value;
  }

  public final void setUrgent(boolean value)
      throws AccessPoemException, ValidationPoemException {
    setUrgent(value ? Boolean.TRUE : Boolean.FALSE);
  }

  public final Field getUrgentField() throws AccessPoemException {
    return getOrderTable().getUrgentColumn().asField(this);
  }
}
