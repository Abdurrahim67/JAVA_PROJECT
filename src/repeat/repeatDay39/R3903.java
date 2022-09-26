package repeat.repeatDay39;

public class R3903 {

    public static void main(String[] args) {


        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");

        } catch (Exception e) {
            System.out.println("Ongörülemeyen bir haata olustu");

            System.out.println("Saysinin karesi:" + sayi * sayi);




        }
    }
}