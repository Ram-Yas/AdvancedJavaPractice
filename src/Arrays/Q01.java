package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Q01 {
    /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array uzunlugu icin bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int arr  []= new int[sayi];
        for (int i = 0; i <sayi; i++) {
            System.out.print((i+1)+".sayiyi giriniz:");
            arr[i] =scan.nextInt();

        }


       Arrays.sort(arr);

        int ek=arr[0];
        int eb=arr[arr.length-1];
        int fark = eb-ek;
        System.out.println("en buyuk sayi ile en kucuk sayi arasindaki fark: "+fark);
    }
}
