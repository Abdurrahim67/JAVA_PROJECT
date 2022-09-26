package team;

import java.util.Arrays;
import java.util.List;

public class Array7 {
   /* Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
            Array: [12,15,43,23,56,76,78,90,77,43]
    Aranan değer:56
    Beklenen Çıktı:
            56 sayısı arrayin 4. indexi


    */


    public static void main(String[] args) {

        int input=56;

        Integer[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(input+" sayisi  arrayin "+list.indexOf(input)+".indexi");

    }


}
