/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınsertion.shell;

/**
 *
 * @author aspa
 */
public class InsertionShell {

    /**
     * @param args the command line arguments
     */
    
     //////////////////////////////  INSERTION SORT ALGORITMASI ////////////////////////////////
 
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            diziYaz(array);
        }
    }
    
    private static void diziYaz(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
    
   
    

//////////////////////////////  SHELL SORT ALGORITMASI ////////////////////////////////

    
     public static void shellSort(int array2[]) 
    {
        int increment = array2.length / 2;
        while (increment > 0) 
        {
            for (int i = increment; i < array2.length; i++) 
            {
                int j = i;
                int temp = array2[i];
                while (j >= increment && array2[j - increment] > temp) 
                {
                    array2[j] = array2[j - increment];
                    j = j - increment;
                }
                array2[j] = temp;
            }
            if (increment == 2)
                increment = 1;
            else
                increment *= (5.0 / 11);
            
            diziYaz2(array2);
 
        }
    }
 
    public static void diziYaz2(int[] input2) 
    {
        for (int i = 0; i < input2.length; i++){
            System.out.print(input2[i] + ", ");
        }
        System.out.println("\n");

    }
    
   
    
    public static void main(String[] args) {

        int[] dizi1 = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        diziYaz(dizi1);
        insertionSort(dizi1);
        
        System.out.println("");
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("");
        
        int[] dizi2 = { 40, 2, 9, 6, 23, 12, 34, 0, 1 ,18,29};
        diziYaz(dizi2);
        shellSort(dizi2);
    
    }
    
}
