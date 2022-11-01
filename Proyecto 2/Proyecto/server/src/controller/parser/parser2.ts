import { Response, Request } from "express";
import Errores from '../../utils/Interpreter/Arbol/Errors/error';
import Three from "../../utils/Interpreter/Arbol/Symbol/Three";
import SymbolTable from "../../utils/Interpreter/Arbol/Symbol/SymbolTable";
import { Instruccion } from "../../utils/Interpreter/Arbol/Abstract/Instruccion";





export let listaErrores: Array<Errores> = [];
export const parse2 = (req: Request & unknown, res: Response): void => {

    listaErrores = new Array<Errores>();
    let parser = require('../../utils/Interpreter/Arbol/analizador')

    let data = '';
    let contador = 0;

    req.on("data", (chunk) => {
        data += chunk;
        contador++;
        console.log(contador)
    })

    req.on("end", () => {
        //console.log(data);
        //res.json({ consola: data })
        try {
            console.log("entre al try catch");
            let text = parser.parse(data.toString());
            console.log(typeof text)
            res.json({ consola: text })
        } catch (err) {
            console.log(err);
            res.json({ consola: 'Me dió ansiedad :(', error: err });
        }

    })

}