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
	 * The feature id for the '<em><b>Interactive Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY__INTERACTIVE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Interactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.InteractiveElement <em>Interactive Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.InteractiveElement
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractiveElement()
	 * @generated
	 */
	int INTERACTIVE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_ELEMENT__TOOLS = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_ELEMENT__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Interactive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interactive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Interaction <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Interaction
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EVENTS = 0;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.ObservableEvent <em>Observable Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.ObservableEvent
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getObservableEvent()
	 * @generated
	 */
	int OBSERVABLE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE_EVENT__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Observable Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Observable Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Action
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REFERENCES = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.InteractiveFeature <em>Interactive Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.InteractiveFeature
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractiveFeature()
	 * @generated
	 */
	int INTERACTIVE_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_FEATURE__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Interactive Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interactive Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.ModelReference <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.ModelReference
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 6;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl <em>Diagram Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getDiagramEditor()
	 * @generated
	 */
	int DIAGRAM_EDITOR = 7;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR__TOOLS = INTERACTIVE_ELEMENT__TOOLS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR__FEATURES = INTERACTIVE_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Diagram Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR__DIAGRAM_REFERENCE = INTERACTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR_FEATURE_COUNT = INTERACTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diagram Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR_OPERATION_COUNT = INTERACTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl <em>Graphic Zoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getGraphicZoom()
	 * @generated
	 */
	int GRAPHIC_ZOOM = 8;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ZOOM__EVENTS = INTERACTION__EVENTS;

	/**
	 * The number of structural features of the '<em>Graphic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ZOOM_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graphic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ZOOM_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.ZoomLevelImpl <em>Zoom Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.ZoomLevelImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getZoomLevel()
	 * @generated
	 */
	int ZOOM_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL__ACTIONS = OBSERVABLE_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL__LEVEL = OBSERVABLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zoom Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL_FEATURE_COUNT = OBSERVABLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Zoom Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL_OPERATION_COUNT = OBSERVABLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.AbstractSyntaxReference <em>Abstract Syntax Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.AbstractSyntaxReference
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAbstractSyntaxReference()
	 * @generated
	 */
	int ABSTRACT_SYNTAX_REFERENCE = 10;

	/**
	 * The number of structural features of the '<em>Abstract Syntax Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_REFERENCE_FEATURE_COUNT = MODEL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Syntax Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_REFERENCE_OPERATION_COUNT = MODEL_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference <em>Concrete Syntax Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getConcreteSyntaxReference()
	 * @generated
	 */
	int CONCRETE_SYNTAX_REFERENCE = 11;

	/**
	 * The number of structural features of the '<em>Concrete Syntax Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_REFERENCE_FEATURE_COUNT = MODEL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concrete Syntax Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_REFERENCE_OPERATION_COUNT = MODEL_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.AsCsMappingReference <em>As Cs Mapping Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.AsCsMappingReference
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAsCsMappingReference()
	 * @generated
	 */
	int AS_CS_MAPPING_REFERENCE = 12;

	/**
	 * The number of structural features of the '<em>As Cs Mapping Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_CS_MAPPING_REFERENCE_FEATURE_COUNT = MODEL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>As Cs Mapping Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_CS_MAPPING_REFERENCE_OPERATION_COUNT = MODEL_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.NodeMappingReference <em>Node Mapping Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.NodeMappingReference
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getNodeMappingReference()
	 * @generated
	 */
	int NODE_MAPPING_REFERENCE = 13;

	/**
	 * The number of structural features of the '<em>Node Mapping Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_REFERENCE_FEATURE_COUNT = AS_CS_MAPPING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Mapping Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_REFERENCE_OPERATION_COUNT = AS_CS_MAPPING_REFERENCE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.Interactivity#getInteractiveElements <em>Interactive Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactive Elements</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity#getInteractiveElements()
	 * @see #getInteractivity()
	 * @generated
	 */
	EReference getInteractivity_InteractiveElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.InteractiveElement <em>Interactive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactive Element</em>'.
	 * @see org.eclipse.sirius.components.interactivity.InteractiveElement
	 * @generated
	 */
	EClass getInteractiveElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.InteractiveElement#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see org.eclipse.sirius.components.interactivity.InteractiveElement#getTools()
	 * @see #getInteractiveElement()
	 * @generated
	 */
	EReference getInteractiveElement_Tools();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.InteractiveElement#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclipse.sirius.components.interactivity.InteractiveElement#getFeatures()
	 * @see #getInteractiveElement()
	 * @generated
	 */
	EReference getInteractiveElement_Features();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.Interaction#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interaction#getEvents()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Events();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ObservableEvent <em>Observable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observable Event</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ObservableEvent
	 * @generated
	 */
	EClass getObservableEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.components.interactivity.ObservableEvent#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ObservableEvent#getActions()
	 * @see #getObservableEvent()
	 * @generated
	 */
	EReference getObservableEvent_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.Action#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Action#getReferences()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_References();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.InteractiveFeature#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.sirius.components.interactivity.InteractiveFeature#getActions()
	 * @see #getInteractiveFeature()
	 * @generated
	 */
	EReference getInteractiveFeature_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.DiagramEditor <em>Diagram Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Editor</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DiagramEditor
	 * @generated
	 */
	EClass getDiagramEditor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramReference <em>Diagram Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramReference()
	 * @see #getDiagramEditor()
	 * @generated
	 */
	EReference getDiagramEditor_DiagramReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.GraphicZoom <em>Graphic Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Zoom</em>'.
	 * @see org.eclipse.sirius.components.interactivity.GraphicZoom
	 * @generated
	 */
	EClass getGraphicZoom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ZoomLevel <em>Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoom Level</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ZoomLevel
	 * @generated
	 */
	EClass getZoomLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.ZoomLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ZoomLevel#getLevel()
	 * @see #getZoomLevel()
	 * @generated
	 */
	EAttribute getZoomLevel_Level();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.AbstractSyntaxReference <em>Abstract Syntax Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.AbstractSyntaxReference
	 * @generated
	 */
	EClass getAbstractSyntaxReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference <em>Concrete Syntax Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference
	 * @generated
	 */
	EClass getConcreteSyntaxReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.AsCsMappingReference <em>As Cs Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As Cs Mapping Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.AsCsMappingReference
	 * @generated
	 */
	EClass getAsCsMappingReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.NodeMappingReference <em>Node Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Mapping Reference</em>'.
	 * @see org.eclipse.sirius.components.interactivity.NodeMappingReference
	 * @generated
	 */
	EClass getNodeMappingReference();

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
		 * The meta object literal for the '<em><b>Interactive Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVITY__INTERACTIVE_ELEMENTS = eINSTANCE.getInteractivity_InteractiveElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.InteractiveElement <em>Interactive Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.InteractiveElement
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteractiveElement()
		 * @generated
		 */
		EClass INTERACTIVE_ELEMENT = eINSTANCE.getInteractiveElement();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVE_ELEMENT__TOOLS = eINSTANCE.getInteractiveElement_Tools();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVE_ELEMENT__FEATURES = eINSTANCE.getInteractiveElement_Features();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Interaction <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Interaction
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__EVENTS = eINSTANCE.getInteraction_Events();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.ObservableEvent <em>Observable Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.ObservableEvent
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getObservableEvent()
		 * @generated
		 */
		EClass OBSERVABLE_EVENT = eINSTANCE.getObservableEvent();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVABLE_EVENT__ACTIONS = eINSTANCE.getObservableEvent_Actions();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Action
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__REFERENCES = eINSTANCE.getAction_References();

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
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVE_FEATURE__ACTIONS = eINSTANCE.getInteractiveFeature_Actions();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.ModelReference <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.ModelReference
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl <em>Diagram Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.DiagramEditorImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getDiagramEditor()
		 * @generated
		 */
		EClass DIAGRAM_EDITOR = eINSTANCE.getDiagramEditor();

		/**
		 * The meta object literal for the '<em><b>Diagram Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDITOR__DIAGRAM_REFERENCE = eINSTANCE.getDiagramEditor_DiagramReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl <em>Graphic Zoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getGraphicZoom()
		 * @generated
		 */
		EClass GRAPHIC_ZOOM = eINSTANCE.getGraphicZoom();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.ZoomLevelImpl <em>Zoom Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.ZoomLevelImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getZoomLevel()
		 * @generated
		 */
		EClass ZOOM_LEVEL = eINSTANCE.getZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOM_LEVEL__LEVEL = eINSTANCE.getZoomLevel_Level();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.AbstractSyntaxReference <em>Abstract Syntax Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.AbstractSyntaxReference
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAbstractSyntaxReference()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX_REFERENCE = eINSTANCE.getAbstractSyntaxReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference <em>Concrete Syntax Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.ConcreteSyntaxReference
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getConcreteSyntaxReference()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX_REFERENCE = eINSTANCE.getConcreteSyntaxReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.AsCsMappingReference <em>As Cs Mapping Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.AsCsMappingReference
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAsCsMappingReference()
		 * @generated
		 */
		EClass AS_CS_MAPPING_REFERENCE = eINSTANCE.getAsCsMappingReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.NodeMappingReference <em>Node Mapping Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.NodeMappingReference
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getNodeMappingReference()
		 * @generated
		 */
		EClass NODE_MAPPING_REFERENCE = eINSTANCE.getNodeMappingReference();

	}

} //InteractivityPackage
