package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {

        int sayi = 5;

        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j < sayi - i; j++) {
                System.out.println(" ");
            }


        }
    }
}

