package questions_varargs;

public class varargs4 {


// 1 parametresiz ve 4 String Argumantli method olusturup bunlari yazdirin.

    public static void main(String args[]) {

        kelime();// 0 Argument
        kelime("patlican", "araba", "kus", "balik");// 4 Argument
    }

    static void kelime(String... str)
    {
       System.out.println("Hava cok güzel ");

        for (String each:str
             ) {
            System.out.println(each);

        }
    }

}

