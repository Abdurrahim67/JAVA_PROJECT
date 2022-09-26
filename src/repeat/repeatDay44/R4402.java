package repeat.repeatDay44;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class R4402 {

    // Soru 4) Bir listedeki elementleri iterator kullanarak
    // sondan basa dogru yazdirin

    public static void main(String[] args) {

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(3);
        liste.add(6);
        liste.add(10);
        liste.add(16);
        liste.add(27);
        liste.add(50);
        liste.add(44);
        liste.add(36);
        liste.add(41);

        ListIterator li1= liste.listIterator();
        System.out.println(liste);

        while(li1.hasNext()) {
            li1.next();
        }
            while (li1.hasPrevious()){

                System.out.print(li1.previous()+" ");

            }

        }
  }

