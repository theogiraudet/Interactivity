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
import org.eclipse.sirius.components.interactivity.Interaction;
import org.eclipse.sirius.components.interactivity.InteractiveFeature;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.view.diagram.DiagramDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl#getInteractiveFeatures <em>Interactive Features</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl#getDiagramDefinition <em>Diagram Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramEditorImpl extends MinimalEObjectImpl.Container implements DiagramEditor {
	/**
	 * The cached value of the '{@link #getInteractiveFeatures() <em>Interactive Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractiveFeature> interactiveFeatures;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interactions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractivityPackage.Literals.DIAGRAM_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InteractiveFeature> getInteractiveFeatures() {
		if (interactiveFeatures == null) {
			interactiveFeatures = new EObjectContainmentEList<InteractiveFeature>(InteractiveFeature.class, this,
					InteractivityPackage.DIAGRAM_EDITOR__INTERACTIVE_FEATURES);
		}
		return interactiveFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interaction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<Interaction>(Interaction.class, this,
					InteractivityPackage.DIAGRAM_EDITOR__INTERACTIONS);
		}
		return interactions;
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
							InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_DEFINITION, oldDiagramDefinition,
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
					InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_DEFINITION, oldDiagramDefinition, diagramDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIVE_FEATURES:
			return ((InternalEList<?>) getInteractiveFeatures()).basicRemove(otherEnd, msgs);
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIONS:
			return ((InternalEList<?>) getInteractions()).basicRemove(otherEnd, msgs);
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
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIVE_FEATURES:
			return getInteractiveFeatures();
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIONS:
			return getInteractions();
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_DEFINITION:
			if (resolve)
				return getDiagramDefinition();
			return basicGetDiagramDefinition();
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
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIVE_FEATURES:
			getInteractiveFeatures().clear();
			getInteractiveFeatures().addAll((Collection<? extends InteractiveFeature>) newValue);
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIONS:
			getInteractions().clear();
			getInteractions().addAll((Collection<? extends Interaction>) newValue);
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_DEFINITION:
			setDiagramDefinition((DiagramDescription) newValue);
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
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIVE_FEATURES:
			getInteractiveFeatures().clear();
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIONS:
			getInteractions().clear();
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_DEFINITION:
			setDiagramDefinition((DiagramDescription) null);
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
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIVE_FEATURES:
			return interactiveFeatures != null && !interactiveFeatures.isEmpty();
		case InteractivityPackage.DIAGRAM_EDITOR__INTERACTIONS:
			return interactions != null && !interactions.isEmpty();
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_DEFINITION:
			return diagramDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramEditorImpl
