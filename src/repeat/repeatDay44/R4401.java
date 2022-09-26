package repeat.repeatDay44;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class R4401 {

    /*Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …                                         (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
    output: [23,40]



     */
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

        System.out.println(liste);

        ListIterator li1=liste.listIterator();
        int basSinir=20;
        int bitSinir=40;

        while(li1.hasNext()){
            Integer temp=(Integer)li1.next();

            if(temp<basSinir || temp>bitSinir){
                li1.remove();
            }
        }

        System.out.println(liste);
    }




}
