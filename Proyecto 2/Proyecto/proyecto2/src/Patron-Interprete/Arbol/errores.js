"use strict";
exports.__esModule = true;
exports.Errores = void 0;
var Errores = /** @class */ (function () {
    function Errores() {
        this.lista = [];
    }
    Errores.getInstance = function () {
        if (!Errores.instance) {
            Errores.instance = new Errores();
        }
        return Errores.instance;
    };
    Errores.prototype.push = function (error) {
        this.lista.push(error);
    };
    Errores.prototype.clear = function () {
        this.lista = [];
    };
    Errores.prototype.hasErrors = function () {
        return this.lista.length > 0;
    };
    Errores.prototype.getErrors = function () {
        return this.lista;
    };
    return Errores;
}());
exports.Errores = Errores;
