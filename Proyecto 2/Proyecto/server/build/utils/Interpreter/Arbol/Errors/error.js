"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Error = void 0;
class Error {
    constructor({ tipo, linea, descripcion }) {
        this.tipo = '';
        this.linea = '';
        this.descripcion = '';
        const valor = linea;
        /**
         * El Object.assing(), copia todas las propiedades enumerables de uno
         * o mas objetos fuente a un objeto destino. Devuelve el objeto destino
         */
        Object.assign(this, { tipo, linea: valor.toString(), descripcion });
    }
}
exports.Error = Error;
