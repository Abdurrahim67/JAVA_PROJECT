package repeat.repeatDay07;

import java.util.Scanner;

public class Q0704 {

    public static void main(String[] args) {

       /* Soru 5) Kullanicidan bir gun alin eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal
        gun" yazdirin. "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin. "Pazar"
        se ekrana "Hiristiyanlar icin kutsal gun" yazdirin

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen bir gün ismi giriniz");
        String gün=scan.next().toLowerCase();

        if(gün=="cuma"){
            System.out.println("müslümanlar icin kutsal gün");
        }else if(gün=="cumartesi"){
            System.out.println("Yahudiler icin kutsal gün");

        }else if(gün=="pazar") {
            System.out.println("Hiristiyanlar icin kutasl gün");
        }


    }
}
