"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.parse = exports.listaErrores = void 0;
const error_1 = __importDefault(require("../../utils/Interpreter/Arbol/Errors/error"));
const Three_1 = __importDefault(require("../../utils/Interpreter/Arbol/Symbol/Three"));
const SymbolTable_1 = __importDefault(require("../../utils/Interpreter/Arbol/Symbol/SymbolTable"));
const Instruccion_1 = require("../../utils/Interpreter/Arbol/Abstract/Instruccion");
exports.listaErrores = [];
const parse = (req, res) => {
    /*
    listaErrores = new Array<Errores>()
    let parser = require('../../utils/Interpreter/Arbol/analizador')
    
    let data = "";
    let contador = 0;
    
    req.on("data", (chunk) => {
        data += chunk;
        contador++;
        console.log(contador);
    })
    
    req.on("end", () => {
        
        try {
            let ast = new Three(parser.parse(data.toString()));
            //console.log(ast);
            var tabla = new SymbolTable();
            ast.settablaGlobal(tabla);
            for (let i of ast.getinstrucciones()) {
                if (i instanceof Errores){
                    listaErrores.push(i);
                    ast.actualizaConsola((<Errores>i).returnError());
                }
                var resultador = i instanceof Instruccion ? i.interpretar(ast, tabla) : new Errores("ERROR SEMANTICO", "no se puede ejecutar la instruccion", 0, 0);
                if (resultador instanceof Errores){
                    listaErrores.push(resultador);
                    ast.actualizaConsola((<Errores>resultador).returnError());
                }
            }
            res.json({ consola: ast.getconsola(), errores: listaErrores, simbolos: [] });
            //res.end('No me dio Ansiedad xd')
        } catch (err) {
            console.log(err);
            res.json({ consola: 'Me dió ansiedad :(', error: err, errores: listaErrores, simbolos: [] });
            //res.end('Perdon, me dió ansiedad :(');
        }
 
        //console.log(data)
        //res.end(data);
    })*/
    exports.listaErrores = new Array();
    let parser = require('../../utils/Interpreter/Arbol/analizador');
    const { peticion } = req.body;
    try {
        let ast = new Three_1.default(parser.parse(peticion.toString()));
        var tabla = new SymbolTable_1.default();
        ast.settablaGlobal(tabla);
        for (let i of ast.getinstrucciones()) {
            if (i instanceof error_1.default) {
                exports.listaErrores.push(i);
                ast.actualizaConsola(i.returnError());
            }
            var resultador = i instanceof Instruccion_1.Instruccion ? i.interpretar(ast, tabla) : new error_1.default("ERROR SEMANTICO", "no se puede ejecutar la instruccion", 0, 0);
            if (resultador instanceof error_1.default) {
                exports.listaErrores.push(resultador);
                ast.actualizaConsola(resultador.returnError());
            }
        }
        res.json({ consola: ast.getconsola(), errores: exports.listaErrores, simbolos: [] });
    }
    catch (err) {
        console.log(err);
        res.json({ consola: 'Algo ocurrió', error: err, errores: exports.listaErrores, simbolos: [] });
    }
};
exports.parse = parse;
