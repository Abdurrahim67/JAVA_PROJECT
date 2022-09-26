package practice.practice_Day04;

public class Q04_NestedIfandTernary {

    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {
        int sayi = 10;
        String sonuc = "";
        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 9) {
                sonuc = "dokuz";
            } else if (sayi == 8) {
                sonuc = "sekiz";
            } else if (sayi == 7) {
                sonuc = "yedi";
            } else if (sayi == 6) {
                sonuc = "alti";
            } else if (sayi == 5) {
                sonuc = "bes";
            } else if (sayi == 4) {
                sonuc = "dort";
            } else if (sayi == 3) {
                sonuc = "uc";
            } else if (sayi == 2) {
                sonuc = "iki";
            } else if (sayi == 1) {
                sonuc = "bir";
            } else sonuc = "sifir";
        } else sonuc = "gecersiz";
        System.out.println("sonuc = " + sonuc);

    }
}