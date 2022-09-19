/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Error_;

import java.io.FileWriter;
import java.util.LinkedList;

/**
 *
 * @author kriti
 */
public class reportErrors {
    
    String inicio = "";
    String fin = "";
    String reporte ="";
    String Lexico = "";
    String sintactico = "";
    
    public void GenerarReporte(LinkedList<Errores> errores, LinkedList<Errores> erroresS){
        Start();
        ReporteLexico(errores);
    }
    
    public void Start(){
        inicio = "<!doctype html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "  	<title>Reporte de Tokens</title>\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                    "\n" +
                    "	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>\n" +
                    "\n" +
                    "	<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                    "	\n" +
                    "	<link rel=\"stylesheet\" href=\"table-07\\css\\style.css\">\n" +
                    "\n" +
                    "	</head>\n" +
                    "	<body>\n" +
                    "	<section class=\"ftco-section\">\n" +
                    "		<div class=\"container\">\n" +
                    "			<div class=\"row justify-content-center\">\n" +
                    "				<div class=\"col-md-6 text-center mb-5\">\n" +
                    "					<h2 class=\"heading-section\">Reporte de Tokens</h2>\n" +
                    "				</div>\n" +
                    "			</div>\n" +
                    "			<div class=\"row\">\n" +
                    "				<div class=\"col-md-12\">\n" +
                    "					<div class=\"table-wrap\">\n" +
                    "						";
        
        fin = "</html>\n" +
                    "\n" +
                    "	<script src=\"js/jquery.min.js\"></script>\n" +
                    "  <script src=\"js/popper.js\"></script>\n" +
                    "  <script src=\"js/bootstrap.min.js\"></script>\n" +
                    "  <script src=\"js/main.js\"></script>\n" +
                    "\n" +
                    "	</body>\n" +
                    "</html>";
    }
    
    public void ReporteLexico(LinkedList<Errores> errores){
    
        Lexico = "<table class=\"table table-bordered table-dark table-hover\">\n" +
            "						  <thead>\n" +
            "						    <tr>\n" +
            "						      <th>Descripcion</th>\n" +
            "						      <th>Lexema</th>\n" +
            "						      <th>Tipo</th>\n" +
            "						      <th>Columna</th>\n" +
            "						      <th>Tipo</th>\n" +
            "						    </tr>\n" +
            "						  </thead>\n" +
            "						  <tbody>";
        
        /*
        for (Errores Error_Lex: errores){
            Lexico += "<tr>";
            Lexico += "<tr>\n" +
                        "<th scope=\"row\">" + Error_Lex.type + "</th>\n" +
                        "<td>" + Error_Lex.message + "</td>\n" +
                        "<td>" + Error_Lex.fila + "</td>\n" +
                        "<td>" + Error_Lex.columna + "</td>\n" +
                        "</tr>";
        }
        */
    }

    
}
