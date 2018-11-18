/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.project439.grocery.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroceryFactoryImpl extends EFactoryImpl implements GroceryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GroceryFactory init()
  {
    try
    {
      GroceryFactory theGroceryFactory = (GroceryFactory)EPackage.Registry.INSTANCE.getEFactory(GroceryPackage.eNS_URI);
      if (theGroceryFactory != null)
      {
        return theGroceryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GroceryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroceryFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GroceryPackage.GROCERY: return createGrocery();
      case GroceryPackage.BUILDING: return createBuilding();
      case GroceryPackage.STORE_ELEMENTS: return createStoreElements();
      case GroceryPackage.DELIVERY_ELEMENT: return createDeliveryElement();
      case GroceryPackage.STORE: return createStore();
      case GroceryPackage.WAREHOUSE: return createWarehouse();
      case GroceryPackage.SHELF: return createShelf();
      case GroceryPackage.BACKROOM: return createBackroom();
      case GroceryPackage.ITEM: return createItem();
      case GroceryPackage.NON_PERISHABLE_ITEM: return createNonPerishableItem();
      case GroceryPackage.PERISHABLE_ITEM: return createPerishableItem();
      case GroceryPackage.EXPERATION_DATE: return createExperationDate();
      case GroceryPackage.DRIVER: return createDriver();
      case GroceryPackage.VEHICLE: return createVehicle();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grocery createGrocery()
  {
    GroceryImpl grocery = new GroceryImpl();
    return grocery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Building createBuilding()
  {
    BuildingImpl building = new BuildingImpl();
    return building;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoreElements createStoreElements()
  {
    StoreElementsImpl storeElements = new StoreElementsImpl();
    return storeElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeliveryElement createDeliveryElement()
  {
    DeliveryElementImpl deliveryElement = new DeliveryElementImpl();
    return deliveryElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Warehouse createWarehouse()
  {
    WarehouseImpl warehouse = new WarehouseImpl();
    return warehouse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shelf createShelf()
  {
    ShelfImpl shelf = new ShelfImpl();
    return shelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Backroom createBackroom()
  {
    BackroomImpl backroom = new BackroomImpl();
    return backroom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerishableItem createNonPerishableItem()
  {
    NonPerishableItemImpl nonPerishableItem = new NonPerishableItemImpl();
    return nonPerishableItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerishableItem createPerishableItem()
  {
    PerishableItemImpl perishableItem = new PerishableItemImpl();
    return perishableItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperationDate createExperationDate()
  {
    ExperationDateImpl experationDate = new ExperationDateImpl();
    return experationDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Driver createDriver()
  {
    DriverImpl driver = new DriverImpl();
    return driver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vehicle createVehicle()
  {
    VehicleImpl vehicle = new VehicleImpl();
    return vehicle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroceryPackage getGroceryPackage()
  {
    return (GroceryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GroceryPackage getPackage()
  {
    return GroceryPackage.eINSTANCE;
  }

} //GroceryFactoryImpl
