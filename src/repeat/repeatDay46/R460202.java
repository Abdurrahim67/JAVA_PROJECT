package repeat.repeatDay46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class R460202 {

    public static void main(String[] args) {

        Map<Integer, String> mapListe = new HashMap<>();
        mapListe.put(101, "Ali, Can, JDev");
        mapListe.put(102, "Enes, Bay, Tester");
        mapListe.put(103, "Erdi, Kara, Jdev");
        mapListe.put(104, "Kerem, Yaz, DevOps");
        mapListe.put(105, "Veli, Pul, Tester");

        System.out.println(mapListe);
        System.out.println(mapListe.keySet());
        System.out.println(mapListe.values());
        System.out.println(mapListe.size());

        String istenenBrans="Tester";
        System.out.println(testerBilenler(mapListe, istenenBrans));


    }

   public static List<String> testerBilenler(Map<Integer, String> mapListe,String istenenBrans ) {

        List<String> isimListe=new ArrayList<>();

       for (String w:mapListe.values()) {

           String [] arr=w.split(", ");
           if(arr[2].equalsIgnoreCase(istenenBrans) ) {

               isimListe.add(arr[0]);
           }

  }

return isimListe;
 }
}
