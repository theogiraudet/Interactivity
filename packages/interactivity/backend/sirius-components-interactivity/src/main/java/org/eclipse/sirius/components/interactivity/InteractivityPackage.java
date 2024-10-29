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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.sirius.components.interactivity.InteractivityFactory
 * @model kind="package"
 * @generated
 */
public interface InteractivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interactivity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius-web/interactivity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interactivity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractivityPackage eINSTANCE = org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl <em>Interactivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractivity()
	 * @generated
	 */
	int INTERACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY__DOMAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Diagram Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY__DIAGRAM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY__FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY__FILTERS = 3;

	/**
	 * The number of structural features of the '<em>Interactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.InteractiveFeature <em>Interactive Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.InteractiveFeature
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractiveFeature()
	 * @generated
	 */
	int INTERACTIVE_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Interactive Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interactive Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.SemanticZoomImpl <em>Semantic Zoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.SemanticZoomImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSemanticZoom()
	 * @generated
	 */
	int SEMANTIC_ZOOM = 2;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM__LEVELS = INTERACTIVE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM_FEATURE_COUNT = INTERACTIVE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semantic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM_OPERATION_COUNT = INTERACTIVE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Identifiable
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.LevelImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MIN = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MAX = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__FILTER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.FilterDefinitionImpl <em>Filter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.FilterDefinitionImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getFilterDefinition()
	 * @generated
	 */
	int FILTER_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION__MODIFIERS = 1;

	/**
	 * The number of structural features of the '<em>Filter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Modifier <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Modifier
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.ScopedModifier <em>Scoped Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.ScopedModifier
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getScopedModifier()
	 * @generated
	 */
	int SCOPED_MODIFIER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_MODIFIER__ID = MODIFIER__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_MODIFIER__ELEMENTS = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scoped Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_MODIFIER_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scoped Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_MODIFIER_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.VisibilityModifierImpl <em>Visibility Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.VisibilityModifierImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getVisibilityModifier()
	 * @generated
	 */
	int VISIBILITY_MODIFIER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_MODIFIER__ID = SCOPED_MODIFIER__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_MODIFIER__ELEMENTS = SCOPED_MODIFIER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_MODIFIER__HIDE = SCOPED_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_MODIFIER_FEATURE_COUNT = SCOPED_MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visibility Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_MODIFIER_OPERATION_COUNT = SCOPED_MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.StyleModifierImpl <em>Style Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.StyleModifierImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getStyleModifier()
	 * @generated
	 */
	int STYLE_MODIFIER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MODIFIER__ID = SCOPED_MODIFIER__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MODIFIER__ELEMENTS = SCOPED_MODIFIER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MODIFIER__STYLE = SCOPED_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MODIFIER__COLORS = SCOPED_MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Style Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MODIFIER_FEATURE_COUNT = SCOPED_MODIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Style Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MODIFIER_OPERATION_COUNT = SCOPED_MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl <em>Dynamic Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getDynamicFilter()
	 * @generated
	 */
	int DYNAMIC_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER__ID = INTERACTIVE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER__NAME = INTERACTIVE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER__FILTER = INTERACTIVE_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER__FOCUS = INTERACTIVE_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER__RADIUS = INTERACTIVE_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER__DEFAULT_MODIFIER = INTERACTIVE_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dynamic Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER_FEATURE_COUNT = INTERACTIVE_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dynamic Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILTER_OPERATION_COUNT = INTERACTIVE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Radius <em>Radius</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Radius
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getRadius()
	 * @generated
	 */
	int RADIUS = 9;

	/**
	 * The number of structural features of the '<em>Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.FixedRadiusImpl <em>Fixed Radius</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.FixedRadiusImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getFixedRadius()
	 * @generated
	 */
	int FIXED_RADIUS = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_RADIUS__VALUE = RADIUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_RADIUS_FEATURE_COUNT = RADIUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_RADIUS_OPERATION_COUNT = RADIUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.BoundedRadiusImpl <em>Bounded Radius</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.BoundedRadiusImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getBoundedRadius()
	 * @generated
	 */
	int BOUNDED_RADIUS = 11;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_RADIUS__MIN = RADIUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_RADIUS__MAX = RADIUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_RADIUS_FEATURE_COUNT = RADIUS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_RADIUS_OPERATION_COUNT = RADIUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.SemanticSearchImpl <em>Semantic Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.SemanticSearchImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSemanticSearch()
	 * @generated
	 */
	int SEMANTIC_SEARCH = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_SEARCH__ID = INTERACTIVE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_SEARCH__SEARCH = INTERACTIVE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_SEARCH_FEATURE_COUNT = INTERACTIVE_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_SEARCH_OPERATION_COUNT = INTERACTIVE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.ElementReference <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.ElementReference
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 15;

	/**
	 * The number of structural features of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.PathImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 16;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = ELEMENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl <em>Default Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getDefaultModifier()
	 * @generated
	 */
	int DEFAULT_MODIFIER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODIFIER__ID = MODIFIER__ID;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODIFIER__HIDE = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODIFIER__STYLE = MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODIFIER__COLORS = MODIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODIFIER_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Default Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODIFIER_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.SnippetImpl <em>Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.SnippetImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSnippet()
	 * @generated
	 */
	int SNIPPET = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__ID = INTERACTIVE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NAME = INTERACTIVE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__MODEL = INTERACTIVE_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__FOCUS = INTERACTIVE_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_FEATURE_COUNT = INTERACTIVE_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_OPERATION_COUNT = INTERACTIVE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.ModelSnippet <em>Model Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.ModelSnippet
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getModelSnippet()
	 * @generated
	 */
	int MODEL_SNIPPET = 19;

	/**
	 * The number of structural features of the '<em>Model Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNIPPET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNIPPET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.SiriusWebModelImpl <em>Sirius Web Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.SiriusWebModelImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSiriusWebModel()
	 * @generated
	 */
	int SIRIUS_WEB_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_WEB_MODEL__MODEL = MODEL_SNIPPET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sirius Web Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_WEB_MODEL_FEATURE_COUNT = MODEL_SNIPPET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sirius Web Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_WEB_MODEL_OPERATION_COUNT = MODEL_SNIPPET_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Interactivity <em>Interactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactivity</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity
	 * @generated
	 */
	EClass getInteractivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Interactivity#getDomainId <em>Domain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Id</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity#getDomainId()
	 * @see #getInteractivity()
	 * @generated
	 */
	EAttribute getInteractivity_DomainId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.interactivity.Interactivity#getDiagramDefinition <em>Diagram Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Definition</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity#getDiagramDefinition()
	 * @see #getInteractivity()
	 * @generated
	 */
	EReference getInteractivity_DiagramDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.Interactivity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity#getFeatures()
	 * @see #getInteractivity()
	 * @generated
	 */
	EReference getInteractivity_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.Interactivity#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity#getFilters()
	 * @see #getInteractivity()
	 * @generated
	 */
	EReference getInteractivity_Filters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.InteractiveFeature <em>Interactive Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactive Feature</em>'.
	 * @see org.eclipse.sirius.components.interactivity.InteractiveFeature
	 * @generated
	 */
	EClass getInteractiveFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.SemanticZoom <em>Semantic Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Zoom</em>'.
	 * @see org.eclipse.sirius.components.interactivity.SemanticZoom
	 * @generated
	 */
	EClass getSemanticZoom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.SemanticZoom#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see org.eclipse.sirius.components.interactivity.SemanticZoom#getLevels()
	 * @see #getSemanticZoom()
	 * @generated
	 */
	EReference getSemanticZoom_Levels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Level#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Level#getMin()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Level#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Level#getMax()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Max();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.interactivity.Level#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Level#getFilter()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Filter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.FilterDefinition <em>Filter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Definition</em>'.
	 * @see org.eclipse.sirius.components.interactivity.FilterDefinition
	 * @generated
	 */
	EClass getFilterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.FilterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.components.interactivity.FilterDefinition#getName()
	 * @see #getFilterDefinition()
	 * @generated
	 */
	EAttribute getFilterDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.FilterDefinition#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see org.eclipse.sirius.components.interactivity.FilterDefinition#getModifiers()
	 * @see #getFilterDefinition()
	 * @generated
	 */
	EReference getFilterDefinition_Modifiers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.VisibilityModifier <em>Visibility Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Modifier</em>'.
	 * @see org.eclipse.sirius.components.interactivity.VisibilityModifier
	 * @generated
	 */
	EClass getVisibilityModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.VisibilityModifier#isHide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide</em>'.
	 * @see org.eclipse.sirius.components.interactivity.VisibilityModifier#isHide()
	 * @see #getVisibilityModifier()
	 * @generated
	 */
	EAttribute getVisibilityModifier_Hide();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.StyleModifier <em>Style Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Modifier</em>'.
	 * @see org.eclipse.sirius.components.interactivity.StyleModifier
	 * @generated
	 */
	EClass getStyleModifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.StyleModifier#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.sirius.components.interactivity.StyleModifier#getStyle()
	 * @see #getStyleModifier()
	 * @generated
	 */
	EReference getStyleModifier_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.StyleModifier#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colors</em>'.
	 * @see org.eclipse.sirius.components.interactivity.StyleModifier#getColors()
	 * @see #getStyleModifier()
	 * @generated
	 */
	EReference getStyleModifier_Colors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.DynamicFilter <em>Dynamic Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Filter</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DynamicFilter
	 * @generated
	 */
	EClass getDynamicFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DynamicFilter#getName()
	 * @see #getDynamicFilter()
	 * @generated
	 */
	EAttribute getDynamicFilter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DynamicFilter#getFilter()
	 * @see #getDynamicFilter()
	 * @generated
	 */
	EReference getDynamicFilter_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DynamicFilter#getFocus()
	 * @see #getDynamicFilter()
	 * @generated
	 */
	EReference getDynamicFilter_Focus();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Radius</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DynamicFilter#getRadius()
	 * @see #getDynamicFilter()
	 * @generated
	 */
	EReference getDynamicFilter_Radius();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.DynamicFilter#getDefaultModifier <em>Default Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Modifier</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DynamicFilter#getDefaultModifier()
	 * @see #getDynamicFilter()
	 * @generated
	 */
	EReference getDynamicFilter_DefaultModifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Radius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radius</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Radius
	 * @generated
	 */
	EClass getRadius();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.FixedRadius <em>Fixed Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Radius</em>'.
	 * @see org.eclipse.sirius.components.interactivity.FixedRadius
	 * @generated
	 */
	EClass getFixedRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.FixedRadius#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.sirius.components.interactivity.FixedRadius#getValue()
	 * @see #getFixedRadius()
	 * @generated
	 */
	EAttribute getFixedRadius_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.BoundedRadius <em>Bounded Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Radius</em>'.
	 * @see org.eclipse.sirius.components.interactivity.BoundedRadius
	 * @generated
	 */
	EClass getBoundedRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.BoundedRadius#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.sirius.components.interactivity.BoundedRadius#getMin()
	 * @see #getBoundedRadius()
	 * @generated
	 */
	EAttribute getBoundedRadius_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.BoundedRadius#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.sirius.components.interactivity.BoundedRadius#getMax()
	 * @see #getBoundedRadius()
	 * @generated
	 */
	EAttribute getBoundedRadius_Max();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.SemanticSearch <em>Semantic Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Search</em>'.
	 * @see org.eclipse.sirius.components.interactivity.SemanticSearch
	 * @generated
	 */
	EClass getSemanticSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.SemanticSearch#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Search</em>'.
	 * @see org.eclipse.sirius.components.interactivity.SemanticSearch#getSearch()
	 * @see #getSemanticSearch()
	 * @generated
	 */
	EReference getSemanticSearch_Search();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ScopedModifier <em>Scoped Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Modifier</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ScopedModifier
	 * @generated
	 */
	EClass getScopedModifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.ScopedModifier#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ScopedModifier#getElements()
	 * @see #getScopedModifier()
	 * @generated
	 */
	EReference getScopedModifier_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Path#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Path#getPath()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.DefaultModifier <em>Default Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Modifier</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DefaultModifier
	 * @generated
	 */
	EClass getDefaultModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.DefaultModifier#isHide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DefaultModifier#isHide()
	 * @see #getDefaultModifier()
	 * @generated
	 */
	EAttribute getDefaultModifier_Hide();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.DefaultModifier#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DefaultModifier#getStyle()
	 * @see #getDefaultModifier()
	 * @generated
	 */
	EReference getDefaultModifier_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.DefaultModifier#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colors</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DefaultModifier#getColors()
	 * @see #getDefaultModifier()
	 * @generated
	 */
	EReference getDefaultModifier_Colors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Snippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Snippet
	 * @generated
	 */
	EClass getSnippet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Snippet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Snippet#getName()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.Snippet#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Snippet#getModel()
	 * @see #getSnippet()
	 * @generated
	 */
	EReference getSnippet_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.components.interactivity.Snippet#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Snippet#getFocus()
	 * @see #getSnippet()
	 * @generated
	 */
	EReference getSnippet_Focus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ModelSnippet <em>Model Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Snippet</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ModelSnippet
	 * @generated
	 */
	EClass getModelSnippet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.SiriusWebModel <em>Sirius Web Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Web Model</em>'.
	 * @see org.eclipse.sirius.components.interactivity.SiriusWebModel
	 * @generated
	 */
	EClass getSiriusWebModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.interactivity.SiriusWebModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.sirius.components.interactivity.SiriusWebModel#getModel()
	 * @see #getSiriusWebModel()
	 * @generated
	 */
	EReference getSiriusWebModel_Model();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractivityFactory getInteractivityFactory();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.InteractivityImpl <em>Interactivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractivity()
		 * @generated
		 */
		EClass INTERACTIVITY = eINSTANCE.getInteractivity();

		/**
		 * The meta object literal for the '<em><b>Domain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTIVITY__DOMAIN_ID = eINSTANCE.getInteractivity_DomainId();

		/**
		 * The meta object literal for the '<em><b>Diagram Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVITY__DIAGRAM_DEFINITION = eINSTANCE.getInteractivity_DiagramDefinition();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVITY__FEATURES = eINSTANCE.getInteractivity_Features();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVITY__FILTERS = eINSTANCE.getInteractivity_Filters();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.InteractiveFeature <em>Interactive Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.InteractiveFeature
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractiveFeature()
		 * @generated
		 */
		EClass INTERACTIVE_FEATURE = eINSTANCE.getInteractiveFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.SemanticZoomImpl <em>Semantic Zoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.SemanticZoomImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSemanticZoom()
		 * @generated
		 */
		EClass SEMANTIC_ZOOM = eINSTANCE.getSemanticZoom();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ZOOM__LEVELS = eINSTANCE.getSemanticZoom_Levels();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.LevelImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__MIN = eINSTANCE.getLevel_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__MAX = eINSTANCE.getLevel_Max();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__FILTER = eINSTANCE.getLevel_Filter();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.FilterDefinitionImpl <em>Filter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.FilterDefinitionImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getFilterDefinition()
		 * @generated
		 */
		EClass FILTER_DEFINITION = eINSTANCE.getFilterDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_DEFINITION__NAME = eINSTANCE.getFilterDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_DEFINITION__MODIFIERS = eINSTANCE.getFilterDefinition_Modifiers();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Modifier <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Modifier
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.VisibilityModifierImpl <em>Visibility Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.VisibilityModifierImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getVisibilityModifier()
		 * @generated
		 */
		EClass VISIBILITY_MODIFIER = eINSTANCE.getVisibilityModifier();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_MODIFIER__HIDE = eINSTANCE.getVisibilityModifier_Hide();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.StyleModifierImpl <em>Style Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.StyleModifierImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getStyleModifier()
		 * @generated
		 */
		EClass STYLE_MODIFIER = eINSTANCE.getStyleModifier();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_MODIFIER__STYLE = eINSTANCE.getStyleModifier_Style();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_MODIFIER__COLORS = eINSTANCE.getStyleModifier_Colors();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl <em>Dynamic Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.DynamicFilterImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getDynamicFilter()
		 * @generated
		 */
		EClass DYNAMIC_FILTER = eINSTANCE.getDynamicFilter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_FILTER__NAME = eINSTANCE.getDynamicFilter_Name();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_FILTER__FILTER = eINSTANCE.getDynamicFilter_Filter();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_FILTER__FOCUS = eINSTANCE.getDynamicFilter_Focus();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_FILTER__RADIUS = eINSTANCE.getDynamicFilter_Radius();

		/**
		 * The meta object literal for the '<em><b>Default Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_FILTER__DEFAULT_MODIFIER = eINSTANCE.getDynamicFilter_DefaultModifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Radius <em>Radius</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Radius
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getRadius()
		 * @generated
		 */
		EClass RADIUS = eINSTANCE.getRadius();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.FixedRadiusImpl <em>Fixed Radius</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.FixedRadiusImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getFixedRadius()
		 * @generated
		 */
		EClass FIXED_RADIUS = eINSTANCE.getFixedRadius();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_RADIUS__VALUE = eINSTANCE.getFixedRadius_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.BoundedRadiusImpl <em>Bounded Radius</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.BoundedRadiusImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getBoundedRadius()
		 * @generated
		 */
		EClass BOUNDED_RADIUS = eINSTANCE.getBoundedRadius();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_RADIUS__MIN = eINSTANCE.getBoundedRadius_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_RADIUS__MAX = eINSTANCE.getBoundedRadius_Max();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.SemanticSearchImpl <em>Semantic Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.SemanticSearchImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSemanticSearch()
		 * @generated
		 */
		EClass SEMANTIC_SEARCH = eINSTANCE.getSemanticSearch();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_SEARCH__SEARCH = eINSTANCE.getSemanticSearch_Search();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Identifiable
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.ScopedModifier <em>Scoped Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.ScopedModifier
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getScopedModifier()
		 * @generated
		 */
		EClass SCOPED_MODIFIER = eINSTANCE.getScopedModifier();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_MODIFIER__ELEMENTS = eINSTANCE.getScopedModifier_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.ElementReference <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.ElementReference
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getElementReference()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.PathImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__PATH = eINSTANCE.getPath_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl <em>Default Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.DefaultModifierImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getDefaultModifier()
		 * @generated
		 */
		EClass DEFAULT_MODIFIER = eINSTANCE.getDefaultModifier();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_MODIFIER__HIDE = eINSTANCE.getDefaultModifier_Hide();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_MODIFIER__STYLE = eINSTANCE.getDefaultModifier_Style();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_MODIFIER__COLORS = eINSTANCE.getDefaultModifier_Colors();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.SnippetImpl <em>Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.SnippetImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSnippet()
		 * @generated
		 */
		EClass SNIPPET = eINSTANCE.getSnippet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__NAME = eINSTANCE.getSnippet_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNIPPET__MODEL = eINSTANCE.getSnippet_Model();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNIPPET__FOCUS = eINSTANCE.getSnippet_Focus();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.ModelSnippet <em>Model Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.ModelSnippet
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getModelSnippet()
		 * @generated
		 */
		EClass MODEL_SNIPPET = eINSTANCE.getModelSnippet();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.SiriusWebModelImpl <em>Sirius Web Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.SiriusWebModelImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getSiriusWebModel()
		 * @generated
		 */
		EClass SIRIUS_WEB_MODEL = eINSTANCE.getSiriusWebModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_WEB_MODEL__MODEL = eINSTANCE.getSiriusWebModel_Model();

	}

} //InteractivityPackage
