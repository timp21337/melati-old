/**
 * 
 */
package org.melati.poem.test.throwing;

import java.util.Properties;

import org.melati.poem.Database;
import org.melati.poem.PoemDatabaseFactory;
import org.melati.poem.PreparedSQLSeriousPoemException;
import org.melati.poem.SQLPoemException;
import org.melati.poem.dbms.test.ThrowingConnection;
import org.melati.poem.dbms.test.ThrowingPreparedStatement;

/**
 * @author timp
 * @since 10 Feb 2007
 * 
 */
public class PreparedStatementFactoryTest extends
    org.melati.poem.test.PreparedStatementFactoryTest {

  /**
   * @param name
   */
  public PreparedStatementFactoryTest(String name) {
    super(name);
  }

  public Database getDatabase(String name) {
    Properties defs = databaseDefs();
    String pref = "org.melati.poem.test.PoemTestCase." + name + ".";
    maxTrans = new Integer(getOrDie(defs, pref + "maxtransactions")).intValue();
    return PoemDatabaseFactory.getDatabase(name, getOrDie(defs, pref + "url"),
        getOrDie(defs, pref + "user"), getOrDie(defs, pref + "password"),
        getOrDie(defs, pref + "class"),
        "org.melati.poem.dbms.test.HsqldbThrower", new Boolean(getOrDie(defs,
            pref + "addconstraints")).booleanValue(), new Boolean(getOrDie(
            defs, pref + "logsql")).booleanValue(), new Boolean(getOrDie(defs,
            pref + "logcommits")).booleanValue(), maxTrans);
  }

  public void testGet() {
    super.testGet();
  }

  public void testPreparedStatement() throws Exception {
    ThrowingConnection.startThrowing("prepareStatement");
    try {
      super.testPreparedStatement();
    } catch (SQLPoemException e) {
      assertEquals("Connection bombed", e.innermostException().getMessage());
    }
    ThrowingConnection.stopThrowing("prepareStatement");
  }

  public void testPreparedStatementFactory() {
    super.testPreparedStatementFactory();
  }

  public void testPreparedStatementPoemTransaction() {
    super.testPreparedStatementPoemTransaction();
  }

  public void testResultSet() throws Exception {
    ThrowingPreparedStatement.startThrowing("executeQuery");
    try {
      super.testResultSet();
    } catch (PreparedSQLSeriousPoemException e) {
      assertEquals("PreparedStatement bombed", e.innermostException().getMessage());
    }
    ThrowingPreparedStatement.stopThrowing("executeQuery");
  }

}
  