/**
 */
package org.eclipse.pss.dsl.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.pss.dsl.metamodel.Action;
import org.eclipse.pss.dsl.metamodel.Action_invocation;
import org.eclipse.pss.dsl.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.Action_invocationImpl#getAction_instance <em>Action instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Action_invocationImpl extends ActionImpl implements Action_invocation {
	/**
	 * The cached value of the '{@link #getAction_instance() <em>Action instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_instance()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action_instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Action_invocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ACTION_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction_instance() {
		if (action_instance == null) {
			action_instance = new EObjectResolvingEList<Action>(Action.class, this,
					MetamodelPackage.ACTION_INVOCATION__ACTION_INSTANCE);
		}
		return action_instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ACTION_INVOCATION__ACTION_INSTANCE:
			return getAction_instance();
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
		case MetamodelPackage.ACTION_INVOCATION__ACTION_INSTANCE:
			getAction_instance().clear();
			getAction_instance().addAll((Collection<? extends Action>) newValue);
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
		case MetamodelPackage.ACTION_INVOCATION__ACTION_INSTANCE:
			getAction_instance().clear();
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
		case MetamodelPackage.ACTION_INVOCATION__ACTION_INSTANCE:
			return action_instance != null && !action_instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Action_invocationImpl
