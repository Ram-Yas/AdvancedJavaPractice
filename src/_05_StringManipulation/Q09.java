package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi girin : ");
        String input = scan.next();
        if(input.length()%2==0){
            System.out.println("Kelimenin ilk yarisi : "+ input.substring(0,input.length()/2));
        } else {
            System.out.println("Girdiginiz kelime cift uzunlukta degil");
        }
    }
}
