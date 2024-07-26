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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.components.interactivity.DefaultModifier;
import org.eclipse.sirius.components.interactivity.DynamicFilter;
import org.eclipse.sirius.components.interactivity.ElementReference;
import org.eclipse.sirius.components.interactivity.FilterDefinition;
import org.eclipse.sirius.components.interactivity.Identifiable;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.Radius;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getDefaultModifier <em>Default Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicFilterImpl extends MinimalEObjectImpl.Container implements DynamicFilter {
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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterDefinition filter;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected ElementReference focus;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected Radius radius;

	/**
	 * The cached value of the '{@link #getDefaultModifier() <em>Default Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultModifier()
	 * @generated
	 * @ordered
	 */
	protected DefaultModifier defaultModifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractivityPackage.Literals.DYNAMIC_FILTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DYNAMIC_FILTER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DYNAMIC_FILTER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterDefinition getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject) filter;
			filter = (FilterDefinition) eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InteractivityPackage.DYNAMIC_FILTER__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDefinition basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(FilterDefinition newFilter) {
		FilterDefinition oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DYNAMIC_FILTER__FILTER,
					oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementReference getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(ElementReference newFocus, NotificationChain msgs) {
		ElementReference oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractivityPackage.DYNAMIC_FILTER__FOCUS, oldFocus, newFocus);
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
	public void setFocus(ElementReference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject) focus).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DYNAMIC_FILTER__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject) newFocus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DYNAMIC_FILTER__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DYNAMIC_FILTER__FOCUS, newFocus,
					newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Radius getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadius(Radius newRadius, NotificationChain msgs) {
		Radius oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractivityPackage.DYNAMIC_FILTER__RADIUS, oldRadius, newRadius);
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
	public void setRadius(Radius newRadius) {
		if (newRadius != radius) {
			NotificationChain msgs = null;
			if (radius != null)
				msgs = ((InternalEObject) radius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DYNAMIC_FILTER__RADIUS, null, msgs);
			if (newRadius != null)
				msgs = ((InternalEObject) newRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DYNAMIC_FILTER__RADIUS, null, msgs);
			msgs = basicSetRadius(newRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DYNAMIC_FILTER__RADIUS,
					newRadius, newRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultModifier getDefaultModifier() {
		return defaultModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultModifier(DefaultModifier newDefaultModifier, NotificationChain msgs) {
		DefaultModifier oldDefaultModifier = defaultModifier;
		defaultModifier = newDefaultModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER, oldDefaultModifier, newDefaultModifier);
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
	public void setDefaultModifier(DefaultModifier newDefaultModifier) {
		if (newDefaultModifier != defaultModifier) {
			NotificationChain msgs = null;
			if (defaultModifier != null)
				msgs = ((InternalEObject) defaultModifier).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER, null, msgs);
			if (newDefaultModifier != null)
				msgs = ((InternalEObject) newDefaultModifier).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER, null, msgs);
			msgs = basicSetDefaultModifier(newDefaultModifier, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER,
					newDefaultModifier, newDefaultModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.DYNAMIC_FILTER__FOCUS:
			return basicSetFocus(null, msgs);
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			return basicSetRadius(null, msgs);
		case InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER:
			return basicSetDefaultModifier(null, msgs);
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
		case InteractivityPackage.DYNAMIC_FILTER__ID:
			return getId();
		case InteractivityPackage.DYNAMIC_FILTER__NAME:
			return getName();
		case InteractivityPackage.DYNAMIC_FILTER__FILTER:
			if (resolve)
				return getFilter();
			return basicGetFilter();
		case InteractivityPackage.DYNAMIC_FILTER__FOCUS:
			return getFocus();
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			return getRadius();
		case InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER:
			return getDefaultModifier();
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
		case InteractivityPackage.DYNAMIC_FILTER__ID:
			setId((String) newValue);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__NAME:
			setName((String) newValue);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__FILTER:
			setFilter((FilterDefinition) newValue);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__FOCUS:
			setFocus((ElementReference) newValue);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			setRadius((Radius) newValue);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER:
			setDefaultModifier((DefaultModifier) newValue);
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
		case InteractivityPackage.DYNAMIC_FILTER__ID:
			setId(ID_EDEFAULT);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__FILTER:
			setFilter((FilterDefinition) null);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__FOCUS:
			setFocus((ElementReference) null);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			setRadius((Radius) null);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER:
			setDefaultModifier((DefaultModifier) null);
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
		case InteractivityPackage.DYNAMIC_FILTER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case InteractivityPackage.DYNAMIC_FILTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case InteractivityPackage.DYNAMIC_FILTER__FILTER:
			return filter != null;
		case InteractivityPackage.DYNAMIC_FILTER__FOCUS:
			return focus != null;
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			return radius != null;
		case InteractivityPackage.DYNAMIC_FILTER__DEFAULT_MODIFIER:
			return defaultModifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Identifiable.class) {
			switch (derivedFeatureID) {
			case InteractivityPackage.DYNAMIC_FILTER__ID:
				return InteractivityPackage.IDENTIFIABLE__ID;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Identifiable.class) {
			switch (baseFeatureID) {
			case InteractivityPackage.IDENTIFIABLE__ID:
				return InteractivityPackage.DYNAMIC_FILTER__ID;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DynamicFilterImpl
