package repeat.repeatDay22;

import java.util.Arrays;

public class R2201 {
    public static void main(String[] args) {

        int[][] sayilar = {{1, 2, 3, 4}, {5, 6}};
        int[] sayilar2 = {1, 2, 3, 4};

        System.out.println(sayilar);// [[I@49e4cb85
        System.out.println(Arrays.toString(sayilar));// [[I@2133c8f8, [I@43a25848]
        System.out.println(Arrays.toString(sayilar[0]));// [1, 2, 3, 4]
        System.out.println(Arrays.toString(sayilar[1])); //[5, 6]

        System.out.println(sayilar2);// [I@3ac3fd8b
        System.out.println(Arrays.toString(sayilar2)); // [1, 2, 3, 4]
        System.out.println(sayilar2[0]);//1


        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }


    }
}