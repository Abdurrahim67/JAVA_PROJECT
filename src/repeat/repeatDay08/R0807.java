package repeat.repeatDay08;

import java.util.Scanner;

public class R0807 {
    public static void main(String[] args) {

        // kullanicidan ay isimi alin ve mevsimini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();

        if (ay.equals("mart") || ay.equals("nisan") || ay.equals("mayis")) {
            System.out.println("Girdiginiz ay ilkbahar ayi");
        } else if (ay.equals("haziran") || ay.equals("temmuz") || ay.equals("agustos")) {
            System.out.println("Girdiginiz ay yaz ayi");

        } else if (ay.equals("eylül") || ay.equals("ekim") || ay.equals("kasim")) {
            System.out.println("Girdiginiz ay  sonbahar ayi");
        } else if (ay.equals("aralik") || ay.equals("ocak") || ay.equals("subat")) {
            System.out.println("Girdiginiz ay kis ayi");
        } else {
            System.out.println("Lütfen gecerli bir ay ismni giriniz");
        }


    }
}
