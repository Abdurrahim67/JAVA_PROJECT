package practice.repeat.repeat_practiceDay02;

public class R_Recap07 {

    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        1)   \\d    ==> tum rakamlar
             \\D ==> tum rakam disi character ler
        2)   \\w   ==> A->Z     a->z         0->9    _
             \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
        3)   \\s   ==> space
             \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D", "");// 1399
        str2 = str2.replaceAll("\\D", "");// 1055

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        System.out.println("$"+(num1+num2)/100);
    }
}
