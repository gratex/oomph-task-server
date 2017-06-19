/**
 *
 */
package com.gratex.oomph.task.utils;

/**
 * @author jkovalux
 *
 */
public abstract class Convert
{

  private Convert()
  {
    // hide
  }

  public static Integer toInteger(String value)
  {
    if (value == null)
    {
      return null;
    }

    return Integer.valueOf(value);
  }
}
