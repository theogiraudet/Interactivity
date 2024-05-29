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
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getDiagramEditors <em>Diagram Editors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity()
 * @model
 * @generated
 */
public interface Interactivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Id</em>' attribute.
	 * @see #setDomainId(String)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity_DomainId()
	 * @model required="true"
	 * @generated
	 */
	String getDomainId();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Interactivity#getDomainId <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Id</em>' attribute.
	 * @see #getDomainId()
	 * @generated
	 */
	void setDomainId(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Editors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.DiagramEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Editors</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity_DiagramEditors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramEditor> getDiagramEditors();

} // Interactivity
