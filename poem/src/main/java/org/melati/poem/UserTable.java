/*
 * $Source$
 * $Revision$
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * -------------------------------------
 *  Copyright (C) 2000 William Chesters
 * -------------------------------------
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * A copy of the GPL should be in the file org/melati/COPYING in this tree.
 * Or see http://melati.org/License.html.
 *
 * Contact details for copyright holder:
 *
 *     William Chesters <williamc@paneris.org>
 *     http://paneris.org/~williamc
 *     Obrechtstraat 114, 2517VX Den Haag, The Netherlands
 *
 *
 * ------
 *  Note
 * ------
 *
 * I will assign copyright to PanEris (http://paneris.org) as soon as
 * we have sorted out what sort of legal existence we need to have for
 * that to make sense.  When WebMacro's "Simple Public License" is
 * finalised, we'll offer it as an alternative license for Melati.
 * In the meantime, if you want to use Melati on non-GPL terms,
 * contact me!
 */

package org.melati.poem;

import java.util.*;
import org.melati.util.*;
import java.sql.*;

public class UserTable extends UserTableBase {

  private User guestUser, administratorUser;
  // see below
  // private Capability canReadPasswords = new Capability("ReadPasswords");
  // private Capability canWritePasswords = new Capability("WritePasswords");

  public UserTable(Database database, String name) throws PoemException {
    this(database, name, DefinitionSource.dsd);
  }

  public UserTable(Database database, String name,
		   DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);

    guestUser = (User)newPersistent();
    guestUser.setLogin_unsafe("_guest_");
    guestUser.setPassword_unsafe("");
    guestUser.setName_unsafe("Melati guest user");

    administratorUser = (User)newPersistent();
    administratorUser.setLogin_unsafe("_administrator_");
    administratorUser.setPassword_unsafe("FIXME");
    administratorUser.setName_unsafe("Melati database administrator");
  }

  User guestUser() {
    return guestUser;
  }

  public User administratorUser() {
    return administratorUser;
  }

  public Capability canReadPasswords() {
    return getDatabase().administerCapability();
    // return canReadPasswords;
  }

  public Capability canWritePasswords() {
    return getDatabase().administerCapability();
    // return canWritePasswords;
  }

  synchronized void unifyWithDB(ResultSet colDescs)
      throws SQLException, PoemException {
    super.unifyWithDB(colDescs);
    guestUser = (User)getLoginColumn().ensure(guestUser);
    administratorUser = (User)getLoginColumn().ensure(administratorUser);
  }

  protected void postInitialise() {
    super.postInitialise();
    if (info.getDefaultcanwrite() == null)
      info.setDefaultcanwrite(getDatabase().administerCapability());
    if (info.getCancreate() == null)
      info.setCancreate(getDatabase().administerCapability());

    // see above

//     canReadPasswords =
//         (Capability)getDatabase().getCapabilityTable().getNameColumn().
//             ensure(canReadPasswords);
//     canWritePasswords =
//         (Capability)getDatabase().getCapabilityTable().getNameColumn().
//             ensure(canWritePasswords);
  }
}
