/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.grocery.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project439.grocery.GroceryPackage;
import org.xtext.project439.grocery.Produce;
import org.xtext.project439.grocery.qualityLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project439.grocery.impl.ProduceImpl#getQuality <em>Quality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProduceImpl extends FoodItemImpl implements Produce
{
  /**
   * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuality()
   * @generated
   * @ordered
   */
  protected static final qualityLevel QUALITY_EDEFAULT = qualityLevel.GOOD;

  /**
   * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuality()
   * @generated
   * @ordered
   */
  protected qualityLevel quality = QUALITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProduceImpl()
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
    return GroceryPackage.Literals.PRODUCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualityLevel getQuality()
  {
    return quality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuality(qualityLevel newQuality)
  {
    qualityLevel oldQuality = quality;
    quality = newQuality == null ? QUALITY_EDEFAULT : newQuality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GroceryPackage.PRODUCE__QUALITY, oldQuality, quality));
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
      case GroceryPackage.PRODUCE__QUALITY:
        return getQuality();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GroceryPackage.PRODUCE__QUALITY:
        setQuality((qualityLevel)newValue);
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
      case GroceryPackage.PRODUCE__QUALITY:
        setQuality(QUALITY_EDEFAULT);
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
      case GroceryPackage.PRODUCE__QUALITY:
        return quality != QUALITY_EDEFAULT;
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
    result.append(" (quality: ");
    result.append(quality);
    result.append(')');
    return result.toString();
  }

} //ProduceImpl
