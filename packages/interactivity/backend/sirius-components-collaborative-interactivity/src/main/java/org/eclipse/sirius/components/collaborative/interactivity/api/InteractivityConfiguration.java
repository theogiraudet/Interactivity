package org.eclipse.sirius.components.collaborative.interactivity.api;

import org.eclipse.sirius.components.collaborative.api.IRepresentationConfiguration;

import java.util.Objects;

/**
 * The configuration used to create a interactivity event processor.
 *
 * @author tgiraudet
 */
public class InteractivityConfiguration implements IRepresentationConfiguration {


        private final String interactivityId;

        public InteractivityConfiguration(String interactivityId) {
            this.interactivityId = Objects.requireNonNull(interactivityId);
        }

        @Override
        public String getId() {
            return this.interactivityId;
        }

}
