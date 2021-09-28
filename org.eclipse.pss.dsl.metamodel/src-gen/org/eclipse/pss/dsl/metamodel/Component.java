/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Component#getData_object <em>Data object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Abstract_Component {
	/**
	 * Returns the value of the '<em><b>Data object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Data_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data object</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getComponent_Data_object()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_Object> getData_object();

} // Component
