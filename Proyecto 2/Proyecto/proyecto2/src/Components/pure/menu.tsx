import React from "react";

export const Menu = () => {

    return (
        <div className="container contenedor">
            <div >
                <button type="button" className="btn btn-outline-secondary boton" style={{margin: "10px"}}>Editor</button>
                <button type="button" className="btn btn-outline-secondary boton" style={{margin: "10px"}}>Errores</button>
                <button type="button" className="btn btn-outline-secondary boton" style={{margin: "10px"}}>Tabla de simbolos</button>
                <button type="button" className="btn btn-outline-secondary boton" style={{margin: "10px"}}>AST</button>
            </div>
        </div>
    )
}