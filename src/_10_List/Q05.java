package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        int arr[] = {1, 2, 3, 4, 5, 6, 25, 52, 18 ,48};

        tekElemanArray(arr);


    }

    private static void tekElemanArray(int[] arr) {
        int arrTek[] = new int[arr.length / 2];
       int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arrTek[sayac] = arr[i];
                sayac++;
            }

        }
        System.out.println(Arrays.toString(arrTek));
    }


}
