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
 * A representation of the model object '<em><b>Interactive Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.InteractiveElement#getTools <em>Tools</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.InteractiveElement#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractiveElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InteractiveElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractiveElement_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getTools();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.InteractiveFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractiveElement_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractiveFeature> getFeatures();

} // InteractiveElement
