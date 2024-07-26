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
package org.eclipse.sirius.components.interactivity.impl;

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

import org.eclipse.sirius.components.interactivity.DefaultModifier;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;

import org.eclipse.sirius.components.view.UserColor;

import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl#isHide <em>Hide</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl#getColors <em>Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultModifierImpl extends MinimalEObjectImpl.Container implements DefaultModifier {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected boolean hide = HIDE_EDEFAULT;

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
	 * The cached value of the '{@link #getColors() <em>Colors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColors()
	 * @generated
	 * @ordered
	 */
	protected EList<UserColor> colors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractivityPackage.Literals.DEFAULT_MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DEFAULT_MODIFIER__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHide() {
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHide(boolean newHide) {
		boolean oldHide = hide;
		hide = newHide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DEFAULT_MODIFIER__HIDE, oldHide,
					hide));
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
					InteractivityPackage.DEFAULT_MODIFIER__STYLE, oldStyle, newStyle);
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
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DEFAULT_MODIFIER__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DEFAULT_MODIFIER__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DEFAULT_MODIFIER__STYLE,
					newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserColor> getColors() {
		if (colors == null) {
			colors = new EObjectContainmentEList<UserColor>(UserColor.class, this,
					InteractivityPackage.DEFAULT_MODIFIER__COLORS);
		}
		return colors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.DEFAULT_MODIFIER__STYLE:
			return basicSetStyle(null, msgs);
		case InteractivityPackage.DEFAULT_MODIFIER__COLORS:
			return ((InternalEList<?>) getColors()).basicRemove(otherEnd, msgs);
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
		case InteractivityPackage.DEFAULT_MODIFIER__ID:
			return getId();
		case InteractivityPackage.DEFAULT_MODIFIER__HIDE:
			return isHide();
		case InteractivityPackage.DEFAULT_MODIFIER__STYLE:
			return getStyle();
		case InteractivityPackage.DEFAULT_MODIFIER__COLORS:
			return getColors();
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
		case InteractivityPackage.DEFAULT_MODIFIER__ID:
			setId((String) newValue);
			return;
		case InteractivityPackage.DEFAULT_MODIFIER__HIDE:
			setHide((Boolean) newValue);
			return;
		case InteractivityPackage.DEFAULT_MODIFIER__STYLE:
			setStyle((NodeStyleDescription) newValue);
			return;
		case InteractivityPackage.DEFAULT_MODIFIER__COLORS:
			getColors().clear();
			getColors().addAll((Collection<? extends UserColor>) newValue);
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
		case InteractivityPackage.DEFAULT_MODIFIER__ID:
			setId(ID_EDEFAULT);
			return;
		case InteractivityPackage.DEFAULT_MODIFIER__HIDE:
			setHide(HIDE_EDEFAULT);
			return;
		case InteractivityPackage.DEFAULT_MODIFIER__STYLE:
			setStyle((NodeStyleDescription) null);
			return;
		case InteractivityPackage.DEFAULT_MODIFIER__COLORS:
			getColors().clear();
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
		case InteractivityPackage.DEFAULT_MODIFIER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case InteractivityPackage.DEFAULT_MODIFIER__HIDE:
			return hide != HIDE_EDEFAULT;
		case InteractivityPackage.DEFAULT_MODIFIER__STYLE:
			return style != null;
		case InteractivityPackage.DEFAULT_MODIFIER__COLORS:
			return colors != null && !colors.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", hide: ");
		result.append(hide);
		result.append(')');
		return result.toString();
	}

} //DefaultModifierImpl
