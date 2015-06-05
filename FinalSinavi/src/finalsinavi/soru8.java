/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalsinavi;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author aspa
 */
public class soru8 {
     public static int [] dizi ;
     
     
    public void olustur(int n) {

        dizi = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(100) + 100;
        }

        for (int a = 0; a < dizi.length; a++) {
            System.out.print(dizi[a] + " ");
        }
        
        System.out.println("");
        System.out.println("DİZİNİN TERSTEN YAZILIŞI");
        for (int a = dizi.length - 1; a >= 0; a--) {
            System.out.print(dizi[a] + " ");
        }

        for (int i = 0; i < dizi.length; i++) {

            if (i >= dizi.length) {
                System.out.println("dizi resize edilmeden önceki boyutu :" + i);

                int yeniBoyut = i * 2;

                int yeniDizi[] = new int[yeniBoyut];

                for (int j = 0; j < dizi.length; j++) {
                    yeniDizi[j] = dizi[j];
                }

                dizi = new int[yeniBoyut];
                for (int k = 0; k < yeniDizi.length; k++) {
                    dizi[k] = yeniDizi[k];
                }
            }
        }
    }
    
     
    public static void main(String[] args) {
        
        
        soru8 s=new soru8();
        
        Scanner klavye = new Scanner (System.in);
        int sayi=klavye.nextInt();
        
        s.olustur(sayi);
        

                
        
        
        
    }

}
