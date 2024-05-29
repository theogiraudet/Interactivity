package org.eclipse.sirius.components.interactivity.starter;

import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IEditingContextProcessor;
import org.eclipse.sirius.components.emf.services.api.IEMFEditingContext;
import org.eclipse.sirius.components.interactivity.InteractivityPackage;
import org.eclipse.sirius.components.semantic_zoom.SemanticZoomPackage;
import org.eclipse.sirius.web.application.studio.services.api.IStudioCapableEditingContextPredicate;
import org.springframework.stereotype.Service;

@Service
public class InteractivityEditingContextInitializer implements IEditingContextProcessor {

    private final IStudioCapableEditingContextPredicate studioCapableEditingContextPredicate;

    public InteractivityEditingContextInitializer(IStudioCapableEditingContextPredicate studioCapableEditingContextPredicate) {
        this.studioCapableEditingContextPredicate = studioCapableEditingContextPredicate;
    }

    @Override
    public void preProcess(IEditingContext editingContext) {
        var isStudio = this.studioCapableEditingContextPredicate.test(editingContext);
        if (isStudio && editingContext instanceof IEMFEditingContext emfEditingContext) {
            var packageRegistry = emfEditingContext.getDomain().getResourceSet().getPackageRegistry();
            packageRegistry.put(InteractivityPackage.eNS_URI, InteractivityPackage.eINSTANCE);
            packageRegistry.put(SemanticZoomPackage.eNS_URI, SemanticZoomPackage.eINSTANCE);
        }
    }
}
