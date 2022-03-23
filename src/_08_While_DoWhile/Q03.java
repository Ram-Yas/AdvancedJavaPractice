package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */

        int sayi1=3;
        int sayi2=4;

        int us=1;

        while (sayi2>0){
            us *= sayi1;
            sayi2--;
        }

        System.out.println(us);
    }


}
