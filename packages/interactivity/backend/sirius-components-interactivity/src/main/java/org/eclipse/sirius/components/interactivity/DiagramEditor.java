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

import org.eclipse.sirius.components.view.diagram.DiagramDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramReference <em>Diagram Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDiagramEditor()
 * @model
 * @generated
 */
public interface DiagramEditor extends InteractiveElement {

	/**
	 * Returns the value of the '<em><b>Diagram Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Reference</em>' reference.
	 * @see #setDiagramReference(DiagramDescription)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDiagramEditor_DiagramReference()
	 * @model
	 * @generated
	 */
	DiagramDescription getDiagramReference();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramReference <em>Diagram Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Reference</em>' reference.
	 * @see #getDiagramReference()
	 * @generated
	 */
	void setDiagramReference(DiagramDescription value);
} // DiagramEditor
