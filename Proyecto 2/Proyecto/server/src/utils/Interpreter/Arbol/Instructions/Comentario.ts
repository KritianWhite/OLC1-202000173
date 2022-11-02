import { Instruccion } from '../Abstract/Instruccion';
import Arbol from '../Symbol/Three';
import Simbolo from '../Symbol/Symbol';
import tablaSimbolo from '../Symbol/SymbolTable';
import Tipo, {DataType} from '../Symbol/Type';

export default class Comentario extends Instruccion {
    private valor: Instruccion;

    constructor(valor: Instruccion, linea: number, columna: number) {
        super(new Tipo(DataType.INDEFINIDO), linea, columna);
        this.valor = valor;
    }

    public interpretar(arbol: Arbol, tabla: tablaSimbolo) {
        //const valorToAsign = this.valor.interpretar(arbol, tabla);
        tabla.setValor('COMENTARIO', new Simbolo(this.valor.tipoDato, 'COMENTARIO', this.valor.interpretar(arbol, tabla)), false);
        return null;
    }
}