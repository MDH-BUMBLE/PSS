/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Action#getAction_identifier <em>Action identifier</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Action#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Action#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Action identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action identifier</em>' attribute.
	 * @see #setAction_identifier(String)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAction_Action_identifier()
	 * @model
	 * @generated
	 */
	String getAction_identifier();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Action#getAction_identifier <em>Action identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action identifier</em>' attribute.
	 * @see #getAction_identifier()
	 * @generated
	 */
	void setAction_identifier(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAction_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.pss.dsl.metamodel.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAction_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // Action
