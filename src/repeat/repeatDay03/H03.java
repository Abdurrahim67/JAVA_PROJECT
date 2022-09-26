package repeat.repeatDay03;

import java.util.Scanner;

public class H03 {

    public static void main(String[] args) {

        /* kullanicidan yaricap isteyip cemberin cevresini ve
         dairenin alanini hesaplayip yazdirin

          */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen cemberin yaricapini giriniz");

        double yaricap=scan .nextDouble();

        double alan=3.14*yaricap*yaricap;
        double cevre=2*yaricap*yaricap;
        System.out.println("Girdiginiz dairenin alani= "+alan);
        System.out.println("Girdiginiz dairenin cevresi= "+cevre);

    }
}
