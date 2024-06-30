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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.sirius.components.interactivity.BoundedRadius;
import org.eclipse.sirius.components.interactivity.DefaultModifier;
import org.eclipse.sirius.components.interactivity.DynamicFilter;
import org.eclipse.sirius.components.interactivity.Filter;
import org.eclipse.sirius.components.interactivity.FilterDefinition;
import org.eclipse.sirius.components.interactivity.FixedRadius;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityFactory;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.Level;
import org.eclipse.sirius.components.interactivity.Path;
import org.eclipse.sirius.components.interactivity.SemanticSearch;
import org.eclipse.sirius.components.interactivity.SemanticZoom;
import org.eclipse.sirius.components.interactivity.StyleModifier;
import org.eclipse.sirius.components.interactivity.VisibilityModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractivityFactoryImpl extends EFactoryImpl implements InteractivityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractivityFactory init() {
		try {
			InteractivityFactory theInteractivityFactory = (InteractivityFactory) EPackage.Registry.INSTANCE
					.getEFactory(InteractivityPackage.eNS_URI);
			if (theInteractivityFactory != null) {
				return theInteractivityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractivityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractivityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case InteractivityPackage.INTERACTIVITY:
			return createInteractivity();
		case InteractivityPackage.SEMANTIC_ZOOM:
			return createSemanticZoom();
		case InteractivityPackage.LEVEL:
			return createLevel();
		case InteractivityPackage.FILTER_DEFINITION:
			return createFilterDefinition();
		case InteractivityPackage.VISIBILITY_MODIFIER:
			return createVisibilityModifier();
		case InteractivityPackage.STYLE_MODIFIER:
			return createStyleModifier();
		case InteractivityPackage.DYNAMIC_FILTER:
			return createDynamicFilter();
		case InteractivityPackage.FILTER:
			return createFilter();
		case InteractivityPackage.FIXED_RADIUS:
			return createFixedRadius();
		case InteractivityPackage.BOUNDED_RADIUS:
			return createBoundedRadius();
		case InteractivityPackage.SEMANTIC_SEARCH:
			return createSemanticSearch();
		case InteractivityPackage.PATH:
			return createPath();
		case InteractivityPackage.DEFAULT_MODIFIER:
			return createDefaultModifier();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interactivity createInteractivity() {
		InteractivityImpl interactivity = new InteractivityImpl();
		return interactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticZoom createSemanticZoom() {
		SemanticZoomImpl semanticZoom = new SemanticZoomImpl();
		return semanticZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterDefinition createFilterDefinition() {
		FilterDefinitionImpl filterDefinition = new FilterDefinitionImpl();
		return filterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityModifier createVisibilityModifier() {
		VisibilityModifierImpl visibilityModifier = new VisibilityModifierImpl();
		return visibilityModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleModifier createStyleModifier() {
		StyleModifierImpl styleModifier = new StyleModifierImpl();
		return styleModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFilter createDynamicFilter() {
		DynamicFilterImpl dynamicFilter = new DynamicFilterImpl();
		return dynamicFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedRadius createFixedRadius() {
		FixedRadiusImpl fixedRadius = new FixedRadiusImpl();
		return fixedRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedRadius createBoundedRadius() {
		BoundedRadiusImpl boundedRadius = new BoundedRadiusImpl();
		return boundedRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticSearch createSemanticSearch() {
		SemanticSearchImpl semanticSearch = new SemanticSearchImpl();
		return semanticSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultModifier createDefaultModifier() {
		DefaultModifierImpl defaultModifier = new DefaultModifierImpl();
		return defaultModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractivityPackage getInteractivityPackage() {
		return (InteractivityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractivityPackage getPackage() {
		return InteractivityPackage.eINSTANCE;
	}

} //InteractivityFactoryImpl
