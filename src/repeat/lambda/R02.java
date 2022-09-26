package repeat.lambda;

import lambda_functional_programming01.Utils;

import java.util.ArrayList;
import java.util.List;

public class R02 {

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

        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);



    } //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)

    public static void listElemanlariniYazdirFunctional(List<Integer>list) {

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);



    }//2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){

        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)


    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        list.stream().filter(Utils::tekElemenaiSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);


    }


}
