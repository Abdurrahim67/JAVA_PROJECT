package repeat.repeatDay46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class R460101 {
    public static void main(String[] args) {

        System.out.println(harfSayilariBul("Hheeellooooo"));


    }

    public static TreeMap<String, Integer> harfSayilariBul(String str) {

        TreeMap<String, Integer> map1 = new TreeMap<>();

        String[] arr1 = str.split("");
        System.out.println(Arrays.toString(arr1));

        for (String w : arr1) {

            if (!map1.containsKey(w)) {

                map1.put(w, 1);


            } else {
                map1.put(w, map1.get(w) + 1);
            }

        }


        return map1;


    }
}
