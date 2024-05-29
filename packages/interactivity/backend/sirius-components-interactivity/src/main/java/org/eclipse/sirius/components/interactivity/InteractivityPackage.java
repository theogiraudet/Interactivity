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
	 * The feature id for the '<em><b>Diagram Editors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY__DIAGRAM_EDITORS = 1;

	/**
	 * The number of structural features of the '<em>Interactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Interaction <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Interaction
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 1;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Action
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

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
	int INTERACTIVE_FEATURE = 3;

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
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl <em>Graphic Zoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getGraphicZoom()
	 * @generated
	 */
	int GRAPHIC_ZOOM = 4;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ZOOM__LEVELS = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ZOOM_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Graphic Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ZOOM_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.Command
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.components.interactivity.impl.ZoomLevelImpl <em>Zoom Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.components.interactivity.impl.ZoomLevelImpl
	 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getZoomLevel()
	 * @generated
	 */
	int ZOOM_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL__ACTIONS = COMMAND__ACTIONS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL__LEVEL = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions To Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL__ACTIONS_TO_TRIGGER = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zoom Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Zoom Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_LEVEL_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Interactive Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR__INTERACTIVE_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR__INTERACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Diagram Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR__DIAGRAM_DEFINITION = 2;

	/**
	 * The number of structural features of the '<em>Diagram Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDITOR_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.Interactivity#getDiagramEditors <em>Diagram Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Editors</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Interactivity#getDiagramEditors()
	 * @see #getInteractivity()
	 * @generated
	 */
	EReference getInteractivity_DiagramEditors();

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
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.components.interactivity.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

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
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.GraphicZoom <em>Graphic Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Zoom</em>'.
	 * @see org.eclipse.sirius.components.interactivity.GraphicZoom
	 * @generated
	 */
	EClass getGraphicZoom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.GraphicZoom#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see org.eclipse.sirius.components.interactivity.GraphicZoom#getLevels()
	 * @see #getGraphicZoom()
	 * @generated
	 */
	EReference getGraphicZoom_Levels();

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
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.components.interactivity.ZoomLevel#getActionsToTrigger <em>Actions To Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions To Trigger</em>'.
	 * @see org.eclipse.sirius.components.interactivity.ZoomLevel#getActionsToTrigger()
	 * @see #getZoomLevel()
	 * @generated
	 */
	EReference getZoomLevel_ActionsToTrigger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.components.interactivity.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.components.interactivity.Command#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see org.eclipse.sirius.components.interactivity.Command#getActions()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Actions();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getInteractiveFeatures <em>Interactive Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactive Features</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DiagramEditor#getInteractiveFeatures()
	 * @see #getDiagramEditor()
	 * @generated
	 */
	EReference getDiagramEditor_InteractiveFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactions</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DiagramEditor#getInteractions()
	 * @see #getDiagramEditor()
	 * @generated
	 */
	EReference getDiagramEditor_Interactions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramDefinition <em>Diagram Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Definition</em>'.
	 * @see org.eclipse.sirius.components.interactivity.DiagramEditor#getDiagramDefinition()
	 * @see #getDiagramEditor()
	 * @generated
	 */
	EReference getDiagramEditor_DiagramDefinition();

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
		 * The meta object literal for the '<em><b>Diagram Editors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIVITY__DIAGRAM_EDITORS = eINSTANCE.getInteractivity_DiagramEditors();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Action
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl <em>Graphic Zoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.impl.GraphicZoomImpl
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getGraphicZoom()
		 * @generated
		 */
		EClass GRAPHIC_ZOOM = eINSTANCE.getGraphicZoom();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ZOOM__LEVELS = eINSTANCE.getGraphicZoom_Levels();

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
		 * The meta object literal for the '<em><b>Actions To Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZOOM_LEVEL__ACTIONS_TO_TRIGGER = eINSTANCE.getZoomLevel_ActionsToTrigger();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.components.interactivity.Command <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.components.interactivity.Command
		 * @see org.eclipse.sirius.components.interactivity.impl.InteractivityPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__ACTIONS = eINSTANCE.getCommand_Actions();

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
		 * The meta object literal for the '<em><b>Interactive Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDITOR__INTERACTIVE_FEATURES = eINSTANCE.getDiagramEditor_InteractiveFeatures();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDITOR__INTERACTIONS = eINSTANCE.getDiagramEditor_Interactions();

		/**
		 * The meta object literal for the '<em><b>Diagram Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDITOR__DIAGRAM_DEFINITION = eINSTANCE.getDiagramEditor_DiagramDefinition();

	}

} //InteractivityPackage
