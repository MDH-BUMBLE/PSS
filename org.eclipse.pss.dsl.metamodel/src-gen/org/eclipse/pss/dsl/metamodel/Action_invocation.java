/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Action_invocation#getAction_instance <em>Action instance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAction_invocation()
 * @model
 * @generated
 */
public interface Action_invocation extends Action {
	/**
	 * Returns the value of the '<em><b>Action instance</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action instance</em>' reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAction_invocation_Action_instance()
	 * @model
	 * @generated
	 */
	EList<Action> getAction_instance();

} // Action_invocation
