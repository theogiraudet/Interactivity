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
 * A representation of the model object '<em><b>Interactivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getDiagramDefinition <em>Diagram Definition</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Interactivity#getFilters <em>Filters</em>}</li>
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
	 * Returns the value of the '<em><b>Diagram Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Definition</em>' reference.
	 * @see #setDiagramDefinition(DiagramDescription)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity_DiagramDefinition()
	 * @model required="true"
	 * @generated
	 */
	DiagramDescription getDiagramDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Interactivity#getDiagramDefinition <em>Diagram Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Definition</em>' reference.
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	void setDiagramDefinition(DiagramDescription value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.InteractiveFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractiveFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.FilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getInteractivity_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterDefinition> getFilters();

} // Interactivity
