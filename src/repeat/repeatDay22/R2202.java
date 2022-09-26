package repeat.repeatDay22;

public class R2202 {
    public static void main(String[] args) {

        // verilen bir multi-dimensional array'in
        // tum elementlerini yazdiran bir method olusturun

        int[][] sayilarArray = {{1, 2, 3}, {4, 5,}, {6}};

        elementleriYazdirMethodu(sayilarArray);

    }

    public static void elementleriYazdirMethodu(int[][] sayilarArray) {

        for (int i = 0; i < sayilarArray.length ; i++) {

            for (int j = 0; j <sayilarArray[i].length ; j++) {

                System.out.print(sayilarArray[i][j]+" ");
                System.out.println(i);
            }

        }





    }
}
