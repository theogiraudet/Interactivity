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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage
 * @generated
 */
public class SemanticZoomAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticZoomPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticZoomAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SemanticZoomPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticZoomSwitch<Adapter> modelSwitch = new SemanticZoomSwitch<>() {
		@Override
		public Adapter caseSemanticZoom(SemanticZoom object) {
			return createSemanticZoomAdapter();
		}

		@Override
		public Adapter caseLevelOfDetail(LevelOfDetail object) {
			return createLevelOfDetailAdapter();
		}

		@Override
		public Adapter caseGraphicalFilter(GraphicalFilter object) {
			return createGraphicalFilterAdapter();
		}

		@Override
		public Adapter caseNodeMappingStyleOverride(NodeMappingStyleOverride object) {
			return createNodeMappingStyleOverrideAdapter();
		}

		@Override
		public Adapter caseByDepth(ByDepth object) {
			return createByDepthAdapter();
		}

		@Override
		public Adapter caseByEdgeNumber(ByEdgeNumber object) {
			return createByEdgeNumberAdapter();
		}

		@Override
		public Adapter caseInteractiveFeature(InteractiveFeature object) {
			return createInteractiveFeatureAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseModelReference(ModelReference object) {
			return createModelReferenceAdapter();
		}

		@Override
		public Adapter caseAsCsMappingReference(AsCsMappingReference object) {
			return createAsCsMappingReferenceAdapter();
		}

		@Override
		public Adapter caseNodeMappingReference(NodeMappingReference object) {
			return createNodeMappingReferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.semantic_zoom.SemanticZoom <em>Semantic Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.semantic_zoom.SemanticZoom
	 * @generated
	 */
	public Adapter createSemanticZoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.semantic_zoom.LevelOfDetail <em>Level Of Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.semantic_zoom.LevelOfDetail
	 * @generated
	 */
	public Adapter createLevelOfDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.semantic_zoom.GraphicalFilter <em>Graphical Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.semantic_zoom.GraphicalFilter
	 * @generated
	 */
	public Adapter createGraphicalFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride <em>Node Mapping Style Override</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.semantic_zoom.NodeMappingStyleOverride
	 * @generated
	 */
	public Adapter createNodeMappingStyleOverrideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.semantic_zoom.ByDepth <em>By Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.semantic_zoom.ByDepth
	 * @generated
	 */
	public Adapter createByDepthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber <em>By Edge Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.semantic_zoom.ByEdgeNumber
	 * @generated
	 */
	public Adapter createByEdgeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.interactivity.InteractiveFeature <em>Interactive Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.interactivity.InteractiveFeature
	 * @generated
	 */
	public Adapter createInteractiveFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.interactivity.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.interactivity.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.interactivity.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.interactivity.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.interactivity.AsCsMappingReference <em>As Cs Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.interactivity.AsCsMappingReference
	 * @generated
	 */
	public Adapter createAsCsMappingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.components.interactivity.NodeMappingReference <em>Node Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.components.interactivity.NodeMappingReference
	 * @generated
	 */
	public Adapter createNodeMappingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SemanticZoomAdapterFactory
