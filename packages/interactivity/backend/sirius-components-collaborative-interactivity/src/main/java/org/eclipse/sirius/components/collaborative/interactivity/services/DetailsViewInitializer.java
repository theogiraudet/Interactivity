package org.eclipse.sirius.components.collaborative.interactivity.services;

import org.eclipse.sirius.components.collaborative.forms.PropertiesEventProcessorFactory;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IEditingContextProcessor;
import org.eclipse.sirius.web.application.editingcontext.EditingContext;
import org.eclipse.sirius.web.application.views.details.services.DetailsViewDescriptionProvider;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DetailsViewInitializer implements IEditingContextProcessor {

    private final DetailsViewDescriptionProvider detailsViewDescriptionProvider;

    public DetailsViewInitializer(DetailsViewDescriptionProvider detailsViewDescriptionProvider) {
        this.detailsViewDescriptionProvider = Objects.requireNonNull(detailsViewDescriptionProvider);
    }

    @Override
    public void preProcess(IEditingContext editingContext) {
        if (editingContext instanceof EditingContext siriusWebEditingContext) {
            siriusWebEditingContext.getRepresentationDescriptions().put(PropertiesEventProcessorFactory.DETAILS_VIEW_ID, this.detailsViewDescriptionProvider.getFormDescription());
        }
    }
}
