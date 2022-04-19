package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanalrı set'e convert edn bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        int arr [] = {1,5,6,4,21,45,12};

        addElement(hashSet1,arr);

    }

    private static void addElement(HashSet<Integer> hashSet1, int[] arr) {

        for (int number : arr  ) {
            hashSet1.add(number);
        }
        write(hashSet1);
    }

    public static void write(HashSet<Integer> hashSet1){

        for (Integer s: hashSet1
             ) {
            System.out.print(s+ " ");
        }
    }

}
