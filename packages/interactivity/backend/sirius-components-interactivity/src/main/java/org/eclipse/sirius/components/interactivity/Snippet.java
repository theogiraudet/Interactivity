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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Snippet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Snippet#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Snippet#getFocus <em>Focus</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSnippet()
 * @model
 * @generated
 */
public interface Snippet extends InteractiveFeature, Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSnippet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Snippet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelSnippet)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSnippet_Model()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelSnippet getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Snippet#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelSnippet value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(ElementReference)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSnippet_Focus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementReference getFocus();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Snippet#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(ElementReference value);

} // Snippet
