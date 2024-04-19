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
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl#getDiagramReference <em>Diagram Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramEditorImpl extends MinimalEObjectImpl.Container implements DiagramEditor {
	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> tools;

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
	 * The cached value of the '{@link #getDiagramReference() <em>Diagram Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramReference()
	 * @generated
	 * @ordered
	 */
	protected DiagramDescription diagramReference;

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
	public EList<Interaction> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<>(Interaction.class, this,
					InteractivityPackage.DIAGRAM_EDITOR__TOOLS);
		}
		return tools;
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
					InteractivityPackage.DIAGRAM_EDITOR__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramDescription getDiagramReference() {
		if (diagramReference != null && diagramReference.eIsProxy()) {
			InternalEObject oldDiagramReference = (InternalEObject) diagramReference;
			diagramReference = (DiagramDescription) eResolveProxy(oldDiagramReference);
			if (diagramReference != oldDiagramReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_REFERENCE, oldDiagramReference,
							diagramReference));
			}
		}
		return diagramReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDescription basicGetDiagramReference() {
		return diagramReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagramReference(DiagramDescription newDiagramReference) {
		DiagramDescription oldDiagramReference = diagramReference;
		diagramReference = newDiagramReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_REFERENCE, oldDiagramReference, diagramReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.DIAGRAM_EDITOR__TOOLS:
			return ((InternalEList<?>) getTools()).basicRemove(otherEnd, msgs);
		case InteractivityPackage.DIAGRAM_EDITOR__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
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
		case InteractivityPackage.DIAGRAM_EDITOR__TOOLS:
			return getTools();
		case InteractivityPackage.DIAGRAM_EDITOR__FEATURES:
			return getFeatures();
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_REFERENCE:
			if (resolve)
				return getDiagramReference();
			return basicGetDiagramReference();
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
		case InteractivityPackage.DIAGRAM_EDITOR__TOOLS:
			getTools().clear();
			getTools().addAll((Collection<? extends Interaction>) newValue);
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends InteractiveFeature>) newValue);
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_REFERENCE:
			setDiagramReference((DiagramDescription) newValue);
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
		case InteractivityPackage.DIAGRAM_EDITOR__TOOLS:
			getTools().clear();
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__FEATURES:
			getFeatures().clear();
			return;
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_REFERENCE:
			setDiagramReference((DiagramDescription) null);
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
		case InteractivityPackage.DIAGRAM_EDITOR__TOOLS:
			return tools != null && !tools.isEmpty();
		case InteractivityPackage.DIAGRAM_EDITOR__FEATURES:
			return features != null && !features.isEmpty();
		case InteractivityPackage.DIAGRAM_EDITOR__DIAGRAM_REFERENCE:
			return diagramReference != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramEditorImpl
