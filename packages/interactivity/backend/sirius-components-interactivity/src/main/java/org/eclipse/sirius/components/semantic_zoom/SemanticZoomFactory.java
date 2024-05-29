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
package org.eclipse.sirius.components.semantic_zoom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage
 * @generated
 */
public interface SemanticZoomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticZoomFactory eINSTANCE = org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Semantic Zoom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Zoom</em>'.
	 * @generated
	 */
	SemanticZoom createSemanticZoom();

	/**
	 * Returns a new object of class '<em>Level Of Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Of Detail</em>'.
	 * @generated
	 */
	LevelOfDetail createLevelOfDetail();

	/**
	 * Returns a new object of class '<em>Style Override</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Override</em>'.
	 * @generated
	 */
	StyleOverride createStyleOverride();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SemanticZoomPackage getSemanticZoomPackage();

} //SemanticZoomFactory
