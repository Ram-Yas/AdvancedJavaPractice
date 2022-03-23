package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi girin : ");
        String isim = scan.next();
        System.out.print("Soyadinizi girin : ");
        String soyad = scan.next();
        System.out.println("Kredi karti numaranizi girin : ");
        String kKNo = scan.next();

        if(kKNo.length()<16){
            System.out.println("Geçersiz kredi kartı numarası");
        }

        System.out.println("Ad :" + isim.toUpperCase().charAt(0)+
                                    isim.substring(1).replaceAll("\\w", "*"));

        System.out.println("Soyad :" + soyad.toUpperCase().charAt(0)+
                soyad.substring(1).replaceAll("\\w", "*"));

        System.out.println("Kartno : **** **** **** "+kKNo.substring(kKNo.length()-4).replaceAll("\\w", "*"));

    }
}
