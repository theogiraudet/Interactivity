/*******************************************************************************
 * Copyright (c) 2024, 2024 Obeo.
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
package org.eclipse.sirius.web.papaya.services;

import java.util.List;
import java.util.Optional;

import org.eclipse.sirius.components.core.RepresentationMetadata;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.emf.services.api.IEMFEditingContext;
import org.eclipse.sirius.web.application.project.services.api.IProjectTemplateInitializer;
import org.eclipse.sirius.web.papaya.factories.EObjectIndexer;
import org.eclipse.sirius.web.papaya.factories.JavaProjectFactory;
import org.eclipse.sirius.web.papaya.factories.ReactiveStreamsProjectFactory;
import org.eclipse.sirius.web.papaya.factories.ReactorProjectFactory;
import org.eclipse.sirius.web.papaya.factories.SiriusWebProjectFactory;
import org.eclipse.sirius.web.papaya.factories.SpringProjectFactory;
import org.eclipse.sirius.web.papaya.factories.api.IEObjectIndexer;
import org.springframework.stereotype.Service;

/**
 * Used to initialize a Papaya project.
 *
 * @author sbegaudeau
 */
@Service
public class PapayaProjectTemplateInitializer implements IProjectTemplateInitializer {

    @Override
    public boolean canHandle(String projectTemplateId) {
        return List.of(PapayaProjectTemplateProvider.SIRIUS_WEB_PROJECT_TEMPLATE_ID).contains(projectTemplateId);
    }

    @Override
    public Optional<RepresentationMetadata> handle(String projectTemplateId, IEditingContext editingContext) {
        if (editingContext instanceof IEMFEditingContext emfEditingContext) {
            IEObjectIndexer eObjectIndexer = new EObjectIndexer();

            new JavaProjectFactory().create(eObjectIndexer, emfEditingContext);
            new JavaProjectFactory().link(eObjectIndexer, emfEditingContext);

            new ReactiveStreamsProjectFactory().create(eObjectIndexer, emfEditingContext);
            new ReactiveStreamsProjectFactory().link(eObjectIndexer, emfEditingContext);

            new ReactorProjectFactory().create(eObjectIndexer, emfEditingContext);
            new ReactorProjectFactory().link(eObjectIndexer, emfEditingContext);

            new SpringProjectFactory().create(eObjectIndexer, emfEditingContext);
            new SpringProjectFactory().link(eObjectIndexer, emfEditingContext);

            new SiriusWebProjectFactory().create(eObjectIndexer, emfEditingContext);
            new SiriusWebProjectFactory().link(eObjectIndexer, emfEditingContext);
        }
        return Optional.empty();
    }
}
