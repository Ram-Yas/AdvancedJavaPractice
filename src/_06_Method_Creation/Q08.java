package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
    /*
      TASK :
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method create ediniz

       Test Data :
      İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
      Output : versin açıklığı zihin arkadaşlara Javacı Allah
       */
    public static void main(String[] args) {

        String input = "Allah Javacı arkadaşlara  zihin açıklığı versin";
        System.out.println(reverseWord(input));


    }

    private static String reverseWord(String input) {

        String reversed = "";
        String arr[] = input.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {

            reversed+=arr[i]+" ";
        }



        return reversed;
    }


}


