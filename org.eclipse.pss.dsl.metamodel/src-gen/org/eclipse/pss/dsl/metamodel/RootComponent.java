/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.RootComponent#getComponent_invocation <em>Component invocation</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.RootComponent#getAction_invocation <em>Action invocation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getRootComponent()
 * @model
 * @generated
 */
public interface RootComponent extends Abstract_Component {
	/**
	 * Returns the value of the '<em><b>Component invocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Component_Invocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component invocation</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getRootComponent_Component_invocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component_Invocation> getComponent_invocation();

	/**
	 * Returns the value of the '<em><b>Action invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action invocation</em>' reference.
	 * @see #setAction_invocation(Action_invocation)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getRootComponent_Action_invocation()
	 * @model
	 * @generated
	 */
	Action_invocation getAction_invocation();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.RootComponent#getAction_invocation <em>Action invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action invocation</em>' reference.
	 * @see #getAction_invocation()
	 * @generated
	 */
	void setAction_invocation(Action_invocation value);

} // RootComponent
