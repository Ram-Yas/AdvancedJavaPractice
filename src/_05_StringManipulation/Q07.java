package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi girin : ");
        String isim = scan.next();

        if(isim.length()==3 ){
            System.out.println("Isminiz 3 karakterlidir");

        }else System.out.println("Isminiz 3 karakterli degildir");
            ;

    }
}