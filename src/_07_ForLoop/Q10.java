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
        System.out.print("bir harf girin : ");
        String  kelime = scan.next();

        String sesliHarf = "aeiou";
        String sessizHarf = "bcdfghjklmnprstvyzxwq";

        //for (int i = 0; i < sesli.length(); i++) {
            if (kelime.length()==1 ){
                for (int i = 0; i < sesliHarf.length(); i++) {
                    if (sesliHarf.contains(kelime)){
                        System.out.println("sesli");
                        break;
                    }else if (sessizHarf.contains(kelime)){
                        System.out.println("sessiz");
                        break;
                    }else   System.out.println("yanlis karakter girdiniz");
                    break;
                }

            }else {
            System.out.println("yanlis karakter girdiniz");
        }



    }

}


