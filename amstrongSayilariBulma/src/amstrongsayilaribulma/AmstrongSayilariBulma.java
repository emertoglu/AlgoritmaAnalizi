/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amstrongsayilaribulma;

/**
 *
 * @author aspa
 */
public class AmstrongSayilariBulma {

    /**
     * @param aspa
     */
    
    
    public void Test(int sayi) {
        int gecici=sayi;
        int birler, onlar, yüzler;
        birler = sayi % 10;
        sayi = sayi / 10;

        onlar = sayi % 10;
        sayi = sayi / 10;

        yüzler = sayi % 10;

        double toplam = Math.pow(yüzler, 3) + Math.pow(onlar, 3) + Math.pow(birler, 3);
        if (gecici ==(int) toplam) {
            System.out.println(gecici+"  SAYISI ARMSTRONG BIR SAYIDIR");
        } 
//        else {
//            System.out.println(gecici+"   ARMSTRONG SAYISI DEĞİLDİR");
//        }
    }

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        AmstrongSayilariBulma a = new AmstrongSayilariBulma();
        a.Test(372);
        
        
        for(int i=100;i<1000;i++){
            a.Test(i);
        }
        
    }
    
}
