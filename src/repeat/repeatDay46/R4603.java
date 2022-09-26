package repeat.repeatDay46;

import java.util.List;
import java.util.Map;

public class R4603 {

    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap1 =R4602.mapOlustur1();
        System.out.println(ogrenciMap1);

        R4602.tumVlaueSiraliYazdir1(ogrenciMap1);

        List<String> sinifisimsoyisimListesi1=R4602.isimSyisimListesiOlustur1(ogrenciMap1);
        System.out.println("isim soyisim listesi:"+ sinifisimsoyisimListesi1);



    }


}
