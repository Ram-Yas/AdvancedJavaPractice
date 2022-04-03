package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {
    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */

        Random rnd = new Random();
        int tahminEdilecekSayi = rnd.nextInt(101);
        System.out.println(tahminEdilecekSayi);
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi = scan.nextInt();

        while (tahminEdilecekSayi!=sayi) {
            if (tahminEdilecekSayi>sayi){
                System.out.println("sayiyi artirin ");
            }else
                System.out.println("sayiyi azaltin");

        };

    }
}
