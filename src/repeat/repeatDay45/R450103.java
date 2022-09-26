package repeat.repeatDay45;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class R450103 {

    public static void main(String[] args) {

        List<String> liste =new ArrayList<>();

       // liste.add(5);
       // liste.add('c');
       // liste.add(true);

        System.out.println(liste);

        List<Object> list=new ArrayList<>();

        list.add(5);
        list.add('c');
        list.add(true);
        list.add("Ali");

        System.out.println(list);

        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+" Can");
        list.set(2,!(Boolean)list.get(2));

        System.out.println(list);

        Set<Object> set1=new HashSet<>();

        set1.add(5);
        set1.add(true);
        set1.add('5');

        System.out.println(set1);






    }
}
