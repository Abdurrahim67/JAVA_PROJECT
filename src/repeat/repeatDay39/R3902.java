package repeat.repeatDay39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class R3902 {
    public static void main(String[] args) {

        int k;

        try {
            FileInputStream fis1 = new FileInputStream("src/repeat/repeatDay39/Test01.txt");

            while ((k = fis1.read()) != -1) {

                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya bulunamadi ");


        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        }
    }
}