import React from "react";
import { Editor } from "../pure/editor";
import { Jumbotron } from "../pure/jumbotron";

export const Father = () => {
  return (
    <div>
      <Jumbotron />
      <div className="container">

        <div>
          <div className="btn-group">
            <button type="button" className="btn btn-outline-dark boton">Editor</button>
            <button type="button" className="btn btn-outline-dark">Errores</button>
            <button type="button" className="btn btn-outline-dark">Tabla de simbolos</button>
            <button type="button" className="btn btn-outline-dark">AST</button>
          </div>
        </div>

        <div className="text-left">
            <Editor />
        </div>
      </div>
    </div>
  );
};
