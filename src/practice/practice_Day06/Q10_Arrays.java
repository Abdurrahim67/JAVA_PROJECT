package practice.practice_Day06;

public class Q10_Arrays {

    public static void main(String[] args) {

        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int[][] arr1 = {{0, 2, -1}, {3, 8, 9}, {7}};
        int[][] arr2 = {{-7, 6, -9}, {0, 12}, {19}};
        int arr1Toplam = 0;
        int arr2Toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                arr1Toplam += arr1[i][j];


            }

        }
        System.out.println("arr1 Array'nin elmentleri toplami: " + arr1Toplam);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                arr2Toplam += arr2[i][j];

            }

        }
        System.out.println("arr2 Array'nin elmentleri toplami: " + arr2Toplam);
        System.out.println("arr1 ve arr2 Array'lerinin tüm elementlerinin toplami: " + (arr1Toplam + arr2Toplam));


    }
}
