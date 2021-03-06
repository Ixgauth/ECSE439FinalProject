/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>quality Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.project439.grocery.GroceryPackage#getqualityLevel()
 * @model
 * @generated
 */
public enum qualityLevel implements Enumerator
{
  /**
   * The '<em><b>GOOD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GOOD_VALUE
   * @generated
   * @ordered
   */
  GOOD(0, "GOOD", "good"),

  /**
   * The '<em><b>MEDIOCRE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIOCRE_VALUE
   * @generated
   * @ordered
   */
  MEDIOCRE(1, "MEDIOCRE", "okay"),

  /**
   * The '<em><b>NEEDSREMOVAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEEDSREMOVAL_VALUE
   * @generated
   * @ordered
   */
  NEEDSREMOVAL(2, "NEEDSREMOVAL", "needs removal");

  /**
   * The '<em><b>GOOD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GOOD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GOOD
   * @model literal="good"
   * @generated
   * @ordered
   */
  public static final int GOOD_VALUE = 0;

  /**
   * The '<em><b>MEDIOCRE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEDIOCRE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEDIOCRE
   * @model literal="okay"
   * @generated
   * @ordered
   */
  public static final int MEDIOCRE_VALUE = 1;

  /**
   * The '<em><b>NEEDSREMOVAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEEDSREMOVAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEEDSREMOVAL
   * @model literal="needs removal"
   * @generated
   * @ordered
   */
  public static final int NEEDSREMOVAL_VALUE = 2;

  /**
   * An array of all the '<em><b>quality Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final qualityLevel[] VALUES_ARRAY =
    new qualityLevel[]
    {
      GOOD,
      MEDIOCRE,
      NEEDSREMOVAL,
    };

  /**
   * A public read-only list of all the '<em><b>quality Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<qualityLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>quality Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static qualityLevel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      qualityLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>quality Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static qualityLevel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      qualityLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>quality Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static qualityLevel get(int value)
  {
    switch (value)
    {
      case GOOD_VALUE: return GOOD;
      case MEDIOCRE_VALUE: return MEDIOCRE;
      case NEEDSREMOVAL_VALUE: return NEEDSREMOVAL;
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
  private qualityLevel(int value, String name, String literal)
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
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
  
} //qualityLevel
