/**
 */
package org.eclipse.pss.dsl.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Resource#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Data_Object {
	/**
	 * Returns the value of the '<em><b>Type identifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.pss.dsl.metamodel.Resource_kind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type identifier</em>' attribute.
	 * @see org.eclipse.pss.dsl.metamodel.Resource_kind
	 * @see #setType_identifier(Resource_kind)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getResource_Type_identifier()
	 * @model
	 * @generated
	 */
	Resource_kind getType_identifier();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Resource#getType_identifier <em>Type identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type identifier</em>' attribute.
	 * @see org.eclipse.pss.dsl.metamodel.Resource_kind
	 * @see #getType_identifier()
	 * @generated
	 */
	void setType_identifier(Resource_kind value);

} // Resource
