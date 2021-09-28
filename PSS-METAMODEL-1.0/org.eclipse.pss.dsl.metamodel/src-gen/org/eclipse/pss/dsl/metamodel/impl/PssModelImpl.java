/**
 */
package org.eclipse.pss.dsl.metamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.pss.dsl.metamodel.Abstract_Component;
import org.eclipse.pss.dsl.metamodel.Action;
import org.eclipse.pss.dsl.metamodel.MetamodelPackage;
import org.eclipse.pss.dsl.metamodel.PssModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.PssModelImpl#getComponent_declaration <em>Component declaration</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.PssModelImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssModelImpl extends MinimalEObjectImpl.Container implements PssModel {
	/**
	 * The cached value of the '{@link #getComponent_declaration() <em>Component declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_declaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Abstract_Component> component_declaration;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PssModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PSS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Abstract_Component> getComponent_declaration() {
		if (component_declaration == null) {
			component_declaration = new EObjectContainmentEList<Abstract_Component>(Abstract_Component.class, this,
					MetamodelPackage.PSS_MODEL__COMPONENT_DECLARATION);
		}
		return component_declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, MetamodelPackage.PSS_MODEL__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.PSS_MODEL__COMPONENT_DECLARATION:
			return ((InternalEList<?>) getComponent_declaration()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.PSS_MODEL__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.PSS_MODEL__COMPONENT_DECLARATION:
			return getComponent_declaration();
		case MetamodelPackage.PSS_MODEL__ACTION:
			return getAction();
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
		case MetamodelPackage.PSS_MODEL__COMPONENT_DECLARATION:
			getComponent_declaration().clear();
			getComponent_declaration().addAll((Collection<? extends Abstract_Component>) newValue);
			return;
		case MetamodelPackage.PSS_MODEL__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
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
		case MetamodelPackage.PSS_MODEL__COMPONENT_DECLARATION:
			getComponent_declaration().clear();
			return;
		case MetamodelPackage.PSS_MODEL__ACTION:
			getAction().clear();
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
		case MetamodelPackage.PSS_MODEL__COMPONENT_DECLARATION:
			return component_declaration != null && !component_declaration.isEmpty();
		case MetamodelPackage.PSS_MODEL__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PssModelImpl
