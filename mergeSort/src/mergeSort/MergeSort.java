/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeSort;

/**
 *
 * @author aspa
 */
public class MergeSort {

    private int[] list;

    // siralancak listeyi alan inşa fonksiyonu
    public MergeSort(int[] listToSort) {
        list = listToSort;
    }

    // listeyi döndüren kapsülleme fonksiyonu 
    public int[] getList() {
        return list;
    }

    // dışarıdan çağırılan sıralama fonksiyonu
    public void sort() {
        list = sort(list);
    }

    // Özyineli olarak çalışan sıralama fonksiyonu
    private int[] sort(int[] whole) {
        if (whole.length == 1) {
            return whole;
        } else {
            // diziyi ikiye bölüyoruz ve solu oluşturuyoruz
            int[] left = new int[whole.length / 2];
            System.arraycopy(whole, 0, left, 0, left.length);

            //dizinin sağını oluşturuyoruz ancak tek sayı ihtimali var
            int[] right = new int[whole.length - left.length];
            System.arraycopy(whole, left.length, right, 0, right.length);
            //System.out.println("sağ işlem " + right);
            // her iki tarafı ayrı ayrı sıralıyoruz
            left = sort(left);
            right = sort(right);

            // Sıralanmış dizileri birleştiriyoruz
            merge(left, right, whole);

            return whole;
        }
    }

    // birleştirme fonksiyonu
    private void merge(int[] sol, int[] sag, int[] sonuc) {
        int x = 0;
        int y = 0;
        int k = 0;

        // iki dizide de eleman varken
        while (x < sol.length
                && y < sag.length) {
            if (sol[x] < sag[y]) {
                sonuc[k] = sol[x];
                System.out.println("islem yapilan eleman : "+sonuc[k]);
                x++;
            } else {
                sonuc[k] = sag[y];
                y++;
                System.out.println("islem yapilan eleman : "+sonuc[k]);
            }
            k++;
        }

        int[] rest;
        int restIndex;
        if (x >= sol.length) {

            rest = sag;
            restIndex = y;
        } else {

            rest = sol;
            restIndex = x;
        }
k=0;
        for (int i = restIndex; i < rest.length; i++) {
            sonuc[k] = rest[i];
            k++;
            System.out.println("recursive islem yapilan eleman son : "+sonuc[k]);
        }
    }

    public static void main(String[] args) {

        int[] arrayToSort = {15, 19, 4, 3, 18, 6, 2, 12, 7, 9, 11, 16};

        System.out.println("dizinin sıralanmamış hali:");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        MergeSort merge = new MergeSort(arrayToSort);
        merge.sort();

        System.out.println("dizinin sıralanmış hali:");
        int[] sirali = merge.getList();

        for (int i = 0; i < sirali.length; i++) {
            System.out.println(sirali[i] + " ");
        }

    }
}