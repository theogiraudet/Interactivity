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
import org.eclipse.sirius.components.interactivity.DiagramEditor;
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
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getDiagramEditors <em>Diagram Editors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractivityImpl extends MinimalEObjectImpl.Container implements Interactivity {
	/**
	 * The default value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected String domainId = DOMAIN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiagramEditors() <em>Diagram Editors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramEditor> diagramEditors;

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
	public String getDomainId() {
		return domainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainId(String newDomainId) {
		String oldDomainId = domainId;
		domainId = newDomainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.INTERACTIVITY__DOMAIN_ID,
					oldDomainId, domainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramEditor> getDiagramEditors() {
		if (diagramEditors == null) {
			diagramEditors = new EObjectContainmentEList<DiagramEditor>(DiagramEditor.class, this,
					InteractivityPackage.INTERACTIVITY__DIAGRAM_EDITORS);
		}
		return diagramEditors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_EDITORS:
			return ((InternalEList<?>) getDiagramEditors()).basicRemove(otherEnd, msgs);
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			return getDomainId();
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_EDITORS:
			return getDiagramEditors();
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			setDomainId((String) newValue);
			return;
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_EDITORS:
			getDiagramEditors().clear();
			getDiagramEditors().addAll((Collection<? extends DiagramEditor>) newValue);
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			setDomainId(DOMAIN_ID_EDEFAULT);
			return;
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_EDITORS:
			getDiagramEditors().clear();
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			return DOMAIN_ID_EDEFAULT == null ? domainId != null : !DOMAIN_ID_EDEFAULT.equals(domainId);
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_EDITORS:
			return diagramEditors != null && !diagramEditors.isEmpty();
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
		result.append(" (domainId: ");
		result.append(domainId);
		result.append(')');
		return result.toString();
	}

} //InteractivityImpl
