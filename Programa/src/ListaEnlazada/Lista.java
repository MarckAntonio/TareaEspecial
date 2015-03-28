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
public class Lista {
    private Nodo cabeza;
    
    public Lista(){
        cabeza=null;
    }
    
    public void Insertar(String nota, String cuerpo){
        Nodo nuevo= new Nodo(nota,cuerpo);
        
        if(this.getCabeza()==null){
            this.setCabeza(nuevo);
        }else{
            Nodo actual = cabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            actual.setAnterior(actual);
        }
    }
    
    public void Visualizar(){
        Nodo visual;
        for(visual = getCabeza(); visual != null; visual=visual.getSiguiente()){
            System.out.println(visual.getNota() + " " + visual.getCuerpoNota());
        }
    }
    
    public String melodia(){
        Nodo visual;
        String cancion ="";
        for(visual= getCabeza(); visual != null; visual = visual.getSiguiente()){
            cancion = cancion + visual.getNota() + visual.getCuerpoNota();
        }
        return cancion;
}

    /**
     * @return the cabeza
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

}
