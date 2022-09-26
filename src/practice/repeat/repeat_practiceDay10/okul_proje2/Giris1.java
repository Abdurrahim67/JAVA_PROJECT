package practice.repeat.repeat_practiceDay10.okul_proje2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris1 {


    public static void main(String[] args) {
        System.out.println("hosgeldiniz okulumuza");

        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim=scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();

        scan.nextLine();
        System.out.println("bransinizi giriniz");
        String brans=scan.nextLine();


        System.out.println("telefon  giriniz");
        String tel=scan.nextLine();


        OgretmenBilgileri1 adayOgretmen1=new OgretmenBilgileri1(isim,soyisim,yas,brans,tel);

        List<OgretmenBilgileri1> ogretmenList1=new ArrayList<>();
        ogretmenList1.add(adayOgretmen1);

        System.out.println("ogretmenList1="+ogretmenList1);
    }


}
