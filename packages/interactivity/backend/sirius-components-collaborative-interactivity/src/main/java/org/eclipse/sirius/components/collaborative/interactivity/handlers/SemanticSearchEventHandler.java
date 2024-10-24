package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.SemanticSearchInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.SemanticSearchSuccessPayload;
import org.eclipse.sirius.components.collaborative.interactivity.services.MetamodelsService;
import org.eclipse.sirius.components.core.api.ErrorPayload;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IIdentityService;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.interactivity.Path;
import org.eclipse.sirius.components.interactivity.SemanticSearch;
import org.eclipse.sirius.components.interpreter.AQLInterpreter;
import org.eclipse.sirius.components.interpreter.Result;
import org.eclipse.sirius.components.representations.Message;
import org.eclipse.sirius.components.representations.MessageLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SemanticSearchEventHandler implements IInteractivityEventHandler {

    private final Logger logger = LoggerFactory.getLogger(SemanticSearchEventHandler.class);
    private final IIdentityService identityService;
    private final MetamodelsService metamodelsService;

    public SemanticSearchEventHandler(IIdentityService identityService, MetamodelsService metamodelsService) {
        this.identityService = identityService;
        this.metamodelsService = metamodelsService;
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof SemanticSearchInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        long startTime = System.nanoTime();
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        List<Message> errors = new LinkedList<>();
        IPayload payload = new ErrorPayload(interactivityInput.id(), errors);

        if(interactivityInput instanceof SemanticSearchInput input) {
            var objectOpt = metamodelsService.getModel(editingContext, input.representationId());
            var semanticSearchOpt = metamodelsService.getDomainName(editingContext, input.representationId())
                    .flatMap(domain -> metamodelsService.getMetamodels(domain, editingContext, input.representationId()))
                    .flatMap(meta -> meta.interactivity().getFeatures()
                            .stream()
                            .filter(feature -> feature instanceof SemanticSearch)
                            .map(feature -> (SemanticSearch) feature)
                            .findAny()
                    );
            if(objectOpt.isPresent() && semanticSearchOpt.isPresent()) {
                var root = objectOpt.get();
                var semanticSearch = semanticSearchOpt.get();
                var found = new HashSet<String>();
                for(var query: semanticSearch.getSearch()) {
                    var queryStr = ((Path) query).getPath();
                    if(queryStr.equals("*")) {
                        var iterator = root.eAllContents();
                        while(iterator.hasNext()) {
                            var obj = iterator.next();
                            for(var attr: obj.eClass().getEAllAttributes()) {
                                var attrValue = obj.eGet(attr);
                                if((attrValue instanceof String || attrValue instanceof Number) && input.input().equals(attrValue)) {
                                    found.add(identityService.getId(obj));
                                }
                            }
                        }
                        if(!found.isEmpty()) {
                            logger.info("[Monitoring] Number of elements returned by interactivity.semantic_search: {} elements", found.size());
                            payload = new SemanticSearchSuccessPayload(input.id(), List.copyOf(found));
                        }
                    } else {
                        if (referencesString(queryStr, root)) {
                            var lastElementPathIndex = queryStr.lastIndexOf(".");
                            var queryToParentObj = queryStr.substring(0, lastElementPathIndex);
                            var attribute = queryStr.substring(lastElementPathIndex + 1);

                            AQLInterpreter interpreter = new AQLInterpreter(List.of(), List.of(root.eClass().getEPackage()));
                            Result result = interpreter.evaluateExpression(Map.of("root", root), queryToParentObj);

                            var resultOpt = result.asObjects().map(list -> list.stream()
                                            .map(obj -> (EObject) obj)
                                            .filter(obj -> input.input().equals(Optional.ofNullable(obj.eGet(obj.eClass().getEStructuralFeature(attribute))).map(Object::toString).orElse(null)))
                                            .map(identityService::getId)
                                            .collect(Collectors.toSet()))
                                    .filter(list -> !list.isEmpty());

                            if (resultOpt.isPresent()) {
                                logger.info("[Monitoring] Number of elements returned by interactivity.semantic_search: {} elements", resultOpt.get().size());
                                payload = new SemanticSearchSuccessPayload(input.id(), List.copyOf(resultOpt.get()));
                                break;
                            }
                        } else {
                            errors.add(new Message("Query '" + queryStr + "' cannot be evaluated to a string.", MessageLevel.ERROR));
                        }
                    }
                }
            }
        }

        errors.add(new Message("No result found.", MessageLevel.INFO));
        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        logger.info("[Monitoring] Execution time for interactivity.semantic_search: {} ms", duration / 1_000_000);
        logger.info("[Monitoring] End of interactivity.semantic_search");
    }

    private boolean referencesString(String query, EObject root) {
        AQLInterpreter interpreter = new AQLInterpreter(List.of(), List.of(root.eClass().getEPackage()));
        Result result = interpreter.evaluateExpression(Map.of("root", root), query);
        return result.asObjects().filter(list -> list.stream().allMatch(elem -> elem instanceof String || elem instanceof Number)).isPresent();
    }
}
