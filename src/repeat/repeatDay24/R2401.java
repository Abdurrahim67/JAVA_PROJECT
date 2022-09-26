package repeat.repeatDay24;

import java.util.ArrayList;
import java.util.List;

public class R2401 {

    public static void main(String[] args) {

        String [] isimler={"Selim","Mualla","Emine"};

        List<String>yeniArr=new ArrayList<>();

        for (int i = 0; i < isimler.length ; i++) {

           yeniArr.add(isimler[i]);


        }yeniArr.add("abdurrahim");
        System.out.println(yeniArr);

        Integer [] sayilar={1,2,3,4,};
        List<Integer>yeniSayilar=new ArrayList<>();

        int sayi=0;

        for (int i = 0; i < sayilar.length; i++) {

            yeniSayilar.add(sayilar[i]);


        } yeniSayilar.add(sayi);
        System.out.println(yeniSayilar);


    }
}
