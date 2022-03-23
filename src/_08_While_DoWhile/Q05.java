package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        int sayi = 58;
        int rakamToplam = 0;

        while (sayi > 0) {
            rakamToplam += (sayi % 10);
            sayi= sayi/10;
        }

        System.out.println("rakamToplam = " + rakamToplam);


    }

}
