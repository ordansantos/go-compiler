/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.myGo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.compiler.go.myGo.Expression;
import org.xtext.compiler.go.myGo.ForRange;
import org.xtext.compiler.go.myGo.LineCommand;
import org.xtext.compiler.go.myGo.MyGoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ForRangeImpl#getId1 <em>Id1</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ForRangeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ForRangeImpl#getLineCommand <em>Line Command</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.impl.ForRangeImpl#getId2 <em>Id2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForRangeImpl extends LineCommandImpl implements ForRange
{
  /**
   * The default value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected static final String ID1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected String id1 = ID1_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getLineCommand() <em>Line Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineCommand()
   * @generated
   * @ordered
   */
  protected EList<LineCommand> lineCommand;

  /**
   * The default value of the '{@link #getId2() <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected static final String ID2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId2() <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected String id2 = ID2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForRangeImpl()
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
    return MyGoPackage.Literals.FOR_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId1()
  {
    return id1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId1(String newId1)
  {
    String oldId1 = id1;
    id1 = newId1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.FOR_RANGE__ID1, oldId1, id1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyGoPackage.FOR_RANGE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyGoPackage.FOR_RANGE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyGoPackage.FOR_RANGE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.FOR_RANGE__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LineCommand> getLineCommand()
  {
    if (lineCommand == null)
    {
      lineCommand = new EObjectContainmentEList<LineCommand>(LineCommand.class, this, MyGoPackage.FOR_RANGE__LINE_COMMAND);
    }
    return lineCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId2()
  {
    return id2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId2(String newId2)
  {
    String oldId2 = id2;
    id2 = newId2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGoPackage.FOR_RANGE__ID2, oldId2, id2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyGoPackage.FOR_RANGE__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyGoPackage.FOR_RANGE__LINE_COMMAND:
        return ((InternalEList<?>)getLineCommand()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyGoPackage.FOR_RANGE__ID1:
        return getId1();
      case MyGoPackage.FOR_RANGE__EXPRESSION:
        return getExpression();
      case MyGoPackage.FOR_RANGE__LINE_COMMAND:
        return getLineCommand();
      case MyGoPackage.FOR_RANGE__ID2:
        return getId2();
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
      case MyGoPackage.FOR_RANGE__ID1:
        setId1((String)newValue);
        return;
      case MyGoPackage.FOR_RANGE__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyGoPackage.FOR_RANGE__LINE_COMMAND:
        getLineCommand().clear();
        getLineCommand().addAll((Collection<? extends LineCommand>)newValue);
        return;
      case MyGoPackage.FOR_RANGE__ID2:
        setId2((String)newValue);
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
      case MyGoPackage.FOR_RANGE__ID1:
        setId1(ID1_EDEFAULT);
        return;
      case MyGoPackage.FOR_RANGE__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyGoPackage.FOR_RANGE__LINE_COMMAND:
        getLineCommand().clear();
        return;
      case MyGoPackage.FOR_RANGE__ID2:
        setId2(ID2_EDEFAULT);
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
      case MyGoPackage.FOR_RANGE__ID1:
        return ID1_EDEFAULT == null ? id1 != null : !ID1_EDEFAULT.equals(id1);
      case MyGoPackage.FOR_RANGE__EXPRESSION:
        return expression != null;
      case MyGoPackage.FOR_RANGE__LINE_COMMAND:
        return lineCommand != null && !lineCommand.isEmpty();
      case MyGoPackage.FOR_RANGE__ID2:
        return ID2_EDEFAULT == null ? id2 != null : !ID2_EDEFAULT.equals(id2);
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
    result.append(" (id1: ");
    result.append(id1);
    result.append(", id2: ");
    result.append(id2);
    result.append(')');
    return result.toString();
  }

} //ForRangeImpl