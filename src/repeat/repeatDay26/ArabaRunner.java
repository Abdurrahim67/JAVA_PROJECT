package repeat.repeatDay26;

public class ArabaRunner {

    public static void main(String[] args) {


        Araba araba1 = new Araba();
        araba1.fiyat = 100000;
        araba1.marka = "Mercedes";
        araba1.model = "C Klasse";
        araba1.yil = 2010;

        System.out.println("araba1 bilgileri \nMarka:" + araba1.marka + "\nModel: " + araba1.model
                + "\nYil:" + araba1.yil + "\nFiyat:" + araba1.fiyat);

        Araba araba2 = new Araba("BMW", "5.20", 2011, 15000);

        System.out.println("araba2 bilgileri \nMarka:" + araba2.marka + "\nModel: " + araba2.model
                + "\nYil:" + araba2.yil + "\nFiyat:" + araba2.fiyat);


        Araba araba3 = new Araba("Opel", "Astra", 2015, 78000);
        System.out.println("araba3 bilgileri \nMarka:" + araba3.marka + "\nModel: " + araba3.model
                + "\nYil:" + araba3.yil + "\nFiyat:" + araba3.fiyat);

        Araba araba4 = new Araba("Audi","A5", 2020, 90000);
        System.out.println("araba4 bilgileri \nMarka:" + araba4.marka + "\nModel: " + araba4.model
                + "\nYil:" + araba4.yil + "\nFiyat:" + araba4.fiyat);

    }

}
