/*******************************************************************************
 * Copyright (c) 2023, 2023 Obeo.
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
package org.eclipse.sirius.components.diagrams.layout.api.experimental;

import java.util.Objects;

import org.eclipse.sirius.components.diagrams.layoutdata.Size;

/**
 * Aggregates all configuration information relevant for an icon.
 *
 * @author sbegaudeau
 */
public record IconLayoutConfiguration(Size iconSize, double gap) {
    public IconLayoutConfiguration {
        Objects.requireNonNull(iconSize);
    }
}
