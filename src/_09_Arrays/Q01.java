package _09_Arrays;

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
		System.out.print("Ne kadarlik bir array olusturmak istiyorsun : ");
		int sayi = scan.nextInt();
		System.out.print("aray in elemanlrini giriniz : ");
		int arr [] = new int[sayi];

		for (int i = 0; i < sayi; i++) {
			arr[i]= scan.nextInt();

		}

		Arrays.sort(arr);
		int ek = arr[0];
		int eb = arr[sayi-1];
		System.out.println(Arrays.toString(arr));
		System.out.println("en buyuk ile en kucuk elemaninin arasinki fark :" + (eb-ek));
	}

}
