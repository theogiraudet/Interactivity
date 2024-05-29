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
import org.eclipse.sirius.components.interactivity.DiagramEditor;
import org.eclipse.sirius.components.interactivity.GraphicZoom;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityFactory;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.ZoomLevel;

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
		case InteractivityPackage.GRAPHIC_ZOOM:
			return createGraphicZoom();
		case InteractivityPackage.ZOOM_LEVEL:
			return createZoomLevel();
		case InteractivityPackage.DIAGRAM_EDITOR:
			return createDiagramEditor();
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
	public GraphicZoom createGraphicZoom() {
		GraphicZoomImpl graphicZoom = new GraphicZoomImpl();
		return graphicZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoomLevel createZoomLevel() {
		ZoomLevelImpl zoomLevel = new ZoomLevelImpl();
		return zoomLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramEditor createDiagramEditor() {
		DiagramEditorImpl diagramEditor = new DiagramEditorImpl();
		return diagramEditor;
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
