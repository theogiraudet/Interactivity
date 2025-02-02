/*******************************************************************************
 * Copyright (c) 2019, 2024 Obeo.
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
package org.eclipse.sirius.web.sample.configuration;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.components.domain.DomainPackage;
import org.eclipse.sirius.components.domain.provider.DomainItemProviderAdapterFactory;
import org.eclipse.sirius.components.emf.configuration.ChildExtenderProvider;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.interactivity.provider.InteractivityItemProviderAdapterFactory;
import org.eclipse.sirius.components.view.ViewPackage;
import org.eclipse.sirius.components.view.diagram.DiagramPackage;
import org.eclipse.sirius.components.view.diagram.customnodes.CustomnodesPackage;
import org.eclipse.sirius.components.view.diagram.customnodes.provider.CustomnodesItemProviderAdapterFactory;
import org.eclipse.sirius.components.view.diagram.provider.DiagramItemProviderAdapterFactory;
import org.eclipse.sirius.components.view.form.FormPackage;
import org.eclipse.sirius.components.view.form.provider.FormItemProviderAdapterFactory;
import org.eclipse.sirius.components.view.provider.ViewItemProviderAdapterFactory;
import org.eclipse.sirius.components.view.widget.reference.ReferencePackage;
import org.eclipse.sirius.components.widgets.reference.provider.ReferenceItemProviderAdapterFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration of the EMF support for Sirius Web.
 *
 * @author sbegaudeau
 */
@Configuration
public class SampleEMFConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage interactivityEPackage() {
        return InteractivityPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory interactivityAdapterFactory() {
        return new InteractivityItemProviderAdapterFactory();
    }
    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage domainEPackage() {
        return DomainPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory domainAdapterFactory() {
        return new DomainItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage viewEPackage() {
        return ViewPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory viewAdapterFactory() {
        return new ViewItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage viewDiagramEPackage() {
        return DiagramPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory diagramAdapterFactory() {
        return new DiagramItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public ChildExtenderProvider diagramChildExtenderProvider() {
        return new ChildExtenderProvider(ViewPackage.eNS_URI, DiagramItemProviderAdapterFactory.ViewChildCreationExtender::new);
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage viewFormEPackage() {
        return FormPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory formAdapterFactory() {
        return new FormItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public ChildExtenderProvider formChildExtenderProvider() {
        return new ChildExtenderProvider(ViewPackage.eNS_URI, FormItemProviderAdapterFactory.ViewChildCreationExtender::new);
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage customNodesEPackage() {
        return CustomnodesPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory customNodesAdapterFactory() {
        return new CustomnodesItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public ChildExtenderProvider customNodesChildExtenderProvider() {
        return new ChildExtenderProvider(DiagramPackage.eNS_URI, CustomnodesItemProviderAdapterFactory.DiagramChildCreationExtender::new);
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage referenceWidgetEPackage() {
        return ReferencePackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory referenceWidgetAdapterFactory() {
        return new ReferenceItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public ChildExtenderProvider referenceWidgetChildExtenderProvider() {
        return new ChildExtenderProvider(FormPackage.eNS_URI, ReferenceItemProviderAdapterFactory.FormChildCreationExtender::new);
    }
}
