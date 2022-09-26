package day17_NestedForLoop;

public class C03_NestedforLoop {
    public static void main(String[] args) {

        /*
          verilen yukseklik ve boy degerine gore
          *'lardan olusan bir dikdortgen olusturalim
          yukseklik :3 boy:4
          * * * *
          * * * *
          * * * *
         */
        int yukseklik = 3;
        int boy = 4;
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

