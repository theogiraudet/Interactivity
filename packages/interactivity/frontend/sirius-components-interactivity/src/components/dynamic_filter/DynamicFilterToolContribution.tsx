import { DiagramPaletteToolContributionComponentProps } from '@eclipse-sirius/sirius-components-diagrams';
import { IconButton } from '@material-ui/core';
import { Fragment } from 'react';

export const DynamicFilterToolContribution = ({ diagramElementId }: DiagramPaletteToolContributionComponentProps) => {
  // const [modal, setModal] = useState<Modal | null>(null);

  // const nodes = useNodes<NodeData>();
  // const targetedNode = nodes.find((node) => node.id === diagramElementId);

  // const onClose = () => {
  //     setModal(null);
  // };

  // let modalElement: JSX.Element | null = null;
  // if (modal === 'dialog' && targetedNode) {
  //     modalElement = (
  //         <>
  //             <Dialog open={true} onClose={onClose} fullWidth>
  //     <DialogContent>
  //         <DialogContentText>{targetedNode.data.insideLabel.text}</DialogContentText>
  //     </DialogContent>
  //     </Dialog>
  //     </>
  // );
  // }

  return (
    <Fragment key="dynamic-filter-contribution">
      <IconButton
        size="small"
        color="inherit"
        aria-label="Label detail"
        title="Label detail"
        // onClick={() => setModal('dialog')}
        data-testid="label-detail">
        {/*<Slideshow />*/}
      </IconButton>
      {/*{modalElement}*/}
    </Fragment>
  );
};
