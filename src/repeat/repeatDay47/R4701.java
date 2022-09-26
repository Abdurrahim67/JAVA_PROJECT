package repeat.repeatDay47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class R4701 {

    public static void main(String[] args) {


        // Verilen bir String'deki kullanilan harfleri
        // ve kullanilan harflerin tekrar sayisini
        // H = 20 seklinde yazdirin
        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";

        str = str.replaceAll("\\W", "");

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));


        Map<String, Integer> harfKullanimMap = new TreeMap<>();
        Integer harfSayi;
        for (String each: arr
             ) {
            if(!harfKullanimMap.containsKey(each)){

                harfKullanimMap.put(each,1);

            }else {
                harfSayi=harfKullanimMap.get(each);
                harfKullanimMap.put(each,++harfSayi);

            }


        }
        System.out.println(harfKullanimMap);

    }

}
