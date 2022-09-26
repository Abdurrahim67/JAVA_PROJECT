package repeat.repeatDay46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class R4602 {

      public static Map<Integer, String> mapOlustur1() {


          Map<Integer, String> sinifMap= new HashMap<>();

          sinifMap.put(101,"Ali, Can, JDev");
          sinifMap.put(102,"Enes, Cem, Tester");
          sinifMap.put(103,"Taha, Emre, Java");
          sinifMap.put(104,"Derya, Deniz, Tester");

          return sinifMap;

    }

    public static void tumVlaueSiraliYazdir1(Map<Integer, String> ogrenciMap1) {

          int sira=1;
        for (String each: ogrenciMap1.values()
             ) {
            System.out.println(sira+" - "+ each);
            sira++;

        }

    }

    public static List<String> isimSyisimListesiOlustur1(Map<Integer, String> ogrenciMap1) {

          List <String> methoddakiList=new ArrayList<>();
          String [] eachArr;

        for (String each: ogrenciMap1.values()
             ) {
            eachArr=each.split(", ");

            methoddakiList.add(eachArr[0]+" "+eachArr[1]);
        }

        return methoddakiList;
    }

}

