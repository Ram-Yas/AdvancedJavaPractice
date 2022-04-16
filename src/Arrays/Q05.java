package Arrays;

public class Q05 {

    /*  TASK :
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */

    public static void main(String[] args) {

        int input[]= {1,2,3,4,5,6,7};

        int toplam = 0;
        for (int each: input
             ) {
            toplam+=each;
        }
        double average = toplam/input.length;

        for (int each2: input
             ) {
            if (each2>average){
                System.out.print(each2+ " ");
            }
        }

    }
}
