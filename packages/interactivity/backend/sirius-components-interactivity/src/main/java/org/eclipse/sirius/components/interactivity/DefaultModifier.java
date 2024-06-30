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
import org.eclipse.sirius.components.view.UserColor;
import org.eclipse.sirius.components.view.diagram.NodeStyleDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DefaultModifier#isHide <em>Hide</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DefaultModifier#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.sirius.components.interactivity.DefaultModifier#getColors <em>Colors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDefaultModifier()
 * @model
 * @generated
 */
public interface DefaultModifier extends Modifier {
	/**
	 * Returns the value of the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide</em>' attribute.
	 * @see #setHide(boolean)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDefaultModifier_Hide()
	 * @model required="true"
	 * @generated
	 */
	boolean isHide();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DefaultModifier#isHide <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide</em>' attribute.
	 * @see #isHide()
	 * @generated
	 */
	void setHide(boolean value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(NodeStyleDescription)
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDefaultModifier_Style()
	 * @model containment="true"
	 * @generated
	 */
	NodeStyleDescription getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.components.interactivity.DefaultModifier#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(NodeStyleDescription value);

	/**
	 * Returns the value of the '<em><b>Colors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.components.view.UserColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colors</em>' containment reference list.
	 * @see org.eclipse.sirius.components.interactivity.InteractivityPackage#getDefaultModifier_Colors()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserColor> getColors();

} // DefaultModifier
