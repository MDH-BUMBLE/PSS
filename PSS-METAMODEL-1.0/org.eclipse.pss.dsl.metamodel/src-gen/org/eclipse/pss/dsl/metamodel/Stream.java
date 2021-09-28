/**
 */
package org.eclipse.pss.dsl.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Stream#isInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Stream#isOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getStream()
 * @model
 * @generated
 */
public interface Stream extends DataFlow_Object {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(boolean)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getStream_Input()
	 * @model
	 * @generated
	 */
	boolean isInput();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Stream#isInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #isInput()
	 * @generated
	 */
	void setInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(boolean)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getStream_Output()
	 * @model default="true"
	 * @generated
	 */
	boolean isOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Stream#isOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #isOutput()
	 * @generated
	 */
	void setOutput(boolean value);

} // Stream
