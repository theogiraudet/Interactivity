package org.eclipse.sirius.components.collaborative.interactivity.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.components.collaborative.api.IRepresentationSearchService;
import org.eclipse.sirius.components.collaborative.interactivity.handlers.SemanticSearchEventHandler;
import org.eclipse.sirius.components.core.api.IDomainSearchService;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IEditingContextSearchService;
import org.eclipse.sirius.components.core.api.IObjectSearchService;
import org.eclipse.sirius.components.diagrams.Diagram;
import org.eclipse.sirius.components.domain.Domain;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.representations.IRepresentationDescription;
import org.eclipse.sirius.components.view.RepresentationDescription;
import org.eclipse.sirius.components.view.View;
import org.eclipse.sirius.components.view.diagram.DiagramDescription;
import org.eclipse.sirius.components.view.emf.IViewRepresentationDescriptionSearchService;
import org.eclipse.sirius.web.application.editingcontext.EditingContext;
import org.eclipse.sirius.web.domain.boundedcontexts.semanticdata.repositories.ISemanticDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class MetamodelsService {

    private final Logger logger = LoggerFactory.getLogger(MetamodelsService.class);
    private final ISemanticDataRepository repository;
    private final IObjectSearchService objectSearchService;
    private final IRepresentationSearchService representationSearchService;
    private final IEditingContextSearchService editingContextSearchService;
    private final IViewRepresentationDescriptionSearchService representationDescriptionSearchService;


    public MetamodelsService(ISemanticDataRepository repository, IObjectSearchService objectSearchService, IRepresentationSearchService representationSearchService, IEditingContextSearchService editingContextSearchService, IViewRepresentationDescriptionSearchService representationDescriptionSearchService) {
        this.repository = repository;
        this.objectSearchService = objectSearchService;
        this.representationSearchService = representationSearchService;
        this.editingContextSearchService = editingContextSearchService;
        this.representationDescriptionSearchService = representationDescriptionSearchService;
    }

    public Optional<EObject> getModel(IEditingContext editingContext, String representationId) {
        var representationOpt = representationSearchService.findById(editingContext, representationId, Diagram.class);
        if (representationOpt.isPresent()) {
            var object = objectSearchService.getObject(editingContext, representationOpt.get().getTargetObjectId());
            if (object.isPresent()) {
                return Optional.of((EObject) object.get());
            }
        }
        return Optional.empty();
    }

    public Optional<Diagram> getRepresentation(IEditingContext editingContext, String representationId) {
        return representationSearchService.findById(editingContext, representationId, Diagram.class);
    }

    public Optional<Interactivity> getInteractivityMetamodel(String domainName) {
        var projectList = repository.findAllByDomains(List.of(InteractivityPackage.eNS_URI));

        for (var project : projectList) {
            var optional = editingContextSearchService.findById(project.getProject().getId().toString());
            if (optional.isPresent()) {
                EditingContext projectEditingContext = (EditingContext) optional.get();
                ResourceSet projectResourceSet = projectEditingContext.getDomain().getResourceSet();

                var interactivityOpt = this.getModelFromResourceSet(projectResourceSet, Interactivity.class, interactivity -> domainName.equals(interactivity.getDomainId()));
                if (interactivityOpt.isPresent()) {
                    return interactivityOpt;
                }
            }
        }
        return Optional.empty();
    }

    /**
     * Return the metamodels used to develop the used studio
     *
     * @param domainName the name of the domain used to develop the current model
     * @return the metamodels or empty
     */
    public Optional<Metamodels> getMetamodels(String domainName, IEditingContext editingContext, String representationId) {
        var interactivityOpt = getInteractivityMetamodel(domainName);
        var representationOpt = representationSearchService.findById(editingContext, representationId, Diagram.class);
        var modelOpt = representationOpt.flatMap(representation -> objectSearchService.getObject(editingContext, representation.getTargetObjectId()));
        var representationDescOpt = representationOpt.flatMap(representation -> representationDescriptionSearchService.findById(editingContext, representation.getDescriptionId()))
                .filter(reprDesc -> reprDesc instanceof DiagramDescription);
        if (interactivityOpt.isPresent() && representationOpt.isPresent() && modelOpt.isPresent() & representationDescOpt.isPresent()) {
            var interactivity = interactivityOpt.get();
            var model = (EObject) modelOpt.get();
            var domain = model.eClass().getEPackage();
            var representationDesc = (DiagramDescription) representationDescOpt.get();

            if (interactivity.getDiagramDefinition() != null && !representationDesc.getName().equals(interactivity.getDiagramDefinition().getName())) {
                logger.error("The found interactivity metamodel doesn't describe interactive features for the representation description of the current model representation.");
                return Optional.empty();
            } else {
                return Optional.of(new Metamodels(interactivity, domain, representationDesc));
            }
        }
        return Optional.empty();
    }

    /**
     * Return the domain name of the current developed model
     *
     * @param editingContext   the editing context of the used studio
     * @param representationId the ID of the opened representation used to develop the model
     * @return the domain name or empty
     */
    public Optional<String> getDomainName(IEditingContext editingContext, String representationId) {
        return this.representationSearchService.findById(editingContext, representationId, Diagram.class)
                .flatMap(diagram -> this.representationDescriptionSearchService
                        .findById(editingContext, diagram.getDescriptionId())
                ).map(desc -> desc.getDomainType().split("::?")[0]);
    }

    public Optional<String> getDomainNameByRepresentationDescription(IEditingContext editingContext, IRepresentationDescription description) {
        return this.representationDescriptionSearchService.findById(editingContext, description.getId()).map(desc -> desc.getDomainType().split("::?")[0]);
    }

    /**
     * Return a model in a resource set matching a specific type and a specific condition
     *
     * @param resourceSet the resource set within search the model
     * @param clazz       the class of the searched model root element
     * @param condition   the condition the model root element needs to verify
     * @param <T>         the type of the returned object
     * @return a model or empty
     */
    public <T> Optional<T> getModelFromResourceSet(ResourceSet resourceSet, Class<T> clazz, Predicate<T> condition) {
        return resourceSet.getResources().stream()
                .flatMap(res -> res.getContents().stream())
                .filter(cont -> clazz.isAssignableFrom(cont.getClass()))
                .map(clazz::cast)
                .filter(condition)
                .findFirst();
    }
}
