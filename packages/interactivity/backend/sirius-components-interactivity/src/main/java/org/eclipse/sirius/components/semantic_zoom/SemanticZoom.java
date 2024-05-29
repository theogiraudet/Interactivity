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
import org.eclipse.sirius.components.interactivity.InteractiveFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Zoom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.SemanticZoom#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getSemanticZoom()
 * @model
 * @generated
 */
public interface SemanticZoom extends InteractiveFeature {

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getSemanticZoom_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<LevelOfDetail> getLevels();
} // SemanticZoom
