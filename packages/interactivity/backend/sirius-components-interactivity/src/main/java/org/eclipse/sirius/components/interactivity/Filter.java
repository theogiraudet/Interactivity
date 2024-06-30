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
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Filter#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Filter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Filter#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Filter#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.Filter#getDefaultModifier <em>Default Modifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(FilterDefinition)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getFilter_Reference()
	 * @model required="true"
	 * @generated
	 */
	FilterDefinition getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Filter#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(FilterDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getFilter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Filter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(ElementReference)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getFilter_Focus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementReference getFocus();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Filter#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(ElementReference value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' containment reference.
	 * @see #setRadius(Radius)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getFilter_Radius()
	 * @model containment="true"
	 * @generated
	 */
	Radius getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Filter#getRadius <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' containment reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Radius value);

	/**
	 * Returns the value of the '<em><b>Default Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Modifier</em>' containment reference.
	 * @see #setDefaultModifier(DefaultModifier)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getFilter_DefaultModifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefaultModifier getDefaultModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.Filter#getDefaultModifier <em>Default Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Modifier</em>' containment reference.
	 * @see #getDefaultModifier()
	 * @generated
	 */
	void setDefaultModifier(DefaultModifier value);

} // Filter
