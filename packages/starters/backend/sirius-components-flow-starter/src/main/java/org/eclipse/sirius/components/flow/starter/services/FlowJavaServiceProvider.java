/*******************************************************************************
 * Copyright (c) 2022, 2024 Obeo.
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
package org.eclipse.sirius.components.flow.starter.services;

import java.util.List;

import org.eclipse.sirius.components.view.View;
import org.eclipse.sirius.components.view.diagram.DiagramDescription;
import org.eclipse.sirius.components.view.emf.IJavaServiceProvider;
import org.springframework.stereotype.Service;

/**
 * Used to provide services for the Flow view.
 *
 * @author frouene
 */
@Service
public class FlowJavaServiceProvider implements IJavaServiceProvider {

    @Override
    public List<Class<?>> getServiceClasses(View view) {
        boolean isFlowView = view.getDescriptions().stream()
                .filter(DiagramDescription.class::isInstance)
                .map(DiagramDescription.class::cast)
                .anyMatch(diagramDescription -> diagramDescription.getDomainType().equals("flow::System"));
        if (isFlowView) {
            return List.of(FlowService.class);
        }
        return List.of();
    }

}
