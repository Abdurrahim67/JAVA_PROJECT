package repeat.repeatDay24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R2405 {

    // Soru 4) Verilen bir array’de istenmeyen harf iceren kelimeleri silip,
    // kalan elementleri yeni bir array yapin

    public static void main(String[] args) {
        String[] isimler = {"ahmet", "kemal", "ali", "veli", "cemil"};
        String istenmeyenHarf = "a";

        List<String> yeniIsimler = new ArrayList<>();

        for (int i = 0; i < isimler.length; i++) {

            if (!isimler[i].contains(istenmeyenHarf)) {

                yeniIsimler.add(isimler[i]);


            }

        }String [] yeniArray=new String[yeniIsimler.size()];

        for (int i = 0; i < yeniArray.length ; i++) {

            yeniArray[i]=yeniIsimler.get(i);

        }

        isimler=yeniArray;
        System.out.println(Arrays.toString(isimler));


    }


}
