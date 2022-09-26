package repeat.repeatDay10;

import java.util.Locale;

public class R1002 {
    public static void main(String[] args) {


        String str = "Bugün hava günesli";
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        System.out.println(str.toUpperCase(Locale.GERMANY));
        System.out.println(str.toLowerCase(Locale.CHINA));
        System.out.println(str.toUpperCase(Locale.FRANCE));


    }
}