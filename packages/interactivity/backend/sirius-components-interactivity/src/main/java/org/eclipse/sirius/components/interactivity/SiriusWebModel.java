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
package org.eclipse.sirius.components.interactivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sirius Web Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.SiriusWebModel#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSiriusWebModel()
 * @model
 * @generated
 */
public interface SiriusWebModel extends ModelSnippet {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EObject)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSiriusWebModel_Model()
	 * @model required="true"
	 * @generated
	 */
	EObject getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.SiriusWebModel#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EObject value);

} // SiriusWebModel
