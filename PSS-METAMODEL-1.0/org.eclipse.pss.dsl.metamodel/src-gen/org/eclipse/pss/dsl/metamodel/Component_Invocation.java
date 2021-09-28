/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Component_Invocation#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getComponent_Invocation()
 * @model
 * @generated
 */
public interface Component_Invocation extends Component {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getComponent_Invocation_Component()
	 * @model
	 * @generated
	 */
	EList<Component> getComponent();

} // Component_Invocation
