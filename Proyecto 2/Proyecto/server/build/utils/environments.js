"use strict";
/**
 * EN LA CARPETA config ES DONDE VAMOS A MANEJAR
 * LOS PUERTOS QUE SE VAN A UTILIZAR
 */
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.PORT = void 0;
const config_1 = __importDefault(require("config"));
exports.PORT = config_1.default.get('PORT');
