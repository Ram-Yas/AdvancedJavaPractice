package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("4 harfli bir kelime girin :");
        String kelime = scan.nextLine();

        if(kelime.length()==4){
            String tersKelime = kelime.substring(3)+
                                kelime.substring(2,3)+
                                kelime.substring(1,2)+
                                kelime.substring(0,1);
            System.out.println(tersKelime);
        }else {
            System.out.println("4 harfli olmayan bir kelime girdiniz");
        }


    }
}
