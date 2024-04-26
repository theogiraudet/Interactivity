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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride#getAsElements <em>As Elements</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getStyleOverride()
 * @model
 * @generated
 */
public interface StyleOverride extends EObject {
	/**
	 * Returns the value of the '<em><b>As Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Elements</em>' attribute.
	 * @see #setAsElements(String)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getStyleOverride_AsElements()
	 * @model required="true"
	 * @generated
	 */
	String getAsElements();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride#getAsElements <em>As Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Elements</em>' attribute.
	 * @see #getAsElements()
	 * @generated
	 */
	void setAsElements(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see #setStyle(NodeStyleDescription)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getStyleOverride_Style()
	 * @model required="true"
	 * @generated
	 */
	NodeStyleDescription getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride#getStyle <em>Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(NodeStyleDescription value);

} // StyleOverride
