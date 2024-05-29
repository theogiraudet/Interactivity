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
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM__LEVELS = InteractivityPackage.INTERACTIVE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ZOOM_FEATURE_COUNT = InteractivityPackage.INTERACTIVE_FEATURE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL__NAME = InteractivityPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Style Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL__STYLE_OVERRIDES = InteractivityPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden AS Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS = InteractivityPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Level Of Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL_FEATURE_COUNT = InteractivityPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Level Of Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_DETAIL_OPERATION_COUNT = InteractivityPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.StyleOverrideImpl <em>Style Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.StyleOverrideImpl
	 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getStyleOverride()
	 * @generated
	 */
	int STYLE_OVERRIDE = 2;

	/**
	 * The feature id for the '<em><b>As Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OVERRIDE__AS_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OVERRIDE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Style Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OVERRIDE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.semantic_zoom.SemanticZoom#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoom#getLevels()
	 * @see #getSemanticZoom()
	 * @generated
	 */
	EReference getSemanticZoom_Levels();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getStyleOverrides <em>Style Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Overrides</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getStyleOverrides()
	 * @see #getLevelOfDetail()
	 * @generated
	 */
	EReference getLevelOfDetail_StyleOverrides();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getHiddenASElements <em>Hidden AS Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden AS Elements</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.LevelOfDetail#getHiddenASElements()
	 * @see #getLevelOfDetail()
	 * @generated
	 */
	EAttribute getLevelOfDetail_HiddenASElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride <em>Style Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Override</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.StyleOverride
	 * @generated
	 */
	EClass getStyleOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride#getAsElements <em>As Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Elements</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.StyleOverride#getAsElements()
	 * @see #getStyleOverride()
	 * @generated
	 */
	EAttribute getStyleOverride_AsElements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.semantic_zoom.StyleOverride#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Style</em>'.
	 * @see org.eclipse.sirius.components.semantic_zoom.StyleOverride#getStyle()
	 * @see #getStyleOverride()
	 * @generated
	 */
	EReference getStyleOverride_Style();

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
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ZOOM__LEVELS = eINSTANCE.getSemanticZoom_Levels();

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
		 * The meta object literal for the '<em><b>Style Overrides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_OF_DETAIL__STYLE_OVERRIDES = eINSTANCE.getLevelOfDetail_StyleOverrides();

		/**
		 * The meta object literal for the '<em><b>Hidden AS Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_OF_DETAIL__HIDDEN_AS_ELEMENTS = eINSTANCE.getLevelOfDetail_HiddenASElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.semantic_zoom.impl.StyleOverrideImpl <em>Style Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.StyleOverrideImpl
		 * @see org.eclipse.sirius.components.semantic_zoom.impl.SemanticZoomPackageImpl#getStyleOverride()
		 * @generated
		 */
		EClass STYLE_OVERRIDE = eINSTANCE.getStyleOverride();

		/**
		 * The meta object literal for the '<em><b>As Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_OVERRIDE__AS_ELEMENTS = eINSTANCE.getStyleOverride_AsElements();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_OVERRIDE__STYLE = eINSTANCE.getStyleOverride_Style();

	}

} //SemanticZoomPackage
