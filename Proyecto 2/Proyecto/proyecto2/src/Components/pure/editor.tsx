import React from 'react';

import CodeMirror from "@uiw/react-codemirror";
import { dracula } from "@uiw/codemirror-theme-dracula";
import { javascript } from "@codemirror/lang-javascript";

export const Editor = () => {
  return (
        <CodeMirror
          value=""
          width='400'
          height="500px"
          theme={dracula}
          extensions={[javascript({ jsx: true })]}
          onChange={(value, viewUpdate) => {
            console.log("value:", value);
          }}
        />
    // <div>
    //     <div className='container'>
    //         <div className="btn-group">
    //             <button type="button" className="btn btn-outline-dark" onClick={showEditor}>Editor</button>
    //             <button type="button" className="btn btn-outline-dark">Errores</button>
    //             <button type="button" className="btn btn-outline-dark">Tabla de simbolos</button>
    //             <button type="button" className="btn btn-outline-dark">AST</button>
    //         </div>
    //     </div>
    // </div>
  );
};
