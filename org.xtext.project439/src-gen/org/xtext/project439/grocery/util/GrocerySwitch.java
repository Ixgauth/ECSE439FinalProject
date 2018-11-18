/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.project439.grocery.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.project439.grocery.GroceryPackage
 * @generated
 */
public class GrocerySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GroceryPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GrocerySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GroceryPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GroceryPackage.GROCERY:
      {
        Grocery grocery = (Grocery)theEObject;
        T result = caseGrocery(grocery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.BUILDING:
      {
        Building building = (Building)theEObject;
        T result = caseBuilding(building);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.STORE_ELEMENTS:
      {
        StoreElements storeElements = (StoreElements)theEObject;
        T result = caseStoreElements(storeElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.DELIVERY_ELEMENT:
      {
        DeliveryElement deliveryElement = (DeliveryElement)theEObject;
        T result = caseDeliveryElement(deliveryElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = caseBuilding(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.WAREHOUSE:
      {
        Warehouse warehouse = (Warehouse)theEObject;
        T result = caseWarehouse(warehouse);
        if (result == null) result = caseBuilding(warehouse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.SHELF:
      {
        Shelf shelf = (Shelf)theEObject;
        T result = caseShelf(shelf);
        if (result == null) result = caseStoreElements(shelf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.BACKROOM:
      {
        Backroom backroom = (Backroom)theEObject;
        T result = caseBackroom(backroom);
        if (result == null) result = caseStoreElements(backroom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.NON_PERISHABLE_ITEM:
      {
        NonPerishableItem nonPerishableItem = (NonPerishableItem)theEObject;
        T result = caseNonPerishableItem(nonPerishableItem);
        if (result == null) result = caseItem(nonPerishableItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.PERISHABLE_ITEM:
      {
        PerishableItem perishableItem = (PerishableItem)theEObject;
        T result = casePerishableItem(perishableItem);
        if (result == null) result = caseItem(perishableItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.ADDRESS:
      {
        Address address = (Address)theEObject;
        T result = caseAddress(address);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.EXPERATION_DATE:
      {
        ExperationDate experationDate = (ExperationDate)theEObject;
        T result = caseExperationDate(experationDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.DRIVER:
      {
        Driver driver = (Driver)theEObject;
        T result = caseDriver(driver);
        if (result == null) result = caseDeliveryElement(driver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GroceryPackage.VEHICLE:
      {
        Vehicle vehicle = (Vehicle)theEObject;
        T result = caseVehicle(vehicle);
        if (result == null) result = caseDeliveryElement(vehicle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grocery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grocery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrocery(Grocery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Building</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuilding(Building object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoreElements(StoreElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delivery Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delivery Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeliveryElement(DeliveryElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Warehouse</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Warehouse</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWarehouse(Warehouse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shelf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shelf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShelf(Shelf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Backroom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Backroom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBackroom(Backroom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Perishable Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Perishable Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonPerishableItem(NonPerishableItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Perishable Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Perishable Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerishableItem(PerishableItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddress(Address object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experation Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experation Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperationDate(ExperationDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDriver(Driver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVehicle(Vehicle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GrocerySwitch
