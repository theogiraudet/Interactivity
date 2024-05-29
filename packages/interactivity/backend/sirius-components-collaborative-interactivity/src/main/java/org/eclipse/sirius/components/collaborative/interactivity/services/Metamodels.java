package org.eclipse.sirius.components.collaborative.interactivity.services;

import org.eclipse.sirius.components.domain.Domain;
import org.eclipse.sirius.components.interactivity.Interactivity;
import org.eclipse.sirius.components.view.View;

public record Metamodels(Interactivity interactivity, Domain domain, View view) {}
