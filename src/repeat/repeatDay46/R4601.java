package repeat.repeatDay46;

import java.util.*;

public class R4601 {
    public static void main(String[] args) {

    Map<Integer,String> sinifList= new HashMap<>();

    sinifList.put(101,"Ali, Can, JDev");
    sinifList.put(102,"Enes, Cem, Tester");
    sinifList.put(103,"Taha, Emre, Java");
    sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());
        System.out.println(sinifList.size());
        System.out.println(sinifList.values().isEmpty());


        Collection<String> tumValueColl =sinifList.values();
        String [] eachArr;
        int sira=1;

        for (String each:tumValueColl
             ) {
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+"-"+eachArr[0]+" "+eachArr[1]);
            sira++;
        }


        List<String> sinifIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl
             ) {

            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);


        }
        System.out.println(sinifIsimSoyisimList);

    }
}
