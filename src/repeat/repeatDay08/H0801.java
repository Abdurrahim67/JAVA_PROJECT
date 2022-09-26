package repeat.repeatDay08;

import java.util.Scanner;

public class H0801 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen istedginiz maas miktarini giriniz");
        int maas = scan.nextInt();

        if (maas < 60000) {
            System.out.println("Malesef kabul edemem");
        } else if (maas < 80000) {
            System.out.println("Konusabiliriz");
        } else {
            System.out.println("Kabul ediyorum");
        }


    }
}
