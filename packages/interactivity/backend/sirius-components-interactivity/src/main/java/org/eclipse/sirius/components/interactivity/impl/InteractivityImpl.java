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
import org.eclipse.sirius.components.interactivity.FilterDefinition;
import org.eclipse.sirius.components.interactivity.InteractiveFeature;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.view.diagram.DiagramDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactivity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getDiagramDefinition <em>Diagram Definition</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl#getFilters <em>Filters</em>}</li>
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
	 * The cached value of the '{@link #getDiagramDefinition() <em>Diagram Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramDefinition()
	 * @generated
	 * @ordered
	 */
	protected DiagramDescription diagramDefinition;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractiveFeature> features;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterDefinition> filters;

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
	public DiagramDescription getDiagramDefinition() {
		if (diagramDefinition != null && diagramDefinition.eIsProxy()) {
			InternalEObject oldDiagramDefinition = (InternalEObject) diagramDefinition;
			diagramDefinition = (DiagramDescription) eResolveProxy(oldDiagramDefinition);
			if (diagramDefinition != oldDiagramDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InteractivityPackage.INTERACTIVITY__DIAGRAM_DEFINITION, oldDiagramDefinition,
							diagramDefinition));
			}
		}
		return diagramDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDescription basicGetDiagramDefinition() {
		return diagramDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagramDefinition(DiagramDescription newDiagramDefinition) {
		DiagramDescription oldDiagramDefinition = diagramDefinition;
		diagramDefinition = newDiagramDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractivityPackage.INTERACTIVITY__DIAGRAM_DEFINITION, oldDiagramDefinition, diagramDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InteractiveFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<>(InteractiveFeature.class, this,
					InteractivityPackage.INTERACTIVITY__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterDefinition> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<>(FilterDefinition.class, this,
					InteractivityPackage.INTERACTIVITY__FILTERS);
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
		case InteractivityPackage.INTERACTIVITY__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case InteractivityPackage.INTERACTIVITY__FILTERS:
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			return getDomainId();
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_DEFINITION:
			if (resolve)
				return getDiagramDefinition();
			return basicGetDiagramDefinition();
		case InteractivityPackage.INTERACTIVITY__FEATURES:
			return getFeatures();
		case InteractivityPackage.INTERACTIVITY__FILTERS:
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			setDomainId((String) newValue);
			return;
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_DEFINITION:
			setDiagramDefinition((DiagramDescription) newValue);
			return;
		case InteractivityPackage.INTERACTIVITY__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends InteractiveFeature>) newValue);
			return;
		case InteractivityPackage.INTERACTIVITY__FILTERS:
			getFilters().clear();
			getFilters().addAll((Collection<? extends FilterDefinition>) newValue);
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
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_DEFINITION:
			setDiagramDefinition((DiagramDescription) null);
			return;
		case InteractivityPackage.INTERACTIVITY__FEATURES:
			getFeatures().clear();
			return;
		case InteractivityPackage.INTERACTIVITY__FILTERS:
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
		case InteractivityPackage.INTERACTIVITY__DOMAIN_ID:
			return DOMAIN_ID_EDEFAULT == null ? domainId != null : !DOMAIN_ID_EDEFAULT.equals(domainId);
		case InteractivityPackage.INTERACTIVITY__DIAGRAM_DEFINITION:
			return diagramDefinition != null;
		case InteractivityPackage.INTERACTIVITY__FEATURES:
			return features != null && !features.isEmpty();
		case InteractivityPackage.INTERACTIVITY__FILTERS:
			return filters != null && !filters.isEmpty();
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
