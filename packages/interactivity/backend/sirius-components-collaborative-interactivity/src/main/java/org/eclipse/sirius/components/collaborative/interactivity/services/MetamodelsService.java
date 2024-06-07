package org.eclipse.sirius.components.collaborative.interactivity.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.components.collaborative.api.IRepresentationSearchService;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IEditingContextSearchService;
import org.eclipse.sirius.components.core.api.IObjectSearchService;
import org.eclipse.sirius.components.diagrams.Diagram;
import org.eclipse.sirius.components.domain.Domain;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.view.View;
import org.eclipse.sirius.components.view.emf.IViewRepresentationDescriptionSearchService;
import org.eclipse.sirius.web.application.editingcontext.EditingContext;
import org.eclipse.sirius.web.domain.boundedcontexts.semanticdata.repositories.ISemanticDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class MetamodelsService {

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
        if(representationOpt.isPresent()) {
           var object = objectSearchService.getObject(editingContext, representationOpt.get().getTargetObjectId());
           if(object.isPresent()) {
               return Optional.of((EObject) object.get());
           }
        }
        return Optional.empty();
    }

    /**
     * Return the metamodels used to develop the used studio
     * @param domainName the name of the domain used to develop the current model
     * @return the metamodels or empty
     */
    public Optional<Metamodels> getMetamodels(String domainName) {
        var projectList = repository.findAllByDomains(List.of(InteractivityPackage.eNS_URI));

        for (var project : projectList) {
            var optional = editingContextSearchService.findById(project.getProject().getId().toString());
            if (optional.isPresent()) {
                EditingContext projectEditingContext = (EditingContext) optional.get();

                ResourceSet projectResourceSet = projectEditingContext.getDomain().getResourceSet();

                var domainOpt = this.getModelFromResourceSet(projectResourceSet, Domain.class, dom -> domainName.equals(dom.getName()));

                if (domainOpt.isPresent()) {
                    var interactivityOpt = this.getModelFromResourceSet(projectResourceSet, Interactivity.class, interactivity -> domainName.equals(interactivity.getDomainId()));
                    if(interactivityOpt.isPresent()) {
                        var interactivity = interactivityOpt.get();
                        // TODO Which view to return when the interactivity model declare several DiagramEditors ?
                        var viewOpt = this.getModelFromResourceSet(projectResourceSet, View.class, view -> view.getDescriptions().stream().anyMatch(desc -> desc.equals(interactivity.getDiagramDefinition())));
                        return viewOpt.map(view -> new Metamodels(interactivity, domainOpt.get(), view));
                    }
                }
            }
        }
        return Optional.empty();
    }

    /**
     * Return the domain name of the current developed model
     * @param editingContext the editing context of the used studio
     * @param representationId the ID of the opened representation used to develop the model
     * @return the domain name or empty
     */
    public Optional<String> getDomainName(IEditingContext editingContext, String representationId) {
        return this.representationSearchService.findById(editingContext, representationId, Diagram.class)
                .flatMap(diagram -> this.representationDescriptionSearchService
                        .findById(editingContext, diagram.getDescriptionId())
                ).map(desc -> desc.getDomainType().split("::")[0]);
    }

    /**
     * Return a model in a resource set matching a specific type and a specific condition
     * @param resourceSet the resource set within search the model
     * @param clazz the class of the searched model root element
     * @param condition the condition the model root element needs to verify
     * @return a model or empty
     * @param <T> the type of the returned object
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
