/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

import ListaEnlazada.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhony
 */
public class Metodos {
    
    public String EscribirNota(Lista lista){
        if(lista.getCabeza()==null){
            return "";
        }        
        Nodo actual;
        for(actual = lista.getCabeza(); actual != null; actual = actual.getSiguiente()){
            if(actual.getNota().equals("DO")){
                actual.setNota("C");
            }else if(actual.getNota().equals("RE")){
                actual.setNota("D");
            }else if(actual.getNota().equals("MI")){
                actual.setNota("E");
            }else if(actual.getNota().equals("FA")){
                actual.setNota("F");
            }else if(actual.getNota().equals("SOL")){
                actual.setNota("G");
            }else if(actual.getNota().equals("SI")){
                actual.setNota("B");
            }else if(actual.getNota().equals("LA")){
                actual.setNota("A");
            }else if(actual.getNota().equals("copiar")){
                actual.setNota(" ");
            }
        }
        return "";
    }
    


    
    public Lista llenarLista(File archivo) {
        Lista listaNotas = new Lista();
        String linea;

        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectorCaracter = new BufferedReader(lector);
            linea = lectorCaracter.readLine();

            while (linea != null) {
                linea = linea.replace(",", "###");
                String ayuda[] = linea.split("###");
                
                if (ayuda.length > 1) {
                    listaNotas.Insertar(ayuda[0], ayuda[1]);
                } else {
                    listaNotas.Insertar("copiar", linea);
                }
                linea = lectorCaracter.readLine();
            }
            this.EscribirNota(listaNotas);
            return listaNotas;

        } catch (java.io.FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado: " + ex.toString());
        } catch (java.io.IOException ioex) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado: " + ioex.toString());
        }
        return null;
    }

    public Lista abrirArchivo() {
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new Filtro("PRT"));
        selector.setDialogTitle("Leer Archivo");
        selector.setFileSelectionMode(0);
        int opcion = selector.showOpenDialog(selector);
        selector.setVisible(true);
        File archivo = selector.getSelectedFile();
        if (JFileChooser.APPROVE_OPTION == opcion) {
            Lista listaNotas = llenarLista(archivo);
            return listaNotas;
        }
        return null;
    }
}
