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
package org.eclipse.sirius.components.semantic_zoom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.semantic_zoom.ByDepth;
import org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber;
import org.eclipse.sirius.components.semantic_zoom.GraphicalFilter;
import org.eclipse.sirius.components.semantic_zoom.LevelOfDetail;
import org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoom;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomFactory;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;
import org.eclipse.sirius.components.view.ViewPackage;
import org.eclipse.sirius.components.view.diagram.DiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticZoomPackageImpl extends EPackageImpl implements SemanticZoomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticZoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOfDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeMappingStyleOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byDepthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byEdgeNumberEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticZoomPackageImpl() {
		super(eNS_URI, SemanticZoomFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SemanticZoomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemanticZoomPackage init() {
		if (isInited)
			return (SemanticZoomPackage) EPackage.Registry.INSTANCE.getEPackage(SemanticZoomPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSemanticZoomPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SemanticZoomPackageImpl theSemanticZoomPackage = registeredSemanticZoomPackage instanceof SemanticZoomPackageImpl
				? (SemanticZoomPackageImpl) registeredSemanticZoomPackage
				: new SemanticZoomPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		InteractivityPackage.eINSTANCE.eClass();
		ViewPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSemanticZoomPackage.createPackageContents();

		// Initialize created meta-data
		theSemanticZoomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemanticZoomPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemanticZoomPackage.eNS_URI, theSemanticZoomPackage);
		return theSemanticZoomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemanticZoom() {
		return semanticZoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevelOfDetail() {
		return levelOfDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelOfDetail_Id() {
		return (EAttribute) levelOfDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicalFilter() {
		return graphicalFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeMappingStyleOverride() {
		return nodeMappingStyleOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeMappingStyleOverride_NodeDescription() {
		return (EReference) nodeMappingStyleOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeMappingStyleOverride_Style() {
		return (EReference) nodeMappingStyleOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeMappingStyleOverride_Filters() {
		return (EReference) nodeMappingStyleOverrideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getByDepth() {
		return byDepthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getByEdgeNumber() {
		return byEdgeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticZoomFactory getSemanticZoomFactory() {
		return (SemanticZoomFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		semanticZoomEClass = createEClass(SEMANTIC_ZOOM);

		levelOfDetailEClass = createEClass(LEVEL_OF_DETAIL);
		createEAttribute(levelOfDetailEClass, LEVEL_OF_DETAIL__ID);

		graphicalFilterEClass = createEClass(GRAPHICAL_FILTER);

		nodeMappingStyleOverrideEClass = createEClass(NODE_MAPPING_STYLE_OVERRIDE);
		createEReference(nodeMappingStyleOverrideEClass, NODE_MAPPING_STYLE_OVERRIDE__NODE_DESCRIPTION);
		createEReference(nodeMappingStyleOverrideEClass, NODE_MAPPING_STYLE_OVERRIDE__STYLE);
		createEReference(nodeMappingStyleOverrideEClass, NODE_MAPPING_STYLE_OVERRIDE__FILTERS);

		byDepthEClass = createEClass(BY_DEPTH);

		byEdgeNumberEClass = createEClass(BY_EDGE_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InteractivityPackage theInteractivityPackage = (InteractivityPackage) EPackage.Registry.INSTANCE
				.getEPackage(InteractivityPackage.eNS_URI);
		DiagramPackage theDiagramPackage = (DiagramPackage) EPackage.Registry.INSTANCE
				.getEPackage(DiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		semanticZoomEClass.getESuperTypes().add(theInteractivityPackage.getInteractiveFeature());
		levelOfDetailEClass.getESuperTypes().add(theInteractivityPackage.getAction());
		nodeMappingStyleOverrideEClass.getESuperTypes().add(theInteractivityPackage.getNodeMappingReference());
		byDepthEClass.getESuperTypes().add(this.getGraphicalFilter());
		byEdgeNumberEClass.getESuperTypes().add(this.getGraphicalFilter());

		// Initialize classes, features, and operations; add parameters
		initEClass(semanticZoomEClass, SemanticZoom.class, "SemanticZoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(levelOfDetailEClass, LevelOfDetail.class, "LevelOfDetail", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelOfDetail_Id(), ecorePackage.getEString(), "id", null, 1, 1, LevelOfDetail.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalFilterEClass, GraphicalFilter.class, "GraphicalFilter", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeMappingStyleOverrideEClass, NodeMappingStyleOverride.class, "NodeMappingStyleOverride",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeMappingStyleOverride_NodeDescription(), theDiagramPackage.getNodeDescription(), null,
				"nodeDescription", null, 1, 1, NodeMappingStyleOverride.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMappingStyleOverride_Style(), theDiagramPackage.getNodeStyleDescription(), null, "style",
				null, 1, 1, NodeMappingStyleOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMappingStyleOverride_Filters(), this.getGraphicalFilter(), null, "filters", null, 0, -1,
				NodeMappingStyleOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byDepthEClass, ByDepth.class, "ByDepth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(byEdgeNumberEClass, ByEdgeNumber.class, "ByEdgeNumber", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SemanticZoomPackageImpl
