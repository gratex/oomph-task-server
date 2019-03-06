/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Websphere Server Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerVersion()
 * @model
 * @generated
 */
public enum WebsphereServerVersion implements Enumerator
{
  /**
   * The '<em><b>WAS70</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WAS70_VALUE
   * @generated
   * @ordered
   */
  WAS70(0, "WAS70", "WebSphere 7.0"),

  /**
   * The '<em><b>WAS80</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WAS80_VALUE
   * @generated
   * @ordered
   */
  WAS80(1, "WAS80", "WebSphere 8.0"),
  /**
   * The '<em><b>WAS85</b></em>' literal object.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @see #WAS85_VALUE
   * @generated
   * @ordered
   */
  WAS85(2, "WAS85", "WebSphere 8.5"),
  /**
   * The '<em><b>WAS9</b></em>' literal object.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @see #WAS9_VALUE
   * @generated
   * @ordered
   */
  WAS9(3, "WAS9", "WebSphere 9");

  /**
   * The '<em><b>WAS70</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WAS70</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WAS70
   * @model literal="WebSphere 7.0"
   * @generated
   * @ordered
   */
  public static final int WAS70_VALUE = 0;

  /**
   * The '<em><b>WAS80</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WAS80</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WAS80
   * @model literal="WebSphere 8.0"
   * @generated
   * @ordered
   */
  public static final int WAS80_VALUE = 1;

  /**
   * The '<em><b>WAS85</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WAS85</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WAS85
   * @model literal="WebSphere 8.5"
   * @generated
   * @ordered
   */
  public static final int WAS85_VALUE = 2;

  /**
   * The '<em><b>WAS9</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WAS9</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WAS9
   * @model literal="WebSphere 9"
   * @generated
   * @ordered
   */
  public static final int WAS9_VALUE = 3;

  /**
   * An array of all the '<em><b>Websphere Server Version</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final WebsphereServerVersion[] VALUES_ARRAY = new WebsphereServerVersion[] { WAS70, WAS80, WAS85, WAS9, };

  /**
   * A public read-only list of all the '<em><b>Websphere Server Version</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<WebsphereServerVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Websphere Server Version</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WebsphereServerVersion get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WebsphereServerVersion result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Websphere Server Version</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WebsphereServerVersion getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WebsphereServerVersion result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Websphere Server Version</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WebsphereServerVersion get(int value)
  {
    switch (value)
    {
    case WAS70_VALUE:
      return WAS70;
    case WAS80_VALUE:
      return WAS80;
    case WAS85_VALUE:
      return WAS85;
    case WAS9_VALUE:
      return WAS9;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private WebsphereServerVersion(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }

} // WebsphereServerVersion
