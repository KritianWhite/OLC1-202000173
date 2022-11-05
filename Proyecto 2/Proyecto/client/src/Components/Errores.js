import React from "react";

export default function Errores(props) {

  return (
    <>
      <div className="container">
        <table class="table table-dark table-striped">
          <thead>
            <tr>
              <th scope="col">Tipo</th>
              <th scope="col">Descripcion</th>
              <th scope="col">Fila</th>
              <th scope="col">Columna</th>
            </tr>
          </thead>
          <tbody>
            {props.valor.map((value, index) => {
              return (
                <tr key={index}>
                  <th>{value.tipo}</th>
                  <td>{value.descripcion}</td>
                  <td>{value.linea}</td>
                  <td>{value.columna}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
}
