package repeat.repeatDay39;

import java.util.Scanner;

public class R3905 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yas giriniz");

        int yas = scan.nextInt();

        try {
            if (yas < 0) {

                throw new IllegalArgumentException();


            } else {
                System.out.println(yas);

            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("yas negatif olamaz");
        }
    }
}