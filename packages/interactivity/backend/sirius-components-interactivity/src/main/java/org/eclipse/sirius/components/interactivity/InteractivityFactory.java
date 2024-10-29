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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage
 * @generated
 */
public interface InteractivityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractivityFactory eINSTANCE = org.eclipse.sirius.components.interactivity.impl.InteractivityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interactivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interactivity</em>'.
	 * @generated
	 */
	Interactivity createInteractivity();

	/**
	 * Returns a new object of class '<em>Semantic Zoom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Zoom</em>'.
	 * @generated
	 */
	SemanticZoom createSemanticZoom();

	/**
	 * Returns a new object of class '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level</em>'.
	 * @generated
	 */
	Level createLevel();

	/**
	 * Returns a new object of class '<em>Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Definition</em>'.
	 * @generated
	 */
	FilterDefinition createFilterDefinition();

	/**
	 * Returns a new object of class '<em>Visibility Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Modifier</em>'.
	 * @generated
	 */
	VisibilityModifier createVisibilityModifier();

	/**
	 * Returns a new object of class '<em>Style Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Modifier</em>'.
	 * @generated
	 */
	StyleModifier createStyleModifier();

	/**
	 * Returns a new object of class '<em>Dynamic Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Filter</em>'.
	 * @generated
	 */
	DynamicFilter createDynamicFilter();

	/**
	 * Returns a new object of class '<em>Fixed Radius</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Radius</em>'.
	 * @generated
	 */
	FixedRadius createFixedRadius();

	/**
	 * Returns a new object of class '<em>Bounded Radius</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Radius</em>'.
	 * @generated
	 */
	BoundedRadius createBoundedRadius();

	/**
	 * Returns a new object of class '<em>Semantic Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Search</em>'.
	 * @generated
	 */
	SemanticSearch createSemanticSearch();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Default Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Modifier</em>'.
	 * @generated
	 */
	DefaultModifier createDefaultModifier();

	/**
	 * Returns a new object of class '<em>Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snippet</em>'.
	 * @generated
	 */
	Snippet createSnippet();

	/**
	 * Returns a new object of class '<em>Sirius Web Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sirius Web Model</em>'.
	 * @generated
	 */
	SiriusWebModel createSiriusWebModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractivityPackage getInteractivityPackage();

} //InteractivityFactory
