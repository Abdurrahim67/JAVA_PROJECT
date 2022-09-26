package repeat.repeatDay46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class R46004 {

    public static void main(String[] args) {

        System.out.println(tekrarsizList("Hellooo"));


    }

    public static List <String> tekrarsizList(String str) {

        List<String>liste= new ArrayList<>();

        HashMap <String,Integer> map=new HashMap<>();

        String [] arr=str.split("");

        for (String w: arr
             ) {
            map.computeIfPresent(w, (key, value)-> value+1);
            map.computeIfAbsent(w, k->1);

        }
        System.out.println(map);

        for (Map.Entry<String, Integer> w: map.entrySet()
             ) {
            if(w.getValue()==1) {
                liste.add(w.getKey());
            }

        }return liste;



    }
}
