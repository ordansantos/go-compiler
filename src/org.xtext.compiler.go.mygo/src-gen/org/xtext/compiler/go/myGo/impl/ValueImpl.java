/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.myGo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.compiler.go.myGo.MyGoPackage;
import org.xtext.compiler.go.myGo.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ValueImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ValueImpl#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ValueImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ValueImpl#getBoolValue <em>Bool Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends ExpressionImpl implements Value
{
  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final String INT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected String intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFloatValue() <em>Float Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatValue()
   * @generated
   * @ordered
   */
  protected static final String FLOAT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloatValue() <em>Float Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatValue()
   * @generated
   * @ordered
   */
  protected String floatValue = FLOAT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolValue() <em>Bool Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolValue()
   * @generated
   * @ordered
   */
  protected static final String BOOL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolValue() <em>Bool Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolValue()
   * @generated
   * @ordered
   */
  protected String boolValue = BOOL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return MyGoPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(String newIntValue)
  {
    String oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.VALUE__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFloatValue()
  {
    return floatValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloatValue(String newFloatValue)
  {
    String oldFloatValue = floatValue;
    floatValue = newFloatValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.VALUE__FLOAT_VALUE, oldFloatValue, floatValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.VALUE__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolValue()
  {
    return boolValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolValue(String newBoolValue)
  {
    String oldBoolValue = boolValue;
    boolValue = newBoolValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.VALUE__BOOL_VALUE, oldBoolValue, boolValue));
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
      case MyGoPackage.VALUE__INT_VALUE:
        return getIntValue();
      case MyGoPackage.VALUE__FLOAT_VALUE:
        return getFloatValue();
      case MyGoPackage.VALUE__STRING_VALUE:
        return getStringValue();
      case MyGoPackage.VALUE__BOOL_VALUE:
        return getBoolValue();
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
      case MyGoPackage.VALUE__INT_VALUE:
        setIntValue((String)newValue);
        return;
      case MyGoPackage.VALUE__FLOAT_VALUE:
        setFloatValue((String)newValue);
        return;
      case MyGoPackage.VALUE__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case MyGoPackage.VALUE__BOOL_VALUE:
        setBoolValue((String)newValue);
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
      case MyGoPackage.VALUE__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case MyGoPackage.VALUE__FLOAT_VALUE:
        setFloatValue(FLOAT_VALUE_EDEFAULT);
        return;
      case MyGoPackage.VALUE__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case MyGoPackage.VALUE__BOOL_VALUE:
        setBoolValue(BOOL_VALUE_EDEFAULT);
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
      case MyGoPackage.VALUE__INT_VALUE:
        return INT_VALUE_EDEFAULT == null ? intValue != null : !INT_VALUE_EDEFAULT.equals(intValue);
      case MyGoPackage.VALUE__FLOAT_VALUE:
        return FLOAT_VALUE_EDEFAULT == null ? floatValue != null : !FLOAT_VALUE_EDEFAULT.equals(floatValue);
      case MyGoPackage.VALUE__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case MyGoPackage.VALUE__BOOL_VALUE:
        return BOOL_VALUE_EDEFAULT == null ? boolValue != null : !BOOL_VALUE_EDEFAULT.equals(boolValue);
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
    result.append(" (intValue: ");
    result.append(intValue);
    result.append(", floatValue: ");
    result.append(floatValue);
    result.append(", stringValue: ");
    result.append(stringValue);
    result.append(", boolValue: ");
    result.append(boolValue);
    result.append(')');
    return result.toString();
  }

} //ValueImpl
