package interview_question;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt(), sayi2 = scan.nextInt();

        sayilariTopla(sayi1, sayi2);


    }

    public static void sayilariTopla(int sayi1, int sayi2) {

        int toplam = 0;

        if (sayi1 <= sayi2) {

            for (int i = sayi1; i <= sayi2; i++) {

                toplam += i;

            }
            System.out.println("Girdiginiz iki tamsayinin arasindaki sayilarin toplami: " + toplam);
        } else if (sayi1 > sayi2) {

            for (int i = sayi2; i <= sayi1; i++) {

                toplam += i;

            }
            System.out.println("Girdiginiz iki tamsayinin arasindaki sayilarin toplami: " + toplam);

        }

    }
}
