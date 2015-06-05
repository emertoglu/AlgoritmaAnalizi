/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalsinavi;

/**
 * 
 * @author aspa
 */
public class soru6 {
    public static int[] dizi;
    int sayac1=0;
    int enbuyuk;
    
    public int  Bul(){
        
        int[] sayac=new int[dizi.length-1]; 
        
       for (int i = 0; i<dizi.length; i++) {
            if (dizi[i] == 0 && dizi[i+1]!=1) {
                sayac1 ++ ;

            }
       }
       
        
       for (int i = 0; i<dizi.length-1; i++) {
            sayac[i]=sayac1;
       }
       
       for (int i = 1; i<dizi.length-1; i++) {
           enbuyuk=dizi[0];
           if(enbuyuk<dizi[i]){
               enbuyuk=dizi[i];
           }
            sayac[i]=dizi[i];
       }
       
        
        
        return enbuyuk ;
        
    }
    
    public static void main(String[] args) {
        dizi=new int[100]; 
        
    }

}
