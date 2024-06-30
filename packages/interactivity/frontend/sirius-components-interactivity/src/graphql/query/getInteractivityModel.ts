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

export const filterFragment = gql`
  fragment filterFragment on FilterDefinition {
    name
    modifiers {
      id
      __typename
      ... on VisibilityModifier {
        hide
        path
      }
      ... on StyleModifier {
        path
        style {
          __typename
          ... on RectangularNodeStyleDescription {
            background {
              name
              value
            }
            borderColor {
              name
              value
            }
            borderLineStyle
            borderSize
            borderRadius
          }
          ... on ImageNodeStyleDescription {
            shape
            borderColor {
              name
              value
            }
            borderLineStyle
            borderSize
            borderRadius
            positionDependentRotation
          }
          ... on IconLabelNodeStyleDescription {
            background {
              name
              value
            }
          }
        }
      }
    }
  }
`;

export const getInteractivityModelQuery = gql`
  ${filterFragment}
  query Interactivity($input: InteractivityModelInput!) {
    interactivity(input: $input) {
      ... on InteractivityModelSuccessPayload {
        __typename
        interactivity {
          domainId
          filters {
            ...filterFragment
          }
          features {
            __typename
            ... on SemanticZoom {
              levels {
                id
                min
                max
                filter {
                  ...filterFragment
                }
              }
            }
            ... on DynamicFilter {
              filters {
                id
                name
                reference {
                  ...filterFragment
                }
              }
              radius {
                __typename
                ... on FixedRadius {
                  value
                }
                ... on BoundedRadius {
                  min
                  max
                }
              }
            }
            ... on SemanticSearch {
              search
              id
            }
          }
        }
      }
    }
  }
`;
