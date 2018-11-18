/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.project439.grocery.GroceryPackage
 * @generated
 */
public interface GroceryFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GroceryFactory eINSTANCE = org.xtext.project439.grocery.impl.GroceryFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Grocery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grocery</em>'.
   * @generated
   */
  Grocery createGrocery();

  /**
   * Returns a new object of class '<em>Building</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Building</em>'.
   * @generated
   */
  Building createBuilding();

  /**
   * Returns a new object of class '<em>Store Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store Elements</em>'.
   * @generated
   */
  StoreElements createStoreElements();

  /**
   * Returns a new object of class '<em>Delivery Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delivery Element</em>'.
   * @generated
   */
  DeliveryElement createDeliveryElement();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Warehouse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warehouse</em>'.
   * @generated
   */
  Warehouse createWarehouse();

  /**
   * Returns a new object of class '<em>Shelf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shelf</em>'.
   * @generated
   */
  Shelf createShelf();

  /**
   * Returns a new object of class '<em>Backroom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Backroom</em>'.
   * @generated
   */
  Backroom createBackroom();

  /**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
  Item createItem();

  /**
   * Returns a new object of class '<em>Non Perishable Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Perishable Item</em>'.
   * @generated
   */
  NonPerishableItem createNonPerishableItem();

  /**
   * Returns a new object of class '<em>Perishable Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Perishable Item</em>'.
   * @generated
   */
  PerishableItem createPerishableItem();

  /**
   * Returns a new object of class '<em>Experation Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experation Date</em>'.
   * @generated
   */
  ExperationDate createExperationDate();

  /**
   * Returns a new object of class '<em>Driver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Driver</em>'.
   * @generated
   */
  Driver createDriver();

  /**
   * Returns a new object of class '<em>Vehicle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vehicle</em>'.
   * @generated
   */
  Vehicle createVehicle();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GroceryPackage getGroceryPackage();

} //GroceryFactory
