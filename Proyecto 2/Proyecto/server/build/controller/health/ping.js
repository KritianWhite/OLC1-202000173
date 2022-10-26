"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ping = void 0;
/**
 * Lo que le estamos diciendo aqui es decirle: Mira yo necesito
 * toda la informacion de mi servidor que tenes guardada dentro
 * del package.json
 */
const { name, version, description } = require('../../../package.json');
/**
 *
 * @param req Requiest: enviar una petición al servidor.
 * @param res Response: recibir la respuesta del servidor.
 *
 * Con un ping no se necesita mandar una peticion hacia la computadora
 * sino solo necesitamos que nos retorne algo
 */
const ping = (req, res) => {
    res.json({
        name,
        description,
        version,
        /**Con el uptime le estamos diciendo que nos diga
         * que en cuanto tiempo se tardo en procesar nuestra
         * solicitud para eso necesitamos tener el proceso y
         * el tiempo de procesamiento.
         */
        uptime: process.uptime()
    });
};
exports.ping = ping;
