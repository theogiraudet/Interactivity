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
	 * Returns the value of the '<em><b>Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' attribute.
	 * @see #setSearch(String)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getSemanticSearch_Search()
	 * @model required="true"
	 * @generated
	 */
	String getSearch();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.SemanticSearch#getSearch <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' attribute.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(String value);

} // SemanticSearch
