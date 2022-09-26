package questions_varargs;

public class varargs1 {


    // Argument sayilari birbirinden farkli 3  method  olusturup,
    // icerisindeki argumentlari for each ile yazdirin(Vararg ile).


    public static void main(String args[])
        {

            sayilar(100); // tek parametreli

            sayilar(5,6);
            sayilar(1, 2, 3, 4);  // 4 parametreli

            sayilar(5,6,9,7,5,9);
            sayilar();// parametresiz
        }




    static void sayilar(int... sayi)
    {
        System.out.println("Argument sayisi: "
                + sayi.length);


        for (int each : sayi)
            System.out.print(each + " ");

    }
    }


