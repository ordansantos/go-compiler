/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.myGo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compiler.go.myGo.ParametersDeclaration#getIdType <em>Id Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compiler.go.myGo.MyGoPackage#getParametersDeclaration()
 * @model
 * @generated
 */
public interface ParametersDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.go.myGo.IdType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Type</em>' containment reference list.
   * @see org.xtext.compiler.go.myGo.MyGoPackage#getParametersDeclaration_IdType()
   * @model containment="true"
   * @generated
   */
  EList<IdType> getIdType();

} // ParametersDeclaration
