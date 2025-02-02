/*******************************************************************************
 * Copyright (c) 2023, 2024 Obeo.
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

import { Selection, useData, useSelection } from '@eclipse-sirius/sirius-components-core';
import React, {
  MouseEvent as ReactMouseEvent,
  useCallback,
  useContext,
  useEffect,
  useMemo,
  useRef,
  useState,
  memo,
} from 'react';
import ReactFlow, {
  Background,
  BackgroundVariant,
  ConnectionLineType,
  ConnectionMode,
  Edge,
  EdgeChange,
  Node,
  NodeChange,
  OnEdgesChange,
  OnMove,
  OnNodesChange,
  ReactFlowProps,
  applyNodeChanges,
} from 'reactflow';
import { DiagramContext } from '../contexts/DiagramContext';
import { DiagramContextValue } from '../contexts/DiagramContext.types';
import { NodeTypeContext } from '../contexts/NodeContext';
import { NodeTypeContextValue } from '../contexts/NodeContext.types';
import { useDiagramDescription } from '../contexts/useDiagramDescription';
import { convertDiagram } from '../converter/convertDiagram';
import { useStore } from '../representation/useStore';
import { Diagram, DiagramRendererProps, NodeData, ReactFlowPropsCustomizer } from './DiagramRenderer.types';
import { diagramRendererReactFlowPropsCustomizerExtensionPoint } from './DiagramRendererExtensionPoints';
import { useBorderChange } from './border/useBorderChange';
import { ConnectorContextualMenu } from './connector/ConnectorContextualMenu';
import { useConnector } from './connector/useConnector';
import { DebugPanel } from './debug/DebugPanel';
import { useDiagramDelete } from './delete/useDiagramDelete';
import { useDiagramDirectEdit } from './direct-edit/useDiagramDirectEdit';
import { useNodesDraggable } from './drag/useNodesDraggable';
import { useDrop } from './drop/useDrop';
import { useDropDiagramStyle } from './dropNode/useDropDiagramStyle';
import { useDropNode } from './dropNode/useDropNode';
import { ConnectionLine } from './edge/ConnectionLine';
import { edgeTypes } from './edge/EdgeTypes';
import { useInitialFitToScreen } from './fit-to-screen/useInitialFitToScreen';
import { useHandleChange } from './handles/useHandleChange';
import { HelperLines } from './helper-lines/HelperLines';
import { useHelperLines } from './helper-lines/useHelperLines';
import { useNodeHover } from './hover/useNodeHover';
import { useFilterReadOnlyChanges } from './layout-events/useFilterReadOnlyChanges';
import { useLayoutOnBoundsChange } from './layout-events/useLayoutOnBoundsChange';
import { RawDiagram } from './layout/layout.types';
import { useLayout } from './layout/useLayout';
import { useSynchronizeLayoutData } from './layout/useSynchronizeLayoutData';
import { useMoveChange } from './move/useMoveChange';
import { DiagramNodeType } from './node/NodeTypes.types';
import { useNodeType } from './node/useNodeType';
import { DiagramPalette } from './palette/DiagramPalette';
import { GroupPalette } from './palette/group-tool/GroupPalette';
import { useGroupPalette } from './palette/group-tool/useGroupPalette';
import { useDiagramElementPalette } from './palette/useDiagramElementPalette';
import { useDiagramPalette } from './palette/useDiagramPalette';
import { DiagramPanel } from './panel/DiagramPanel';
import { useReconnectEdge } from './reconnect-edge/useReconnectEdge';
import { useResizeChange } from './resize/useResizeChange';
import { useDiagramSelection } from './selection/useDiagramSelection';
import { useShiftSelection } from './selection/useShiftSelection';
import { useSnapToGrid } from './snap-to-grid/useSnapToGrid';

import 'reactflow/dist/style.css';
import { Interactivity } from '@eclipse-sirius/sirius-components-interactivity';
import { useInteractivityProxy } from '@eclipse-sirius/sirius-components-interactivity';

const GRID_STEP: number = 10;

export const DiagramRenderer = memo(({ diagramRefreshedEventPayload }: DiagramRendererProps) => {
  const { readOnly } = useContext<DiagramContextValue>(DiagramContext);
  const { diagramDescription } = useDiagramDescription();
  const { getEdges, onEdgesChange, getNodes, setEdges: oldSetEdges, setNodes: oldSetNodes } = useStore();
  // const nodes = getNodes();
  const edges = getEdges();

  const { onDirectEdit } = useDiagramDirectEdit();
  const { onDelete } = useDiagramDelete();

  const ref = useRef<HTMLDivElement | null>(null);
  const { layout } = useLayout();
  const { synchronizeLayoutData } = useSynchronizeLayoutData();
  const {
    onDiagramBackgroundClick,
    onDiagramElementClick: diagramPaletteOnDiagramElementClick,
    hideDiagramPalette,
    isOpened: isDiagramPaletteOpened,
  } = useDiagramPalette();
  const {
    onDiagramElementClick: elementPaletteOnDiagramElementClick,
    hideDiagramElementPalette,
    isOpened: isDiagramElementPaletteOpened,
  } = useDiagramElementPalette();

  const {
    onDiagramElementClick: groupPaletteOnDiagramElementClick,
    hideGroupPalette,
    position: groupPalettePosition,
    isOpened: isGroupPaletteOpened,
    refElementId: groupPaletteRefElementId,
  } = useGroupPalette();

  const { onConnect, onConnectStart, onConnectEnd } = useConnector();
  const { reconnectEdge } = useReconnectEdge();
  const { onDrop, onDragOver } = useDrop();
  const { onNodeDragStart, onNodeDrag, onNodeDragStop } = useDropNode();
  const { backgroundColor, largeGridColor, smallGridColor } = useDropDiagramStyle();
  const { nodeTypes } = useNodeType();

  const { nodeConverters } = useContext<NodeTypeContextValue>(NodeTypeContext);
  const { fitToScreen } = useInitialFitToScreen();
  const { setSelection } = useSelection();

  const [convertedDiagram, setDiagram] = useState<Diagram | undefined>(undefined);
  const { diagramId: representationId, editingContextId } = useContext<DiagramContextValue>(DiagramContext);
  const [setNodes, setEdges, nodes] = useInteractivityProxy({
    editingContextId,
    representationId,
    setNodes: oldSetNodes,
    setEdges: oldSetEdges,
    getNodes,
    getEdges,
    gqlDiagram: diagramRefreshedEventPayload.diagram,
    convertedDiagram: convertedDiagram,
  });

  useEffect(() => {
    const { diagram, cause } = diagramRefreshedEventPayload;
    const convertedDiagram: Diagram = convertDiagram(diagram, nodeConverters, diagramDescription);
    setDiagram(convertedDiagram);
    const selectedNodeIds = nodes.filter((node) => node.selected).map((node) => node.id);
    const selectedEdgeIds = edges.filter((edge) => edge.selected).map((edge) => edge.id);
    if (cause === 'layout') {
      convertedDiagram.nodes
        .filter((node) => selectedNodeIds.includes(node.id))
        .forEach((node) => (node.selected = true));
      convertedDiagram.edges
        .filter((edge) => selectedEdgeIds.includes(edge.id))
        .forEach((edge) => (edge.selected = true));

      setNodes(convertedDiagram.nodes);
      setEdges(convertedDiagram.edges);
      fitToScreen();
    } else if (cause === 'refresh') {
      const previousDiagram: RawDiagram = {
        nodes: nodes as Node<NodeData, DiagramNodeType>[],
        edges,
      };
      layout(previousDiagram, convertedDiagram, diagramRefreshedEventPayload.referencePosition, (laidOutDiagram) => {
        laidOutDiagram.nodes
          .filter((node) => selectedNodeIds.includes(node.id))
          .forEach((node) => (node.selected = true));
        laidOutDiagram.edges
          .filter((edge) => selectedEdgeIds.includes(edge.id))
          .forEach((edge) => (edge.selected = true));

        setNodes(laidOutDiagram.nodes);
        setEdges(laidOutDiagram.edges);
        closeAllPalettes();

        synchronizeLayoutData(diagramRefreshedEventPayload.id, laidOutDiagram);
      });
    }
  }, [diagramRefreshedEventPayload, diagramDescription]);

  useEffect(() => {
    setEdges((oldEdges) => oldEdges.map((edge) => ({ ...edge, updatable: !!edge.selected })));
  }, [edges.map((edge) => edge.id + edge.selected).join()]);

  const { onShiftSelection, setShiftSelection } = useShiftSelection();
  useDiagramSelection(onShiftSelection);
  const { transformBorderNodeChanges } = useBorderChange();
  const { transformUndraggableListNodeChanges, applyMoveChange } = useMoveChange();
  const { transformResizeListNodeChanges } = useResizeChange();
  const { applyHandleChange } = useHandleChange();
  const { layoutOnBoundsChange } = useLayoutOnBoundsChange(diagramRefreshedEventPayload.id);
  const { filterReadOnlyChanges } = useFilterReadOnlyChanges();
  const {
    helperLinesEnabled,
    setHelperLinesEnabled,
    horizontalHelperLine,
    verticalHelperLine,
    applyHelperLines,
    resetHelperLines,
  } = useHelperLines();

  const handleNodesChange: OnNodesChange = useCallback(
    (changes: NodeChange[]) => {
      const noReadOnlyChanges = filterReadOnlyChanges(changes);
      const isResetChange = changes.find((change) => change.type === 'reset');
      if (
        isResetChange ||
        (noReadOnlyChanges.length === 1 &&
          noReadOnlyChanges[0]?.type === 'dimensions' &&
          typeof noReadOnlyChanges[0].resizing !== 'boolean')
      ) {
        setNodes((oldNodes) => applyNodeChanges(noReadOnlyChanges, oldNodes));
      } else {
        setNodes((oldNodes) => {
          resetHelperLines(changes);
          let transformedNodeChanges: NodeChange[] = transformBorderNodeChanges(noReadOnlyChanges, oldNodes);
          transformedNodeChanges = transformUndraggableListNodeChanges(transformedNodeChanges);
          transformedNodeChanges = transformResizeListNodeChanges(transformedNodeChanges);
          transformedNodeChanges = applyHelperLines(transformedNodeChanges);

          let newNodes = applyNodeChanges(transformedNodeChanges, oldNodes);

          newNodes = applyMoveChange(transformedNodeChanges, newNodes);
          newNodes = applyHandleChange(transformedNodeChanges, newNodes as Node<NodeData, DiagramNodeType>[]);

          layoutOnBoundsChange(transformedNodeChanges, newNodes as Node<NodeData, DiagramNodeType>[]);
          return newNodes;
        });
      }
    },
    [setNodes, layoutOnBoundsChange, getNodes, getEdges]
  );

  const handleEdgesChange: OnEdgesChange = useCallback(
    (changes: EdgeChange[]) => {
      onEdgesChange(changes);
    },
    [onEdgesChange]
  );

  const handlePaneClick = useCallback(
    (event: React.MouseEvent<Element, MouseEvent>) => {
      const {
        diagram: {
          id,
          metadata: { kind, label },
        },
      } = diagramRefreshedEventPayload;
      const selection: Selection = {
        entries: [
          {
            id,
            kind,
            label,
          },
        ],
      };
      setSelection(selection);
      onDiagramBackgroundClick(event);
    },
    [setSelection]
  );

  const onKeyDown = useCallback((event: React.KeyboardEvent<Element>) => {
    onDirectEdit(event);
    onDelete(event);
  }, []);

  const { snapToGrid, onSnapToGrid } = useSnapToGrid();

  const closeAllPalettes = useCallback(() => {
    hideDiagramPalette();
    hideDiagramElementPalette();
    hideGroupPalette();
  }, [hideDiagramPalette, hideDiagramElementPalette, hideGroupPalette]);

  const handleMove: OnMove = useCallback(() => {
    closeAllPalettes();
  }, [isDiagramElementPaletteOpened, isDiagramPaletteOpened]);

  const handleDiagramElementCLick = useCallback(
    (event: React.MouseEvent<Element, MouseEvent>, element: Node | Edge) => {
      diagramPaletteOnDiagramElementClick();
      elementPaletteOnDiagramElementClick(event, element);
      groupPaletteOnDiagramElementClick(event, element);
    },
    [elementPaletteOnDiagramElementClick, diagramPaletteOnDiagramElementClick, groupPaletteOnDiagramElementClick]
  );

  const handleSelectionStart = useCallback(() => {
    closeAllPalettes();
    setShiftSelection(true);
  }, [closeAllPalettes, setShiftSelection]);

  const handleSelectionEnd = useCallback(
    (event: React.MouseEvent<Element, MouseEvent>) => {
      groupPaletteOnDiagramElementClick(event, null);
      setShiftSelection(false);
    },
    [groupPaletteOnDiagramElementClick, setShiftSelection]
  );

  const { onNodeMouseEnter, onNodeMouseLeave } = useNodeHover();

  const handleNodeDrag = useCallback(
    (event: ReactMouseEvent, node: Node, nodes: Node[]) => {
      onNodeDrag(event, node, nodes);
      closeAllPalettes();
    },
    [onNodeDrag, closeAllPalettes]
  );

  const { nodesDraggable } = useNodesDraggable();

  let reactFlowProps: ReactFlowProps & { diagram: any } = {
    diagram: convertedDiagram,
    nodes: nodes,
    nodeTypes: nodeTypes,
    onNodesChange: handleNodesChange,
    edges: edges,
    edgeTypes: edgeTypes,
    edgesUpdatable: !readOnly,
    onKeyDown: onKeyDown,
    onConnect: onConnect,
    onConnectStart: onConnectStart,
    onConnectEnd: onConnectEnd,
    connectionLineComponent: ConnectionLine,
    onEdgesChange: handleEdgesChange,
    onEdgeUpdate: reconnectEdge,
    onPaneClick: handlePaneClick,
    onEdgeClick: handleDiagramElementCLick,
    onNodeClick: handleDiagramElementCLick,
    onMove: handleMove,
    nodeDragThreshold: 1,
    onDrop: onDrop,
    onDragOver: onDragOver,
    onNodeDrag: handleNodeDrag,
    onNodeDragStart: onNodeDragStart,
    onNodeDragStop: onNodeDragStop,
    onNodeMouseEnter: onNodeMouseEnter,
    onNodeMouseLeave: onNodeMouseLeave,
    onSelectionStart: handleSelectionStart,
    onSelectionEnd: handleSelectionEnd,
    maxZoom: 40,
    minZoom: 0.1,
    snapToGrid: snapToGrid,
    snapGrid: useMemo(() => [GRID_STEP, GRID_STEP], []),
    connectionMode: ConnectionMode.Loose,
    zoomOnDoubleClick: false,
    connectionLineType: ConnectionLineType.SmoothStep,
    nodesDraggable: nodesDraggable,
    children: (
      <>
        {snapToGrid ? (
          <>
            <Background
              id="small-grid"
              style={{ backgroundColor }}
              variant={BackgroundVariant.Lines}
              gap={GRID_STEP}
              color={smallGridColor}
            />
            <Background
              id="large-grid"
              variant={BackgroundVariant.Lines}
              gap={10 * GRID_STEP}
              offset={1}
              color={largeGridColor}
            />
          </>
        ) : (
          <Background style={{ backgroundColor }} color={backgroundColor} />
        )}
        <DiagramPanel
          snapToGrid={snapToGrid}
          onSnapToGrid={onSnapToGrid}
          helperLines={helperLinesEnabled}
          onHelperLines={setHelperLinesEnabled}
          reactFlowWrapper={ref}
        />
        <GroupPalette
          x={groupPalettePosition?.x}
          y={groupPalettePosition?.y}
          isOpened={isGroupPaletteOpened}
          refElementId={groupPaletteRefElementId}
          hidePalette={hideGroupPalette}
        />
        <DiagramPalette diagramElementId={diagramRefreshedEventPayload.diagram.id} />
        {diagramDescription.debug ? <DebugPanel reactFlowWrapper={ref} /> : null}
        <ConnectorContextualMenu />
        {helperLinesEnabled ? <HelperLines horizontal={horizontalHelperLine} vertical={verticalHelperLine} /> : null}
      </>
    ),
  };

  const { data: reactFlowPropsCustomizers } = useData<Array<ReactFlowPropsCustomizer>>(
    diagramRendererReactFlowPropsCustomizerExtensionPoint
  );
  reactFlowPropsCustomizers.forEach((customizer) => {
    reactFlowProps = { ...customizer(reactFlowProps), diagram: convertedDiagram };
  });

  return (
    <>
      <Interactivity {...reactFlowProps} />
      <ReactFlow {...reactFlowProps} ref={ref} />
    </>
  );
});
