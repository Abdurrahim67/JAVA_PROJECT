package questions_varargs;

public class varargs2 {

//  1 String ve 3 Integer parametreli,
//  1 String ve 6 Integer parametreli,
 // 1 String ve 4 Integer parametreli ayri ayri 3 tane method olusturun  ve bunlari yazdirin.(Vararg ile)

    public static void main(String args[]) {

        stringVeInteger("Deutschland", 100, 200,300);
        stringVeInteger("Mönchengladbach", 1, 2, 3, 4, 5,6);
        stringVeInteger("Bayern München",10,20,40,90,65,58);
    }


    static void stringVeInteger(String str, int... sayi) {
        System.out.println("String: " + str);
        System.out.println("Argument sayisi: "
                + sayi.length);


        for (int each : sayi)
            System.out.print(each + " ");

        System.out.println();


    }
}