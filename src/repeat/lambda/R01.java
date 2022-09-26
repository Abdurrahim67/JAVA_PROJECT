package repeat.lambda;

import java.util.ArrayList;
import java.util.List;

public class R01 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);

    }
    //  1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void elemanlariYazdir(List<Integer> liste1) {

        liste1.stream().forEach(t -> System.out.println(t));

        //2) Cift list elemanlarini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

        liste1.stream().filter(t-> t%2==0).forEach(t-> System.out.println(t));
        //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

        liste1.stream().filter(t-> t%2==1).forEach(t-> System.out.println(t));
        //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun


        liste1.stream().distinct().filter(t-> t%2==1).forEach(t-> System.out.println(t));

        //5) Tekrarsız çift elemanlarin karelerinin toplamını hesaplayan bir method oluşturun.

       Integer toplam=liste1.stream().distinct().filter(t-> t%2==0).reduce(0,(t,u)->t+u);
        System.out.println(toplam);



    }

}




