package repeat.repeatDay14;

import day14_methodCreation.C02_MethodCreation;

public class R1403 {

    public static void main(String[] args) {

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim);
        C02_MethodCreation.rakamlariTopla(654);
        R1405.kullaniciAdi();
        R1405.kartNo();

    }
public static void ismiGizle(String isim, String soyisim) {


        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

    System.out.println(isim+" "+soyisim);

}

}
