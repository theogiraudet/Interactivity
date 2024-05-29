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
	 * Returns a new object of class '<em>Graphic Zoom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphic Zoom</em>'.
	 * @generated
	 */
	GraphicZoom createGraphicZoom();

	/**
	 * Returns a new object of class '<em>Zoom Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zoom Level</em>'.
	 * @generated
	 */
	ZoomLevel createZoomLevel();

	/**
	 * Returns a new object of class '<em>Diagram Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Editor</em>'.
	 * @generated
	 */
	DiagramEditor createDiagramEditor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractivityPackage getInteractivityPackage();

} //InteractivityFactory
