import React, { useState } from "react";
import Navbar from "../Components/Navbar";
import Editor2 from "../Components/Editor2";
//import Editor from "../Components/Editor";
import Service from "../Services/Service";



function Index() {
 
    const [value, setValue] = useState("")
    const [response, setResponse] = useState("")

    const changeText = (valueA) => {
        setValue(valueA)
    }

    const handlerPostParse = () => {
        //alert(value)
        Service.parse(value).then(({consola}) => {
            setResponse(consola)
        })
    }

    const handlerClear = () =>{
        setResponse("")
    }

    const buttonTraducir = <button type="button" class="btn btn-dark btn-hola" onClick={handlerPostParse}>Traducir</button>
    //const buttonVivo = <button type="button" class="btn btn-outline-warning" onClick={handlerGetServerInfo}>Traducir</button>
    const buttonLimpiar = <button type="button" class="btn btn-dark btn-hola" onClick={handlerClear}>Limpiar</button>


    return(
        <>
            <Navbar />
            {/* <button type="button" class="btn btn-success btn-run" onClick={handlerPostParse}>►</button> */}

            {/* <Editor text={"Consola de Entrada:"} handlerChange={changeText} comp={buttonTraducir} />
            <Editor text={"Consola de Salida:"} value={response} comp={buttonLimpiar} />  */}

            <Editor2 text={"Consola de Entrada:"} handlerChange={changeText} comp={buttonTraducir} />
            <Editor2 text={"Consola de Salida:"} value={response} comp={buttonLimpiar} />
        </>
    )



}

export default Index;