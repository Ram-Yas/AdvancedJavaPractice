package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam =0;
        int kup = 0;
       /* while (sayi10) {
            sayi=(sayi%10)/10;
            kup = sayi*sayi*sayi;
            toplam+=kup;
        }*/

        System.out.println(toplam);

    }

}
