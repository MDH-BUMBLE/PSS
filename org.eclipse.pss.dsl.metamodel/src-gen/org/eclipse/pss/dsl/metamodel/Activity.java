/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Activity#getAction_invocation <em>Action invocation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Action invocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Action_invocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action invocation</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getActivity_Action_invocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action_invocation> getAction_invocation();

} // Activity
