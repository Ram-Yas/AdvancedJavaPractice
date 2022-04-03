package _10_List;

import java.util.Collections;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        boolean simetrikMi = true;
        int arr1[] = {1, 2, 3, 4, 4, 3, 2, 1};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr1[arr1.length - 1 - i]) { //elemanin simetrigindeki eleman kontrol ediliyor.eger birbirine esit degillerse
                                                        //simetrik bozulacagidan simetrikmi boolean'i false a cevirecek
                simetrikMi = false;
                break;
            }
        }
        if (simetrikMi) {
            System.out.println("simetrik");
        } else System.out.println("simetrik degil");

    }

}


