/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.myGo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compiler.go.myGo.Receiver#getIdName <em>Id Name</em>}</li>
 *   <li>{@link org.xtext.compiler.go.myGo.Receiver#getIdType <em>Id Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compiler.go.myGo.MyGoPackage#getReceiver()
 * @model
 * @generated
 */
public interface Receiver extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Name</em>' attribute.
   * @see #setIdName(String)
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getReceiver_IdName()
   * @model
   * @generated
   */
  String getIdName();

  /**
   * Sets the value of the '{@link org.xtext.compiler.go.myGo.Receiver#getIdName <em>Id Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Name</em>' attribute.
   * @see #getIdName()
   * @generated
   */
  void setIdName(String value);

  /**
   * Returns the value of the '<em><b>Id Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Type</em>' attribute.
   * @see #setIdType(String)
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getReceiver_IdType()
   * @model
   * @generated
   */
  String getIdType();

  /**
   * Sets the value of the '{@link org.xtext.compiler.go.myGo.Receiver#getIdType <em>Id Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Type</em>' attribute.
   * @see #getIdType()
   * @generated
   */
  void setIdType(String value);

} // Receiver