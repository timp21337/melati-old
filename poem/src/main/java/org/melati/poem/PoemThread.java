package org.melati.poem;

import java.util.*;
import org.melati.util.*;

public class PoemThread {

  private PoemThread() {}

  private static Vector sessionTokens = new Vector();
  private static Vector freeSessionTokenIndices = new Vector();

  public static final int threadsMax = 100; // must be < Char.MAX_VALUE = 64k

  static Integer allocatedSessionToken(AccessToken accessToken,
                                       PoemTransaction transaction) {
    synchronized (freeSessionTokenIndices) {
      Integer index;
      if (freeSessionTokenIndices.size() == 0) {
        int i = sessionTokens.size();
        if (i >= threadsMax)
          throw new TooManyThreadsPoemException();
        sessionTokens.setSize(i + 1);
        index = new Integer(i);
      }
      else {
        index = (Integer)freeSessionTokenIndices.lastElement();
        freeSessionTokenIndices.setSize(freeSessionTokenIndices.size() - 1);
      }

      SessionToken token = new SessionToken(
          Thread.currentThread(), transaction, accessToken);
      sessionTokens.setElementAt(token, index.intValue());
      Thread.currentThread().setName("" + (char)index.intValue());

      return index;
    }
  }

  static void inSession(PoemTask task, AccessToken accessToken,
                        PoemTransaction transaction) throws PoemException {
    Integer token = allocatedSessionToken(accessToken, transaction);
    try {
      task.run();
    }
    finally {
      synchronized (freeSessionTokenIndices) {
        ((SessionToken)sessionTokens.elementAt(token.intValue())).invalidate();
        sessionTokens.setElementAt(null, token.intValue());
        freeSessionTokenIndices.addElement(token);
      }
    }
  }

  static SessionToken _sessionToken() {
    try {
      SessionToken context =
          (SessionToken)sessionTokens.elementAt(Thread.currentThread().
                                                getName().charAt(0));
      if (context.thread == Thread.currentThread())
        return context;
      else
        return null;
    }
    catch (Exception e) {
      return null;
    }
  }

  static SessionToken sessionToken() throws NotInSessionPoemException {
    SessionToken it = _sessionToken();
    if (it == null)
      throw new NotInSessionPoemException();
    return it;
  }

  public static PoemTransaction transaction() {
    return sessionToken().transaction;
  }

  public static boolean inSession() {
    return _sessionToken() != null;
  }

  public static AccessToken accessToken()
      throws NotInSessionPoemException, NoAccessTokenPoemException {
    AccessToken it = sessionToken().accessToken;
    if (it == null)
      throw new NoAccessTokenPoemException();
    return it;
  }

  /**
   * Change the access token under which your thread is operating.  You can't
   * do this unless the current token is <TT>root</TT>.
   *
   * @see AccessToken#root
   */

  public static void setAccessToken(AccessToken token)
      throws NonRootSetAccessTokenPoemException {
    SessionToken context = sessionToken();
    AccessToken old = context.accessToken;
    if (old != AccessToken.root)
      throw new NonRootSetAccessTokenPoemException(old);
    context.accessToken = token;
  }

  public static void assertHasCapability(Capability capability)
     throws NotInSessionPoemException, NoAccessTokenPoemException,
            AccessPoemException {
    AccessToken token = accessToken();
    if (!token.givesCapability(capability))
      throw new AccessPoemException(token, capability);
  }

  public static Database database() throws NotInSessionPoemException {
    return transaction().getDatabase();
  }

  public static void writeDown() {
    transaction().writeDown();
  }

  public static void commit() {
    transaction().commit();
  }

  public static void rollback() {
    transaction().rollback();
  }
}
