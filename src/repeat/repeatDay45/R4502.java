package repeat.repeatDay45;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class R4502 {

    public static void main(String[] args) {

        List<String> liste=new ArrayList<>();

     //    liste.add(5);
       //  liste.add('s');
        // liste.add(true);


        List list=new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("ALi");


        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+"Can"); // String de böyle bir poblem olmadi
        list.set(2,!(Boolean)list.get(2));


        System.out.println(list);

        List <Object>list1=new ArrayList();
        list1.add(5);
        list1.add('s');
        list1.add(true);
        list1.add("ALi");

        System.out.println(list1);

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');

        System.out.println(set1);



    }
}
