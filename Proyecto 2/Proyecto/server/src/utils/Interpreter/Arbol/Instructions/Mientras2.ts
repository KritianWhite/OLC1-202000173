import { Instruccion } from '../Abstract/Instruccion';
import Arbol from '../Symbol/Three';
import tablaSimbolo from '../Symbol/SymbolTable';
import Tipo, { DataType } from '../Symbol/Type';
import SymbolTable from '../Symbol/SymbolTable';
import cloneDeep from 'lodash/cloneDeep';

export default class Mientras extends Instruccion {
    private operacion: Instruccion;
    private listaInstrucciones: Instruccion[];

    constructor(
        operacion: Instruccion,
        listaInstrucciones: Instruccion[],
        linea: number,
        columna: number
    ) {
        super(new Tipo(DataType.INDEFINIDO), linea, columna);
        this.operacion = operacion
        this.listaInstrucciones = listaInstrucciones
    }

    public interpretar(arbol: Arbol, tabla: tablaSimbolo) {
        
            while(cloneDeep(this.operacion).interpretar(arbol, tabla)){
                let tablaLocal = new SymbolTable(tabla);
                for(let inst of this.listaInstrucciones){
                    let ret = inst.interpretar(arbol, tabla);
                }
                return null
            }
    }
}