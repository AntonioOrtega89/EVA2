/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UNA LISTA
        LISTA miLista = new LISTA();//creo una lista
       
        /*int[] miArreglo = new int[1000000];
        for (int i = 0; i < miArreglo.length; i++){
            miArreglo[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < 1000000; i++){
            miLista.add(new Nodo(1));
        }*/
        
        miLista.add(100);//0
        miLista.add(200);//1
        miLista.add(300);//2
        miLista.add(400);//3
        miLista.add(500);//4
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        
        System.out.println("\nDespues de insertar ");
        miLista.insertAt(4, 9999);
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        
        System.out.println("\nDepues de borrar ");
        miLista.deleteAt(5);
        miLista.printList();
        
        System.out.println("Conteo: " + miLista.length());
        miLista.add(7777);
        System.out.println("\nDespues de agregar");
        miLista.printList();
        
        System.out.println("\nConteo: " + miLista.length());
        
        for(int i = miLista.length() - 1;i >= 0;i--){
            try{
            System.out.print(miLista.get(i) + " - ");
            } catch (Exception ex){
                ex.printStackTrace();
            }
            }
   }
    
}
   
