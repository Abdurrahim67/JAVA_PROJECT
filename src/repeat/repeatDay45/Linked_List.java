package repeat.repeatDay45;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {

    public static void main(String[] args) {


        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Veli");
        ll1.add("Can");
        ll1.add("Ayse");

        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();

        if(ll1.remove(isim)){

            System.out.println("Girdiginiz isim: "+isim+ " listede vardi silindi");
        }else {

            System.out.println("Girdginiz isim: "+isim+" listede yok bu yutden  silinemedi");
        }



    }
}
