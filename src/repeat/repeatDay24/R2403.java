package repeat.repeatDay24;

import java.util.ArrayList;
import java.util.List;

public class R2403 {

    public static void main(String[] args) {

        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] sayilar = {6, 10, 23, 5, 0, 3, 23, 0, 23, 0, 9, 9};

        List<Integer> tekrarSayilar = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {

                if (sayilar[i] == sayilar[j] && !tekrarSayilar.contains(sayilar[i])) {
                    tekrarSayilar.add(sayilar[i]);
                    System.out.print(sayilar[i]+" ");

                }

            }

        }
        System.out.println();
        System.out.println(tekrarSayilar);


    }
}
