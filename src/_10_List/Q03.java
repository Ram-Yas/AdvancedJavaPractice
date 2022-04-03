package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));

        int toplam = 0;

        for (int each:list
             ) {
            toplam =toplam +(each*each);
        }
        System.out.println("list’deki tum sayıların karesinin toplami : "+toplam);
    }
}
