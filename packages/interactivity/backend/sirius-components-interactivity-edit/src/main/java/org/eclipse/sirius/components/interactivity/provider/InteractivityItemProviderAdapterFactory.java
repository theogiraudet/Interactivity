/**
 * Copyright (c) 2021 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.sirius.components.interactivity.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.util.InteractivityAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractivityItemProviderAdapterFactory extends InteractivityAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			InteractivityEditPlugin.INSTANCE, InteractivityPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractivityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.Interactivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractivityItemProvider interactivityItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.Interactivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractivityAdapter() {
		if (interactivityItemProvider == null) {
			interactivityItemProvider = new InteractivityItemProvider(this);
		}

		return interactivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.SemanticZoom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticZoomItemProvider semanticZoomItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.SemanticZoom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemanticZoomAdapter() {
		if (semanticZoomItemProvider == null) {
			semanticZoomItemProvider = new SemanticZoomItemProvider(this);
		}

		return semanticZoomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.Level} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelItemProvider levelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLevelAdapter() {
		if (levelItemProvider == null) {
			levelItemProvider = new LevelItemProvider(this);
		}

		return levelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.FilterDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterDefinitionItemProvider filterDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.FilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterDefinitionAdapter() {
		if (filterDefinitionItemProvider == null) {
			filterDefinitionItemProvider = new FilterDefinitionItemProvider(this);
		}

		return filterDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.VisibilityModifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityModifierItemProvider visibilityModifierItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.VisibilityModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisibilityModifierAdapter() {
		if (visibilityModifierItemProvider == null) {
			visibilityModifierItemProvider = new VisibilityModifierItemProvider(this);
		}

		return visibilityModifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.StyleModifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleModifierItemProvider styleModifierItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.StyleModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStyleModifierAdapter() {
		if (styleModifierItemProvider == null) {
			styleModifierItemProvider = new StyleModifierItemProvider(this);
		}

		return styleModifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.DynamicFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicFilterItemProvider dynamicFilterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.DynamicFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicFilterAdapter() {
		if (dynamicFilterItemProvider == null) {
			dynamicFilterItemProvider = new DynamicFilterItemProvider(this);
		}

		return dynamicFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.Filter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterItemProvider filterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterAdapter() {
		if (filterItemProvider == null) {
			filterItemProvider = new FilterItemProvider(this);
		}

		return filterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.FixedRadius} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedRadiusItemProvider fixedRadiusItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.FixedRadius}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedRadiusAdapter() {
		if (fixedRadiusItemProvider == null) {
			fixedRadiusItemProvider = new FixedRadiusItemProvider(this);
		}

		return fixedRadiusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.BoundedRadius} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedRadiusItemProvider boundedRadiusItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.BoundedRadius}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundedRadiusAdapter() {
		if (boundedRadiusItemProvider == null) {
			boundedRadiusItemProvider = new BoundedRadiusItemProvider(this);
		}

		return boundedRadiusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.interactivity.SemanticSearch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticSearchItemProvider semanticSearchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.components.interactivity.SemanticSearch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemanticSearchAdapter() {
		if (semanticSearchItemProvider == null) {
			semanticSearchItemProvider = new SemanticSearchItemProvider(this);
		}

		return semanticSearchItemProvider;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
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
		if (interactivityItemProvider != null)
			interactivityItemProvider.dispose();
		if (semanticZoomItemProvider != null)
			semanticZoomItemProvider.dispose();
		if (levelItemProvider != null)
			levelItemProvider.dispose();
		if (filterDefinitionItemProvider != null)
			filterDefinitionItemProvider.dispose();
		if (visibilityModifierItemProvider != null)
			visibilityModifierItemProvider.dispose();
		if (styleModifierItemProvider != null)
			styleModifierItemProvider.dispose();
		if (dynamicFilterItemProvider != null)
			dynamicFilterItemProvider.dispose();
		if (filterItemProvider != null)
			filterItemProvider.dispose();
		if (fixedRadiusItemProvider != null)
			fixedRadiusItemProvider.dispose();
		if (boundedRadiusItemProvider != null)
			boundedRadiusItemProvider.dispose();
		if (semanticSearchItemProvider != null)
			semanticSearchItemProvider.dispose();
	}

}
