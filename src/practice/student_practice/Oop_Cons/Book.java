package practice.student_practice.Oop_Cons;

public class Book {

    public String name="sadas";
    public int pageNumber=140;
    public String author="sadas";  // degerler sonradan atandi
    public String publisher="asdas";
    public double price=75;

    public Book(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public static void main(String[] args) {

        Book book1=new Book();
        book1.name="Seker Portakali";
        book1.author="Jose Mauro de Vasconelos";
        book1.pageNumber=180;
        book1.price=25;
        book1.publisher="Can Yayinlari";

        Book book2=new Book("Kiraz Mevsimi",145,"Mirac","abc yayinlari",75);




    }

}
