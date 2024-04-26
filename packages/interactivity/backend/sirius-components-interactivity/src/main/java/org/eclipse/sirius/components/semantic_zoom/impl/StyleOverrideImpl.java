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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;
import org.eclipse.sirius.components.semantic_zoom.StyleOverride;

import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.StyleOverrideImpl#getAsElements <em>As Elements</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.impl.StyleOverrideImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleOverrideImpl extends MinimalEObjectImpl.Container implements StyleOverride {
	/**
	 * The default value of the '{@link #getAsElements() <em>As Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsElements()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsElements() <em>As Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsElements()
	 * @generated
	 * @ordered
	 */
	protected String asElements = AS_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected NodeStyleDescription style;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticZoomPackage.Literals.STYLE_OVERRIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAsElements() {
		return asElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsElements(String newAsElements) {
		String oldAsElements = asElements;
		asElements = newAsElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticZoomPackage.STYLE_OVERRIDE__AS_ELEMENTS,
					oldAsElements, asElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeStyleDescription getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (NodeStyleDescription) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticZoomPackage.STYLE_OVERRIDE__STYLE,
							oldStyle, style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStyleDescription basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(NodeStyleDescription newStyle) {
		NodeStyleDescription oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticZoomPackage.STYLE_OVERRIDE__STYLE, oldStyle,
					style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SemanticZoomPackage.STYLE_OVERRIDE__AS_ELEMENTS:
			return getAsElements();
		case SemanticZoomPackage.STYLE_OVERRIDE__STYLE:
			if (resolve)
				return getStyle();
			return basicGetStyle();
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
		case SemanticZoomPackage.STYLE_OVERRIDE__AS_ELEMENTS:
			setAsElements((String) newValue);
			return;
		case SemanticZoomPackage.STYLE_OVERRIDE__STYLE:
			setStyle((NodeStyleDescription) newValue);
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
		case SemanticZoomPackage.STYLE_OVERRIDE__AS_ELEMENTS:
			setAsElements(AS_ELEMENTS_EDEFAULT);
			return;
		case SemanticZoomPackage.STYLE_OVERRIDE__STYLE:
			setStyle((NodeStyleDescription) null);
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
		case SemanticZoomPackage.STYLE_OVERRIDE__AS_ELEMENTS:
			return AS_ELEMENTS_EDEFAULT == null ? asElements != null : !AS_ELEMENTS_EDEFAULT.equals(asElements);
		case SemanticZoomPackage.STYLE_OVERRIDE__STYLE:
			return style != null;
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
		result.append(" (asElements: ");
		result.append(asElements);
		result.append(')');
		return result.toString();
	}

} //StyleOverrideImpl
