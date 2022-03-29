package _09_Arrays;

import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[] = {1, 2, 3, 4, 5, 6, 7};

        int ortalama;
        int toplam = 0;
        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
        }
        ortalama = toplam/ input.length;
        System.out.println("Array'in ortalamasi : "+ortalama);

        for (int i = 0; i < input.length; i++) {
            if (ortalama<input[i]){
                System.out.print(input[i]+ " ");
            }
        }

    }

}


