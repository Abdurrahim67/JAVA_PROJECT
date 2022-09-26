package repeat.repeatDay17;

public class R1703 {

    public static void main(String[] args) {

/*
          verilen yukseklik ve boy degerine gore
          *'lardan olusan bir dikdortgen olusturalim
          yukseklik :4 boy:8
          * * * *
          * * * *
          * * * *

         */


        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {

            for (int j = 1; j <=boy ; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }








    }
}
