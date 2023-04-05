/*******************************************************************************
 * Copyright (c) 2023 Obeo.
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
package org.eclipse.sirius.web.sample.papaya.view.classdiagram;

import java.util.Objects;

import org.eclipse.sirius.components.view.ArrowStyle;
import org.eclipse.sirius.components.view.DiagramDescription;
import org.eclipse.sirius.components.view.EdgeDescription;
import org.eclipse.sirius.components.view.LabelEditTool;
import org.eclipse.sirius.components.view.LineStyle;
import org.eclipse.sirius.components.view.ViewFactory;
import org.eclipse.sirius.web.sample.papaya.view.IColorProvider;
import org.eclipse.sirius.web.sample.papaya.view.IEdgeDescriptionProvider;
import org.eclipse.sirius.web.sample.papaya.view.PapayaViewCache;

/**
 * Used to create the implements interface edge description.
 *
 * @author sbegaudeau
 */
public class CDImplementsInterfaceEdgeDescriptionProvider implements IEdgeDescriptionProvider {

    public static final String NAME = "CD Edge Implements Interface";

    private final IColorProvider colorProvider;

    public CDImplementsInterfaceEdgeDescriptionProvider(IColorProvider colorProvider) {
        this.colorProvider = Objects.requireNonNull(colorProvider);
    }

    @Override
    public EdgeDescription create() {
        var implementsInterfaceEdgeStyle = ViewFactory.eINSTANCE.createEdgeStyle();
        implementsInterfaceEdgeStyle.setColor(this.colorProvider.getColor("color_blue_2"));
        implementsInterfaceEdgeStyle.setEdgeWidth(1);
        implementsInterfaceEdgeStyle.setLineStyle(LineStyle.DASH);
        implementsInterfaceEdgeStyle.setSourceArrowStyle(ArrowStyle.NONE);
        implementsInterfaceEdgeStyle.setTargetArrowStyle(ArrowStyle.INPUT_CLOSED_ARROW);

        var implementsInterfaceEdgeDescription = ViewFactory.eINSTANCE.createEdgeDescription();
        implementsInterfaceEdgeDescription.setName(NAME);
        implementsInterfaceEdgeDescription.setLabelExpression("");
        implementsInterfaceEdgeDescription.setBeginLabelExpression("aql:'implements ' + semanticEdgeTarget.name");

        implementsInterfaceEdgeDescription.setEndLabelExpression("aql:'implemented by ' + semanticEdgeSource.name");
        implementsInterfaceEdgeDescription.setStyle(implementsInterfaceEdgeStyle);
        implementsInterfaceEdgeDescription.setSourceNodesExpression("aql:self");
        implementsInterfaceEdgeDescription.setTargetNodesExpression("aql:self.implements");
        implementsInterfaceEdgeDescription.setIsDomainBasedEdge(false);

        var edgePalette = ViewFactory.eINSTANCE.createEdgePalette();
        implementsInterfaceEdgeDescription.setPalette(edgePalette);
        edgePalette.setBeginLabelEditTool(this.editImplementsInterfaceEdgeBeginLabel());
        edgePalette.setEndLabelEditTool(this.editImplementsInterfaceEdgeEndLabel());

        return implementsInterfaceEdgeDescription;
    }

    private LabelEditTool editImplementsInterfaceEdgeBeginLabel() {
        var editLabelTool = ViewFactory.eINSTANCE.createLabelEditTool();
        editLabelTool.setName("Edit Begin Label");
        editLabelTool.setInitialDirectEditLabelExpression("aql:semanticEdgeTarget.name");

        var changeContext = ViewFactory.eINSTANCE.createChangeContext();
        changeContext.setExpression("aql:semanticEdgeTarget");

        var setValue = ViewFactory.eINSTANCE.createSetValue();
        setValue.setFeatureName("name");
        setValue.setValueExpression("aql:newLabel");

        changeContext.getChildren().add(setValue);
        editLabelTool.getBody().add(changeContext);

        return editLabelTool;
    }

    private LabelEditTool editImplementsInterfaceEdgeEndLabel() {
        var editLabelTool = ViewFactory.eINSTANCE.createLabelEditTool();

        editLabelTool.setName("Edit End Label");
        editLabelTool.setInitialDirectEditLabelExpression("aql:semanticEdgeSource.name");

        var changeContext = ViewFactory.eINSTANCE.createChangeContext();
        changeContext.setExpression("aql:semanticEdgeSource");

        var setValue = ViewFactory.eINSTANCE.createSetValue();
        setValue.setFeatureName("name");
        setValue.setValueExpression("aql:newLabel");

        changeContext.getChildren().add(setValue);
        editLabelTool.getBody().add(changeContext);

        return editLabelTool;
    }

    @Override
    public void link(DiagramDescription diagramDescription, PapayaViewCache cache) {
        var implementsInterfaceEdgeDescription = cache.getEdgeDescription(NAME);
        var classNodeDescription = cache.getNodeDescription(CDClassNodeDescriptionProvider.NAME);
        var interfaceNodeDescription = cache.getNodeDescription(CDInterfaceNodeDescriptionProvider.NAME);

        diagramDescription.getEdgeDescriptions().add(implementsInterfaceEdgeDescription);
        implementsInterfaceEdgeDescription.getSourceNodeDescriptions().add(classNodeDescription);
        implementsInterfaceEdgeDescription.getTargetNodeDescriptions().add(interfaceNodeDescription);
    }
}