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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pss.dsl.metamodel.Action_invocation;
import org.eclipse.pss.dsl.metamodel.Component_Invocation;
import org.eclipse.pss.dsl.metamodel.MetamodelPackage;
import org.eclipse.pss.dsl.metamodel.RootComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.RootComponentImpl#getComponent_invocation <em>Component invocation</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.RootComponentImpl#getAction_invocation <em>Action invocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootComponentImpl extends Abstract_ComponentImpl implements RootComponent {
	/**
	 * The cached value of the '{@link #getComponent_invocation() <em>Component invocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_invocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Component_Invocation> component_invocation;

	/**
	 * The cached value of the '{@link #getAction_invocation() <em>Action invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_invocation()
	 * @generated
	 * @ordered
	 */
	protected Action_invocation action_invocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ROOT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component_Invocation> getComponent_invocation() {
		if (component_invocation == null) {
			component_invocation = new EObjectContainmentEList<Component_Invocation>(Component_Invocation.class, this,
					MetamodelPackage.ROOT_COMPONENT__COMPONENT_INVOCATION);
		}
		return component_invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ROOT_COMPONENT__COMPONENT_INVOCATION:
			return ((InternalEList<?>) getComponent_invocation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action_invocation getAction_invocation() {
		if (action_invocation != null && action_invocation.eIsProxy()) {
			InternalEObject oldAction_invocation = (InternalEObject) action_invocation;
			action_invocation = (Action_invocation) eResolveProxy(oldAction_invocation);
			if (action_invocation != oldAction_invocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.ROOT_COMPONENT__ACTION_INVOCATION, oldAction_invocation,
							action_invocation));
			}
		}
		return action_invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_invocation basicGetAction_invocation() {
		return action_invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction_invocation(Action_invocation newAction_invocation) {
		Action_invocation oldAction_invocation = action_invocation;
		action_invocation = newAction_invocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ROOT_COMPONENT__ACTION_INVOCATION,
					oldAction_invocation, action_invocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ROOT_COMPONENT__COMPONENT_INVOCATION:
			return getComponent_invocation();
		case MetamodelPackage.ROOT_COMPONENT__ACTION_INVOCATION:
			if (resolve)
				return getAction_invocation();
			return basicGetAction_invocation();
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
		case MetamodelPackage.ROOT_COMPONENT__COMPONENT_INVOCATION:
			getComponent_invocation().clear();
			getComponent_invocation().addAll((Collection<? extends Component_Invocation>) newValue);
			return;
		case MetamodelPackage.ROOT_COMPONENT__ACTION_INVOCATION:
			setAction_invocation((Action_invocation) newValue);
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
		case MetamodelPackage.ROOT_COMPONENT__COMPONENT_INVOCATION:
			getComponent_invocation().clear();
			return;
		case MetamodelPackage.ROOT_COMPONENT__ACTION_INVOCATION:
			setAction_invocation((Action_invocation) null);
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
		case MetamodelPackage.ROOT_COMPONENT__COMPONENT_INVOCATION:
			return component_invocation != null && !component_invocation.isEmpty();
		case MetamodelPackage.ROOT_COMPONENT__ACTION_INVOCATION:
			return action_invocation != null;
		}
		return super.eIsSet(featureID);
	}

} //RootComponentImpl
