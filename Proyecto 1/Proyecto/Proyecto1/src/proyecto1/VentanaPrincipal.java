/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Analizadores.Analizador_Lexico;
import Analizadores.Analizador_Sintactico;
import Analizadores.Lexer;
import Analizadores.parser;
import Error_.Errores;
import Error_.reportErrors;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import Arbol.*;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import proyecto1.NumeroLinea;
/**
 *
 * @author kriti
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    NumeroLinea numeroLinea;

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        numeroLinea = new NumeroLinea(jTextArea1);
        jScrollPane1.setRowHeaderView(numeroLinea);
    }
    reportErrors reporte = new reportErrors();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        viewGolang = new javax.swing.JButton();
        viewPython = new javax.swing.JButton();
        Run = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        flowChart = new javax.swing.JMenuItem();
        AST = new javax.swing.JMenuItem();
        Errors = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        userManual = new javax.swing.JMenuItem();
        technicalManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        viewGolang.setText("View code Golang");
        viewGolang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGolangActionPerformed(evt);
            }
        });

        viewPython.setText("View code Python");
        viewPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPythonActionPerformed(evt);
            }
        });

        Run.setText("Run");
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        openFile.setText("Open file");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setText("Save file");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Report");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        flowChart.setText("Flowchart");
        flowChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowChartActionPerformed(evt);
            }
        });
        jMenu2.add(flowChart);

        AST.setText("Abstrac Sintac Tree");
        AST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASTActionPerformed(evt);
            }
        });
        jMenu2.add(AST);

        Errors.setText("Errors");
        Errors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorsActionPerformed(evt);
            }
        });
        jMenu2.add(Errors);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        userManual.setText("User manual");
        userManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManualActionPerformed(evt);
            }
        });
        jMenu3.add(userManual);

        technicalManual.setText("Technical manual");
        technicalManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicalManualActionPerformed(evt);
            }
        });
        jMenu3.add(technicalManual);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Clear)
                        .addGap(45, 45, 45)
                        .addComponent(Run))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewGolang, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(viewPython, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Run)
                    .addComponent(Clear))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewGolang, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(viewPython, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        leerArchivo();
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
        saveHow();
    }//GEN-LAST:event_saveFileActionPerformed

    private void flowChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowChartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flowChartActionPerformed

    private void viewGolangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGolangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewGolangActionPerformed

    private void viewPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPythonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPythonActionPerformed

    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed
        if (jTextArea1.getText() != null) {
            try {
                analizadorLexico();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se detecto ningun texto, cargue un archivo o escriba en el area de texto.");
        }
    }//GEN-LAST:event_RunActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void ASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASTActionPerformed
        // TODO add your handling code here:
        Nodo raiz = null;

        try {
            Analizador_Sintactico sintactico = new Analizador_Sintactico(new Analizador_Lexico(new BufferedReader(new StringReader(jTextArea1.getText()))));
            sintactico.parse();
            raiz = sintactico.getRaiz();
            System.out.println("Generando arbol sintactico..!");
            

        } catch (Exception ex) {
            Logger.getLogger(Proyecto1.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (raiz != null) {
            Arbol arbolito = new Arbol(raiz);
            arbolito.GraficarSintactico();
            
        }
        JOptionPane.showMessageDialog(null, "Analizado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        abrirArchivos("Arbol_Sintactico.svg");
    }//GEN-LAST:event_ASTActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void ErrorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorsActionPerformed
        reportarErrors();
        abrirArchivos("Reporte errores.html");
    }//GEN-LAST:event_ErrorsActionPerformed

    private void userManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManualActionPerformed
        // TODO add your handling code here:
        abrirArchivos("C:\\Users\\kriti\\OneDrive\\Documents\\GitHub\\OLC1-202000173\\Proyecto 1\\Documentacion\\Manual usuario.pdf");
    }//GEN-LAST:event_userManualActionPerformed

    private void technicalManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technicalManualActionPerformed
        // TODO add your handling code here:
        abrirArchivos("C:\\Users\\kriti\\OneDrive\\Documents\\GitHub\\OLC1-202000173\\Proyecto 1\\Documentacion\\Manual tecnico.pdf");
    }//GEN-LAST:event_technicalManualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public void leerArchivo() {

        // Cargando archivo
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);

        // Leendo archivo
        String text = "";
        int c = 0;
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File file = new File(ruta);
            entrada = new Scanner(file);
            while (entrada.hasNext()) {
                if (c > 0) {
                    text += "\n";
                }
                text += entrada.nextLine();
                c += 1;
            }

            //Mostrando en el textArea1
            jTextArea1.setText(text);
            Proyecto1.ruta = ruta;

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            jTextArea1.setText("");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            //jTextArea1.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            jTextArea1.setText("");
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }

    }

    private void analizadorLexico() throws Exception {
        String text2 = (String) jTextArea1.getText();
        Analizador_Lexico lexico = new Analizador_Lexico(new StringReader(text2));
        Analizador_Sintactico sintactico = new Analizador_Sintactico(lexico);
        sintactico.parse();
        //System.out.println(text2);
    }

    private void saveHow() {
        JFileChooser save = new JFileChooser();
        save.showSaveDialog(null);
        save.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        File file = save.getSelectedFile();
        saveFile(jTextArea1.getText(), file);
    }

    private void saveFile(String cadena, File file) {
        FileWriter write;
        try {
            write = new FileWriter(file, true);
            write.write(cadena);
            write.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, ingrese el nombre que le desea dar al archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
        }
    }

    private void reportarErrors() {

        //Analizador_Lexico lexico;
        //Analizador_Sintactico sintactico;
        if (jTextArea1.getText() != null) {

            try {
                Boolean Errores = false;

                String text2 = (String) jTextArea1.getText();
                Analizador_Lexico lexico = new Analizador_Lexico(new StringReader(text2));
                Analizador_Sintactico sintactico = new Analizador_Sintactico(lexico);
                sintactico.parse();

                if (lexico.errores.size() > 0 || sintactico.errores.size() > 0) {
                    if (lexico.errores.size() > 0) {
                        System.out.println("--------------ERRORES LEXICOS------------");
                        for (Errores errore : lexico.errores) {
                            System.out.println(errore.toString());
                        }
                    }
                    if (sintactico.errores.size() > 0) {
                        System.out.println("------------------ERRORES SINTACTICOS------------------");
                        for (Errores errore : sintactico.errores) {
                            System.out.println(errore.toString());
                        }
                    }
                    Errores = true;
                } else {
                    System.out.println("No se detectaron errores..");
                    Errores = false;
                }
                System.out.println("Generando reporte de errores....");
                reporte.GenerarReporte(lexico.errores, sintactico.errores);
                // incluuir aca reporte de errores
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se detecto ningun texto, cargue un archivo o escriba en el area de texto.");
        }
    }

    private void abrirArchivos(String nombre) {
        try {
            File file = new File(nombre);
            if (!Desktop.isDesktopSupported()) {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                System.out.println("Abriendo archivo.");
            }
            desktop.open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AST;
    private javax.swing.JButton Clear;
    private javax.swing.JMenuItem Errors;
    private javax.swing.JButton Run;
    private javax.swing.JMenuItem flowChart;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem technicalManual;
    private javax.swing.JMenuItem userManual;
    private javax.swing.JButton viewGolang;
    private javax.swing.JButton viewPython;
    // End of variables declaration//GEN-END:variables
}
