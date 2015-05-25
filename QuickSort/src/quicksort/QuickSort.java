/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;


/**
 *
 * @author aspa
 */
public class QuickSort {

    public static void quickSort(int[] dizi, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = dizi[(left + right) / 2];

        while (i <= j) {
            while (dizi[i] < pivot) {
                i++;
            }
            while (dizi[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = tmp;
                i++;
                j--;
            }
        };

        if (left < j) {
            quickSort(dizi, left, j);
        }
        if (i < right) {
            quickSort(dizi, i, right);
        }
    }
    
    public static void yaz(int[] dizi){
    
        for(int i=0; i<dizi.length ;i++){
            System.out.print( " "+dizi[i]);
        }
    
    }
    

    public static void main(String[] args) {
        
        int[] dizi = {44, 3, 20, 61, 19, 10, 52, 38, 7,99};
        quickSort(dizi,0,9);
        yaz(dizi);
        System.out.println("");
        
    }

}
