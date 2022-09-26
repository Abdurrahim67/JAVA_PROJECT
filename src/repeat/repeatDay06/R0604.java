package repeat.repeatDay06;

public class R0604 {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);// Java Guzeldir 54
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));// Java güzeldir 9
        System.out.println(sayi1+sayi2+" "+str1);//9 Java
        System.out.println(""+sayi1+sayi2+" "+str2);// 54 Guzeldir

        System.out.println(str1.concat(str2));//JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2));
        



    }
}
