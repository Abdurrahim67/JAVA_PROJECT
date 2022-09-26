package repeat.repeatDay10;

import java.util.Scanner;

public class H1001 {
    public static void main(String[] args) {


        //Kullanicidan bir cümle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scan.nextLine().toUpperCase();
        System.out.println("LÜtfen bir harf giriniz");
        char harf = scan.next().toUpperCase().charAt(0);

        if (cümle.indexOf(harf) == -1) {
            System.out.println("Girilen harf cümle icinde yoktur");
        } else {
            System.out.println("Girilen harf cümle icinde vardir");
        }


    }
}