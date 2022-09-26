package repeat.repeatDay21;

import java.util.Arrays;
import java.util.Scanner;

public class R07 {

    public static void main(String[] args) {


        String[] liste = {"ahmet", "mehmet", "can"};
        Scanner scan = new Scanner(System.in);
        int kontrol = 0;

        while (kontrol < 3) {

            System.out.println("LÜtfen eklemek istediginiz ismi giriniz");
            String eklenecekIsim = scan.nextLine();
            liste = R05.isimEkle(liste, eklenecekIsim);

            kontrol++;

        }
        System.out.println(Arrays.toString(liste));

        for (int i = 0; i < liste.length ; i++) {
            System.out.println((i+1)+"-"+liste[i]);

        }
    }
}
