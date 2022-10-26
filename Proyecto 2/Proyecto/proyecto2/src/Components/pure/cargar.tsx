import React from "react";
import * as fs from 'fs';

export const Cargar = () => {
    
    const readFile = (file: any) => {
        fs.readFile(file, 'utf-8', (err, data) => {
            console.log(data)
        })

    }


    return(
        <div className="contenedor-2">
            <div className="input-group">
                <input type="file" multiple={false} className="form-control" />
                <button className="btn btn-outline-secondary" type="button" id="inputGroupFileAddon04" onChange={readFile}>Guardar archivo</button>
            </div>
        </div>
    )

}