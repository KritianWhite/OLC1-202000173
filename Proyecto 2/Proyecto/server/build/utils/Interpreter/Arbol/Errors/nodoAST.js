"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NodoAST = void 0;
const NodoAST = class NodoAST {
    constructor({ label = 'SIN ETIQUETA', hijos = [], linea = 0 } = {}) {
        this.label = label;
        this.hijos = hijos;
        this.linea = linea;
    }
};
exports.NodoAST = NodoAST;
