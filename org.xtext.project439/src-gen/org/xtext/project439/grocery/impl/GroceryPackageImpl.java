/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.project439.grocery.Backroom;
import org.xtext.project439.grocery.Building;
import org.xtext.project439.grocery.Customer;
import org.xtext.project439.grocery.Delivery;
import org.xtext.project439.grocery.Driver;
import org.xtext.project439.grocery.Employee;
import org.xtext.project439.grocery.FoodItem;
import org.xtext.project439.grocery.Grocery;
import org.xtext.project439.grocery.GroceryFactory;
import org.xtext.project439.grocery.GroceryPackage;
import org.xtext.project439.grocery.Item;
import org.xtext.project439.grocery.Movement;
import org.xtext.project439.grocery.MovementElement;
import org.xtext.project439.grocery.NonFoodItem;
import org.xtext.project439.grocery.NonPerishableItem;
import org.xtext.project439.grocery.PerishableItem;
import org.xtext.project439.grocery.Person;
import org.xtext.project439.grocery.Sale;
import org.xtext.project439.grocery.Shelf;
import org.xtext.project439.grocery.StockMovement;
import org.xtext.project439.grocery.Store;
import org.xtext.project439.grocery.StoreElements;
import org.xtext.project439.grocery.Vehicle;
import org.xtext.project439.grocery.Warehouse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroceryPackageImpl extends EPackageImpl implements GroceryPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groceryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storeElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass movementElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foodItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass movementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass warehouseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backroomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonPerishableItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass perishableItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonFoodItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass employeeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vehicleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deliveryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass saleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stockMovementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.project439.grocery.GroceryPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GroceryPackageImpl()
  {
    super(eNS_URI, GroceryFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GroceryPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GroceryPackage init()
  {
    if (isInited) return (GroceryPackage)EPackage.Registry.INSTANCE.getEPackage(GroceryPackage.eNS_URI);

    // Obtain or create and register package
    GroceryPackageImpl theGroceryPackage = (GroceryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GroceryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GroceryPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGroceryPackage.createPackageContents();

    // Initialize created meta-data
    theGroceryPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGroceryPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GroceryPackage.eNS_URI, theGroceryPackage);
    return theGroceryPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrocery()
  {
    return groceryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrocery_Elements()
  {
    return (EReference)groceryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuilding()
  {
    return buildingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilding_Name()
  {
    return (EAttribute)buildingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStoreElements()
  {
    return storeElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStoreElements_Name()
  {
    return (EAttribute)storeElementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStoreElements_Items()
  {
    return (EReference)storeElementsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMovementElement()
  {
    return movementElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMovementElement_Name()
  {
    return (EAttribute)movementElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem()
  {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Name()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Price()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Quantity()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFoodItem()
  {
    return foodItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMovement()
  {
    return movementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMovement_Name()
  {
    return (EAttribute)movementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMovement_Items()
  {
    return (EReference)movementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStore()
  {
    return storeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStore_Elements()
  {
    return (EReference)storeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWarehouse()
  {
    return warehouseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarehouse_Address()
  {
    return (EAttribute)warehouseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWarehouse_Items()
  {
    return (EReference)warehouseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShelf()
  {
    return shelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackroom()
  {
    return backroomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonPerishableItem()
  {
    return nonPerishableItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerishableItem()
  {
    return perishableItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerishableItem_ExperationDate()
  {
    return (EAttribute)perishableItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonFoodItem()
  {
    return nonFoodItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDriver()
  {
    return driverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriver_DriverName()
  {
    return (EAttribute)driverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDriver_Vehicle()
  {
    return (EReference)driverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmployee()
  {
    return employeeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_EmployeeName()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmployee_StockMovement()
  {
    return (EReference)employeeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomer()
  {
    return customerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomer_CustomerName()
  {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomer_Sale()
  {
    return (EReference)customerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVehicle()
  {
    return vehicleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVehicle_PlateNumber()
  {
    return (EAttribute)vehicleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVehicle_Items()
  {
    return (EReference)vehicleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelivery()
  {
    return deliveryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelivery_FromWarehouse()
  {
    return (EReference)deliveryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelivery_ToStore()
  {
    return (EReference)deliveryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSale()
  {
    return saleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSale_FromShelf()
  {
    return (EReference)saleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStockMovement()
  {
    return stockMovementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStockMovement_FromBackroom()
  {
    return (EReference)stockMovementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStockMovement_ToShelf()
  {
    return (EReference)stockMovementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroceryFactory getGroceryFactory()
  {
    return (GroceryFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    groceryEClass = createEClass(GROCERY);
    createEReference(groceryEClass, GROCERY__ELEMENTS);

    buildingEClass = createEClass(BUILDING);
    createEAttribute(buildingEClass, BUILDING__NAME);

    storeElementsEClass = createEClass(STORE_ELEMENTS);
    createEAttribute(storeElementsEClass, STORE_ELEMENTS__NAME);
    createEReference(storeElementsEClass, STORE_ELEMENTS__ITEMS);

    movementElementEClass = createEClass(MOVEMENT_ELEMENT);
    createEAttribute(movementElementEClass, MOVEMENT_ELEMENT__NAME);

    personEClass = createEClass(PERSON);

    itemEClass = createEClass(ITEM);
    createEAttribute(itemEClass, ITEM__NAME);
    createEAttribute(itemEClass, ITEM__PRICE);
    createEAttribute(itemEClass, ITEM__QUANTITY);

    foodItemEClass = createEClass(FOOD_ITEM);

    movementEClass = createEClass(MOVEMENT);
    createEAttribute(movementEClass, MOVEMENT__NAME);
    createEReference(movementEClass, MOVEMENT__ITEMS);

    storeEClass = createEClass(STORE);
    createEReference(storeEClass, STORE__ELEMENTS);

    warehouseEClass = createEClass(WAREHOUSE);
    createEAttribute(warehouseEClass, WAREHOUSE__ADDRESS);
    createEReference(warehouseEClass, WAREHOUSE__ITEMS);

    shelfEClass = createEClass(SHELF);

    backroomEClass = createEClass(BACKROOM);

    nonPerishableItemEClass = createEClass(NON_PERISHABLE_ITEM);

    perishableItemEClass = createEClass(PERISHABLE_ITEM);
    createEAttribute(perishableItemEClass, PERISHABLE_ITEM__EXPERATION_DATE);

    nonFoodItemEClass = createEClass(NON_FOOD_ITEM);

    driverEClass = createEClass(DRIVER);
    createEAttribute(driverEClass, DRIVER__DRIVER_NAME);
    createEReference(driverEClass, DRIVER__VEHICLE);

    employeeEClass = createEClass(EMPLOYEE);
    createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_NAME);
    createEReference(employeeEClass, EMPLOYEE__STOCK_MOVEMENT);

    customerEClass = createEClass(CUSTOMER);
    createEAttribute(customerEClass, CUSTOMER__CUSTOMER_NAME);
    createEReference(customerEClass, CUSTOMER__SALE);

    vehicleEClass = createEClass(VEHICLE);
    createEAttribute(vehicleEClass, VEHICLE__PLATE_NUMBER);
    createEReference(vehicleEClass, VEHICLE__ITEMS);

    deliveryEClass = createEClass(DELIVERY);
    createEReference(deliveryEClass, DELIVERY__FROM_WAREHOUSE);
    createEReference(deliveryEClass, DELIVERY__TO_STORE);

    saleEClass = createEClass(SALE);
    createEReference(saleEClass, SALE__FROM_SHELF);

    stockMovementEClass = createEClass(STOCK_MOVEMENT);
    createEReference(stockMovementEClass, STOCK_MOVEMENT__FROM_BACKROOM);
    createEReference(stockMovementEClass, STOCK_MOVEMENT__TO_SHELF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    personEClass.getESuperTypes().add(this.getMovementElement());
    foodItemEClass.getESuperTypes().add(this.getItem());
    storeEClass.getESuperTypes().add(this.getBuilding());
    warehouseEClass.getESuperTypes().add(this.getBuilding());
    shelfEClass.getESuperTypes().add(this.getStoreElements());
    backroomEClass.getESuperTypes().add(this.getStoreElements());
    nonPerishableItemEClass.getESuperTypes().add(this.getFoodItem());
    perishableItemEClass.getESuperTypes().add(this.getFoodItem());
    nonFoodItemEClass.getESuperTypes().add(this.getItem());
    driverEClass.getESuperTypes().add(this.getPerson());
    employeeEClass.getESuperTypes().add(this.getPerson());
    customerEClass.getESuperTypes().add(this.getPerson());
    vehicleEClass.getESuperTypes().add(this.getMovementElement());
    deliveryEClass.getESuperTypes().add(this.getMovement());
    saleEClass.getESuperTypes().add(this.getMovement());
    stockMovementEClass.getESuperTypes().add(this.getMovement());

    // Initialize classes and features; add operations and parameters
    initEClass(groceryEClass, Grocery.class, "Grocery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrocery_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Grocery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuilding_Name(), ecorePackage.getEString(), "name", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeElementsEClass, StoreElements.class, "StoreElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStoreElements_Name(), ecorePackage.getEString(), "name", null, 0, 1, StoreElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStoreElements_Items(), this.getItem(), null, "items", null, 0, -1, StoreElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(movementElementEClass, MovementElement.class, "MovementElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMovementElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MovementElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Price(), ecorePackage.getEString(), "price", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foodItemEClass, FoodItem.class, "FoodItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(movementEClass, Movement.class, "Movement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMovement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Movement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMovement_Items(), this.getItem(), null, "items", null, 0, -1, Movement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStore_Elements(), this.getStoreElements(), null, "elements", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(warehouseEClass, Warehouse.class, "Warehouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWarehouse_Address(), ecorePackage.getEString(), "address", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWarehouse_Items(), this.getItem(), null, "items", null, 0, -1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shelfEClass, Shelf.class, "Shelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(backroomEClass, Backroom.class, "Backroom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonPerishableItemEClass, NonPerishableItem.class, "NonPerishableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(perishableItemEClass, PerishableItem.class, "PerishableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerishableItem_ExperationDate(), ecorePackage.getEString(), "experationDate", null, 0, 1, PerishableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonFoodItemEClass, NonFoodItem.class, "NonFoodItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDriver_DriverName(), ecorePackage.getEString(), "driverName", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDriver_Vehicle(), this.getVehicle(), null, "vehicle", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmployee_EmployeeName(), ecorePackage.getEString(), "employeeName", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmployee_StockMovement(), this.getStockMovement(), null, "stockMovement", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomer_CustomerName(), ecorePackage.getEString(), "customerName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_Sale(), this.getSale(), null, "sale", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVehicle_PlateNumber(), ecorePackage.getEString(), "plateNumber", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVehicle_Items(), this.getItem(), null, "items", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelivery_FromWarehouse(), this.getWarehouse(), null, "fromWarehouse", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelivery_ToStore(), this.getStore(), null, "toStore", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(saleEClass, Sale.class, "Sale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSale_FromShelf(), this.getShelf(), null, "fromShelf", null, 0, 1, Sale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stockMovementEClass, StockMovement.class, "StockMovement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStockMovement_FromBackroom(), this.getBackroom(), null, "fromBackroom", null, 0, 1, StockMovement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStockMovement_ToShelf(), this.getShelf(), null, "toShelf", null, 0, 1, StockMovement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GroceryPackageImpl
