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
 * A representation of the model object '<em><b>Dynamic Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getDefaultModifier <em>Default Modifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDynamicFilter()
 * @model
 * @generated
 */
public interface DynamicFilter extends InteractiveFeature, Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDynamicFilter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(FilterDefinition)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDynamicFilter_Filter()
	 * @model required="true"
	 * @generated
	 */
	FilterDefinition getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterDefinition value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(ElementReference)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDynamicFilter_Focus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementReference getFocus();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getFocus <em>Focus</em>}' containment reference.
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
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDynamicFilter_Radius()
	 * @model containment="true"
	 * @generated
	 */
	Radius getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getRadius <em>Radius</em>}' containment reference.
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
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDynamicFilter_DefaultModifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefaultModifier getDefaultModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getDefaultModifier <em>Default Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Modifier</em>' containment reference.
	 * @see #getDefaultModifier()
	 * @generated
	 */
	void setDefaultModifier(DefaultModifier value);

} // DynamicFilter
