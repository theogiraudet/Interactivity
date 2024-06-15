package org.eclipse.sirius.components.collaborative.interactivity.provider;

import com.google.common.collect.Lists;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.components.collaborative.diagrams.api.IDiagramDescriptionService;
import org.eclipse.sirius.components.collaborative.diagrams.dto.ITool;
import org.eclipse.sirius.components.collaborative.diagrams.dto.Palette;
import org.eclipse.sirius.components.collaborative.diagrams.dto.SingleClickOnDiagramElementTool;
import org.eclipse.sirius.components.collaborative.diagrams.dto.ToolSection;
import org.eclipse.sirius.components.collaborative.interactivity.services.MetamodelsService;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IIdentityService;
import org.eclipse.sirius.components.core.api.IObjectService;
import org.eclipse.sirius.components.core.api.IURLParser;
import org.eclipse.sirius.components.diagrams.description.DiagramDescription;
import org.eclipse.sirius.components.interactivity.DynamicFilter;
import org.eclipse.sirius.components.interpreter.AQLInterpreter;
import org.eclipse.sirius.components.interpreter.Result;
import org.eclipse.sirius.components.view.emf.IViewRepresentationDescriptionPredicate;
import org.eclipse.sirius.components.view.emf.api.IViewAQLInterpreterFactory;
import org.eclipse.sirius.components.view.emf.diagram.IDiagramIdProvider;
import org.eclipse.sirius.components.view.emf.diagram.ViewPaletteProvider;
import org.eclipse.sirius.components.view.emf.diagram.api.IViewDiagramDescriptionSearchService;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Service
public class InteractivityViewPaletteProvider extends ViewPaletteProvider {

    private final MetamodelsService metamodelsService;
    private final IIdentityService identityService;

    public InteractivityViewPaletteProvider(IURLParser urlParser, IViewRepresentationDescriptionPredicate viewRepresentationDescriptionPredicate, IViewDiagramDescriptionSearchService viewDiagramDescriptionSearchService, IDiagramDescriptionService diagramDescriptionService, IDiagramIdProvider diagramIdProvider, IObjectService objectService, IViewAQLInterpreterFactory aqlInterpreterFactory, MetamodelsService metamodelsService, IIdentityService identityService) {
        super(urlParser, viewRepresentationDescriptionPredicate, viewDiagramDescriptionSearchService, diagramDescriptionService, diagramIdProvider, objectService, aqlInterpreterFactory);
        this.metamodelsService = metamodelsService;
        this.identityService = identityService;
    }

    @Override
    public Palette handle(Object targetElement, Object diagramElement, Object diagramElementDescription, DiagramDescription diagramDescription, IEditingContext editingContext) {
        Palette palette = super.handle(targetElement, diagramElement, diagramElementDescription, diagramDescription, editingContext);
        var metamodelsOpt = metamodelsService.getDomainNameByRepresentationDescription(editingContext, diagramDescription).flatMap(metamodelsService::getMetamodels);
        var root = ((EObject) targetElement).eResource().getContents().get(0);
        if(metamodelsOpt.isPresent()) {
            var toolList = new LinkedList<ITool>();
            var metamodels = metamodelsOpt.get();
            var interactivity = metamodels.interactivity();
            for(var feature: interactivity.getFeatures()) {
                if(feature instanceof DynamicFilter dynamicFilter) {
                    for(var filter: dynamicFilter.getFilters()) {
                        AQLInterpreter interpreter = new AQLInterpreter(List.of(), List.of(root.eClass().getEPackage()));
                        Result result = interpreter.evaluateExpression(Map.of("root", root), filter.getFocus());
                        result.asObjects().flatMap(list -> list.stream().filter(targetElement::equals).findFirst())
                                .ifPresent(obj -> toolList.add(SingleClickOnDiagramElementTool
                                        .newSingleClickOnDiagramElementTool("dynamic-filter")
                                        .label(filter.getName())
                                        .iconURL(List.of("/images/filter.svg"))
                                        .targetDescriptions(List.of())
                                        .selectionDescriptionId(filter.getId() + "|" + this.identityService.getId(obj))
                                        .build()
                                ));
                    }
                }
            }
            if(!toolList.isEmpty()) {
                var filterSection = ToolSection.newToolSection(UUID.randomUUID().toString())
                        .label("Filters")
                        .iconURL(List.of("/images/filter.svg"))
                        .tools(toolList)
                        .build();
                var list = Lists.newLinkedList(palette.toolSections());
                list.add(filterSection);
                return Palette.newPalette(palette.id()).tools(palette.tools()).toolSections(list).build();
            }
        }
        return palette;
    }
}
