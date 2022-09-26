package repeat.repeatDay17;

import java.util.Scanner;

public class R1708 {

    public static void main(String[] args) {

         /*
          kullanicidan toplanmak uzere sayilar alin
          sayilarin toplami 500'u gecince (500 dahil)
          sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin
          13 sayi girdinz ve toplamlari 567
         */


        Scanner scan = new Scanner(System.in);


        int toplam = 0;
        int sayac = 0;
        int input=0;

        while (toplam < 500) {
            System.out.println("Lütfen toplamak icin sayi giriniz");
            input = scan.nextInt();
            toplam += input;
            sayac++;


        }
        System.out.println(sayac+"  sayi girdiniz ve toplamleri "+toplam);


    }
}
