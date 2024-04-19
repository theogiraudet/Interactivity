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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.components.interactivity.InteractiveElement;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactivity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getInteractiveElements <em>Interactive Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractivityImpl extends MinimalEObjectImpl.Container implements Interactivity {
	/**
	 * The cached value of the '{@link #getInteractiveElements() <em>Interactive Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractiveElement> interactiveElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractivityPackage.Literals.INTERACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InteractiveElement> getInteractiveElements() {
		if (interactiveElements == null) {
			interactiveElements = new EObjectContainmentEList<>(InteractiveElement.class, this,
					InteractivityPackage.INTERACTIVITY__INTERACTIVE_ELEMENTS);
		}
		return interactiveElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.INTERACTIVITY__INTERACTIVE_ELEMENTS:
			return ((InternalEList<?>) getInteractiveElements()).basicRemove(otherEnd, msgs);
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
		case InteractivityPackage.INTERACTIVITY__INTERACTIVE_ELEMENTS:
			return getInteractiveElements();
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
		case InteractivityPackage.INTERACTIVITY__INTERACTIVE_ELEMENTS:
			getInteractiveElements().clear();
			getInteractiveElements().addAll((Collection<? extends InteractiveElement>) newValue);
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
		case InteractivityPackage.INTERACTIVITY__INTERACTIVE_ELEMENTS:
			getInteractiveElements().clear();
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
		case InteractivityPackage.INTERACTIVITY__INTERACTIVE_ELEMENTS:
			return interactiveElements != null && !interactiveElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractivityImpl
