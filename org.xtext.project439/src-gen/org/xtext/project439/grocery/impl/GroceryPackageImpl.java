/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.project439.grocery.Address;
import org.xtext.project439.grocery.Backroom;
import org.xtext.project439.grocery.Building;
import org.xtext.project439.grocery.DeliveryElement;
import org.xtext.project439.grocery.Driver;
import org.xtext.project439.grocery.ExperationDate;
import org.xtext.project439.grocery.Grocery;
import org.xtext.project439.grocery.GroceryFactory;
import org.xtext.project439.grocery.GroceryPackage;
import org.xtext.project439.grocery.Item;
import org.xtext.project439.grocery.NonPerishableItem;
import org.xtext.project439.grocery.PerishableItem;
import org.xtext.project439.grocery.Shelf;
import org.xtext.project439.grocery.Store;
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
  private EClass deliveryElementEClass = null;

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
  private EClass itemEClass = null;

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
  private EClass addressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experationDateEClass = null;

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
  private EClass vehicleEClass = null;

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
  public EClass getDeliveryElement()
  {
    return deliveryElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeliveryElement_Name()
  {
    return (EAttribute)deliveryElementEClass.getEStructuralFeatures().get(0);
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
  public EReference getWarehouse_Address()
  {
    return (EReference)warehouseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWarehouse_Elements()
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
  public EAttribute getShelf_Name()
  {
    return (EAttribute)shelfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShelf_Elements()
  {
    return (EReference)shelfEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getBackroom_Name()
  {
    return (EAttribute)backroomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackroom_Elements()
  {
    return (EReference)backroomEClass.getEStructuralFeatures().get(1);
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
  public EClass getNonPerishableItem()
  {
    return nonPerishableItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPerishableItem_Price()
  {
    return (EAttribute)nonPerishableItemEClass.getEStructuralFeatures().get(0);
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
  public EReference getPerishableItem_ExperationDate()
  {
    return (EReference)perishableItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddress()
  {
    return addressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_Street()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_Number()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_City()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperationDate()
  {
    return experationDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperationDate_Month()
  {
    return (EAttribute)experationDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperationDate_Day()
  {
    return (EAttribute)experationDateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperationDate_Year()
  {
    return (EAttribute)experationDateEClass.getEStructuralFeatures().get(2);
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
  public EClass getVehicle()
  {
    return vehicleEClass;
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

    deliveryElementEClass = createEClass(DELIVERY_ELEMENT);
    createEAttribute(deliveryElementEClass, DELIVERY_ELEMENT__NAME);

    storeEClass = createEClass(STORE);
    createEReference(storeEClass, STORE__ELEMENTS);

    warehouseEClass = createEClass(WAREHOUSE);
    createEReference(warehouseEClass, WAREHOUSE__ADDRESS);
    createEReference(warehouseEClass, WAREHOUSE__ELEMENTS);

    shelfEClass = createEClass(SHELF);
    createEAttribute(shelfEClass, SHELF__NAME);
    createEReference(shelfEClass, SHELF__ELEMENTS);

    backroomEClass = createEClass(BACKROOM);
    createEAttribute(backroomEClass, BACKROOM__NAME);
    createEReference(backroomEClass, BACKROOM__ELEMENTS);

    itemEClass = createEClass(ITEM);
    createEAttribute(itemEClass, ITEM__NAME);

    nonPerishableItemEClass = createEClass(NON_PERISHABLE_ITEM);
    createEAttribute(nonPerishableItemEClass, NON_PERISHABLE_ITEM__PRICE);

    perishableItemEClass = createEClass(PERISHABLE_ITEM);
    createEReference(perishableItemEClass, PERISHABLE_ITEM__EXPERATION_DATE);

    addressEClass = createEClass(ADDRESS);
    createEAttribute(addressEClass, ADDRESS__STREET);
    createEAttribute(addressEClass, ADDRESS__NUMBER);
    createEAttribute(addressEClass, ADDRESS__CITY);

    experationDateEClass = createEClass(EXPERATION_DATE);
    createEAttribute(experationDateEClass, EXPERATION_DATE__MONTH);
    createEAttribute(experationDateEClass, EXPERATION_DATE__DAY);
    createEAttribute(experationDateEClass, EXPERATION_DATE__YEAR);

    driverEClass = createEClass(DRIVER);

    vehicleEClass = createEClass(VEHICLE);
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
    storeEClass.getESuperTypes().add(this.getBuilding());
    warehouseEClass.getESuperTypes().add(this.getBuilding());
    nonPerishableItemEClass.getESuperTypes().add(this.getItem());
    perishableItemEClass.getESuperTypes().add(this.getItem());
    driverEClass.getESuperTypes().add(this.getDeliveryElement());
    vehicleEClass.getESuperTypes().add(this.getDeliveryElement());

    // Initialize classes and features; add operations and parameters
    initEClass(groceryEClass, Grocery.class, "Grocery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrocery_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Grocery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuilding_Name(), ecorePackage.getEString(), "name", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deliveryElementEClass, DeliveryElement.class, "DeliveryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeliveryElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeliveryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStore_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(warehouseEClass, Warehouse.class, "Warehouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWarehouse_Address(), this.getAddress(), null, "address", null, 0, -1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWarehouse_Elements(), this.getItem(), null, "elements", null, 0, -1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shelfEClass, Shelf.class, "Shelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShelf_Name(), ecorePackage.getEString(), "name", null, 0, 1, Shelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShelf_Elements(), this.getItem(), null, "elements", null, 0, -1, Shelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(backroomEClass, Backroom.class, "Backroom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBackroom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Backroom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBackroom_Elements(), this.getItem(), null, "elements", null, 0, -1, Backroom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonPerishableItemEClass, NonPerishableItem.class, "NonPerishableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNonPerishableItem_Price(), ecorePackage.getEInt(), "price", null, 0, 1, NonPerishableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(perishableItemEClass, PerishableItem.class, "PerishableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerishableItem_ExperationDate(), this.getExperationDate(), null, "experationDate", null, 0, -1, PerishableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddress_Street(), ecorePackage.getEString(), "street", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experationDateEClass, ExperationDate.class, "ExperationDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExperationDate_Month(), ecorePackage.getEInt(), "month", null, 0, 1, ExperationDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperationDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, ExperationDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperationDate_Year(), ecorePackage.getEInt(), "year", null, 0, 1, ExperationDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GroceryPackageImpl
