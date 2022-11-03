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
                  <th>{value.tipoError}</th>
                  <td>{value.desc}</td>
                  <td>{value.fila}</td>
                  <td>{value.Columna}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
}
