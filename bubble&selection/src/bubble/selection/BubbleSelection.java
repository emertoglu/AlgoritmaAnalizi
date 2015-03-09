/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubble.selection;

import static java.lang.System.out;
import java.util.Random;

/**
 *
 * @author BM
 */
public class BubbleSelection {

    /**
     * @param args the command line arguments
     */
    
    
public static int BubbleSort(int [] dizi ,int elemanSayisi)
{
    
    
    
    
    Random rnd = new Random();
    dizi = new int[elemanSayisi];
    for (int i = 0; i < elemanSayisi; i++) {
        dizi[i] = rnd.nextInt();
    }

    int temp;   // Yer değiştirmede kullanılacak geçici değişken
    int bKarsilastirma=0;
    int bYedekleme=0;
    for (int i=1; i<dizi.length; i++)
    {
        for(int j=0; j<dizi.length-i; j++)
        {
            bKarsilastirma +=1;
            
            if (dizi[j] > dizi [j+1])
            {
                temp = dizi [j];
                dizi [j] = dizi [j+1];
                dizi [j+1] = temp;
                
                
                bYedekleme +=1;
                
            }//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
        }// Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
        
        
        
    }// Her karşılaştırmadan sonra yeniden kaldığımız yerden devam etmemizi sağlayan döngü
    System.out.println();
    System.out.println("bubble karsilastirma= " + bKarsilastirma);
    System.out.println(); 
    System.out.println("bubble yedekeleme= "+bYedekleme);
    System.out.println();
    return bYedekleme ;
}
    


public static int SelectionSort(int [] dizi,int elemanSayisi){
         
    Random rnd = new Random();
    dizi = new int[elemanSayisi];
    for (int i = 0; i < elemanSayisi; i++) {
        dizi[i] = rnd.nextInt();
    }
    
    
    int sKarsilastirma=0;
    int sYedekleme=0;
    
    
    
        for (int i = 0; i < dizi.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < dizi.length; j++){
                sKarsilastirma=sKarsilastirma+1;
                if (dizi[j] < dizi[index]){
                    index = j;
      
                int smallerNumber = dizi[index]; 
                dizi[index] = dizi[i];
                dizi[i] = smallerNumber;
                sYedekleme=sYedekleme+1;
                }
            }

        }
        
     System.out.println();
    System.out.println("selection karsilastirma= " + sKarsilastirma);
    System.out.println();
    System.out.println("selection yedekeleme= " + sYedekleme);
    System.out.println();
  
    return 0;
       
    }


    public static void main(String[] args) {


        
        int [] dizi = null ;
         BubbleSort(dizi,500);  
         SelectionSort(dizi,500);
 
    }
    
}
