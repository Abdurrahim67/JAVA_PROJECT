package practice.practice_Day01;

import java.util.Scanner;

public class Q09_Scanner02 {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz :");
        String isim=scan.nextLine();

        System.out.println("memleketiniz :");
        String memeleket=scan.nextLine();

        System.out.println("konumunuz :");
        String konum=scan.nextLine();

        System.out.println("yasiniz :");
        int yas=scan.nextInt();

        System.out.println("boyunuz :");
        double boy=scan.nextDouble();

        System.out.println("yasidiginiz "+konum+" u seviyor musunuz? true/false");
        boolean seviyorMu=scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memeleket = " + memeleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);





    }


}
