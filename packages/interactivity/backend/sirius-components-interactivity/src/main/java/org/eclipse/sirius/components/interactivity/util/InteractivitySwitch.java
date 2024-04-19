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
package org.eclipse.sirius.components.interactivity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.ModelReference;
import org.eclipse.sirius.components.interactivity.NodeMappingReference;
import org.eclipse.sirius.components.interactivity.ObservableEvent;
import org.eclipse.sirius.components.interactivity.ZoomLevel;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage
 * @generated
 */
public class InteractivitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractivitySwitch() {
		if (modelPackage == null) {
			modelPackage = InteractivityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case InteractivityPackage.INTERACTIVITY: {
			Interactivity interactivity = (Interactivity) theEObject;
			T result = caseInteractivity(interactivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.INTERACTIVE_ELEMENT: {
			InteractiveElement interactiveElement = (InteractiveElement) theEObject;
			T result = caseInteractiveElement(interactiveElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.INTERACTION: {
			Interaction interaction = (Interaction) theEObject;
			T result = caseInteraction(interaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.OBSERVABLE_EVENT: {
			ObservableEvent observableEvent = (ObservableEvent) theEObject;
			T result = caseObservableEvent(observableEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.INTERACTIVE_FEATURE: {
			InteractiveFeature interactiveFeature = (InteractiveFeature) theEObject;
			T result = caseInteractiveFeature(interactiveFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.MODEL_REFERENCE: {
			ModelReference modelReference = (ModelReference) theEObject;
			T result = caseModelReference(modelReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.DIAGRAM_EDITOR: {
			DiagramEditor diagramEditor = (DiagramEditor) theEObject;
			T result = caseDiagramEditor(diagramEditor);
			if (result == null)
				result = caseInteractiveElement(diagramEditor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.GRAPHIC_ZOOM: {
			GraphicZoom graphicZoom = (GraphicZoom) theEObject;
			T result = caseGraphicZoom(graphicZoom);
			if (result == null)
				result = caseInteraction(graphicZoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.ZOOM_LEVEL: {
			ZoomLevel zoomLevel = (ZoomLevel) theEObject;
			T result = caseZoomLevel(zoomLevel);
			if (result == null)
				result = caseObservableEvent(zoomLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.ABSTRACT_SYNTAX_REFERENCE: {
			AbstractSyntaxReference abstractSyntaxReference = (AbstractSyntaxReference) theEObject;
			T result = caseAbstractSyntaxReference(abstractSyntaxReference);
			if (result == null)
				result = caseModelReference(abstractSyntaxReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.CONCRETE_SYNTAX_REFERENCE: {
			ConcreteSyntaxReference concreteSyntaxReference = (ConcreteSyntaxReference) theEObject;
			T result = caseConcreteSyntaxReference(concreteSyntaxReference);
			if (result == null)
				result = caseModelReference(concreteSyntaxReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.AS_CS_MAPPING_REFERENCE: {
			AsCsMappingReference asCsMappingReference = (AsCsMappingReference) theEObject;
			T result = caseAsCsMappingReference(asCsMappingReference);
			if (result == null)
				result = caseModelReference(asCsMappingReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.NODE_MAPPING_REFERENCE: {
			NodeMappingReference nodeMappingReference = (NodeMappingReference) theEObject;
			T result = caseNodeMappingReference(nodeMappingReference);
			if (result == null)
				result = caseAsCsMappingReference(nodeMappingReference);
			if (result == null)
				result = caseModelReference(nodeMappingReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractivity(Interactivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractiveElement(InteractiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observable Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observable Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservableEvent(ObservableEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactive Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactive Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractiveFeature(InteractiveFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramEditor(DiagramEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Zoom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Zoom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicZoom(GraphicZoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zoom Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zoom Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoomLevel(ZoomLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Syntax Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Syntax Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSyntaxReference(AbstractSyntaxReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Syntax Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Syntax Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteSyntaxReference(ConcreteSyntaxReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As Cs Mapping Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As Cs Mapping Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsCsMappingReference(AsCsMappingReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Mapping Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Mapping Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMappingReference(NodeMappingReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InteractivitySwitch
