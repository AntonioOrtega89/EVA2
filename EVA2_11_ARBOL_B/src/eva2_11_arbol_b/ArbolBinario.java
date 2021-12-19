/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol_b;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class ArbolBinario {
    private Nodo root;
    
    public ArbolBinario() {
        this.root = null; //Arbol vacio
    }
    
    //A PARTIR DE AQUI TODO ES RECURSIVO
    //AGREGAR NODO:
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //VERIFICAMOS SI HAY NODOS EN EL ARBOL
        if(root == null){//ARBOL VACIO
            root = nuevo;
        
        }else{
            //metodo recursivo para agregar nodos 
            addRecu(root, nuevo);
        }
    }
    
    //metodo recursivo (nodo actual, nodo nuevo)
    private void addRecu(Nodo actual, Nodo nuevo){
        //VERIFICAR EL LADO AL QUE VA EL NODO
        if(nuevo.getDato() < actual.getDato()){//IZQ: VALOR NUEVO MENOR QUE NODO ACTUAL
            if(actual.getIzquierda() == null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NODO NUEVO
                actual.setIzquierda(nuevo);
            }else{//llamar de nuevo al metodo recursivo, pero moviendome a la izq
                addRecu(actual.getIzquierda(), nuevo);
                
            }
        }else if(nuevo.getDato() > actual.getDato()){//DRERCHA
            
        
            if(actual.getDerecha()== null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NODO NUEVO
                actual.setDerecha(nuevo);
        }else{
                addRecu(actual.getDerecha(), nuevo);
            }
            
        }else{//VALOR IGUAL AL ACTUAL
                System.out.println("El valor ya existe en el arbol");
                }
            
    }
    
    //IMPRIMIR NODOS DEL ARBOL
    public void printPreOrder(){
        preOrder(root);
        
        
    }
    private void preOrder(Nodo actual){
        if(actual != null){
            System.out.println("{" + actual.getDato() + "}");//visit node
        }
        
    }
    
}
