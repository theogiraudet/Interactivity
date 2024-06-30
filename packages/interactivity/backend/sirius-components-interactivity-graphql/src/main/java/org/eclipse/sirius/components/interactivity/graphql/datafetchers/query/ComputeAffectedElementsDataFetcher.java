package org.eclipse.sirius.components.interactivity.graphql.datafetchers.query;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.schema.DataFetchingEnvironment;
import org.eclipse.sirius.components.annotations.spring.graphql.QueryDataFetcher;
import org.eclipse.sirius.components.collaborative.interactivity.dto.ComputeAffectedElementsInput;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.graphql.api.IDataFetcherWithFieldCoordinates;
import org.eclipse.sirius.components.graphql.api.IEditingContextDispatcher;
import org.eclipse.sirius.components.graphql.api.IExceptionWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * The data fetcher used to get the different nodes affected by a Interactivity action.
 *
 * @author tgiraudet
 */
@QueryDataFetcher(type = "Query", field = "affectedElements")
public class ComputeAffectedElementsDataFetcher implements IDataFetcherWithFieldCoordinates<CompletableFuture<IPayload>> {

    private static final String INPUT_ARGUMENT = "input";

    private final ObjectMapper objectMapper;

    private final IExceptionWrapper exceptionWrapper;

    private final IEditingContextDispatcher editingContextDispatcher;

    public ComputeAffectedElementsDataFetcher(ObjectMapper objectMapper, IExceptionWrapper exceptionWrapper, IEditingContextDispatcher editingContextDispatcher) {
        this.objectMapper = objectMapper;
        this.exceptionWrapper = exceptionWrapper;
        this.editingContextDispatcher = editingContextDispatcher;
    }

    @Override
    public CompletableFuture<IPayload> get(DataFetchingEnvironment environment) throws Exception {
        Object argument = environment.getArgument(INPUT_ARGUMENT);
        var input = this.objectMapper.convertValue(argument, ComputeAffectedElementsInput.class);

        return this.exceptionWrapper.wrapMono(() -> this.editingContextDispatcher.dispatchQuery(input.editingContextId(), input), input).toFuture();
    }
}
