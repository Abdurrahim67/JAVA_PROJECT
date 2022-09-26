package repeat.repeatDay20;

import java.util.Arrays;

public class R01 {

    public static void main(String[] args) {
        int notlar []={30,40,50};
        int sayilar[]=new int [3];


        System.out.println(Arrays.toString(notlar));
        System.out.println(Arrays.toString(sayilar));
        sayilar [1]=10;
        sayilar [2]=20;
        sayilar [0]=30;
        System.out.println(Arrays.toString(sayilar));

        String sinifList []={"ali","ayse","ahmet"};
        System.out.println(Arrays.toString(sinifList));

    sinifList [1]="hasan";
        System.out.println(Arrays.toString(sinifList));

        System.out.println(sinifList[1]);
        System.out.println(sinifList[2]);
        System.out.println(sinifList[0]);

        System.out.println(sinifList.length);
        System.out.println(sinifList[sinifList.length-1]);

        int zahlen []={0,1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(zahlen));

        for (int i = 0; i <zahlen.length ; i++) {
        if(i< zahlen.length-1){
            System.out.print(i+", ");
        }else {
            System.out.print(i);
        }
        }
        System.out.println("");
        for (int i = 0; i < zahlen.length ; i++) {
            System.out.print(i+" ");

        }
    }
}
