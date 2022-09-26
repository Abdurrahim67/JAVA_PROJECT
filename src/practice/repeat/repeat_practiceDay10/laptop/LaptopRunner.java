package practice.repeat.repeat_practiceDay10.laptop;

public class LaptopRunner {
    public static void main(String[] args) {


        Laptop laptop1 = new Laptop("Lenovo", "Win 10 Home", "4GB DDR4", "128GB SSD");
        Laptop laptop2 = new Laptop("Asus", "Win 11", "4GB DDR4", "AMD 3000", "256GB SSD", "15.6 LED");


        laptopÖzellik(laptop1, laptop2);

    }

    public static void laptopÖzellik(Laptop laptop1, Laptop laptop2) {

        System.out.println("Laptop 1`in Özellikleri:" + "\n" + laptop1);
        System.out.println();
        System.out.println("Laptop 2`in Özellikleri:" + "\n" + laptop2);
    }
}




