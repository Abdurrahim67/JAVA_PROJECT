package repeat.repeatDay17;

public class R1701 {
    public static void main(String[] args) {

        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz


        String input = "Hava cok güzel";

        tekrarsizStr(input);

    }

    private static void tekrarsizStr(String input) {

        String benzersizInput = "";
        String islenecekInput = input.replaceAll("\\W", "");
        System.out.println(islenecekInput.substring(0, 1));

        benzersizInput += islenecekInput.substring(0, 1);

        for (int i = 0; i < islenecekInput.length(); i++) {

            if (!benzersizInput.contains(islenecekInput.substring(i, i + 1))) {

                System.out.print(", " + islenecekInput.substring(i, i + 1));
                benzersizInput += islenecekInput.substring(i, i + 1);


            }

        }
        System.out.println("");
        System.out.println("input: " + input);
        System.out.println("benzersiz input: " + benzersizInput);

    }
}