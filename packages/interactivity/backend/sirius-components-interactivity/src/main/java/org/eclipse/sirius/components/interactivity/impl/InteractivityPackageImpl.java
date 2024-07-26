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
package org.eclipse.sirius.components.interactivity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.components.interactivity.BoundedRadius;
import org.eclipse.sirius.components.interactivity.DefaultModifier;
import org.eclipse.sirius.components.interactivity.DynamicFilter;
import org.eclipse.sirius.components.interactivity.ElementReference;
import org.eclipse.sirius.components.interactivity.FilterDefinition;
import org.eclipse.sirius.components.interactivity.FixedRadius;
import org.eclipse.sirius.components.interactivity.Identifiable;
import org.eclipse.sirius.components.interactivity.InteractiveFeature;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityFactory;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.Level;
import org.eclipse.sirius.components.interactivity.Modifier;
import org.eclipse.sirius.components.interactivity.Path;
import org.eclipse.sirius.components.interactivity.Radius;
import org.eclipse.sirius.components.interactivity.ScopedModifier;
import org.eclipse.sirius.components.interactivity.SemanticSearch;
import org.eclipse.sirius.components.interactivity.SemanticZoom;
import org.eclipse.sirius.components.interactivity.StyleModifier;
import org.eclipse.sirius.components.interactivity.VisibilityModifier;

import org.eclipse.sirius.components.view.ViewPackage;

