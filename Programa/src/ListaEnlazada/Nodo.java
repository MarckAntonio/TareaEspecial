/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaEnlazada;

/**
 *
 * @author Juande
 */
public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private String nota;
    private String cuerpoNota;

    public Nodo(String nota, String cuerpoNota) {
        this.nota = nota;
        this.cuerpoNota = cuerpoNota;
    }
    
    

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return the cuerpoNota
     */
    public String getCuerpoNota() {
        return cuerpoNota;
    }

    /**
     * @param cuerpoNota the cuerpoNota to set
     */
    public void setCuerpoNota(String cuerpoNota) {
        this.cuerpoNota = cuerpoNota;
    }
    
}
