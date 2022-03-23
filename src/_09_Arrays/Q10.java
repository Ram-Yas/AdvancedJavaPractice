package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String cumle = "GayetBasarılı";
        System.out.println(cumle);
        String arr[] = cumle.split("t");
        arr[0] = "Coook";
        System.out.println(Arrays.toString(arr));
        cumle = arr[0]+ arr[1];
        System.out.println(cumle);
    }

}
