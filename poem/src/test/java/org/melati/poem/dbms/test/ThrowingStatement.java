/**
 * 
 */
package org.melati.poem.dbms.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Hashtable;

/**
*  A {@link Statement} decorated to throw SQLException on command.
*  
 * @author timp
 * @since 10 Feb 2007
 * 
 */
public class ThrowingStatement extends Thrower implements Statement {
  Statement s = null;
  { 
    throwers = new Hashtable();
  }

  /**
   * 
   */
  public ThrowingStatement(Statement s) {
    this.s = s;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#addBatch(java.lang.String)
   */
  public void addBatch(String sql) throws SQLException {
    if (shouldThrow("addBatch"))
      throw new SQLException("Statement bombed");
    s.addBatch(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#cancel()
   */
  public void cancel() throws SQLException {
    if (shouldThrow("cancel"))
      throw new SQLException("Statement bombed");
    s.cancel();

  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#clearBatch()
   */
  public void clearBatch() throws SQLException {
    if (shouldThrow("clearBatch"))
      throw new SQLException("Statement bombed");
    s.clearBatch();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#clearWarnings()
   */
  public void clearWarnings() throws SQLException {
    if (shouldThrow("clearWarnings"))
      throw new SQLException("Statement bombed");
    s.clearWarnings();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#close()
   */
  public void close() throws SQLException {
    if (shouldThrow("close"))
      throw new SQLException("Statement bombed");
    s.close();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String)
   */
  public boolean execute(String sql) throws SQLException {
    if (shouldThrow("execute"))
      throw new SQLException("Statement bombed");

    return s.execute(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String, int)
   */
  public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
    if (shouldThrow("execute"))
      throw new SQLException("Statement bombed");

    return s.execute(sql, autoGeneratedKeys);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String, int[])
   */
  public boolean execute(String sql, int[] columnIndexes) throws SQLException {
    if (shouldThrow("execute"))
      throw new SQLException("Statement bombed");

    return s.execute(sql, columnIndexes);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String, java.lang.String[])
   */
  public boolean execute(String sql, String[] columnNames) throws SQLException {
    if (shouldThrow("execute"))
      throw new SQLException("Statement bombed");

    return s.execute(sql, columnNames);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeBatch()
   */
  public int[] executeBatch() throws SQLException {
    if (shouldThrow("executeBatch"))
      throw new SQLException("Statement bombed");

    return s.executeBatch();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeQuery(java.lang.String)
   */
  public ResultSet executeQuery(String sql) throws SQLException {
    if (shouldThrow("executeQuery"))
      throw new SQLException("Statement bombed");

    return s.executeQuery(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String)
   */
  public int executeUpdate(String sql) throws SQLException {
    if (shouldThrow("executeUpdate"))
      throw new SQLException("Statement bombed");

    return s.executeUpdate(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String, int)
   */
  public int executeUpdate(String sql, int autoGeneratedKeys)
      throws SQLException {
    if (shouldThrow("executeUpdate"))
      throw new SQLException("Statement bombed");

    return s.executeUpdate(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String, int[])
   */
  public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
    if (shouldThrow("executeUpdate"))
      throw new SQLException("Statement bombed");

    return s.executeUpdate(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String, java.lang.String[])
   */
  public int executeUpdate(String sql, String[] columnNames)
      throws SQLException {
    if (shouldThrow("executeUpdate"))
      throw new SQLException("Statement bombed");

    return s.executeUpdate(sql,columnNames);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getConnection()
   */
  public Connection getConnection() throws SQLException {
    if (shouldThrow("getConnection"))
      throw new SQLException("Statement bombed");

    return s.getConnection();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getFetchDirection()
   */
  public int getFetchDirection() throws SQLException {
    if (shouldThrow("getFetchDirection"))
      throw new SQLException("Statement bombed");

    return s.getFetchDirection();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getFetchSize()
   */
  public int getFetchSize() throws SQLException {
    if (shouldThrow("getFetchSize"))
      throw new SQLException("Statement bombed");

    return s.getFetchSize();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getGeneratedKeys()
   */
  public ResultSet getGeneratedKeys() throws SQLException {
    if (shouldThrow("getGeneratedKeys"))
      throw new SQLException("Statement bombed");

    return s.getGeneratedKeys();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMaxFieldSize()
   */
  public int getMaxFieldSize() throws SQLException {
    if (shouldThrow("getMaxFieldSize"))
      throw new SQLException("Statement bombed");

    return s.getMaxFieldSize();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMaxRows()
   */
  public int getMaxRows() throws SQLException {
    if (shouldThrow("getMaxRows"))
      throw new SQLException("Statement bombed");

    return s.getMaxRows();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMoreResults()
   */
  public boolean getMoreResults() throws SQLException {
    if (shouldThrow("getMoreResults"))
      throw new SQLException("Statement bombed");

    return s.getMoreResults();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMoreResults(int)
   */
  public boolean getMoreResults(int current) throws SQLException {
    if (shouldThrow("getMoreResults"))
      throw new SQLException("Statement bombed");

    return s.getMoreResults(current);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getQueryTimeout()
   */
  public int getQueryTimeout() throws SQLException {
    if (shouldThrow("getQueryTimeout"))
      throw new SQLException("Statement bombed");

    return s.getQueryTimeout();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSet()
   */
  public ResultSet getResultSet() throws SQLException {
    if (shouldThrow("getResultSet"))
      throw new SQLException("Statement bombed");

    return s.getResultSet();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSetConcurrency()
   */
  public int getResultSetConcurrency() throws SQLException {
    if (shouldThrow("getResultSetConcurrency"))
      throw new SQLException("Statement bombed");

    return s.getResultSetConcurrency();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSetHoldability()
   */
  public int getResultSetHoldability() throws SQLException {
    if (shouldThrow("getResultSetHoldability"))
      throw new SQLException("Statement bombed");

    return s.getResultSetHoldability();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSetType()
   */
  public int getResultSetType() throws SQLException {
    if (shouldThrow("getResultSetType"))
      throw new SQLException("Statement bombed");

    return s.getResultSetType();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getUpdateCount()
   */
  public int getUpdateCount() throws SQLException {
    if (shouldThrow("getUpdateCount"))
      throw new SQLException("Statement bombed");

    return s.getUpdateCount();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getWarnings()
   */
  public SQLWarning getWarnings() throws SQLException {
    if (shouldThrow("getWarnings"))
      throw new SQLException("Statement bombed");

    return s.getWarnings();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setCursorName(java.lang.String)
   */
  public void setCursorName(String name) throws SQLException {
    if (shouldThrow("setCursorName"))
      throw new SQLException("Statement bombed");
    s.setCursorName(name);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setEscapeProcessing(boolean)
   */
  public void setEscapeProcessing(boolean enable) throws SQLException {
    if (shouldThrow("setEscapeProcessing"))
      throw new SQLException("Statement bombed");
    s.setEscapeProcessing(enable);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setFetchDirection(int)
   */
  public void setFetchDirection(int direction) throws SQLException {
    if (shouldThrow("setFetchDirection"))
      throw new SQLException("Statement bombed");
    s.setFetchDirection(direction);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setFetchSize(int)
   */
  public void setFetchSize(int rows) throws SQLException {
    if (shouldThrow("setFetchSize"))
      throw new SQLException("Statement bombed");
    s.setFetchSize(rows);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setMaxFieldSize(int)
   */
  public void setMaxFieldSize(int max) throws SQLException {
    if (shouldThrow("setMaxFieldSize"))
      throw new SQLException("Statement bombed");
    s.setMaxFieldSize(max);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setMaxRows(int)
   */
  public void setMaxRows(int max) throws SQLException {
    if (shouldThrow("setMaxRows"))
      throw new SQLException("Statement bombed");
    s.setMaxRows(max);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setQueryTimeout(int)
   */
  public void setQueryTimeout(int seconds) throws SQLException {
    if (shouldThrow("setQueryTimeout"))
      throw new SQLException("Statement bombed");
    s.setQueryTimeout(seconds);
  }

}
