package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("3 kelimelik ad soyadinizi girin: ");
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        System.out.println(str1.substring(0,1).toUpperCase()+"."+
                            str2.substring(0,1).toUpperCase()+ "."+
                            str3.substring(0,1).toUpperCase()+ ".");
    }
}
