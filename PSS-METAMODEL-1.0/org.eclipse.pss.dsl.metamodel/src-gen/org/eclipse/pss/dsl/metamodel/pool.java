/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.pool#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getpool()
 * @model
 * @generated
 */
public interface pool extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pss.dsl.metamodel.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getpool_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.pss.dsl.metamodel.Object> getObject();

} // pool
