package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        //asList () --> String olarak verilen ifadelerin hepsini ArrayList'in icin atar
        //Yani list olusturur, tek tek add demek zorunda kalmayiz

        System.out.println(isimler);

        List<String> aOlmayanIsimler = new ArrayList<>(); //a olmayan isilerin saklanacagi bos list create edilmistir

        for (String w:isimler //isimlerin herbirini w'ye ata
             ) {
            if (!w.toLowerCase().contains("a")){ //a bulundurmayan isimler sarti
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler :" +aOlmayanIsimler);
        isimler.clear();
        isimler.addAll(aOlmayanIsimler);//aOlmayanIsimler'deki degerleri al isimler listesine ekle
        System.out.println(isimler);

    }


}
