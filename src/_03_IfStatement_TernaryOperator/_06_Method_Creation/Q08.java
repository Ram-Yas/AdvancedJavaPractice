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
      reverseWord(input);
     // System.out.println();

  }

    private static void reverseWord(String input) {

      String str2 = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            str2+=input.substring(input.charAt(' '), input.length());

        }

        System.out.println(str2);
//return str2;
    }

}
