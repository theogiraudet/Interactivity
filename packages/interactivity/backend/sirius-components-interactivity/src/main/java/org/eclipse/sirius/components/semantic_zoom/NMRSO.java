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
import org.eclipse.sirius.components.interactivity.NodeMappingReference;
import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NMRSO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.NMRSO#getNodeDescription <em>Node Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.NMRSO#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.NMRSO#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNMRSO()
 * @model
 * @generated
 */
public interface NMRSO extends NodeMappingReference {
	/**
	 * Returns the value of the '<em><b>Node Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Description</em>' reference.
	 * @see #setNodeDescription(NodeMappingReference)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNMRSO_NodeDescription()
	 * @model required="true"
	 * @generated
	 */
	NodeMappingReference getNodeDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.NMRSO#getNodeDescription <em>Node Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Description</em>' reference.
	 * @see #getNodeDescription()
	 * @generated
	 */
	void setNodeDescription(NodeMappingReference value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see #setStyle(NodeStyleDescription)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNMRSO_Style()
	 * @model required="true"
	 * @generated
	 */
	NodeStyleDescription getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.NMRSO#getStyle <em>Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(NodeStyleDescription value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.semantic_zoom.GraphicalFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNMRSO_Filters()
	 * @model
	 * @generated
	 */
	EList<GraphicalFilter> getFilters();

} // NMRSO
