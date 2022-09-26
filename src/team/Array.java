package team;

import java.util.ArrayList;
import java.util.List;

public class Array {

    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */


    public static void main(String[] args) {

        int [] arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        List<Integer> yeniList= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if(!yeniList.contains(arr[i])) {

                yeniList.add(arr[i] );
            }

        }


        System.out.println(yeniList);


    }









}
