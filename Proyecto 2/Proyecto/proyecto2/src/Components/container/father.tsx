import React from "react";
import { Cargar } from "../pure/cargar";
import { Editor } from "../pure/editor";
import { Jumbotron } from "../pure/jumbotron";
import { Menu } from "../pure/menu";

export const Father = () => {
  return (
    <div>
      <Jumbotron />
      <div className="container">
        <Menu/>
        <div className="text-left">
            <Editor />
        </div>
        <Cargar/>
      </div>
    </div>
  );
};
