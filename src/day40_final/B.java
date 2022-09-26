package day40_final;

final public class B extends A {


    public static void main(String[] args) {
        B obj = new B();
        obj.isim = "Alp"; //

        System.out.println(A.OKUL);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez.
         */


      /*  Özet;
        final Variable---> Degeri degistirilmeyecek(constat) variable'lar icin kullanilir,
                           mutlaka deger atanmalidir, isimleri buyuk harfle yazilir(optinal)

        final Methods---> Override edilemeyecek method demektir.

        final Classes---> Inherit edilemeyecek class demektir.

        Ek olarak;

        finally kod blogu: try veya try-catch bloklari ile kullanilir.Try_catch'in sonucu ne olursa olsun calisir.
                           Genellikle database veya cloud ile connection 'in sonlandirilmasi,
                           calisan file'in kapanmasi gibi islemler yapar.

        finalize method : garbage collector kullanilmayan objeleri destroy etmeden once kullanir.
                            Calismasina biz karismayiz, garbage collector onu kendisi ayarlar..





       */

        }


    }





