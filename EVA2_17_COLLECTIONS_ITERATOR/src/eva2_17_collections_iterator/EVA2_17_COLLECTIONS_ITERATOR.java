/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_collections_iterator;

import java.util.Iterator;
import java.util.LinkedList;


/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA2_17_COLLECTIONS_ITERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        //ITERATOR: iterator --> recorre elemnto x elemento almacenado
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){//hay un nodo sigiente?
            int iVal = (int)iterator.next();
            System.out.println("{" + iVal + "}");
            
        }
        
        
    }
    
}
