import React from "react";

export const Cargar = () => {

    


    return(
        <div className="contenedor-2">
            <div className="input-group">
                <input type="file" multiple={false} className="form-control" />
                <button className="btn btn-outline-secondary" type="button" id="inputGroupFileAddon04">Guardar archivo</button>
            </div>
        </div>
    )

}