package repeat.repeatDay38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class R3803 {
    public static void main(String[] args) {


        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenSira = 0;

        try {
            istenenSira = scan.nextInt();
        } catch (InputMismatchException deneme) {
           System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            System.out.println(deneme);
        }


        System.out.println("");

        }
    }