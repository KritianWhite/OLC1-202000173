"use strict";
exports.__esModule = true;
exports.Salida = void 0;
var Salida = /** @class */ (function () {
    function Salida() {
        this.lista = [];
    }
    Salida.getInstance = function () {
        if (!Salida.instance) {
            Salida.instance = new Salida();
        }
        return Salida.instance;
    };
    Salida.prototype.push = function (linea) {
        this.lista.push(linea);
    };
    Salida.prototype.clear = function () {
        this.lista = [];
    };
    return Salida;
}());
exports.Salida = Salida;
