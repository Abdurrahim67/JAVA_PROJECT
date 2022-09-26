package repeat.repeatDay07;

import java.util.Scanner;

public class Q0701 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen dikdörtgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        if(kenar1==kenar2){
            System.out.println("Girdiginiz dikdörtgen bir karedir");
        }else {
            System.out.println("Girdiginiz dikdörtgen bir kare degildir");
        }


    }
}
