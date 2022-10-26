"use strict";
/**
 * Aca solo importamos nuestro archivo api.controller.ts
 * ya que ahi se estan controlando todos los endpoints y
 * no se necesita de estar importando de clase en clase.
 */
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const api_controller_1 = __importDefault(require("../controller/api.controller"));
const express_1 = __importDefault(require("express"));
/**
 * Creamos nuestro enrutador
 */
const router = express_1.default.Router();
/**
 * Ya no importamos la clase ni el metodo ping
 * porque ya esta adentro de nuestro archivo api.controller
 * y ya solo se extrae la propiedad que es el ping.
 */
router.get('/ping', api_controller_1.default.ping);
router.get('/parse', api_controller_1.default.parse);
exports.default = router;
