package repeat.repeatDay45;

import java.util.*;

public class R450102 {
    public static void main(String[] args) {

        //Verilen bir array'deki tekrar eden elementleri silip
        // tekrarsiz halini Array'e atayan bir kod yaziniz.

        int[] arr = {2, 6, 8, 1, 0, 11, 13, 1, 45, 23, 41, 54, 29};

        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (int each : arr
        ) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet);

        int [] tekrarsizArr=new int[tekrarsizSet.size()];

        int i=0;

        for (int each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(tekrarsizArr));

        arr=tekrarsizArr;

        System.out.println(Arrays.toString(arr));

    }


}
