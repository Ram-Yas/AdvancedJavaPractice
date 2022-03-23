package _07_ForLoop;

import java.util.Scanner;

public class Q13 {


    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        String str = "Java ogrenmek cok guzel.";
        char harf = 'e';

        int toplam = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == harf) {
                toplam++;
            }
        }

        System.out.println("Girdiginiz cumlede "+ harf + " harfi " + toplam + " kere kullanilmis");

    }

}
