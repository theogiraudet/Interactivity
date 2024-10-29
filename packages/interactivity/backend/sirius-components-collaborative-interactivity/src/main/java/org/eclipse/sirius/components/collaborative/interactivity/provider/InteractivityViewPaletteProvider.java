package org.eclipse.sirius.components.collaborative.interactivity.provider;

import com.google.common.collect.Lists;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.eclipse.sirius.components.interactivity.*;
import org.eclipse.sirius.components.interpreter.AQLInterpreter;
import org.eclipse.sirius.components.interpreter.Result;
import org.eclipse.sirius.components.view.emf.IViewRepresentationDescriptionPredicate;
import org.eclipse.sirius.components.view.emf.api.IViewAQLInterpreterFactory;
import org.eclipse.sirius.components.view.emf.diagram.IDiagramIdProvider;
import org.eclipse.sirius.components.view.emf.diagram.ViewPaletteProvider;
import org.eclipse.sirius.components.view.emf.diagram.api.IViewDiagramDescriptionSearchService;
import org.eclipse.sirius.web.application.studio.services.ViewRepresentationDescriptionSearchService;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

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
        var interactivityOpt = metamodelsService.getDomainNameByRepresentationDescription(editingContext, diagramDescription)
                .flatMap(metamodelsService::getInteractivityMetamodel);
        var root = ((EObject) targetElement).eResource().getContents().get(0);

        if(interactivityOpt.isPresent()) {
            var interactivity = interactivityOpt.get();

            var interpreter = new AQLInterpreter(List.of(), List.of(root.eClass().getEPackage()));
            Map<String, Object> map = Map.of("root", root);
            var list = Lists.newLinkedList(palette.toolSections());

            handleDynamicFilterPalette(interpreter, map, interactivity.getFeatures(), targetElement).ifPresent(list::add);
            handleSnippetPalette(interpreter, map, interactivity.getFeatures(), targetElement).ifPresent(list::add);

            return Palette.newPalette(palette.id()).tools(palette.tools()).toolSections(list).build();
        }

        return palette;
    }

    private Optional<ToolSection> handleDynamicFilterPalette(AQLInterpreter interpreter, Map<String, Object> params, Collection<InteractiveFeature> features, Object targetElement) {
        Function<DynamicFilter, String> getPath = (filter) -> ((Path) filter.getFocus()).getPath();
        BiFunction<DynamicFilter, Object, SingleClickOnDiagramElementTool> createTool = (filter, obj) ->
                buildSingleClickOnDiagramElementTool("dynamic-filter",
                        filter.getName(),
                        "/images/filter.svg",
                        filter.getId() + "|" + this.identityService.getId(obj));
        var builderParams = new InteractiveFeatureToolBuilderParams<>(interpreter, params, features, getPath, createTool, targetElement, "Filters", "/images/filter.svg", DynamicFilter.class);
        return handleFeaturePalette(builderParams);
    }

    private Optional<ToolSection> handleSnippetPalette(AQLInterpreter interpreter, Map<String, Object> params, Collection<InteractiveFeature> features, Object targetElement) {
        Function<Snippet, String> getPath = (snippet) -> ((Path) snippet.getFocus()).getPath();
        BiFunction<Snippet, Object, SingleClickOnDiagramElementTool> createTool = (snippet, obj) ->
                buildSingleClickOnDiagramElementTool("snippet",
                        snippet.getName(),
                        "/images/snippet.svg",
                        snippet.getId() + "|" + this.identityService.getId(obj));
        var builderParams = new InteractiveFeatureToolBuilderParams<>(interpreter, params, features, getPath, createTool, targetElement, "Snippets", "/images/snippet.svg", Snippet.class);
        return handleFeaturePalette(builderParams);
    }

    private <T extends InteractiveFeature> Optional<ToolSection> handleFeaturePalette(InteractiveFeatureToolBuilderParams<T> params) {
        List<ITool> toolList = new LinkedList<>();
        for(var feature: params.features) {
            if(params.clazz.isInstance(feature)) {
                var feat = params.clazz.cast(feature);
                Result result = params.interpreter.evaluateExpression(params.params, params.getPath.apply(feat));
                result.asObjects().flatMap(list -> list.stream().filter(params.targetElement::equals).findFirst())
                        .ifPresent(obj -> toolList.add(params.getTool.apply(feat, obj)));
            }
        }
        if(!toolList.isEmpty()) {
            return Optional.of(ToolSection.newToolSection(UUID.randomUUID().toString())
                    .label(params.sectionName)
                    .iconURL(List.of(params.icon))
                    .tools(toolList)
                    .build());
        }
        return Optional.empty();
    }

    private SingleClickOnDiagramElementTool buildSingleClickOnDiagramElementTool(String id, String label, String icon, String selectionDescriptionId) {
        return SingleClickOnDiagramElementTool
                .newSingleClickOnDiagramElementTool(id)
                .label(label)
                .iconURL(List.of(icon))
                .targetDescriptions(List.of())
                .selectionDescriptionId(selectionDescriptionId)
                .build();
    }

    private record InteractiveFeatureToolBuilderParams<T extends InteractiveFeature>(
            AQLInterpreter interpreter,
            Map<String, Object> params,
            Collection<InteractiveFeature> features,
            Function<T, String> getPath,
            BiFunction<T, Object, SingleClickOnDiagramElementTool> getTool,
            Object targetElement,
            String sectionName,
            String icon,
            Class<T> clazz
            ) {}
}