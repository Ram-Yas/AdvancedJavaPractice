package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("bolunen sayi: ");
		int bolunen = scan.nextInt();
		System.out.print("bolen sayi : ");
		int bolen = scan.nextInt();
		bolme(bolunen, bolen);
	}

	private static void bolme(int bolunen, int bolen) {

		int sayac = 0;

		if (bolunen<bolen){
			System.out.println("bolen sayi bolunen sayidan buyuktur");
					}
		else {
			while (bolunen>=bolen){
				bolunen-=bolen;
				sayac++;
			}
			System.out.println("bolum : "+sayac);
		}
	}

}


