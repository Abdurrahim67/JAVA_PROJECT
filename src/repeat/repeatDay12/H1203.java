package repeat.repeatDay12;

import java.util.Scanner;

public class H1203 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String isim = scan.nextLine();

        int harfa = isim.indexOf('a');
        int harfZ = isim.indexOf('Z');

        if (!(harfa == -1)) {
            System.out.println("Girdiginiz kelime a harfi iceriyor");
        } else if (!(harfZ ==-1)) {
            System.out.println("Girdiginiz kelime Z harfi iceriyor");

        } else {
            System.out.println("Girdiginiz kelime a veya z harfi icermiyor");
        }


    }
}
