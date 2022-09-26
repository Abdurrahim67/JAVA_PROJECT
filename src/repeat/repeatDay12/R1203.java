package repeat.repeatDay12;

public class R1203 {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartno="1234 6589 7458 9658";

        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyisim.substring(5));//fil
        System.out.println(kartno.substring(8));//9 7458 9658

        System.out.println(soyisim.substring(soyisim.length()-3)); //fil
        System.out.println(isim.substring(isim.length()-6)); // leyman

        System.out.println(isim.substring(3,7));//eyma
        System.out.println(soyisim.substring(4,7)); //nfi
        System.out.println(kartno.substring(6,10));//589

        String ilkIsim=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyIsimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kartNum=kartno.substring(0,4);
        String kartNumDanGeriye=" **** **** ****";

        System.out.println(ilkIsim+isimGeriyeKalanlar+" "+soyIsimIlkHarf+soyIsimGeriyeKalanlar+"\n"+kartNum+kartNumDanGeriye);


    }
}
