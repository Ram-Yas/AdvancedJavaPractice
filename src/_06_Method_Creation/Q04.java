package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true
         * degilse false return eden method create ediniz.
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String kelime = scan.next();
        xyzKontrol(kelime);
    }

    private static void xyzKontrol(String kelime) {

        if (kelime.contains("xyz")) {
            System.out.println(kelime + " == " + true);
            ;
        } else {
            System.out.println(kelime + " == " + false);
        }
    }

}
