package amortizedcost;

import static java.lang.Math.E;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author aspa
 */
public class AmortizedCost {

    /**
     * @param args the command line arguments
     */
    static int newSize = 1000;
    static int[] dizi = new int[newSize];
    static int i = 0;

    public static void main(String[] args) {
        
        for (i = 0; i < 1001; i++) {

            if (i >= dizi.length) {
                System.out.println("dizi resize edilmeden önceki boyutu :"+i);
                
                int yeniBoyut = i * 2;
                
                int yeniDizi[] = new int[yeniBoyut];

                for (int i = 0; i < dizi.length; i++) {
                    yeniDizi[i] = dizi[i];

                }

                dizi = new int[yeniBoyut];
                for (int i = 0; i < yeniDizi.length; i++) {
                    dizi[i] = yeniDizi[i];

                }
               
            }

            dizi[i] = i;
            System.out.println("dizinin"+(i+1)+". elmani:"+dizi[i]);
        }
       
        System.out.println("dizinin yeni boyutu : "+dizi.length);

    }

}