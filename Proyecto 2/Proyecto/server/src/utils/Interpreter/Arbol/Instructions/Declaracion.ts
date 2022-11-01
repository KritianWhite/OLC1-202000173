import { Instruccion } from "../Abstract/Instruccion";
import Three from "../Symbol/Three";
import Symbol from "../Symbol/Symbol";
import SymbolTable from "../Symbol/SymbolTable";
import Type, { DataType } from "../Symbol/Type";

export default class Declaracion extends Instruccion{
    private id: String;
    private tipo: Type;
    private valor: Instruccion;

    constructor(id: String, tipo: Type, valor: Instruccion, linea: number, columna: number){
        super(new Type(DataType.INDEFINIDO), linea, columna);
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public interpretar(arbol: Three, tabla: SymbolTable) {
        tabla.setValor(this.id, new Symbol(this.tipo, this.id, this.valor.interpretar(arbol, tabla)));
        return null;
    }

}