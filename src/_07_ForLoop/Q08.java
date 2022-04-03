package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz: ");
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) ==str.charAt(str.length()-1)){

            }
        }

    }

}

