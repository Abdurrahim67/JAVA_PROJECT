package repeat.repeatDay11;

public class R1101 {

    public static void main(String[] args) {

        String cümle = "Java ögrenmek COK güzel";

        /* Verilen bir String'de herhangi bir String veya char'in
           ilk kullanildigi index'i bize dondurur
         */

        System.out.println(cümle.indexOf('a')); //1
        System.out.println(cümle.indexOf('ö'));//5
        System.out.println(cümle.indexOf("k")); //12
        System.out.println(cümle.indexOf("cok"));//-1
        System.out.println(cümle.toLowerCase().indexOf("cok"));//14
        System.out.println(cümle.indexOf("e"));// 8
        System.out.println(cümle.toLowerCase().indexOf("j")); //0
        System.out.println(cümle.toUpperCase().indexOf("M")); //10


        // eger istedigimiz index'den sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz

        System.out.println(cümle.indexOf("a", (1 + 1))); //3
        System.out.println(cümle.indexOf("k", (12 + 1))); //-1

        // yukaridaki str'da 2. ve 3. a'nin indexlerini bulun
        // 2.ci a'yi bulabilmek icin 1.a'nin index'ine ihtiyacim var


        int ilka = cümle.indexOf("a");
        int ikincia = cümle.indexOf("a", ilka + 1);
        int ücüncüa = cümle.indexOf("a", ikincia + 1);

        // eger 2. a varsa 3.a'nin olup olmadigini
        // ve varsa index'ini yazdiralim

        if (ikincia == -1) {
            System.out.println("girilen cümlede 2. a yoktur");

        } else {
            if (ücüncüa == -1) {
                System.out.println("girilen cümlede 3. a yoktur");
            } else {
                System.out.println("verilen cümledeki 3. a nin index i: " + ücüncüa);
            }
        }


    }


}
