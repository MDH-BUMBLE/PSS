/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Object#getObject_identifier <em>Object identifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getObject()
 * @model abstract="true"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object identifier</em>' attribute.
	 * @see #setObject_identifier(String)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getObject_Object_identifier()
	 * @model required="true"
	 * @generated
	 */
	String getObject_identifier();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Object#getObject_identifier <em>Object identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object identifier</em>' attribute.
	 * @see #getObject_identifier()
	 * @generated
	 */
	void setObject_identifier(String value);

} // Object
