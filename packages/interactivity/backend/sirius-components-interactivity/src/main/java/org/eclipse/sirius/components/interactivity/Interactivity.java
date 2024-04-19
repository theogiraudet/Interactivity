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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getInteractiveElements <em>Interactive Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity()
 * @model
 * @generated
 */
public interface Interactivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Interactive Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.InteractiveElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive Elements</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity_InteractiveElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractiveElement> getInteractiveElements();

} // Interactivity
