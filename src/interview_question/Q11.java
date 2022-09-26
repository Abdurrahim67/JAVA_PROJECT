package interview_question;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        // Kullanicidan 10 dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel i bulun.
        //orn:(5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 10'dan kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int faktoryel = 1;

        for (int i = sayi; i >= 1; i--) {

            faktoryel *= i;


        }
        System.out.println("Girilen sayinin faktoryel'i: " + faktoryel);


    }
}
