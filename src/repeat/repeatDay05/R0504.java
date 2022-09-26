package repeat.repeatDay05;

import java.util.Scanner;

public class R0504 {

    public static void main(String[] args) {
        //  3 basamakli bir sayi isteyin ve rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 3 basamakli bir sayi giriniz ");
        int sayi=scan.nextInt();
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=sayi;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(girilenSayi+" "+"sayisinin rakamlar toplami= "+rakamlarToplami);


    }
}
