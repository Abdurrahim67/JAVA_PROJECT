package day40_final;

public abstract class CAbstract {



   /* Abstract class, genellikle ortak ozellikleri olan nesneleri
    tek bir cati altinda toplamak icin kullanilir. ( Hayvanlar alemi, Araba , Ekmek standarti vs..).

    Tum child class'larda olmasini istedigimiz dinamik
    ozellikleri (methods) abstract class'da abstract method
    olarak olustururuz.

    Abstract olmayan (concrete) tum child class'lar abstract
    method'lari override etmek zorundadir. Boylece tum child
    class'lar ayni dinamik ozelliklere (methods) sahip olurlar.

    Standartlari belirler ama kendilerinden obje olusturulamaz.

    Bir Class'i abstract yapmanin yolu basina abstract yazilmasidir.
    Görüntüsü farkli olur.

       */




    void toplama() {

        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();
     /*
     bir method'un basina abstract yazarsaniz
     bu method'un child class'lar icin bir standart oldugunu declare ederiz
     ve method body'sine ihtiyac kalmaz.

     Ya body yada abstract olmali.
     */


    abstract void bolme();

    void cikarma() {
        System.out.println("Bu method cikarma yapar");
    }


}


