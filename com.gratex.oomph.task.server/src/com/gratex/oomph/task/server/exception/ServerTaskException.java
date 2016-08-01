/**
 *
 */
package com.gratex.oomph.task.server.exception;

/**
 * @author jkovalux
 *
 */
public class ServerTaskException extends Exception
{

  private static final long serialVersionUID = 1823432507770547902L;

  /**
   * @param message
   */
  public ServerTaskException(String message)
  {
    super(message);
  }

  /**
   * @param cause
   */
  public ServerTaskException(Throwable cause)
  {
    super(cause);
  }

  /**
   * @param message
   * @param cause
   */
  public ServerTaskException(String message, Throwable cause)
  {
    super(message, cause);
  }

  /**
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public ServerTaskException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
  {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
