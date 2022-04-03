package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};

        ArrayList<Integer> tekrarsizList = new ArrayList<Integer>();
        //burada bizden array olarak istiyor ancak ilk basta array in boyutunu bilmedigimizden list olusturup
        //sonrasinda array'a cevirecegiz

        for (int s : arr
        ) {
            if (!tekrarsizList.contains(s)) { //eleman yoksa add ile tekrarsiz listeye eleman ekle varsa gec
                tekrarsizList.add(s);
            }
        }

        Collections.sort(tekrarsizList); // list elemanlarini siraladik

        int tekrarsizArr [] = new int[tekrarsizList.size()]; // tekrarsizList.size() kadar length i olan bos eleman atandi

        for (int i = 0; i < tekrarsizList.size(); i++) {
            tekrarsizArr[i] = tekrarsizList.get(i); //lsit den getirdigin elemani arr e ata
        }

        System.out.println("her elemandan bir tane olan Arrray : "+Arrays.toString(tekrarsizArr));


    }

}
