package practice.practice_Day06;

import java.util.Arrays;

public class Q07_Arrays {

    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String[] arr = {"HeySiri"};
        String kelime = "Heysiri";

        kelime = kelime.replace("Hey", "Bye");

        System.out.println("yeni kelime: " + kelime);

        arr[0] = kelime;

        //String[] arr = new String[1];
        //arr[0] = kelime;

        System.out.println(Arrays.toString(arr));


    }
}
