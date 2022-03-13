package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
        Test Data:
        Input the string: The quick brown fox jumps over the lazy dog.
 	    Expected Output: Number of words in the string: 9
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle giriniz :");
        String cumle = scan.nextLine();
        kelimeSayisiBul(cumle);

    }

    private static void kelimeSayisiBul(String cumle) {
        int kelimeSayisi = 0;
        int cumleUzunluk = cumle.length();
        for (int i = 0; i <cumleUzunluk ; i++) {
            if(cumle.charAt(i)== ' '){
                kelimeSayisi++;
            }
        }
        System.out.println("Girdiginiz cumlenin kelime sayisi : " +(kelimeSayisi+1));
    }
}
