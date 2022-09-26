package repeat.repeatDay05;

import java.util.Scanner;

public class R0503 {

    public static void main(String[] args) {

        // kullanicidan  4 basamakli bir sayi isteyin ve rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 4 baasamakli  bir sayi giriniz");//5267

        int sayi= scan.nextInt();
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=sayi;

        // suanda sayi 5267 bb 0 rt 0
        birlerBasamagi=sayi%10;//5267
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        // suanda sayi 526  bb7 rt7
        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        // suanda sayi 52 bb 2 rt 13

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        // suanda sayi 5 bb 5 rt 15

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        //suanda sayi 0 bb 0 rt 20

        System.out.println(girilenSayi+" "+"sayisinin rakmalar toplami= "+rakamlarToplami);




    }
}
