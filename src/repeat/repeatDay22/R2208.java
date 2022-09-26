package repeat.repeatDay22;

import java.util.Scanner;

public class R2208 {
    public static void main(String[] args) {
        /*
        Verilen bir array'den istenen degere esit olan elemanlari kaldırıp,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.
         */

        int [] sayilar={1,2,2,3,4,4,4,5,5,6,7};

        Array(sayilar);

    }

    public static void Array(int[] sayilar) {

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen bir deger giriniz");
        int deger = scan.nextInt();
        int sayac=0;
        int element=0;
        int []yeniArray=new int[sayac];


        for (int i = 0; i < sayilar.length; i++) {
            if (deger!=sayilar[i]) {
                sayac++;
                element=sayilar[i];

            }element=0;

            System.out.println(sayilar[i]);
        }
        for (int i = 0; i <sayac ; i++) {

         //   yeniArray[]

        }



    }}
