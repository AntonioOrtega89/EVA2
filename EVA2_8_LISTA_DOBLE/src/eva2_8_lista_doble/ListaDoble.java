/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_lista_doble;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class ListaDoble {
     private Nodo inicio;//ACCESO A MI LISTA
    private Nodo fin;
    private int tama;//Contador de nodos

    public ListaDoble() {
        inicio = null; //LISTA VACIA
        fin = null;
        tama = 0;
    }
    
    //AGREGAR NODOS
    public void add(int valor){//O(1)
        Nodo nuevo = new Nodo(valor);
        
     
        if(inicio == null){ //LISTA VACIA
            inicio = nuevo; //conectamos el primer nodo a la lista
            fin = nuevo;
            }else{ //LISTA CON NODOS
            
             fin.setSiguiente(nuevo);
             nuevo.setPrevio(fin);
             fin = nuevo;//NOS MOVEMOS AL FINAL DE LA LISTA
        }
        tama++;
    }
    
    
}
