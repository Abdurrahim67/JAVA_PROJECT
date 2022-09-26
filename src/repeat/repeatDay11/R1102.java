package repeat.repeatDay11;

public class R1102 {

    public static void main(String[] args) {

        String cümle = "Java cok kolay, Java cok güzel";

        String kelime = "kolay";

        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */

        int kelimeIlkIndex = cümle.indexOf(kelime);
        int kelimeSonIndex = cümle.lastIndexOf(kelime);

        if (kelimeIlkIndex == -1) {
            System.out.println("verilen kelime cümle icinde kullanilmamis");
        } else if (kelimeIlkIndex == kelimeSonIndex) {

            System.out.println("verilen kelime cümlede sadece bir defa kullanilmis");
        } else {
            System.out.println("verilen kelime cümlede birden fazla kullanilmis");


        }


    }
}
