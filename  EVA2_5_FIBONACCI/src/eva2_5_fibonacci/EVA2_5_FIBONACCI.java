/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_fibonacci;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA2_5_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El valor de la posicion 12 es: " + fibonacci(12));
    }
    
    public static int fibonacci(int iPos){
        
         if(iPos == 0)
            return 0;
         
         if(iPos == 1 || iPos == 2)
             return 1;
         
         else
             
            return fibonacci(iPos - 1) + fibonacci(iPos - 2);
        
    }
}
   
