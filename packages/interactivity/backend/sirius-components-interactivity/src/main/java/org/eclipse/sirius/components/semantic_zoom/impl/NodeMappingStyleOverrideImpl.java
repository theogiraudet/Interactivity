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
package org.eclipse.sirius.components.semantic_zoom.impl;

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
import org.eclipse.sirius.components.semantic_zoom.GraphicalFilter;
import org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;
import org.eclipse.sirius.components.view.diagram.NodeDescription;
import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Mapping Style Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl#getNodeDescription <em>Node Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeMappingStyleOverrideImpl extends MinimalEObjectImpl.Container implements NodeMappingStyleOverride {
	/**
	 * The cached value of the '{@link #getNodeDescription() <em>Node Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeDescription()
	 * @generated
	 * @ordered
	 */
	protected NodeDescription nodeDescription;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected NodeStyleDescription style;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicalFilter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeMappingStyleOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticZoomPackage.Literals.NODE_MAPPING_STYLE_OVERRIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeDescription getNodeDescription() {
		if (nodeDescription != null && nodeDescription.eIsProxy()) {
			InternalEObject oldNodeDescription = (InternalEObject) nodeDescription;
			nodeDescription = (NodeDescription) eResolveProxy(oldNodeDescription);
			if (nodeDescription != oldNodeDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION, oldNodeDescription,
							nodeDescription));
			}
		}
		return nodeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDescription basicGetNodeDescription() {
		return nodeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeDescription(NodeDescription newNodeDescription) {
		NodeDescription oldNodeDescription = nodeDescription;
		nodeDescription = newNodeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION, oldNodeDescription,
					nodeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeStyleDescription getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(NodeStyleDescription newStyle, NotificationChain msgs) {
		NodeStyleDescription oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE, oldStyle, newStyle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(NodeStyleDescription newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject) style).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicalFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<>(GraphicalFilter.class, this,
					SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE:
			return basicSetStyle(null, msgs);
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__FILTERS:
			return ((InternalEList<?>) getFilters()).basicRemove(otherEnd, msgs);
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
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION:
			if (resolve)
				return getNodeDescription();
			return basicGetNodeDescription();
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE:
			return getStyle();
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__FILTERS:
			return getFilters();
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
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION:
			setNodeDescription((NodeDescription) newValue);
			return;
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE:
			setStyle((NodeStyleDescription) newValue);
			return;
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__FILTERS:
			getFilters().clear();
			getFilters().addAll((Collection<? extends GraphicalFilter>) newValue);
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
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION:
			setNodeDescription((NodeDescription) null);
			return;
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE:
			setStyle((NodeStyleDescription) null);
			return;
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__FILTERS:
			getFilters().clear();
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
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION:
			return nodeDescription != null;
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__STYLE:
			return style != null;
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE__FILTERS:
			return filters != null && !filters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeMappingStyleOverrideImpl
