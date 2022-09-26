package repeat.repeatDay21;

import java.util.Arrays;
import java.util.Scanner;

public class R04 {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir array’in boyutunu
        // ve tum elementlerini alarak bir array olusturup,
        // bu array’i bize donduren bir method olusturun

        int[] sayilar = arrayOlusturma();
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayOlusturma() {

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen olusturmak istediginiz Array in uzunlugunu giriniz");
        int uzunluk = scan.nextInt();

        int[] olusturulan = new int[uzunluk];

        for (int i = 0; i < olusturulan.length; i++) {

            System.out.println(i + ". indexin elemnetini giriniz");
            olusturulan[i] = scan.nextInt();


        }


        return olusturulan;
    }

}
