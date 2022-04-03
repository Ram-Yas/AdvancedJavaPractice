package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q02 {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */
        String[][] input = {{"Ali,Veli,Ayse" }, {"Hasan,Can" }, {"Suzan" }};
        System.out.println(Arrays.deepToString(input));
       // arrayListYazdir(input);
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                list1.add(input[i][j]);
            }
        }
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }

    public static void arrayListYazdir(String[][] input) {

    }
}
