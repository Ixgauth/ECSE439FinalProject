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
      case GroceryPackage.MOVEMENT_ELEMENT: return createMovementElement();
      case GroceryPackage.PERSON: return createPerson();
      case GroceryPackage.ITEM: return createItem();
      case GroceryPackage.FOOD_ITEM: return createFoodItem();
      case GroceryPackage.MOVEMENT: return createMovement();
      case GroceryPackage.STORE: return createStore();
      case GroceryPackage.WAREHOUSE: return createWarehouse();
      case GroceryPackage.SHELF: return createShelf();
      case GroceryPackage.BACKROOM: return createBackroom();
      case GroceryPackage.NON_PERISHABLE_ITEM: return createNonPerishableItem();
      case GroceryPackage.PERISHABLE_ITEM: return createPerishableItem();
      case GroceryPackage.NON_FOOD_ITEM: return createNonFoodItem();
      case GroceryPackage.DRIVER: return createDriver();
      case GroceryPackage.EMPLOYEE: return createEmployee();
      case GroceryPackage.CUSTOMER: return createCustomer();
      case GroceryPackage.VEHICLE: return createVehicle();
      case GroceryPackage.DELIVERY: return createDelivery();
      case GroceryPackage.SALE: return createSale();
      case GroceryPackage.STOCK_MOVEMENT: return createStockMovement();
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
  public MovementElement createMovementElement()
  {
    MovementElementImpl movementElement = new MovementElementImpl();
    return movementElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
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
  public FoodItem createFoodItem()
  {
    FoodItemImpl foodItem = new FoodItemImpl();
    return foodItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Movement createMovement()
  {
    MovementImpl movement = new MovementImpl();
    return movement;
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
  public NonFoodItem createNonFoodItem()
  {
    NonFoodItemImpl nonFoodItem = new NonFoodItemImpl();
    return nonFoodItem;
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
  public Employee createEmployee()
  {
    EmployeeImpl employee = new EmployeeImpl();
    return employee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer createCustomer()
  {
    CustomerImpl customer = new CustomerImpl();
    return customer;
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
  public Delivery createDelivery()
  {
    DeliveryImpl delivery = new DeliveryImpl();
    return delivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sale createSale()
  {
    SaleImpl sale = new SaleImpl();
    return sale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StockMovement createStockMovement()
  {
    StockMovementImpl stockMovement = new StockMovementImpl();
    return stockMovement;
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
