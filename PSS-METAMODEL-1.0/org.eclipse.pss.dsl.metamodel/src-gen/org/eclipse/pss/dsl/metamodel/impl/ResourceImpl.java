/**
 */
package org.eclipse.pss.dsl.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.pss.dsl.metamodel.MetamodelPackage;
import org.eclipse.pss.dsl.metamodel.Resource;
import org.eclipse.pss.dsl.metamodel.Resource_kind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.ResourceImpl#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends Data_ObjectImpl implements Resource {
	/**
	 * The default value of the '{@link #getType_identifier() <em>Type identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final Resource_kind TYPE_IDENTIFIER_EDEFAULT = Resource_kind.NONE;

	/**
	 * The cached value of the '{@link #getType_identifier() <em>Type identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_identifier()
	 * @generated
	 * @ordered
	 */
	protected Resource_kind type_identifier = TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource_kind getType_identifier() {
		return type_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_identifier(Resource_kind newType_identifier) {
		Resource_kind oldType_identifier = type_identifier;
		type_identifier = newType_identifier == null ? TYPE_IDENTIFIER_EDEFAULT : newType_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCE__TYPE_IDENTIFIER,
					oldType_identifier, type_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.RESOURCE__TYPE_IDENTIFIER:
			return getType_identifier();
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
		case MetamodelPackage.RESOURCE__TYPE_IDENTIFIER:
			setType_identifier((Resource_kind) newValue);
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
		case MetamodelPackage.RESOURCE__TYPE_IDENTIFIER:
			setType_identifier(TYPE_IDENTIFIER_EDEFAULT);
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
		case MetamodelPackage.RESOURCE__TYPE_IDENTIFIER:
			return type_identifier != TYPE_IDENTIFIER_EDEFAULT;
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
		result.append(" (type_identifier: ");
		result.append(type_identifier);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
