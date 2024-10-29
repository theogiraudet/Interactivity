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
import org.eclipse.sirius.components.interactivity.ElementReference;
import org.eclipse.sirius.components.interactivity.Identifiable;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.ModelSnippet;
import org.eclipse.sirius.components.interactivity.Snippet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.SnippetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.SnippetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.SnippetImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.impl.SnippetImpl#getFocus <em>Focus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnippetImpl extends MinimalEObjectImpl.Container implements Snippet {
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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ModelSnippet model;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnippetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractivityPackage.Literals.SNIPPET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.SNIPPET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.SNIPPET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelSnippet getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelSnippet newModel, NotificationChain msgs) {
		ModelSnippet oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InteractivityPackage.SNIPPET__MODEL, oldModel, newModel);
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
	public void setModel(ModelSnippet newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.SNIPPET__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.SNIPPET__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.SNIPPET__MODEL, newModel,
					newModel));
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
					InteractivityPackage.SNIPPET__FOCUS, oldFocus, newFocus);
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
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.SNIPPET__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject) newFocus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InteractivityPackage.SNIPPET__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractivityPackage.SNIPPET__FOCUS, newFocus,
					newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InteractivityPackage.SNIPPET__MODEL:
			return basicSetModel(null, msgs);
		case InteractivityPackage.SNIPPET__FOCUS:
			return basicSetFocus(null, msgs);
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
		case InteractivityPackage.SNIPPET__ID:
			return getId();
		case InteractivityPackage.SNIPPET__NAME:
			return getName();
		case InteractivityPackage.SNIPPET__MODEL:
			return getModel();
		case InteractivityPackage.SNIPPET__FOCUS:
			return getFocus();
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
		case InteractivityPackage.SNIPPET__ID:
			setId((String) newValue);
			return;
		case InteractivityPackage.SNIPPET__NAME:
			setName((String) newValue);
			return;
		case InteractivityPackage.SNIPPET__MODEL:
			setModel((ModelSnippet) newValue);
			return;
		case InteractivityPackage.SNIPPET__FOCUS:
			setFocus((ElementReference) newValue);
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
		case InteractivityPackage.SNIPPET__ID:
			setId(ID_EDEFAULT);
			return;
		case InteractivityPackage.SNIPPET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case InteractivityPackage.SNIPPET__MODEL:
			setModel((ModelSnippet) null);
			return;
		case InteractivityPackage.SNIPPET__FOCUS:
			setFocus((ElementReference) null);
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
		case InteractivityPackage.SNIPPET__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case InteractivityPackage.SNIPPET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case InteractivityPackage.SNIPPET__MODEL:
			return model != null;
		case InteractivityPackage.SNIPPET__FOCUS:
			return focus != null;
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
			case InteractivityPackage.SNIPPET__ID:
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
				return InteractivityPackage.SNIPPET__ID;
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

} //SnippetImpl
