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
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getLevelOfDetail()
 * @model
 * @generated
 */
public interface LevelOfDetail extends Action {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getLevelOfDetail_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LevelOfDetail
