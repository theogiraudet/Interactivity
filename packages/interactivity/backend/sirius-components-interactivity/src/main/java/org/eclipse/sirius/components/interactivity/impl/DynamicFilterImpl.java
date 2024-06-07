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
import org.eclipse.sirius.components.interactivity.DynamicFilter;
import org.eclipse.sirius.components.interactivity.Filter;
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
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicFilterImpl extends MinimalEObjectImpl.Container implements DynamicFilter {
	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

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
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<>(Filter.class, this,
					InteractivityPackage.DYNAMIC_FILTER__FILTERS);
		}
		return filters;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.DYNAMIC_FILTER__FILTERS:
			return ((InternalEList<?>) getFilters()).basicRemove(otherEnd, msgs);
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			return basicSetRadius(null, msgs);
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
		case InteractivityPackage.DYNAMIC_FILTER__FILTERS:
			return getFilters();
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			return getRadius();
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
		case InteractivityPackage.DYNAMIC_FILTER__FILTERS:
			getFilters().clear();
			getFilters().addAll((Collection<? extends Filter>) newValue);
			return;
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			setRadius((Radius) newValue);
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
		case InteractivityPackage.DYNAMIC_FILTER__FILTERS:
			getFilters().clear();
			return;
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			setRadius((Radius) null);
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
		case InteractivityPackage.DYNAMIC_FILTER__FILTERS:
			return filters != null && !filters.isEmpty();
		case InteractivityPackage.DYNAMIC_FILTER__RADIUS:
			return radius != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicFilterImpl
