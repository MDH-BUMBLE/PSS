/**
 */
package org.eclipse.pss.dsl.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.pss.dsl.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.ObjectImpl#getObject_identifier <em>Object identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectImpl extends MinimalEObjectImpl.Container implements org.eclipse.pss.dsl.metamodel.Object {
	/**
	 * The default value of the '{@link #getObject_identifier() <em>Object identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject_identifier() <em>Object identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject_identifier()
	 * @generated
	 * @ordered
	 */
	protected String object_identifier = OBJECT_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObject_identifier() {
		return object_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObject_identifier(String newObject_identifier) {
		String oldObject_identifier = object_identifier;
		object_identifier = newObject_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.OBJECT__OBJECT_IDENTIFIER,
					oldObject_identifier, object_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.OBJECT__OBJECT_IDENTIFIER:
			return getObject_identifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.OBJECT__OBJECT_IDENTIFIER:
			setObject_identifier((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.OBJECT__OBJECT_IDENTIFIER:
			setObject_identifier(OBJECT_IDENTIFIER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.OBJECT__OBJECT_IDENTIFIER:
			return OBJECT_IDENTIFIER_EDEFAULT == null ? object_identifier != null
					: !OBJECT_IDENTIFIER_EDEFAULT.equals(object_identifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Object_identifier: ");
		result.append(object_identifier);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
