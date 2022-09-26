package day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;

        System.out.println(sayi1/sayi2);// 4.6 degil 4 --> ikisid e int oldugundan sonucu int olarak

        System.out.println(25*7/3); //58.6666..-->

        double sayi3=5;

        System.out.println(sayi1/sayi3); //  4.6 iki variable nin data türü degisik oldugunda
                                            // daha kapsamli data türü olarak kabul eder


    }




}
