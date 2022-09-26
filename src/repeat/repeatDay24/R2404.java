package repeat.repeatDay24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R2404 {
    public static void main(String[] args) {

        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun


        int[] sayilar = {1, 2, 2, 6, 9, 9, 3, 3, 3, 8};

        int [] tekrarsizArray = tekrarsizSayilarMethodu(sayilar);
        System.out.println(Arrays.toString(tekrarsizArray));


    }

    public static int[] tekrarsizSayilarMethodu(int[] sayilar) {

        List<Integer> yeniListe = new ArrayList<>();

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length-1; i++) {
            if (sayilar[i] != sayilar[i + 1]) {

                yeniListe.add(sayilar[i]);

            }

        } if(!yeniListe.contains(sayilar[sayilar.length-1])){

            yeniListe.add(sayilar[sayilar.length-1]);

        } int [] yeniArray=new int[yeniListe.size()];

        for (int i = 0; i < yeniArray.length ; i++) {
            yeniArray[i]=yeniListe.get(i);

        }
           return yeniArray;
        }


}
