/**
 */
package org.eclipse.pss.dsl.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Buffer#isInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.Buffer#isOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getBuffer()
 * @model
 * @generated
 */
public interface Buffer extends DataFlow_Object {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(boolean)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getBuffer_Input()
	 * @model default="true"
	 * @generated
	 */
	boolean isInput();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Buffer#isInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #isInput()
	 * @generated
	 */
	void setInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(boolean)
	 * @see org.eclipse.pss.dsl.metamodel.MetamodelPackage#getBuffer_Output()
	 * @model default="false"
	 * @generated
	 */
	boolean isOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.pss.dsl.metamodel.Buffer#isOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #isOutput()
	 * @generated
	 */
	void setOutput(boolean value);

} // Buffer
