package team;

public class T01_bHarf {
    public static void main(String[] args) {

        for (int i = 1; i <=7 ; i++) {

            for (int j = 1; j <= 4; j++) {

                if((i==1 || i==4 || i==7) &&(j<=4)){

                    System.out.print(" * ");


                }else if ((j==1 || j==4) && i<=7) {

                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }


            }
            System.out.println("");





        }


    }

}
