// Do not edit this file!  It was generated by Melati Poem's DSD preprocessor.

package org.melati.poem;

public class CapabilityTableBase extends Table {

  private Column col_id = null;
  private Column col_name = null;

  public CapabilityTableBase(Database database, String name) throws PoemException {
    super(database, name, DefinitionSource.dsd);
  }

  protected void init() throws PoemException {
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((CapabilityData)data).id;
          }

          public void setIdent(Data data, Object ident) {
            ((CapabilityData)data).id = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Capability)g).getId();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((Capability)g).setId((Integer)value);
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((Capability)g).getId();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((Capability)g).setId((Integer)ident);
          }
        });

    defineColumn(col_name =
        new Column(this, "name", new StringPoemType(false, 60), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (String)((CapabilityData)data).name;
          }

          public void setIdent(Data data, Object ident) {
            ((CapabilityData)data).name = (String)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Capability)g).getName();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((Capability)g).setName((String)value);
          }

          protected boolean defaultPrimaryDisplay() {
            return true;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(0);
          }

          protected String defaultDisplayName() {
            return "Name";
          }

          protected String defaultDescription() {
            return "A human-readable name for the capability";
          }

          protected boolean defaultUnique() {
            return false;
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((Capability)g).getName();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((Capability)g).setName((String)ident);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getNameColumn() {
    return col_name;
  }

  public Capability getCapabilityObject(Integer troid) {
    return (Capability)getObject(troid);
  }

  public Capability getCapabilityObject(int troid) {
    return (Capability)getObject(troid);
  }

  protected Persistent newPersistent() {
    return new Capability();
  }

  protected Data _newData() {
    return new CapabilityData();
  }
  protected String defaultDescription() {
    return "A capability which users can be required to possess before accessing data";
  }

}
