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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.SemanticSearch#getSearch <em>Search</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSemanticSearch()
 * @model
 * @generated
 */
public interface SemanticSearch extends InteractiveFeature, Identifiable {
	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.ElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSemanticSearch_Search()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementReference> getSearch();

} // SemanticSearch
