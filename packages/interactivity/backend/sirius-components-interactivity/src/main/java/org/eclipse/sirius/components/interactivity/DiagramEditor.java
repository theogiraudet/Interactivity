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
 *   <li>{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getInteractiveFeatures <em>Interactive Features</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramDefinition <em>Diagram Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDiagramEditor()
 * @model
 * @generated
 */
public interface DiagramEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Interactive Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.InteractiveFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive Features</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDiagramEditor_InteractiveFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractiveFeature> getInteractiveFeatures();

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDiagramEditor_Interactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getInteractions();

	/**
	 * Returns the value of the '<em><b>Diagram Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Definition</em>' reference.
	 * @see #setDiagramDefinition(DiagramDescription)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDiagramEditor_DiagramDefinition()
	 * @model required="true"
	 * @generated
	 */
	DiagramDescription getDiagramDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramDefinition <em>Diagram Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Definition</em>' reference.
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	void setDiagramDefinition(DiagramDescription value);

} // DiagramEditor
