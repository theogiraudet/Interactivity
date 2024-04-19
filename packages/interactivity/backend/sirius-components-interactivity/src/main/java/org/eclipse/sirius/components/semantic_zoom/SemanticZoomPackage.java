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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomFactory
 * @model kind="package"
 * @generated
 */
public interface SemanticZoomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semantic_zoom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius-web/semantic_zoom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "semantic_zoom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticZoomPackage eINSTANCE = org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomImpl <em>Semantic Zoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomImpl
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getSemanticZoom()
	 * @generated
	 */
	int SEMANTIC_ZOOM = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM__ACTIONS = InteractivityPackage.INTERACTIVE_FEATURE__ACTIONS;

	/**
	 * The number of structural features of the '<em>Semantic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM_FEATURE_COUNT = InteractivityPackage.INTERACTIVE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Semantic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM_OPERATION_COUNT = InteractivityPackage.INTERACTIVE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl <em>Level Of Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getLevelOfDetail()
	 * @generated
	 */
	int LEVEL_OF_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL__REFERENCES = InteractivityPackage.ACTION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL__ID = InteractivityPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level Of Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL_FEATURE_COUNT = InteractivityPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Level Of Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL_OPERATION_COUNT = InteractivityPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.GraphicalFilter <em>Graphical Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.GraphicalFilter
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getGraphicalFilter()
	 * @generated
	 */
	int GRAPHICAL_FILTER = 2;

	/**
	 * The number of structural features of the '<em>Graphical Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_FILTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Graphical Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl <em>Node Mapping Style Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getNodeMappingStyleOverride()
	 * @generated
	 */
	int NODE_MAPPING_STYLE_OVERRIDE = 3;

	/**
	 * The feature id for the '<em><b>Node Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION = InteractivityPackage.NODE_MAPPING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_STYLE_OVERRIDE__STYLE = InteractivityPackage.NODE_MAPPING_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_STYLE_OVERRIDE__FILTERS = InteractivityPackage.NODE_MAPPING_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Mapping Style Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_STYLE_OVERRIDE_FEATURE_COUNT = InteractivityPackage.NODE_MAPPING_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node Mapping Style Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_STYLE_OVERRIDE_OPERATION_COUNT = InteractivityPackage.NODE_MAPPING_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.ByDepthImpl <em>By Depth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.ByDepthImpl
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getByDepth()
	 * @generated
	 */
	int BY_DEPTH = 4;

	/**
	 * The number of structural features of the '<em>By Depth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DEPTH_FEATURE_COUNT = GRAPHICAL_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Depth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DEPTH_OPERATION_COUNT = GRAPHICAL_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.ByEdgeNumberImpl <em>By Edge Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.ByEdgeNumberImpl
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getByEdgeNumber()
	 * @generated
	 */
	int BY_EDGE_NUMBER = 5;

	/**
	 * The number of structural features of the '<em>By Edge Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EDGE_NUMBER_FEATURE_COUNT = GRAPHICAL_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Edge Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EDGE_NUMBER_OPERATION_COUNT = GRAPHICAL_FILTER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.SemanticZoom <em>Semantic Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Zoom</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoom
	 * @generated
	 */
	EClass getSemanticZoom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail <em>Level Of Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Of Detail</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.LevelOfDetail
	 * @generated
	 */
	EClass getLevelOfDetail();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getId()
	 * @see #getLevelOfDetail()
	 * @generated
	 */
	EAttribute getLevelOfDetail_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.GraphicalFilter <em>Graphical Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Filter</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.GraphicalFilter
	 * @generated
	 */
	EClass getGraphicalFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride <em>Node Mapping Style Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Mapping Style Override</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride
	 * @generated
	 */
	EClass getNodeMappingStyleOverride();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getNodeDescription <em>Node Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Description</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getNodeDescription()
	 * @see #getNodeMappingStyleOverride()
	 * @generated
	 */
	EReference getNodeMappingStyleOverride_NodeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getStyle()
	 * @see #getNodeMappingStyleOverride()
	 * @generated
	 */
	EReference getNodeMappingStyleOverride_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride#getFilters()
	 * @see #getNodeMappingStyleOverride()
	 * @generated
	 */
	EReference getNodeMappingStyleOverride_Filters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.ByDepth <em>By Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Depth</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.ByDepth
	 * @generated
	 */
	EClass getByDepth();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber <em>By Edge Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Edge Number</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber
	 * @generated
	 */
	EClass getByEdgeNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemanticZoomFactory getSemanticZoomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomImpl <em>Semantic Zoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomImpl
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getSemanticZoom()
		 * @generated
		 */
		EClass SEMANTIC_ZOOM = eINSTANCE.getSemanticZoom();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl <em>Level Of Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.LevelOfDetailImpl
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getLevelOfDetail()
		 * @generated
		 */
		EClass LEVEL_OF_DETAIL = eINSTANCE.getLevelOfDetail();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_OF_DETAIL__ID = eINSTANCE.getLevelOfDetail_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.GraphicalFilter <em>Graphical Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.GraphicalFilter
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getGraphicalFilter()
		 * @generated
		 */
		EClass GRAPHICAL_FILTER = eINSTANCE.getGraphicalFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl <em>Node Mapping Style Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.NodeMappingStyleOverrideImpl
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getNodeMappingStyleOverride()
		 * @generated
		 */
		EClass NODE_MAPPING_STYLE_OVERRIDE = eINSTANCE.getNodeMappingStyleOverride();

		/**
		 * The meta object literal for the '<em><b>Node Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION = eINSTANCE
				.getNodeMappingStyleOverride_NodeDescription();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_MAPPING_STYLE_OVERRIDE__STYLE = eINSTANCE.getNodeMappingStyleOverride_Style();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_MAPPING_STYLE_OVERRIDE__FILTERS = eINSTANCE.getNodeMappingStyleOverride_Filters();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.ByDepthImpl <em>By Depth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.ByDepthImpl
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getByDepth()
		 * @generated
		 */
		EClass BY_DEPTH = eINSTANCE.getByDepth();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.ByEdgeNumberImpl <em>By Edge Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.ByEdgeNumberImpl
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getByEdgeNumber()
		 * @generated
		 */
		EClass BY_EDGE_NUMBER = eINSTANCE.getByEdgeNumber();

	}

} //SemanticZoomPackage
