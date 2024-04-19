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
import org.eclipse.sirius.components.semantic_zoom.ByDepth;
import org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber;
import org.eclipse.sirius.components.semantic_zoom.LevelOfDetail;
import org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoom;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomFactory;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;

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
		case SemanticZoomPackage.NODE_MAPPING_STYLE_OVERRIDE:
			return createNodeMappingStyleOverride();
		case SemanticZoomPackage.BY_DEPTH:
			return createByDepth();
		case SemanticZoomPackage.BY_EDGE_NUMBER:
			return createByEdgeNumber();
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
	public NodeMappingStyleOverride createNodeMappingStyleOverride() {
		NodeMappingStyleOverrideImpl nodeMappingStyleOverride = new NodeMappingStyleOverrideImpl();
		return nodeMappingStyleOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ByDepth createByDepth() {
		ByDepthImpl byDepth = new ByDepthImpl();
		return byDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ByEdgeNumber createByEdgeNumber() {
		ByEdgeNumberImpl byEdgeNumber = new ByEdgeNumberImpl();
		return byEdgeNumber;
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
