package day41_abstractClass_Interface;

public abstract class KBmw extends DAraba {

    /*
     BMW abstract bir class'in
     abstract bir child'i oldugu icin
     Parent class'daki abstract method'lari implement etmek ZORUNDA KALMADI

     1- Ya Bmw yi abstract yap kural koyucu ol
     2- Bmw yi conrete yap tüm kurallari uygular, cocuklara mecburiyet kalmaz.


    */
    public abstract void amblem();
    public abstract void guvenlik();



}
