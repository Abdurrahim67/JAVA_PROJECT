package repeat.repeatDay46;

import java.util.HashMap;
import java.util.Map;

public class R460303 {
    public static void main(String[] args) {

        Map<Integer, String> mapListe = new HashMap<>();
        mapListe.put(101, "Ali, Can, JDev");
        mapListe.put(102, "Enes, Bay, Tester");
        mapListe.put(103, "Erdi, Kara, Jdev");
        mapListe.put(104, "Kerem, Yaz, DevOps");
        mapListe.put(105, "Veli, Pul, Tester");

        //  System.out.println(mapListe);
        //  System.out.println(mapListe.keySet());
        //  System.out.println(mapListe.values());
        //  System.out.println(mapListe.size());


        //  System.out.println(mapListe.containsKey(107));
        //  System.out.println(mapListe.containsValue("Kerem, Yaz, DevOps"));


        //System.out.println(mapListe.entrySet());

       // System.out.println(mapListe.equals(mapListe));


        System.out.println(mapListe.get(102));
        System.out.println(mapListe.get(107));
        System.out.println(mapListe);






    }
}