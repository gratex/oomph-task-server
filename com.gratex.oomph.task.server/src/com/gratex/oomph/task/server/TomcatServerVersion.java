/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tomcat Server Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerVersion()
 * @model
 * @generated
 */
public enum TomcatServerVersion implements Enumerator
{
  /**
   * The '<em><b>TOMCAT70</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOMCAT70_VALUE
   * @generated
   * @ordered
   */
  TOMCAT70(0, "TOMCAT70", "Tomcat 7.0"),

  /**
   * The '<em><b>TOMCAT80</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOMCAT80_VALUE
   * @generated
   * @ordered
   */
  TOMCAT80(1, "TOMCAT80", "Tomcat 8.0"),

  /**
   * The '<em><b>TOMCAT85</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOMCAT85_VALUE
   * @generated
   * @ordered
   */
  TOMCAT85(2, "TOMCAT85", "Tomcat 8.5"),

  TOMCAT90(3, "TOMCAT90", "Tomcat 9.0");

  /**
   * The '<em><b>TOMCAT70</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOMCAT70</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOMCAT70
   * @model literal="Tomcat 7.0"
   * @generated
   * @ordered
   */
  public static final int TOMCAT70_VALUE = 0;

  /**
   * The '<em><b>TOMCAT80</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOMCAT80</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOMCAT80
   * @model literal="Tomcat 8.0"
   * @generated
   * @ordered
   */
  public static final int TOMCAT80_VALUE = 1;

  /**
   * The '<em><b>TOMCAT85</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOMCAT85</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOMCAT85
   * @model literal="Tomcat 8.5"
   * @generated
   * @ordered
   */
  public static final int TOMCAT85_VALUE = 2;

  public static final int TOMCAT90_VALUE = 3;

  /**
   * An array of all the '<em><b>Tomcat Server Version</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TomcatServerVersion[] VALUES_ARRAY = new TomcatServerVersion[] { TOMCAT70, TOMCAT80, TOMCAT85, TOMCAT90 };

  /**
   * A public read-only list of all the '<em><b>Tomcat Server Version</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TomcatServerVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Tomcat Server Version</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TomcatServerVersion get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TomcatServerVersion result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tomcat Server Version</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TomcatServerVersion getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TomcatServerVersion result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tomcat Server Version</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TomcatServerVersion get(int value)
  {
    switch (value)
    {
    case TOMCAT70_VALUE:
      return TOMCAT70;
    case TOMCAT80_VALUE:
      return TOMCAT80;
    case TOMCAT85_VALUE:
      return TOMCAT85;
    case TOMCAT90_VALUE:
      return TOMCAT90;
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
  private TomcatServerVersion(int value, String name, String literal)
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

} // TomcatServerVersion
