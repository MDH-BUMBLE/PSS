/**
 */
package org.eclipse.pss.dsl.metamodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.pss.dsl.metamodel.util.MetamodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelItemProviderAdapterFactory extends MetamodelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.RootComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootComponentItemProvider rootComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.RootComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootComponentAdapter() {
		if (rootComponentItemProvider == null) {
			rootComponentItemProvider = new RootComponentItemProvider(this);
		}

		return rootComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.pool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected poolItemProvider poolItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createpoolAdapter() {
		if (poolItemProvider == null) {
			poolItemProvider = new poolItemProvider(this);
		}

		return poolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.PssModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PssModelItemProvider pssModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.PssModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPssModelAdapter() {
		if (pssModelItemProvider == null) {
			pssModelItemProvider = new PssModelItemProvider(this);
		}

		return pssModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Component_Invocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component_InvocationItemProvider component_InvocationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Component_Invocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponent_InvocationAdapter() {
		if (component_InvocationItemProvider == null) {
			component_InvocationItemProvider = new Component_InvocationItemProvider(this);
		}

		return component_InvocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Action_invocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Action_invocationItemProvider action_invocationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Action_invocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAction_invocationAdapter() {
		if (action_invocationItemProvider == null) {
			action_invocationItemProvider = new Action_invocationItemProvider(this);
		}

		return action_invocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Stream} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamItemProvider streamItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Stream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStreamAdapter() {
		if (streamItemProvider == null) {
			streamItemProvider = new StreamItemProvider(this);
		}

		return streamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.pss.dsl.metamodel.Buffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferItemProvider bufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.pss.dsl.metamodel.Buffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferAdapter() {
		if (bufferItemProvider == null) {
			bufferItemProvider = new BufferItemProvider(this);
		}

		return bufferItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (resourceItemProvider != null)
			resourceItemProvider.dispose();
		if (rootComponentItemProvider != null)
			rootComponentItemProvider.dispose();
		if (actionItemProvider != null)
			actionItemProvider.dispose();
		if (activityItemProvider != null)
			activityItemProvider.dispose();
		if (pssModelItemProvider != null)
			pssModelItemProvider.dispose();
		if (component_InvocationItemProvider != null)
			component_InvocationItemProvider.dispose();
		if (streamItemProvider != null)
			streamItemProvider.dispose();
		if (bufferItemProvider != null)
			bufferItemProvider.dispose();
		if (poolItemProvider != null)
			poolItemProvider.dispose();
		if (action_invocationItemProvider != null)
			action_invocationItemProvider.dispose();
	}

}
