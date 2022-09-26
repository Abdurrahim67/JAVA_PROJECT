package repeat.repeatDay03;

import java.util.Scanner;

public class H02 {

    public static void main(String[] args) {

        /* Kullanicidan karenin bir kenarinin uzunlugunu alin
        ve karenin cevresini ve alanini hesaplayip yazdirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfenin karenin uzunlugunu giriniz");

        double kenar=scan.nextDouble();
        double alan=kenar*kenar;

        System.out.println("Girdiginiz karenin alani= "+alan);


    }
}
