"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const dotenv_1 = __importDefault(require("dotenv"));
const environments_1 = require("./utils/environments");
const app_1 = __importDefault(require("./app"));
dotenv_1.default.config();
/**
 * Para obtener la promesa debemos de usar un .then
 * para que cuando termine decirle retorna una variable
 * del tipo de aplicacion (app: typeof application) y en
 * base a esta app yo necesito que hagas algo ( => {} )
 */
(0, app_1.default)().then((app) => {
    /**
     * Necesitamos que cuando ya este activo empiece a escuchar
     * y le vamos a decir que nos de señales de vida :v
     */
    app.listen(environments_1.PORT, () => {
        console.log(`Server ready on PORT ${environments_1.PORT} ${process.env.NODE_ENV}`);
    });
})
    /**
     * Ahora necesitamos que nos otorge las promesas y utilizamos
     * un .catch para decirle que mientras se estaba instanciando
     * nuestro servidor necesito que me lo hagas saber.
     */
    .catch((err) => console.log(err));
