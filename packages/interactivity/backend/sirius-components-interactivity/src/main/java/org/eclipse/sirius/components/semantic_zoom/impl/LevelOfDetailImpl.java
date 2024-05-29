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
import org.eclipse.sirius.components.semantic_zoom.LevelOfDetail;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;
import org.eclipse.sirius.components.semantic_zoom.StyleOverride;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Of Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl#getStyleOverrides <em>Style Overrides</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl#getHiddenASElements <em>Hidden AS Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelOfDetailImpl extends MinimalEObjectImpl.Container implements LevelOfDetail {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyleOverrides() <em>Style Overrides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleOverrides()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleOverride> styleOverrides;

	/**
	 * The default value of the '{@link #getHiddenASElements() <em>Hidden AS Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenASElements()
	 * @generated
	 * @ordered
	 */
	protected static final String HIDDEN_AS_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHiddenASElements() <em>Hidden AS Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenASElements()
	 * @generated
	 * @ordered
	 */
	protected String hiddenASElements = HIDDEN_AS_ELEMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelOfDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticZoomPackage.Literals.LEVEL_OF_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticZoomPackage.LEVEL_OF_DETAIL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyleOverride> getStyleOverrides() {
		if (styleOverrides == null) {
			styleOverrides = new EObjectContainmentEList<>(StyleOverride.class, this,
					SemanticZoomPackage.LEVEL_OF_DETAIL__STYLE_OVERRIDES);
		}
		return styleOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHiddenASElements() {
		return hiddenASElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHiddenASElements(String newHiddenASElements) {
		String oldHiddenASElements = hiddenASElements;
		hiddenASElements = newHiddenASElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SemanticZoomPackage.LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS, oldHiddenASElements, hiddenASElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SemanticZoomPackage.LEVEL_OF_DETAIL__STYLE_OVERRIDES:
			return ((InternalEList<?>) getStyleOverrides()).basicRemove(otherEnd, msgs);
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
		case SemanticZoomPackage.LEVEL_OF_DETAIL__NAME:
			return getName();
		case SemanticZoomPackage.LEVEL_OF_DETAIL__STYLE_OVERRIDES:
			return getStyleOverrides();
		case SemanticZoomPackage.LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS:
			return getHiddenASElements();
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
		case SemanticZoomPackage.LEVEL_OF_DETAIL__NAME:
			setName((String) newValue);
			return;
		case SemanticZoomPackage.LEVEL_OF_DETAIL__STYLE_OVERRIDES:
			getStyleOverrides().clear();
			getStyleOverrides().addAll((Collection<? extends StyleOverride>) newValue);
			return;
		case SemanticZoomPackage.LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS:
			setHiddenASElements((String) newValue);
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
		case SemanticZoomPackage.LEVEL_OF_DETAIL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SemanticZoomPackage.LEVEL_OF_DETAIL__STYLE_OVERRIDES:
			getStyleOverrides().clear();
			return;
		case SemanticZoomPackage.LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS:
			setHiddenASElements(HIDDEN_AS_ELEMENTS_EDEFAULT);
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
		case SemanticZoomPackage.LEVEL_OF_DETAIL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SemanticZoomPackage.LEVEL_OF_DETAIL__STYLE_OVERRIDES:
			return styleOverrides != null && !styleOverrides.isEmpty();
		case SemanticZoomPackage.LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS:
			return HIDDEN_AS_ELEMENTS_EDEFAULT == null ? hiddenASElements != null
					: !HIDDEN_AS_ELEMENTS_EDEFAULT.equals(hiddenASElements);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", hiddenASElements: ");
		result.append(hiddenASElements);
		result.append(')');
		return result.toString();
	}

} //LevelOfDetailImpl
