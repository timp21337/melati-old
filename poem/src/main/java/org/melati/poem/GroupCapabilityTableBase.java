// Do not edit this file!  It was generated by Melati Poem's DSD preprocessor.

package org.melati.poem;

public class GroupCapabilityTableBase extends Table {

  private Column col_id = null;
  private Column col_group = null;
  private Column col_capability = null;

  public GroupCapabilityTableBase(Database database, String name) throws PoemException {
    super(database, name, DefinitionSource.dsd);
  }

  protected void init() throws PoemException {
    defineColumn(col_id =
        new Column(this, "id", TroidPoemType.it, DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((GroupCapabilityData)data).id;
          }

          public void setIdent(Data data, Object ident) {
            ((GroupCapabilityData)data).id = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupCapability)g).getId();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((GroupCapability)g).setId((Integer)value);
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getId();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((GroupCapability)g).setId((Integer)ident);
          }
        });

    defineColumn(col_group =
        new Column(this, "group", new ReferencePoemType(getDatabase().getGroupTable(), false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((GroupCapabilityData)data).group;
          }

          public void setIdent(Data data, Object ident) {
            ((GroupCapabilityData)data).group = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupCapability)g).getGroup();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((GroupCapability)g).setGroup((Group)value);
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getGroupTroid();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((GroupCapability)g).setGroupTroid((Integer)ident);
          }
        });

    defineColumn(col_capability =
        new Column(this, "capability", new ReferencePoemType(getDatabase().getCapabilityTable(), false), DefinitionSource.dsd) { 
          public Object getIdent(Data data) {
            return (Integer)((GroupCapabilityData)data).capability;
          }

          public void setIdent(Data data, Object ident) {
            ((GroupCapabilityData)data).capability = (Integer)ident;
          }

          public Object getValue(Persistent g)
              throws AccessPoemException, PoemException {
            return ((GroupCapability)g).getCapability();
          }

          public void setValue(Persistent g, Object value)
              throws AccessPoemException, ValidationPoemException {
            ((GroupCapability)g).setCapability((Capability)value);
          }

          public Object getIdent(Persistent g)
              throws AccessPoemException {
            return ((GroupCapability)g).getCapabilityTroid();
          }

          public void setIdent(Persistent g, Object ident)
              throws AccessPoemException {
            ((GroupCapability)g).setCapabilityTroid((Integer)ident);
          }
        });
  }

  public final Column getIdColumn() {
    return col_id;
  }

  public final Column getGroupColumn() {
    return col_group;
  }

  public final Column getCapabilityColumn() {
    return col_capability;
  }

  public GroupCapability getGroupCapabilityObject(Integer troid) {
    return (GroupCapability)getObject(troid);
  }

  public GroupCapability getGroupCapabilityObject(int troid) {
    return (GroupCapability)getObject(troid);
  }

  protected Persistent newPersistent() {
    return new GroupCapability();
  }

  protected Data _newData() {
    return new GroupCapabilityData();
  }
}
