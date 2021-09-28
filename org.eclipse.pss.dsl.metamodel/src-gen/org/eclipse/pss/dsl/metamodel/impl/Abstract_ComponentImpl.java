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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.pss.dsl.metamodel.Abstract_Component;
import org.eclipse.pss.dsl.metamodel.Action;
import org.eclipse.pss.dsl.metamodel.MetamodelPackage;
import org.eclipse.pss.dsl.metamodel.pool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl#getComponent_identifier <em>Component identifier</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Abstract_ComponentImpl extends MinimalEObjectImpl.Container implements Abstract_Component {
	/**
	 * The default value of the '{@link #getComponent_identifier() <em>Component identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent_identifier() <em>Component identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_identifier()
	 * @generated
	 * @ordered
	 */
	protected String component_identifier = COMPONENT_IDENTIFIER_EDEFAULT;

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
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Abstract_Component> extends_;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected EList<pool> pool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Abstract_ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ABSTRACT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponent_identifier() {
		return component_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent_identifier(String newComponent_identifier) {
		String oldComponent_identifier = component_identifier;
		component_identifier = newComponent_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER, oldComponent_identifier,
					component_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this,
					MetamodelPackage.ABSTRACT_COMPONENT__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Abstract_Component> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<Abstract_Component>(Abstract_Component.class, this,
					MetamodelPackage.ABSTRACT_COMPONENT__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<pool> getPool() {
		if (pool == null) {
			pool = new EObjectContainmentEList<pool>(pool.class, this, MetamodelPackage.ABSTRACT_COMPONENT__POOL);
		}
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ABSTRACT_COMPONENT__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.ABSTRACT_COMPONENT__POOL:
			return ((InternalEList<?>) getPool()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER:
			return getComponent_identifier();
		case MetamodelPackage.ABSTRACT_COMPONENT__ACTION:
			return getAction();
		case MetamodelPackage.ABSTRACT_COMPONENT__EXTENDS:
			return getExtends();
		case MetamodelPackage.ABSTRACT_COMPONENT__POOL:
			return getPool();
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
		case MetamodelPackage.ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER:
			setComponent_identifier((String) newValue);
			return;
		case MetamodelPackage.ABSTRACT_COMPONENT__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case MetamodelPackage.ABSTRACT_COMPONENT__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends Abstract_Component>) newValue);
			return;
		case MetamodelPackage.ABSTRACT_COMPONENT__POOL:
			getPool().clear();
			getPool().addAll((Collection<? extends pool>) newValue);
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
		case MetamodelPackage.ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER:
			setComponent_identifier(COMPONENT_IDENTIFIER_EDEFAULT);
			return;
		case MetamodelPackage.ABSTRACT_COMPONENT__ACTION:
			getAction().clear();
			return;
		case MetamodelPackage.ABSTRACT_COMPONENT__EXTENDS:
			getExtends().clear();
			return;
		case MetamodelPackage.ABSTRACT_COMPONENT__POOL:
			getPool().clear();
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
		case MetamodelPackage.ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER:
			return COMPONENT_IDENTIFIER_EDEFAULT == null ? component_identifier != null
					: !COMPONENT_IDENTIFIER_EDEFAULT.equals(component_identifier);
		case MetamodelPackage.ABSTRACT_COMPONENT__ACTION:
			return action != null && !action.isEmpty();
		case MetamodelPackage.ABSTRACT_COMPONENT__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
		case MetamodelPackage.ABSTRACT_COMPONENT__POOL:
			return pool != null && !pool.isEmpty();
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
		result.append(" (Component_identifier: ");
		result.append(component_identifier);
		result.append(')');
		return result.toString();
	}

} //Abstract_ComponentImpl
