export const NodoAST = class NodoAST {

    label: String;
    hijos: String[];
    linea: number;

    constructor({ label = 'SIN ETIQUETA', hijos = [], linea = 0} = {}) {
      this.label = label;
      this.hijos = hijos;
      this.linea = linea;
    }

}