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
import org.eclipse.sirius.components.interactivity.AbstractSyntaxReference;
import org.eclipse.sirius.components.interactivity.Action;
import org.eclipse.sirius.components.interactivity.AsCsMappingReference;
import org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference;
import org.eclipse.sirius.components.interactivity.DiagramEditor;
import org.eclipse.sirius.components.interactivity.GraphicZoom;
import org.eclipse.sirius.components.interactivity.Interaction;
import org.eclipse.sirius.components.interactivity.InteractiveElement;
import org.eclipse.sirius.components.interactivity.InteractiveFeature;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityFactory;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.ModelReference;
import org.eclipse.sirius.components.interactivity.NodeMappingReference;
import org.eclipse.sirius.components.interactivity.ObservableEvent;
import org.eclipse.sirius.components.interactivity.ZoomLevel;
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
	private EClass interactiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observableEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

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
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicZoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoomLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSyntaxReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteSyntaxReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asCsMappingReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeMappingReferenceEClass = null;

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
	public EReference getInteractivity_InteractiveElements() {
		return (EReference) interactivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractiveElement() {
		return interactiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractiveElement_Tools() {
		return (EReference) interactiveElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractiveElement_Features() {
		return (EReference) interactiveElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteraction_Events() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObservableEvent() {
		return observableEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObservableEvent_Actions() {
		return (EReference) observableEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_References() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
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
	public EReference getInteractiveFeature_Actions() {
		return (EReference) interactiveFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagramEditor() {
		return diagramEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramEditor_DiagramReference() {
		return (EReference) diagramEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicZoom() {
		return graphicZoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZoomLevel() {
		return zoomLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZoomLevel_Level() {
		return (EAttribute) zoomLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractSyntaxReference() {
		return abstractSyntaxReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcreteSyntaxReference() {
		return concreteSyntaxReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsCsMappingReference() {
		return asCsMappingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeMappingReference() {
		return nodeMappingReferenceEClass;
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
		createEReference(interactivityEClass, INTERACTIVITY__INTERACTIVE_ELEMENTS);

		interactiveElementEClass = createEClass(INTERACTIVE_ELEMENT);
		createEReference(interactiveElementEClass, INTERACTIVE_ELEMENT__TOOLS);
		createEReference(interactiveElementEClass, INTERACTIVE_ELEMENT__FEATURES);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__EVENTS);

		observableEventEClass = createEClass(OBSERVABLE_EVENT);
		createEReference(observableEventEClass, OBSERVABLE_EVENT__ACTIONS);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__REFERENCES);

		interactiveFeatureEClass = createEClass(INTERACTIVE_FEATURE);
		createEReference(interactiveFeatureEClass, INTERACTIVE_FEATURE__ACTIONS);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);

		diagramEditorEClass = createEClass(DIAGRAM_EDITOR);
		createEReference(diagramEditorEClass, DIAGRAM_EDITOR__DIAGRAM_REFERENCE);

		graphicZoomEClass = createEClass(GRAPHIC_ZOOM);

		zoomLevelEClass = createEClass(ZOOM_LEVEL);
		createEAttribute(zoomLevelEClass, ZOOM_LEVEL__LEVEL);

		abstractSyntaxReferenceEClass = createEClass(ABSTRACT_SYNTAX_REFERENCE);

		concreteSyntaxReferenceEClass = createEClass(CONCRETE_SYNTAX_REFERENCE);

		asCsMappingReferenceEClass = createEClass(AS_CS_MAPPING_REFERENCE);

		nodeMappingReferenceEClass = createEClass(NODE_MAPPING_REFERENCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramEditorEClass.getESuperTypes().add(this.getInteractiveElement());
		graphicZoomEClass.getESuperTypes().add(this.getInteraction());
		zoomLevelEClass.getESuperTypes().add(this.getObservableEvent());
		abstractSyntaxReferenceEClass.getESuperTypes().add(this.getModelReference());
		concreteSyntaxReferenceEClass.getESuperTypes().add(this.getModelReference());
		asCsMappingReferenceEClass.getESuperTypes().add(this.getModelReference());
		nodeMappingReferenceEClass.getESuperTypes().add(this.getAsCsMappingReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactivityEClass, Interactivity.class, "Interactivity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractivity_InteractiveElements(), this.getInteractiveElement(), null,
				"interactiveElements", null, 0, -1, Interactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactiveElementEClass, InteractiveElement.class, "InteractiveElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractiveElement_Tools(), this.getInteraction(), null, "tools", null, 0, -1,
				InteractiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractiveElement_Features(), this.getInteractiveFeature(), null, "features", null, 0, -1,
				InteractiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Events(), this.getObservableEvent(), null, "events", null, 0, -1,
				Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observableEventEClass, ObservableEvent.class, "ObservableEvent", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservableEvent_Actions(), this.getAction(), null, "actions", null, 1, -1,
				ObservableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_References(), this.getModelReference(), null, "references", null, 0, -1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactiveFeatureEClass, InteractiveFeature.class, "InteractiveFeature", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractiveFeature_Actions(), this.getAction(), null, "actions", null, 0, -1,
				InteractiveFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramEditorEClass, DiagramEditor.class, "DiagramEditor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramEditor_DiagramReference(), theDiagramPackage.getDiagramDescription(), null,
				"diagramReference", null, 0, 1, DiagramEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicZoomEClass, GraphicZoom.class, "GraphicZoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(zoomLevelEClass, ZoomLevel.class, "ZoomLevel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoomLevel_Level(), ecorePackage.getEInt(), "level", null, 0, 1, ZoomLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSyntaxReferenceEClass, AbstractSyntaxReference.class, "AbstractSyntaxReference", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteSyntaxReferenceEClass, ConcreteSyntaxReference.class, "ConcreteSyntaxReference", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asCsMappingReferenceEClass, AsCsMappingReference.class, "AsCsMappingReference", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeMappingReferenceEClass, NodeMappingReference.class, "NodeMappingReference", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InteractivityPackageImpl
