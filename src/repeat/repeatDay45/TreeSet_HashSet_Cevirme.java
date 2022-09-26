package repeat.repeatDay45;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_HashSet_Cevirme {

    public static void main(String[] args) {


      /*  soru-2:ilk soruya 3. bir islem ekleyelim
        str'i Hashset olarak olusturup elemanlari
        ekleyelim ve sonra TreeSet'e cevirip yazdiralim
        */

        Set<Integer> hash=new HashSet<>();

        hash.add(7);
        hash.add(10);
        hash.add(32);
        hash.add(44);
        hash.add(66);
        hash.add(23);
        hash.add(14);
        hash.add(28);

        System.out.println("hash: "+hash);

        Set<Integer> tree=new TreeSet<>();

        for (int each:hash
             ) {
            tree.add(each);


        }

        System.out.println("tree:"+tree);




    }
}
