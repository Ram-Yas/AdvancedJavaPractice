package Arrays;
import java.util.Arrays;

public class Q10 {

       /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

    public static void main(String[] args) {
        String str = "GayetBasarılı";
        String arr [] = str.split("Gayet");
        System.out.println(Arrays.toString(arr));
        arr[0]="Coook";
        System.out.println(Arrays.toString(arr));

        str = arr[0]+arr[1];
        System.out.println(str);

    }


}
