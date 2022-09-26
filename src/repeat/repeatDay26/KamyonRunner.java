package repeat.repeatDay26;

public class KamyonRunner {

    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri "+kamyon1.toString());


        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,25000);
        System.out.println("Kamyon2 bilgileri "+kamyon2.toString());

        Kamyon kamyon3=new Kamyon("Man","as900",2014,15000);
        System.out.println("Kamyon3 bilgileri "+kamyon3.toString());

        Kamyon kamyon4=new Kamyon("Scania","s54");
        System.out.println("Kamyon4 bilgileri"+kamyon4.toString());


    }
}
