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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zoom Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.ZoomLevel#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.ZoomLevel#getActionsToTrigger <em>Actions To Trigger</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getZoomLevel()
 * @model
 * @generated
 */
public interface ZoomLevel extends Command {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getZoomLevel_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.ZoomLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Actions To Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.interactivity.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions To Trigger</em>' reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getZoomLevel_ActionsToTrigger()
	 * @model
	 * @generated
	 */
	EList<Action> getActionsToTrigger();

} // ZoomLevel
