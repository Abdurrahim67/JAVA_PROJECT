package repeat.repeatDay07;

import java.util.Scanner;

public class Q0703 {
    public static void main(String[] args) {

           /*Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
          birbirine esit ise ekrana "Eskenar ucgen" yazdirin. Diger durumlarda ekrana
            "Eskenar degil" yazdirin.

         */

        Scanner scan=new Scanner (System.in);
        System.out.println("Lütfen ücgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if( (kenar1==kenar2) && (kenar2==kenar3 )) {
            System.out.println("Girdiginiz ucgen eskenar ücgendir");
        }else {
            System.out.println("Girdiginiz ucgen eskenar degildir");



        }






    }





}