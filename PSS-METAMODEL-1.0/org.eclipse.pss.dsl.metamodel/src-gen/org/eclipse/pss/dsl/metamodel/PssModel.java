/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pss Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.PssModel#getComponent_declaration <em>Component declaration</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.PssModel#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getPssModel()
 * @model
 * @generated
 */
public interface PssModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Component declaration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Abstract_Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component declaration</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getPssModel_Component_declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Abstract_Component> getComponent_declaration();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getPssModel_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

} // PssModel
