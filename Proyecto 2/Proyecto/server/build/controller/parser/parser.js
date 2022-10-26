"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.parse = void 0;
const parse = (req, res) => {
    let parser = require('../../utils/Interpreter/Arbol/analizador');
    const { peticion } = req.body;
    try {
        let file = parser.parse(peticion);
        res.json({ console: file });
    }
    catch (err) {
        console.log(err);
        res.json({ consola: '', error: err });
    }
};
exports.parse = parse;
