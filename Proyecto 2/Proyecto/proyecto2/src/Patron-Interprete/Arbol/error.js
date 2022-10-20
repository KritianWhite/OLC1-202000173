"use strict";
exports.__esModule = true;
exports.Error = void 0;
var Error = /** @class */ (function () {
    function Error(_a) {
        var tipo = _a.tipo, linea = _a.linea, descripcion = _a.descripcion;
        // const valor = tipo == 'lexico' ? +linea + 1 : linea;
        var valor = linea;
        Object.assign(this, { tipo: tipo, linea: valor.toString(), descripcion: descripcion });
    }
    return Error;
}());
exports.Error = Error;
