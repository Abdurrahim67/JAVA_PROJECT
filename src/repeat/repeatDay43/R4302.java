package repeat.repeatDay43;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class R4302 {

    public static void main(String[] args) {

        // liste'deki tum elementleri INDEX KULLANMADAN 3 artirin

        List<Integer> liste1 = new ArrayList<>();

        liste1.add(5);
        liste1.add(8);
        liste1.add(11);

        System.out.println(liste1);

        Integer temp;
        ListIterator lit1 = liste1.listIterator();

        while (lit1.hasNext()) {
            temp = (Integer) lit1.next() + 3;
            lit1.set(temp);

        }
        System.out.println(liste1);


        // liste'deki tum elementleri INDEX KULLANMADAN  4 azaltin


        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(25);
        list2.add(30);

        System.out.println(list2);

        ListIterator lit2=list2.listIterator();

        Integer temp2;

        while (lit2.hasNext()) {

            temp2=(Integer)lit2.next()-4;

            lit2.set(temp2);

        }
        System.out.println(list2);


        // liste'deki tum elementleri INDEX KULLANMADAN  5 ile carpin.


        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(25);
        list3.add(30);

        System.out.println(list3);

        ListIterator it3=list3.listIterator();

        Integer temp3;

        while (it3.hasNext()) {

            temp3=(Integer)it3.next()*5;
            it3.set(temp3);

        }
        System.out.println(list3);

    }
}