package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sekiz elemanli bir array olusturmak istiyoruz. \n Bu elemanlari giriniz : ");
        int arr[] = new int[8];
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) {
                sayac++;
            }
        }

        System.out.println("Array imiz : "+ Arrays.toString(arr));
        System.out.println("Array imizde " + sayac + " tane 3'e bolunebilen sayi var");

    }

}
