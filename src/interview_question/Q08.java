package interview_question;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin


        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen bir String giriniz");
        String str = scan.next();
        System.out.println("Girdiginiz String: " + str);

        strTers(str);


    }

    public static void strTers(String str) {


        String tersStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            tersStr += str.charAt(i);

        }
        System.out.println("Girdiginiz String'in tersten okunusu: " + tersStr);

    }
}
