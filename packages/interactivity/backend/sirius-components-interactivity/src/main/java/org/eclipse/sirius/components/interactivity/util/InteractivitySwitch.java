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

import org.eclipse.sirius.components.interactivity.*;

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
		case InteractivityPackage.INTERACTIVE_FEATURE: {
			InteractiveFeature interactiveFeature = (InteractiveFeature) theEObject;
			T result = caseInteractiveFeature(interactiveFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.SEMANTIC_ZOOM: {
			SemanticZoom semanticZoom = (SemanticZoom) theEObject;
			T result = caseSemanticZoom(semanticZoom);
			if (result == null)
				result = caseInteractiveFeature(semanticZoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.LEVEL: {
			Level level = (Level) theEObject;
			T result = caseLevel(level);
			if (result == null)
				result = caseIdentifiable(level);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.FILTER_DEFINITION: {
			FilterDefinition filterDefinition = (FilterDefinition) theEObject;
			T result = caseFilterDefinition(filterDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.MODIFIER: {
			Modifier modifier = (Modifier) theEObject;
			T result = caseModifier(modifier);
			if (result == null)
				result = caseIdentifiable(modifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.VISIBILITY_MODIFIER: {
			VisibilityModifier visibilityModifier = (VisibilityModifier) theEObject;
			T result = caseVisibilityModifier(visibilityModifier);
			if (result == null)
				result = caseScopedModifier(visibilityModifier);
			if (result == null)
				result = caseModifier(visibilityModifier);
			if (result == null)
				result = caseIdentifiable(visibilityModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.STYLE_MODIFIER: {
			StyleModifier styleModifier = (StyleModifier) theEObject;
			T result = caseStyleModifier(styleModifier);
			if (result == null)
				result = caseScopedModifier(styleModifier);
			if (result == null)
				result = caseModifier(styleModifier);
			if (result == null)
				result = caseIdentifiable(styleModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.DYNAMIC_FILTER: {
			DynamicFilter dynamicFilter = (DynamicFilter) theEObject;
			T result = caseDynamicFilter(dynamicFilter);
			if (result == null)
				result = caseInteractiveFeature(dynamicFilter);
			if (result == null)
				result = caseIdentifiable(dynamicFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.RADIUS: {
			Radius radius = (Radius) theEObject;
			T result = caseRadius(radius);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.FIXED_RADIUS: {
			FixedRadius fixedRadius = (FixedRadius) theEObject;
			T result = caseFixedRadius(fixedRadius);
			if (result == null)
				result = caseRadius(fixedRadius);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.BOUNDED_RADIUS: {
			BoundedRadius boundedRadius = (BoundedRadius) theEObject;
			T result = caseBoundedRadius(boundedRadius);
			if (result == null)
				result = caseRadius(boundedRadius);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.SEMANTIC_SEARCH: {
			SemanticSearch semanticSearch = (SemanticSearch) theEObject;
			T result = caseSemanticSearch(semanticSearch);
			if (result == null)
				result = caseInteractiveFeature(semanticSearch);
			if (result == null)
				result = caseIdentifiable(semanticSearch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.IDENTIFIABLE: {
			Identifiable identifiable = (Identifiable) theEObject;
			T result = caseIdentifiable(identifiable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.SCOPED_MODIFIER: {
			ScopedModifier scopedModifier = (ScopedModifier) theEObject;
			T result = caseScopedModifier(scopedModifier);
			if (result == null)
				result = caseModifier(scopedModifier);
			if (result == null)
				result = caseIdentifiable(scopedModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.ELEMENT_REFERENCE: {
			ElementReference elementReference = (ElementReference) theEObject;
			T result = caseElementReference(elementReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.PATH: {
			Path path = (Path) theEObject;
			T result = casePath(path);
			if (result == null)
				result = caseElementReference(path);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivityPackage.DEFAULT_MODIFIER: {
			DefaultModifier defaultModifier = (DefaultModifier) theEObject;
			T result = caseDefaultModifier(defaultModifier);
			if (result == null)
				result = caseModifier(defaultModifier);
			if (result == null)
				result = caseIdentifiable(defaultModifier);
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
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel(Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterDefinition(FilterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityModifier(VisibilityModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleModifier(StyleModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicFilter(DynamicFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radius</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radius</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadius(Radius object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Radius</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Radius</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedRadius(FixedRadius object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Radius</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Radius</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedRadius(BoundedRadius object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticSearch(SemanticSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedModifier(ScopedModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReference(ElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultModifier(DefaultModifier object) {
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
