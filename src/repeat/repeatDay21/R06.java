package repeat.repeatDay21;

import java.util.Arrays;
import java.util.Scanner;

public class R06 {

    public static void main(String[] args) {

        // R05 deki method'u kullanarak array'e eleman ekleyelim

        String[] liste = {"ahmet", "mehmet", "can"};
        String eklencekIsim = "omer";
        liste = R05.isimEkle(liste, eklencekIsim);
        System.out.println(Arrays.toString(liste));


        int kontrol = 0;

        while (kontrol == 10) {
            Scanner scan = new Scanner(System.in);
            System.out.println("LÜtfen eklemek istediginiz ismi giriniz");
            String eklenecekIsim = scan.nextLine();
            liste = R05.isimEkle(liste, eklenecekIsim);
            System.out.println(Arrays.toString(liste));
            kontrol++;

        }

    }
}
