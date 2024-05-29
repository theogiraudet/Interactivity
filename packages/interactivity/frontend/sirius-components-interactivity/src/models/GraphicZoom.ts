import * as React from 'react';
import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';

interface Action {
  apply(): void;
}

class LevelOfDetail implements Action {
  readonly setState: React.Dispatch<React.SetStateAction<Node<NodeData>[]>>;

  constructor(setState: React.Dispatch<React.SetStateAction<Node<NodeData>[]>>) {
    this.setState = setState;
    // Issue: to know what (semantic) nodes are concerned by the hide/fade, I need to query the backend
  }

  apply(): void {}
}
