package Arrays;

import java.util.Arrays;
public class Q06 {

    /*
    /*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

	*/
    public static void main(String[] args) {

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);

        int max2 = arr[arr.length - 2];
        int min = arr[0];

        System.out.println(max2);
        System.out.println(min);
    }

}
