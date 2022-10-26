import { Response, Request } from "express";

export const parse = (req: Request & unknown, res: Response): void => {

    let parser = require('../../utils/Interpreter/Arbol/analizador');
    const { peticion } = req.body;
    try {
        let file = parser.parse(peticion);
        res.json({ console: file });
    } catch (err) {
        console.log(err);
        res.json({ consola: '', error: err});
        
    }

}