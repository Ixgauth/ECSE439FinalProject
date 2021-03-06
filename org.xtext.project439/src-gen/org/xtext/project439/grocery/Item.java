/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project439.grocery.Item#getPrice <em>Price</em>}</li>
 *   <li>{@link org.xtext.project439.grocery.Item#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.xtext.project439.grocery.GroceryPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(String)
   * @see org.xtext.project439.grocery.GroceryPackage#getItem_Price()
   * @model
   * @generated
   */
  String getPrice();

  /**
   * Sets the value of the '{@link org.xtext.project439.grocery.Item#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(String value);

  /**
   * Returns the value of the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' attribute.
   * @see #setQuantity(int)
   * @see org.xtext.project439.grocery.GroceryPackage#getItem_Quantity()
   * @model
   * @generated
   */
  int getQuantity();

  /**
   * Sets the value of the '{@link org.xtext.project439.grocery.Item#getQuantity <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' attribute.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(int value);

} // Item
