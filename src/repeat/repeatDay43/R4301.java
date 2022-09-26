package repeat.repeatDay43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class R4301 {

    public static void main(String[] args) {

        List<Integer> liste2=new ArrayList<>();
        liste2.add(12);
        liste2.add(16);
        liste2.add(19);

        System.out.println(liste2);
        // liste'deki tum elementleri INDEX KULLANMADAN 6 artirin

        for (int each:liste2
             ) {
            each+=6;

            System.out.print(each+" ");

        }
        System.out.println("");
        System.out.println(liste2);

        Iterator it2=liste2.iterator();
        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.next());

      //  System.out.println(it2.next()); baska element olmadigi icin cte verir.

       Iterator it3=liste2.iterator();
        //System.out.println(it3);
        it3.next();
        it3.remove();
        it3.next();
        it3.remove();
        it3.next();
        it3.remove();
        System.out.println(liste2);
        liste2.add(12);
        liste2.add(16);
        liste2.add(19);
        System.out.println(liste2);
        Iterator it4=liste2.iterator();

      while(it4.hasNext()) {
          it4.next();
          it4.remove();
      }
        System.out.println(liste2);




    }
}
