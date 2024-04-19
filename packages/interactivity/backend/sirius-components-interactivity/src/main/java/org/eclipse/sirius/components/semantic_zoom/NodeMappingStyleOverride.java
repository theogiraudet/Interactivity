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
import org.eclipse.sirius.components.view.diagram.NodeDescription;
import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Mapping Style Override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getNodeDescription <em>Node Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNodeMappingStyleOverride()
 * @model
 * @generated
 */
public interface NodeMappingStyleOverride extends NodeMappingReference {
	/**
	 * Returns the value of the '<em><b>Node Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Description</em>' reference.
	 * @see #setNodeDescription(NodeDescription)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNodeMappingStyleOverride_NodeDescription()
	 * @model required="true"
	 * @generated
	 */
	NodeDescription getNodeDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getNodeDescription <em>Node Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Description</em>' reference.
	 * @see #getNodeDescription()
	 * @generated
	 */
	void setNodeDescription(NodeDescription value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(NodeStyleDescription)
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNodeMappingStyleOverride_Style()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeStyleDescription getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(NodeStyleDescription value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.semantic_zoom.GraphicalFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#getNodeMappingStyleOverride_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicalFilter> getFilters();

} // NodeMappingStyleOverride
