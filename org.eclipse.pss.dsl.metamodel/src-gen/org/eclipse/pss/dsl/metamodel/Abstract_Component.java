/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getComponent_identifier <em>Component identifier</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAbstract_Component()
 * @model abstract="true"
 * @generated
 */
public interface Abstract_Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Component identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component identifier</em>' attribute.
	 * @see #setComponent_identifier(String)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAbstract_Component_Component_identifier()
	 * @model
	 * @generated
	 */
	String getComponent_identifier();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getComponent_identifier <em>Component identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component identifier</em>' attribute.
	 * @see #getComponent_identifier()
	 * @generated
	 */
	void setComponent_identifier(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAbstract_Component_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Abstract_Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAbstract_Component_Extends()
	 * @model
	 * @generated
	 */
	EList<Abstract_Component> getExtends();

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getAbstract_Component_Pool()
	 * @model containment="true"
	 * @generated
	 */
	EList<pool> getPool();

} // Abstract_Component
