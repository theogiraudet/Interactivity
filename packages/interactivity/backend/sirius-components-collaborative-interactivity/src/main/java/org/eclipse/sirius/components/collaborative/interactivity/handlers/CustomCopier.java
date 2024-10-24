package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.components.emf.services.IDAdapter;

public class CustomCopier extends EcoreUtil.Copier {

    @Override
    public EObject copy(EObject eObject) {
        EObject result = super.copy(eObject);
        if(result == null) {
            return null;
        }
        result.eAdapters().add(new IDAdapter(eObject.eAdapters().stream().filter(IDAdapter.class::isInstance).map(IDAdapter.class::cast).findFirst().map(IDAdapter::getId).orElse(null)));
        return result;
    }

}
