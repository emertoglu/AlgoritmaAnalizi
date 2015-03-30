/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypointerbasedlist;

/**
 *
 * @author BM
 */
public class MyPointerBasedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    LinkedList ll=new LinkedList();
    
    ll.add(5);
    ll.add(15);
    ll.add(25);
    ll.add(35);
    ll.add(45);
    ll.add(55);
    ll.add(65);
    
    ll.add(10, 2);
    
    System.out.println("liste boyutu= "+ll.size());
    System.out.println(""+ll.yaz());
    
    ll.remove(5);
    
    System.out.println();
    System.out.println("liste boyutu= "+ll.size());
    System.out.println(""+ll.yaz());
    
    System.out.println();
    System.out.println("x.(burda x=5) degerini dönderiyor "+ll.get(5));
    }
    
}

