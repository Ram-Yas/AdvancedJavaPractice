package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

    Scanner scan = new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int birler = sayi%10;
        System.out.println(" birler basamagi : "+birler);
        int onlar = sayi%100;
        System.out.println("yuzler basamagi : "+ onlar);




    }
}