/*******************************************************************************
 * Copyright (c) 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.components.papaya;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Provided Service</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.sirius.components.papaya.ProvidedService#getContracts <em>Contracts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.papaya.PapayaPackage#getProvidedService()
 * @model
 * @generated
 */
public interface ProvidedService extends NamedElement {
    /**
     * Returns the value of the '<em><b>Contracts</b></em>' reference list. The list contents are of type
     * {@link org.eclipse.sirius.components.papaya.Interface}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Contracts</em>' reference list.
     * @see org.eclipse.sirius.components.papaya.PapayaPackage#getProvidedService_Contracts()
     * @model
     * @generated
     */
    EList<Interface> getContracts();

} // ProvidedService
