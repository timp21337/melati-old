package org.melati.poem;

public class TableInfo extends TableInfoBase {
  protected void assertCanRead(Data data, AccessToken token) {}

  public void setName(String name) {
    if (getName() != null)
      throw new TableRenamePoemException(name);
    super.setName(name);
  }

  public String displayString() throws AccessPoemException {
    return getDisplayname();
  }
}
