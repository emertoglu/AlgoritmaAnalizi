/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefibbonacci;

import java.util.Scanner;

/**
 *
 * @author aspa
 */
public class RecursiveFibbonacci {

    /**
     * @param args the command line arguments
     */
    
    
    
    private static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("kacıncı fibbonachi sayısı hesaplansın: ");
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
       
        System.out.println(" Girilen fibbonachi sayısının degeri " +fib(i));
        
    }
    
}
