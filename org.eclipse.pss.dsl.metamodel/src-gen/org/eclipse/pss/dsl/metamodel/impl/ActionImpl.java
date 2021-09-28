/**
 */
package org.eclipse.pss.dsl.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.pss.dsl.metamodel.Action;
import org.eclipse.pss.dsl.metamodel.Activity;
import org.eclipse.pss.dsl.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.ActionImpl#getAction_identifier <em>Action identifier</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.ActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.ActionImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getAction_identifier() <em>Action identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction_identifier() <em>Action identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_identifier()
	 * @generated
	 * @ordered
	 */
	protected String action_identifier = ACTION_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.pss.dsl.metamodel.Object> object;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction_identifier() {
		return action_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction_identifier(String newAction_identifier) {
		String oldAction_identifier = action_identifier;
		action_identifier = newAction_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ACTION__ACTION_IDENTIFIER,
					oldAction_identifier, action_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.pss.dsl.metamodel.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<org.eclipse.pss.dsl.metamodel.Object>(
					org.eclipse.pss.dsl.metamodel.Object.class, this, MetamodelPackage.ACTION__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, MetamodelPackage.ACTION__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ACTION__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.ACTION__ACTIVITY:
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ACTION__ACTION_IDENTIFIER:
			return getAction_identifier();
		case MetamodelPackage.ACTION__OBJECT:
			return getObject();
		case MetamodelPackage.ACTION__ACTIVITY:
			return getActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.ACTION__ACTION_IDENTIFIER:
			setAction_identifier((String) newValue);
			return;
		case MetamodelPackage.ACTION__OBJECT:
			getObject().clear();
			getObject().addAll((Collection<? extends org.eclipse.pss.dsl.metamodel.Object>) newValue);
			return;
		case MetamodelPackage.ACTION__ACTIVITY:
			getActivity().clear();
			getActivity().addAll((Collection<? extends Activity>) newValue);
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
		case MetamodelPackage.ACTION__ACTION_IDENTIFIER:
			setAction_identifier(ACTION_IDENTIFIER_EDEFAULT);
			return;
		case MetamodelPackage.ACTION__OBJECT:
			getObject().clear();
			return;
		case MetamodelPackage.ACTION__ACTIVITY:
			getActivity().clear();
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
		case MetamodelPackage.ACTION__ACTION_IDENTIFIER:
			return ACTION_IDENTIFIER_EDEFAULT == null ? action_identifier != null
					: !ACTION_IDENTIFIER_EDEFAULT.equals(action_identifier);
		case MetamodelPackage.ACTION__OBJECT:
			return object != null && !object.isEmpty();
		case MetamodelPackage.ACTION__ACTIVITY:
			return activity != null && !activity.isEmpty();
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
		result.append(" (action_identifier: ");
		result.append(action_identifier);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
