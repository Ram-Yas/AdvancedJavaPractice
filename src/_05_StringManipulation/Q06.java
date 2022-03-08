package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("E-mail adresinizi girin : ");
        String email = scan.next();

        if (email.contains("hotmail")) {
            email = email.replace("hotmail", "gmail");
            System.out.println("yeni e-mail adresiniz: " + email);
        } else System.out.println("Degisiklige gerek yok");
    }
}
