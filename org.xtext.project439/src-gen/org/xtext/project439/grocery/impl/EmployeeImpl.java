/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.project439.grocery.Employee;
import org.xtext.project439.grocery.GroceryPackage;
import org.xtext.project439.grocery.StockMovement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project439.grocery.impl.EmployeeImpl#getEmployeeName <em>Employee Name</em>}</li>
 *   <li>{@link org.xtext.project439.grocery.impl.EmployeeImpl#getStockMovement <em>Stock Movement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee
{
  /**
   * The default value of the '{@link #getEmployeeName() <em>Employee Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmployeeName()
   * @generated
   * @ordered
   */
  protected static final String EMPLOYEE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmployeeName() <em>Employee Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmployeeName()
   * @generated
   * @ordered
   */
  protected String employeeName = EMPLOYEE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStockMovement() <em>Stock Movement</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStockMovement()
   * @generated
   * @ordered
   */
  protected EList<StockMovement> stockMovement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmployeeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GroceryPackage.Literals.EMPLOYEE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmployeeName()
  {
    return employeeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmployeeName(String newEmployeeName)
  {
    String oldEmployeeName = employeeName;
    employeeName = newEmployeeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GroceryPackage.EMPLOYEE__EMPLOYEE_NAME, oldEmployeeName, employeeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StockMovement> getStockMovement()
  {
    if (stockMovement == null)
    {
      stockMovement = new EObjectResolvingEList<StockMovement>(StockMovement.class, this, GroceryPackage.EMPLOYEE__STOCK_MOVEMENT);
    }
    return stockMovement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GroceryPackage.EMPLOYEE__EMPLOYEE_NAME:
        return getEmployeeName();
      case GroceryPackage.EMPLOYEE__STOCK_MOVEMENT:
        return getStockMovement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GroceryPackage.EMPLOYEE__EMPLOYEE_NAME:
        setEmployeeName((String)newValue);
        return;
      case GroceryPackage.EMPLOYEE__STOCK_MOVEMENT:
        getStockMovement().clear();
        getStockMovement().addAll((Collection<? extends StockMovement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GroceryPackage.EMPLOYEE__EMPLOYEE_NAME:
        setEmployeeName(EMPLOYEE_NAME_EDEFAULT);
        return;
      case GroceryPackage.EMPLOYEE__STOCK_MOVEMENT:
        getStockMovement().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GroceryPackage.EMPLOYEE__EMPLOYEE_NAME:
        return EMPLOYEE_NAME_EDEFAULT == null ? employeeName != null : !EMPLOYEE_NAME_EDEFAULT.equals(employeeName);
      case GroceryPackage.EMPLOYEE__STOCK_MOVEMENT:
        return stockMovement != null && !stockMovement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (employeeName: ");
    result.append(employeeName);
    result.append(')');
    return result.toString();
  }

} //EmployeeImpl