import org.eclipse.sirius.components.view.diagram.DiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractivityPackageImpl extends EPackageImpl implements InteractivityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactiveFeatureEClass = null;

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
	private EClass levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radiusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedRadiusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedRadiusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultModifierEClass = null;

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
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractivityPackageImpl() {
		super(eNS_URI, InteractivityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InteractivityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractivityPackage init() {
		if (isInited)
			return (InteractivityPackage) EPackage.Registry.INSTANCE.getEPackage(InteractivityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInteractivityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InteractivityPackageImpl theInteractivityPackage = registeredInteractivityPackage instanceof InteractivityPackageImpl
				? (InteractivityPackageImpl) registeredInteractivityPackage
				: new InteractivityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		ViewPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInteractivityPackage.createPackageContents();

		// Initialize created meta-data
		theInteractivityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInteractivityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractivityPackage.eNS_URI, theInteractivityPackage);
		return theInteractivityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractivity() {
		return interactivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractivity_DomainId() {
		return (EAttribute) interactivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractivity_DiagramDefinition() {
		return (EReference) interactivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractivity_Features() {
		return (EReference) interactivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractivity_Filters() {
		return (EReference) interactivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractiveFeature() {
		return interactiveFeatureEClass;
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
	public EReference getSemanticZoom_Levels() {
		return (EReference) semanticZoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevel() {
		return levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevel_Min() {
		return (EAttribute) levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevel_Max() {
		return (EAttribute) levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevel_Filter() {
		return (EReference) levelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterDefinition() {
		return filterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterDefinition_Name() {
		return (EAttribute) filterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterDefinition_Modifiers() {
		return (EReference) filterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisibilityModifier() {
		return visibilityModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVisibilityModifier_Hide() {
		return (EAttribute) visibilityModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleModifier() {
		return styleModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleModifier_Style() {
		return (EReference) styleModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleModifier_Colors() {
		return (EReference) styleModifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicFilter() {
		return dynamicFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicFilter_Name() {
		return (EAttribute) dynamicFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicFilter_Filter() {
		return (EReference) dynamicFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicFilter_Focus() {
		return (EReference) dynamicFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicFilter_Radius() {
		return (EReference) dynamicFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicFilter_DefaultModifier() {
		return (EReference) dynamicFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRadius() {
		return radiusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedRadius() {
		return fixedRadiusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedRadius_Value() {
		return (EAttribute) fixedRadiusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedRadius() {
		return boundedRadiusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedRadius_Min() {
		return (EAttribute) boundedRadiusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedRadius_Max() {
		return (EAttribute) boundedRadiusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemanticSearch() {
		return semanticSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemanticSearch_Search() {
		return (EReference) semanticSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiable_Id() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScopedModifier() {
		return scopedModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopedModifier_Elements() {
		return (EReference) scopedModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementReference() {
		return elementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_Path() {
		return (EAttribute) pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultModifier() {
		return defaultModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultModifier_Hide() {
		return (EAttribute) defaultModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultModifier_Style() {
		return (EReference) defaultModifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultModifier_Colors() {
		return (EReference) defaultModifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractivityFactory getInteractivityFactory() {
		return (InteractivityFactory) getEFactoryInstance();
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
		interactivityEClass = createEClass(INTERACTIVITY);
		createEAttribute(interactivityEClass, INTERACTIVITY__DOMAIN_ID);
		createEReference(interactivityEClass, INTERACTIVITY__DIAGRAM_DEFINITION);
		createEReference(interactivityEClass, INTERACTIVITY__FEATURES);
		createEReference(interactivityEClass, INTERACTIVITY__FILTERS);

		interactiveFeatureEClass = createEClass(INTERACTIVE_FEATURE);

		semanticZoomEClass = createEClass(SEMANTIC_ZOOM);
		createEReference(semanticZoomEClass, SEMANTIC_ZOOM__LEVELS);

		levelEClass = createEClass(LEVEL);
		createEAttribute(levelEClass, LEVEL__MIN);
		createEAttribute(levelEClass, LEVEL__MAX);
		createEReference(levelEClass, LEVEL__FILTER);

		filterDefinitionEClass = createEClass(FILTER_DEFINITION);
		createEAttribute(filterDefinitionEClass, FILTER_DEFINITION__NAME);
		createEReference(filterDefinitionEClass, FILTER_DEFINITION__MODIFIERS);

		modifierEClass = createEClass(MODIFIER);

		visibilityModifierEClass = createEClass(VISIBILITY_MODIFIER);
		createEAttribute(visibilityModifierEClass, VISIBILITY_MODIFIER__HIDE);

		styleModifierEClass = createEClass(STYLE_MODIFIER);
		createEReference(styleModifierEClass, STYLE_MODIFIER__STYLE);
		createEReference(styleModifierEClass, STYLE_MODIFIER__COLORS);

		dynamicFilterEClass = createEClass(DYNAMIC_FILTER);
		createEAttribute(dynamicFilterEClass, DYNAMIC_FILTER__NAME);
		createEReference(dynamicFilterEClass, DYNAMIC_FILTER__FILTER);
		createEReference(dynamicFilterEClass, DYNAMIC_FILTER__FOCUS);
		createEReference(dynamicFilterEClass, DYNAMIC_FILTER__RADIUS);
		createEReference(dynamicFilterEClass, DYNAMIC_FILTER__DEFAULT_MODIFIER);

		radiusEClass = createEClass(RADIUS);

		fixedRadiusEClass = createEClass(FIXED_RADIUS);
		createEAttribute(fixedRadiusEClass, FIXED_RADIUS__VALUE);

		boundedRadiusEClass = createEClass(BOUNDED_RADIUS);
		createEAttribute(boundedRadiusEClass, BOUNDED_RADIUS__MIN);
		createEAttribute(boundedRadiusEClass, BOUNDED_RADIUS__MAX);

		semanticSearchEClass = createEClass(SEMANTIC_SEARCH);
		createEReference(semanticSearchEClass, SEMANTIC_SEARCH__SEARCH);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		scopedModifierEClass = createEClass(SCOPED_MODIFIER);
		createEReference(scopedModifierEClass, SCOPED_MODIFIER__ELEMENTS);

		elementReferenceEClass = createEClass(ELEMENT_REFERENCE);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__PATH);

		defaultModifierEClass = createEClass(DEFAULT_MODIFIER);
		createEAttribute(defaultModifierEClass, DEFAULT_MODIFIER__HIDE);
		createEReference(defaultModifierEClass, DEFAULT_MODIFIER__STYLE);
		createEReference(defaultModifierEClass, DEFAULT_MODIFIER__COLORS);
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
		DiagramPackage theDiagramPackage = (DiagramPackage) EPackage.Registry.INSTANCE
				.getEPackage(DiagramPackage.eNS_URI);
		ViewPackage theViewPackage = (ViewPackage) EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		semanticZoomEClass.getESuperTypes().add(this.getInteractiveFeature());
		levelEClass.getESuperTypes().add(this.getIdentifiable());
		modifierEClass.getESuperTypes().add(this.getIdentifiable());
		visibilityModifierEClass.getESuperTypes().add(this.getScopedModifier());
		styleModifierEClass.getESuperTypes().add(this.getScopedModifier());
		dynamicFilterEClass.getESuperTypes().add(this.getInteractiveFeature());
		dynamicFilterEClass.getESuperTypes().add(this.getIdentifiable());
		fixedRadiusEClass.getESuperTypes().add(this.getRadius());
		boundedRadiusEClass.getESuperTypes().add(this.getRadius());
		semanticSearchEClass.getESuperTypes().add(this.getInteractiveFeature());
		semanticSearchEClass.getESuperTypes().add(this.getIdentifiable());
		scopedModifierEClass.getESuperTypes().add(this.getModifier());
		pathEClass.getESuperTypes().add(this.getElementReference());
		defaultModifierEClass.getESuperTypes().add(this.getModifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactivityEClass, Interactivity.class, "Interactivity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractivity_DomainId(), ecorePackage.getEString(), "domainId", null, 1, 1,
				Interactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInteractivity_DiagramDefinition(), theDiagramPackage.getDiagramDescription(), null,
				"diagramDefinition", null, 1, 1, Interactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractivity_Features(), this.getInteractiveFeature(), null, "features", null, 0, -1,
				Interactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractivity_Filters(), this.getFilterDefinition(), null, "filters", null, 0, -1,
				Interactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactiveFeatureEClass, InteractiveFeature.class, "InteractiveFeature", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(semanticZoomEClass, SemanticZoom.class, "SemanticZoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticZoom_Levels(), this.getLevel(), null, "levels", null, 1, -1, SemanticZoom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevel_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevel_Max(), ecorePackage.getEInt(), "max", null, 1, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Filter(), this.getFilterDefinition(), null, "filter", null, 1, 1, Level.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterDefinitionEClass, FilterDefinition.class, "FilterDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				FilterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFilterDefinition_Modifiers(), this.getScopedModifier(), null, "modifiers", null, 1, -1,
				FilterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visibilityModifierEClass, VisibilityModifier.class, "VisibilityModifier", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityModifier_Hide(), ecorePackage.getEBoolean(), "hide", null, 1, 1,
				VisibilityModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(styleModifierEClass, StyleModifier.class, "StyleModifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleModifier_Style(), theDiagramPackage.getNodeStyleDescription(), null, "style", null, 1, 1,
				StyleModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleModifier_Colors(), theViewPackage.getUserColor(), null, "colors", null, 0, -1,
				StyleModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicFilterEClass, DynamicFilter.class, "DynamicFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicFilter_Name(), ecorePackage.getEString(), "name", null, 1, 1, DynamicFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicFilter_Filter(), this.getFilterDefinition(), null, "filter", null, 1, 1,
				DynamicFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicFilter_Focus(), this.getElementReference(), null, "focus", null, 1, 1,
				DynamicFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicFilter_Radius(), this.getRadius(), null, "radius", null, 0, 1, DynamicFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicFilter_DefaultModifier(), this.getDefaultModifier(), null, "defaultModifier", null, 1,
				1, DynamicFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radiusEClass, Radius.class, "Radius", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedRadiusEClass, FixedRadius.class, "FixedRadius", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedRadius_Value(), ecorePackage.getEInt(), "value", null, 0, 1, FixedRadius.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedRadiusEClass, BoundedRadius.class, "BoundedRadius", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedRadius_Min(), ecorePackage.getEInt(), "min", null, 1, 1, BoundedRadius.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedRadius_Max(), ecorePackage.getEInt(), "max", null, 1, 1, BoundedRadius.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticSearchEClass, SemanticSearch.class, "SemanticSearch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticSearch_Search(), this.getElementReference(), null, "search", null, 1, -1,
				SemanticSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 1, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopedModifierEClass, ScopedModifier.class, "ScopedModifier", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopedModifier_Elements(), this.getElementReference(), null, "elements", null, 1, 1,
				ScopedModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Path(), ecorePackage.getEString(), "path", null, 1, 1, Path.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultModifierEClass, DefaultModifier.class, "DefaultModifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultModifier_Hide(), ecorePackage.getEBoolean(), "hide", null, 1, 1, DefaultModifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultModifier_Style(), theDiagramPackage.getNodeStyleDescription(), null, "style", null, 0,
				1, DefaultModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultModifier_Colors(), theViewPackage.getUserColor(), null, "colors", null, 0, -1,
				DefaultModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InteractivityPackageImpl
