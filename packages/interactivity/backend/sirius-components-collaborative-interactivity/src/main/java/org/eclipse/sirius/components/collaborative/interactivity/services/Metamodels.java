package org.eclipse.sirius.components.collaborative.interactivity.services;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.components.domain.Domain;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.view.RepresentationDescription;
import org.eclipse.sirius.components.view.View;

public record Metamodels(Interactivity interactivity, EPackage domain, RepresentationDescription representationDescription) {}
