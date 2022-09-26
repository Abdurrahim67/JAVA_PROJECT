package day25_constructor;

public class Car {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir");

    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max" + hiz + "km hiz yapar");

    }
}
