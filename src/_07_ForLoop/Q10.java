package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf girin : ");
        String  harf = scan.next();

        String sesli = "aeiou";

        //for (int i = 0; i < sesli.length(); i++) {
            if (harf.length()>1 ){
                System.out.println("yanlis karakter girdiniz");
            } else{
                if (sesli.contains(harf)){
                    System.out.println("girdiginiz harf seslidir.");
                }else {
                    System.out.println("girdiginiz harf sessizdir");
                }
            }
        //}


    }

}


