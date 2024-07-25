import { IconButton, Paper, Popper, Tooltip, InputAdornment, TextField } from '@material-ui/core';
import SearchIcon from '@material-ui/icons/Search';
import ClearIcon from '@material-ui/icons/Clear';
import {
  DiagramContext,
  DiagramContextValue,
  DiagramPanelActionProps,
} from '@eclipse-sirius/sirius-components-diagrams';
import { Selection, useSelection } from '@eclipse-sirius/sirius-components-core';
import { useContext, useRef, useState } from 'react';
import ClickAwayListener from '@material-ui/core/ClickAwayListener';
import { emitCustomEvent, useCustomEventListener } from 'react-custom-events';

export const SemanticSearchIcon = ({ diagramId }: DiagramPanelActionProps) => {
  const [displaySemanticSearch, setDisplaySemanticSearch] = useState(false);
  const [isOpen, setIsOpen] = useState<boolean>(false);
  const [text, setText] = useState<string | undefined>(undefined);
  const { setSelection } = useSelection();

  useCustomEventListener('display-semantic-search', () => setDisplaySemanticSearch(true), []);

  const handlePanel = () => {
    const newSelection: Selection = {
      entries: [
        {
          id: diagramId,
          label: '',
          kind: '',
        },
      ],
    };
    setSelection(newSelection);
    setIsOpen(() => true);
  };

  const anchorRef = useRef<HTMLButtonElement | null>(null);
  const { readOnly } = useContext<DiagramContextValue>(DiagramContext);

  const clean = () => {
    setText(undefined);
    console.log('Click clean');
    emitCustomEvent('semantic-search', undefined);
  };

  const clearAdornment = () => {
    if (text) {
      return (
        <InputAdornment position="end">
          <IconButton onClick={clean}>
            <ClearIcon />
          </IconButton>
        </InputAdornment>
      );
    }
    return '';
  };
  const searchAdornment = () => {
    return (
      <InputAdornment position="start">
        <IconButton onClick={() => emitCustomEvent('semantic-search', text)} disabled={text === undefined}>
          <SearchIcon />
        </IconButton>
      </InputAdornment>
    );
  };

  const result = (
    <>
      <Tooltip title="Search" ref={anchorRef}>
        <IconButton
          size="small"
          aria-label="semantic search"
          onClick={handlePanel}
          data-testid="semantic-search"
          disabled={readOnly}
          color={isOpen || text !== undefined ? 'primary' : 'default'}>
          <SearchIcon />
        </IconButton>
      </Tooltip>
      <Popper
        open={isOpen}
        anchorEl={anchorRef.current}
        placement="bottom-start"
        transition
        disablePortal
        style={{ zIndex: '9999' }}>
        <Paper style={{ maxHeight: '50vh', overflow: 'hidden' }}>
          <ClickAwayListener onClickAway={() => setIsOpen(false)}>
            <div>
              <TextField
                value={text || ''}
                onChange={(event) => (event.target.value.length == 0 ? clean() : setText(event.target.value))}
                id="semantic-search-textfield"
                InputProps={{
                  endAdornment: clearAdornment(),
                  startAdornment: searchAdornment(),
                }}
              />
            </div>
          </ClickAwayListener>
        </Paper>
      </Popper>
    </>
  );

  return displaySemanticSearch ? result : null;
};
