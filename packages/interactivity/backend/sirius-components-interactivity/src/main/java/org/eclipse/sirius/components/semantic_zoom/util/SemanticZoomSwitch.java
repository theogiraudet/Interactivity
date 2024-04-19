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
package org.eclipse.sirius.components.semantic_zoom.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.sirius.components.interactivity.Action;
import org.eclipse.sirius.components.interactivity.AsCsMappingReference;
import org.eclipse.sirius.components.interactivity.InteractiveFeature;
import org.eclipse.sirius.components.interactivity.ModelReference;
import org.eclipse.sirius.components.interactivity.NodeMappingReference;
import org.eclipse.sirius.components.semantic_zoom.ByDepth;
import org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber;
import org.eclipse.sirius.components.semantic_zoom.GraphicalFilter;
import org.eclipse.sirius.components.semantic_zoom.LevelOfDetail;
import org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoom;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;

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
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage
 * @generated
 */
public class SemanticZoomSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticZoomPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticZoomSwitch() {
		if (modelPackage == null) {
			modelPackage = SemanticZoomPackage.eINSTANCE;
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
		case SemanticZoomPackage.SEMANTIC_ZOOM: {
			SemanticZoom semanticZoom = (SemanticZoom) theEObject;
			T result = caseSemanticZoom(semanticZoom);
			if (result == null)
				result = caseInteractiveFeature(semanticZoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticZoomPackage.LEVEL_OF_DETAIL: {
			LevelOfDetail levelOfDetail = (LevelOfDetail) theEObject;
			T result = caseLevelOfDetail(levelOfDetail);
			if (result == null)
				result = caseAction(levelOfDetail);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticZoomPackage.GRAPHICAL_FILTER: {
			GraphicalFilter graphicalFilter = (GraphicalFilter) theEObject;
			T result = caseGraphicalFilter(graphicalFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE: {
			NodeMappingStyleOverride nodeMappingStyleOverride = (NodeMappingStyleOverride) theEObject;
			T result = caseNodeMappingStyleOverride(nodeMappingStyleOverride);
			if (result == null)
				result = caseNodeMappingReference(nodeMappingStyleOverride);
			if (result == null)
				result = caseAsCsMappingReference(nodeMappingStyleOverride);
			if (result == null)
				result = caseModelReference(nodeMappingStyleOverride);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticZoomPackage.BY_DEPTH: {
			ByDepth byDepth = (ByDepth) theEObject;
			T result = caseByDepth(byDepth);
			if (result == null)
				result = caseGraphicalFilter(byDepth);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticZoomPackage.BY_EDGE_NUMBER: {
			ByEdgeNumber byEdgeNumber = (ByEdgeNumber) theEObject;
			T result = caseByEdgeNumber(byEdgeNumber);
			if (result == null)
				result = caseGraphicalFilter(byEdgeNumber);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Zoom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Zoom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticZoom(SemanticZoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Of Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Of Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelOfDetail(LevelOfDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalFilter(GraphicalFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Mapping Style Override</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Mapping Style Override</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMappingStyleOverride(NodeMappingStyleOverride object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Depth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Depth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByDepth(ByDepth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Edge Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Edge Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByEdgeNumber(ByEdgeNumber object) {
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

} //SemanticZoomSwitch
