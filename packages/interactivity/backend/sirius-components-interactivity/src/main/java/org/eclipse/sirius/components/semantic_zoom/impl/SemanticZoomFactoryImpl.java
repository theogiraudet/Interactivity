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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.components.semantic_zoom.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticZoomFactoryImpl extends EFactoryImpl implements SemanticZoomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticZoomFactory init() {
		try {
			SemanticZoomFactory theSemanticZoomFactory = (SemanticZoomFactory) EPackage.Registry.INSTANCE
					.getEFactory(SemanticZoomPackage.eNS_URI);
			if (theSemanticZoomFactory != null) {
				return theSemanticZoomFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticZoomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticZoomFactoryImpl() {
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
		case SemanticZoomPackage.SEMANTIC_ZOOM:
			return createSemanticZoom();
		case SemanticZoomPackage.LEVEL_OF_DETAIL:
			return createLevelOfDetail();
		case SemanticZoomPackage.STYLE_OVERRIDE:
			return createStyleOverride();
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
	public LevelOfDetail createLevelOfDetail() {
		LevelOfDetailImpl levelOfDetail = new LevelOfDetailImpl();
		return levelOfDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleOverride createStyleOverride() {
		StyleOverrideImpl styleOverride = new StyleOverrideImpl();
		return styleOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticZoomPackage getSemanticZoomPackage() {
		return (SemanticZoomPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticZoomPackage getPackage() {
		return SemanticZoomPackage.eINSTANCE;
	}

} //SemanticZoomFactoryImpl
