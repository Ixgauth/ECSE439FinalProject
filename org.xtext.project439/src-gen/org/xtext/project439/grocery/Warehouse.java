/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project439.grocery.Warehouse#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.project439.grocery.Warehouse#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @see org.xtext.project439.grocery.GroceryPackage#getWarehouse()
 * @model
 * @generated
 */
public interface Warehouse extends Building
{
  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see org.xtext.project439.grocery.GroceryPackage#getWarehouse_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link org.xtext.project439.grocery.Warehouse#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

  /**
   * Returns the value of the '<em><b>Supplier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supplier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supplier</em>' reference.
   * @see #setSupplier(Supplier)
   * @see org.xtext.project439.grocery.GroceryPackage#getWarehouse_Supplier()
   * @model
   * @generated
   */
  Supplier getSupplier();

  /**
   * Sets the value of the '{@link org.xtext.project439.grocery.Warehouse#getSupplier <em>Supplier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supplier</em>' reference.
   * @see #getSupplier()
   * @generated
   */
  void setSupplier(Supplier value);

} // Warehouse
