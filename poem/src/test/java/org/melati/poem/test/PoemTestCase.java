package org.melati.poem.test;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;

import org.melati.LogicalDatabase;
import org.melati.poem.AccessToken;
import org.melati.poem.PoemDatabase;
import org.melati.poem.PoemTask;
import org.melati.util.DatabaseInitException;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 * A TestCase that runs in a Database session.
 * 
 * @author timp
 * @since 19-May-2006
 */
public abstract class PoemTestCase extends TestCase implements Test {

  /**
   * the name of the test case
   */
  private String fName;

  private PoemDatabase db = null;

  private String dbName = "melatijunit";

  /**
   * Constructor.
   */
  public PoemTestCase() {
    super();
    fName = null;
    db = null;
  }

  /**
   * Constructor.
   * 
   * @param name
   */
  public PoemTestCase(String name) {
    super(name);
    fName = name;
    db = null;
  }

  /**
   * @see TestCase#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();
    setDb(getDbName());
    int count = 0;
    while (getDb().getCommittedConnection().isClosed() && count++ < 10) {
      System.err.println(count);
    }
  }

  /**
   * @see TestCase#tearDown()
   */
  protected void tearDown() throws Exception {
    String dbUrl = getDb().toString();
    Connection connection = getDb().getCommittedConnection();
    if (connection != null) {
      getDb().inSession(AccessToken.root, // HACK
          new PoemTask() {
            public void run() {
              try {
                 getDb().shutdown();
              } catch (Throwable e) {
                e.fillInStackTrace();
                throw new RuntimeException(e);
              }
            }
          });
      if (!connection.isClosed())
        connection.close();
    }
    if (getDb().getDbms() instanceof org.melati.poem.dbms.Hsqldb) {
      db = null;
      System.gc();
      String fileName = dbUrl.substring(12);
      int count = 0;
      while(! new File(fileName + ".script").delete() && count++ < 10 );
      count = 0;
      while(! new File(fileName + ".log").delete() && count++ < 10 );
      count = 0;
      while(! new File(fileName + ".data").delete() && count++ < 10 );
      count = 0;
      while(! new File(fileName + ".backup").delete() && count++ < 10 );
      count = 0;
      while(! new File(fileName + ".properties").delete() && count++ < 10 );
      System.err.println("should be gone");
    }
    db = null;
  }

  /**
   * Run the test in a session.
   * 
   * @see junit.framework.TestCase#runTest()
   */
  protected void runTest() throws Throwable {
    assertNotNull(fName);
    try {
      // use getMethod to get all public inherited
      // methods. getDeclaredMethods returns all
      // methods of this class but excludes the
      // inherited ones.
      final Method runMethod = getClass().getMethod(fName, null);
      if (!Modifier.isPublic(runMethod.getModifiers())) {
        fail("Method \"" + fName + "\" should be public");
      }
      // Ensures that we are invoking on
      // the object that method belongs to.
      final Object _this = this;
      getDb().inSession(AccessToken.root, // HACK
          new PoemTask() {
            public void run() {
              try {
                runMethod.invoke(_this, new Class[0]);
              } catch (Throwable e) {
                e.fillInStackTrace();
                throw new RuntimeException(e);
              }
            }
          });
    } catch (NoSuchMethodException e) {
      fail("Method \"" + fName + "\" not found");
    }
  }

  /**
   * Gets the name of a TestCase.
   * 
   * @return returns a String
   */
  public String getName() {
    return fName;
  }

  /**
   * Sets the name of a TestCase.
   * 
   * @param name
   *          The name to set
   */
  public void setName(String name) {
    fName = name;
  }

  /**
   * @return Returns the dbName.
   */
  protected String getDbName() {
    return dbName;
  }

  /**
   * @param dbName
   *          The dbName to set.
   */
  protected void setDbName(String dbName) {
    this.dbName = dbName;
  }

  /**
   * @return Returns the db.
   */
  public PoemDatabase getDb() {
    return db;
  }

  public void setDb(String dbName) {
    try {
      db = (PoemDatabase) LogicalDatabase.getDatabase(dbName);
    } catch (DatabaseInitException e) {
      fail(e.getMessage());
    }
  }

}