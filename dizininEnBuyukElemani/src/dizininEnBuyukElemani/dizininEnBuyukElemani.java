/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizininEnBuyukElemani;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aspa
 */
public class dizininEnBuyukElemani { 
       
        
        private static void elemanBul(int a, int[] dizi)
        {
            int gecici = 0;
            for (int i = 1; i < dizi.length; i++)
            {
                for (int j= 0; j< i; j++)
                {
                    if (dizi[j] > dizi[i])
                    {
                        gecici = dizi[j];
                        dizi[j] = dizi[i];
                        dizi[i] = gecici;
                    }
                }
            }
            //for (int i = 0; i < numbers.Length; i++)
            //    Console.WriteLine(i + ": " + numbers[i]);
            if (a >= 0 && a <= dizi.length){
                System.out.println(a + ".eleman :" + dizi[a]);
            }
            
                
            }
        

        

        private static void EnBuyukSayiBul(int[] dizi)
        {
            int enBuyuk=0;
            
            for (int i = 0; i < dizi.length; i++)
            {
                if (enBuyuk < dizi[i])
                    enBuyuk = dizi[i];

            }
            System.out.println("En buyuk sayi : " + enBuyuk);
            
        }

    public static void main(String[] args) {
           
  
            //int[] numbers = new int[DIFF_NUMBERS + 1];
            //int[] numbers = null ;
            
            int dizi_boyutu = 10000;
            int max_deger_araligi = 1000000;
            
            int[] numbers = new int[dizi_boyutu + 1];
            
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = 0;

            Random rnd = new Random();
            // Sayi uret ve diziye aktar
            for (int i = 0; i < dizi_boyutu; i++)
            {
                numbers[i] = rnd.nextInt(max_deger_araligi);
            }

            // Olusturulan dizi elemanlarını ekrana bas
            for (int i = 0; i < dizi_boyutu; i++)
                System.out.println(i  + ": " + numbers[i]);

            EnBuyukSayiBul(numbers); //dizinin en buyuk elemanini bulan fonksiyon

            
            System.out.println("Kacinci Eleman Bulunsun? :");
            Scanner scn=new Scanner(System.in);
            int a;
            a=scn.nextInt();
            elemanBul(a,numbers);
            System.out.println();

            
        }
}

        
       
 
    

