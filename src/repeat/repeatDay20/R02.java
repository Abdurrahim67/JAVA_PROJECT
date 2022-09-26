package repeat.repeatDay20;

import java.util.Arrays;

public class R02 {

    public static void main(String[] args) {

        int not[]={1,2,3,4,5,6,7};

        int temp=not[0];

        for (int i = 0; i < not.length-1 ; i++) {

            not[i]=not[i+1];


        } not[not.length-1]=temp;
        System.out.println(Arrays.toString(not));

        int cemp=not[not.length-1];

        for (int i = not.length-1; i >0 ; i--) {

            not[i]=not[i-1];

        }not[0]=cemp;
        System.out.println(Arrays.toString(not));
    }
}
