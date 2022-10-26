export class Error {
    tipo: String = '';
    linea: String = '';
    descripcion: String = '';

    constructor({tipo, linea, descripcion}: {tipo: String, linea: String, descripcion: String}){
        const valor = linea;

        /**
         * El Object.assing(), copia todas las propiedades enumerables de uno
         * o mas objetos fuente a un objeto destino. Devuelve el objeto destino
         */
        Object.assign(this, {tipo, linea: valor.toString(), descripcion})
    }
}