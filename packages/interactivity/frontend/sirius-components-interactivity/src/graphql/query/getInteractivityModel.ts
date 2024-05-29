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

export const getInteractivityModelQuery = gql`
  query Interactivity($input: InteractivityModelInput!) {
    interactivity(input: $input) {
      ... on InteractivityModelSuccessPayload {
        __typename
        interactivity {
          domainId
          diagramEditors {
            interactions {
              __typename
              ... on GraphicZoom {
                levels {
                  level
                  actionsToTrigger {
                    ... on LevelOfDetail {
                      name
                    }
                  }
                }
              }
            }
            interactiveFeatures {
              ... on SemanticZoom {
                levels {
                  name
                }
              }
            }
          }
        }
      }
    }
  }
`;
