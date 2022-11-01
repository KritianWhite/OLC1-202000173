import { Response, Request } from "express";
import Errores from '../../utils/Interpreter/Arbol/Errors/error';
import Three from "../../utils/Interpreter/Arbol/Symbol/Three";
import SymbolTable from "../../utils/Interpreter/Arbol/Symbol/SymbolTable";
import { Instruccion } from "../../utils/Interpreter/Arbol/Abstract/Instruccion";



export let listaErrores: Array<Errores> = [];

export const parse = (req: Request & unknown, res: Response): void => {

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

    listaErrores = new Array<Errores>();
    let parser = require('../../utils/Interpreter/Arbol/analizador');
    const { peticion } = req.body;

    try {
        let ast = new Three(parser.parse(peticion.toString()));
        var tabla = new SymbolTable();
        ast.settablaGlobal(tabla);
        for (let i of ast.getinstrucciones()) {
            if (i instanceof Errores) {
                listaErrores.push(i);
                ast.actualizaConsola((<Errores>i).returnError());
            }
            //console.log(i);
            var resultador = i instanceof Instruccion ? i.interpretar(ast, tabla) : new Errores("ERROR SEMANTICO", "no se puede ejecutar la instruccion", 0, 0);
            if (resultador instanceof Errores){
                listaErrores.push(resultador);
                ast.actualizaConsola((<Errores>resultador).returnError());
            }
        }
        res.json({ consola: ast.getconsola(), errores: listaErrores, simbolos: [] });
    } catch (err) {
        console.log(err);
        res.json({ consola: 'Algo ocurrió', error: err, errores: listaErrores, simbolos: [] });
    }


}