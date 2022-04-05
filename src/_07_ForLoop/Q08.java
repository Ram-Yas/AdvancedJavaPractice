package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle  giriniz: ");
        String str = scanner.nextLine();
        String tersCumle = "";

        for (int i = str.length()-1; i >=0; i--) {
            tersCumle += str.charAt(i);
        }

            if (str.equals(tersCumle)){
                System.out.println("Cumle Polindrome");
            }else System.out.println("Cumle Polindrome degildir");
        }



}

