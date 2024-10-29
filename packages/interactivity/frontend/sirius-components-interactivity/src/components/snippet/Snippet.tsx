import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { GQLSnippet, GQLSnippetPayload } from '../../graphql/query/InteractivityGraphQL.types';
import { OperationVariables, QueryOptions, useLazyQuery } from '@apollo/client';
import { computeSnippetQuery } from '../../graphql/query/computeSnippet';
import { useCustomEventListener } from 'react-custom-events';
import { GQLSingleClickOnDiagramElementTool } from '@eclipse-sirius/sirius-components-diagrams';

const queryParams = (
  editingContextId: string,
  representationId: string,
  focusedId: string,
  snippetId: string
): QueryOptions<OperationVariables, GQLSnippetPayload> => ({
  query: computeSnippetQuery,
  fetchPolicy: 'no-cache',
  variables: {
    input: {
      id: crypto.randomUUID(),
      editingContextId: editingContextId,
      representationId: representationId,
      snippetId: snippetId,
      focusElementId: focusedId,
    },
  },
});

export const Snippet = (props: InteractiveFeatureProps<GQLSnippet>) => {
  const [query] = useLazyQuery(computeSnippetQuery);

  useCustomEventListener(
    'snippet-' + props.value.id,
    (data: GQLSingleClickOnDiagramElementTool) => {
      query(
        queryParams(
          props.editingContextId,
          props.representationId,
          data.selectionDescriptionId.split('|')[1]!,
          data.selectionDescriptionId.split('|')[0]!
        )
      );
    },
    [props.interactivity.features]
  );

  return null;
};
