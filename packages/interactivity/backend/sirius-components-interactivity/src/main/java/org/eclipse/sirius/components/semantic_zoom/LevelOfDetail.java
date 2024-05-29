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

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.components.interactivity.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Of Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getStyleOverrides <em>Style Overrides</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getHiddenASElements <em>Hidden AS Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getLevelOfDetail()
 * @model
 * @generated
 */
public interface LevelOfDetail extends Action {
	/**
	 * Returns the value of the '<em><b>Style Overrides</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.semantic_zoom.StyleOverride}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Overrides</em>' containment reference list.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getLevelOfDetail_StyleOverrides()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleOverride> getStyleOverrides();

	/**
	 * Returns the value of the '<em><b>Hidden AS Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden AS Elements</em>' attribute.
	 * @see #setHiddenASElements(String)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getLevelOfDetail_HiddenASElements()
	 * @model
	 * @generated
	 */
	String getHiddenASElements();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getHiddenASElements <em>Hidden AS Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden AS Elements</em>' attribute.
	 * @see #getHiddenASElements()
	 * @generated
	 */
	void setHiddenASElements(String value);

} // LevelOfDetail
