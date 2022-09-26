package team;

public class Binary {
    public static void main(String[] args) {
        /*
       Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
    Test Data:
    birinci binary number: 100010       //   34     1 2 3   9        10 2 0 , 5 2 1 , 2 2 0 , 1       1010  2+ 8 =10
    ikinci  binary number: 110010       //   50     0 1
                           1010100
    Beklenen Çıktı:
    1010100  //  84
        */
        int sayi = 100010;
        int onlukSayi = 0;
        int i3 = 0;
        int kalan;
        while (sayi != 0) {
            kalan = sayi % 10;
            sayi /= 10;
            onlukSayi += kalan * Math.pow(2, i3);
            ++i3;
        }
        System.out.println(onlukSayi); // 34
        int sayi2 = 110010;
        int onlukSayi2 = 0;
        int i2 = 0;
        int kalan2;
        while (sayi2 != 0) {
            kalan2 = sayi2 % 10;
            sayi2 /= 10;
            onlukSayi2 += kalan2 * Math.pow(2, i2);
            ++i2;
        }
        System.out.println(onlukSayi2);  // 50
        System.out.println(onlukSayi + onlukSayi2);
        int onlukToplam = onlukSayi + onlukSayi2; // 84
        int binary[] = new int[onlukToplam];
        int sira = 0;
        while (onlukToplam > 0) {
            binary[sira++] = onlukToplam % 2;
            onlukToplam = onlukToplam / 2;
        }
        for (int i = sira - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }


    }
}
