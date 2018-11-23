/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project439.grocery.Store#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.project439.grocery.GroceryPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Building
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.xtext.project439.grocery.StoreElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see org.xtext.project439.grocery.GroceryPackage#getStore_Elements()
   * @model
   * @generated
   */
  EList<StoreElements> getElements();

} // Store
