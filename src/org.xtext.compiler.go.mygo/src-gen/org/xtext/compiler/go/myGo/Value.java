/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.myGo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compiler.go.myGo.Value#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.Value#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.Value#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.Value#getBoolValue <em>Bool Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compiler.go.myGo.MyGoPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends Expression
{
  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(String)
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getValue_IntValue()
   * @model
   * @generated
   */
  String getIntValue();

  /**
   * Sets the value of the '{@link org.xtext.compiler.go.myGo.Value#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(String value);

  /**
   * Returns the value of the '<em><b>Float Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Float Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Float Value</em>' attribute.
   * @see #setFloatValue(String)
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getValue_FloatValue()
   * @model
   * @generated
   */
  String getFloatValue();

  /**
   * Sets the value of the '{@link org.xtext.compiler.go.myGo.Value#getFloatValue <em>Float Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float Value</em>' attribute.
   * @see #getFloatValue()
   * @generated
   */
  void setFloatValue(String value);

  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getValue_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link org.xtext.compiler.go.myGo.Value#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Bool Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Value</em>' attribute.
   * @see #setBoolValue(String)
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getValue_BoolValue()
   * @model
   * @generated
   */
  String getBoolValue();

  /**
   * Sets the value of the '{@link org.xtext.compiler.go.myGo.Value#getBoolValue <em>Bool Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Value</em>' attribute.
   * @see #getBoolValue()
   * @generated
   */
  void setBoolValue(String value);

} // Value