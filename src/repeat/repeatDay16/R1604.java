package repeat.repeatDay16;

import java.util.Scanner;

public class R1604 {
    public static void main(String[] args) {

         /*
  Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
  1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine "Java" yazdirin.
- Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.

   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 100 den bir kücük sayi giriniz");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("Java Güzeldir"+"\n");

            } else if (i % 3 == 0) {
                System.out.print("Java ");

            } else if (i % 5 == 0) {
                System.out.print("Güzeldir ");
            } else {
                System.out.print(i+" ");

            }


        }
    }
}