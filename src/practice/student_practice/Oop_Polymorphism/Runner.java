package practice.student_practice.Oop_Polymorphism;

public class Runner {

    public static void main(String[] args) {
        Civciv civciv1 = new Civciv();
        Ordek ordek1 = new Ordek();
        Kedi kedi1=new Kedi();

        havyanSesCikar(civciv1);
        havyanSesCikar(ordek1);
        havyanSesCikar((kedi1));

    }

    public static void havyanSesCikar(Animal animal) {
        animal.sesiCikar();



    }
}