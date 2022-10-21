export const NodoAST = class NodoAST {

    constructor({ label = 'No target', hijos = [], linea = 0} = {}){

        this.label = label;
        this.hijos = hijos;
        this.linea = linea;

    }
}