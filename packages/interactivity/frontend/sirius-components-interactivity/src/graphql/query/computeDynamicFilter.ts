/*******************************************************************************
 * Copyright (c) 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
import { gql } from '@apollo/client';

export const computeDynamicFilterQuery = gql`
  query dynamicFilter($input: ComputeDynamicFilterInput!) {
    dynamicFilter(input: $input) {
      ... on ComputeDynamicFilterSuccessPayload {
        __typename
        id
        elementIds {
          modifierId
          semanticElementId
        }
        edges {
          edgeDescription
          sourceObjectId
          targetObjectIds
        }
      }
    }
  }
`;