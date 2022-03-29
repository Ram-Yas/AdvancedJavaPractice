package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String money[] = str.split(" ");
        System.out.println(Arrays.toString(money));
        int toplamDolar = 0;
        int toplamSterlin = 0;
        for (int i = 0; i < money.length; i++) {
            if (money[i].contains("$")){
                money[i] = money[i].replace("$", "");
                toplamDolar+=Integer.parseInt(money[i]); //Integer.parseInt stringi integer a ceviriyor
            }
            if (money[i].contains("£")){
                money[i] = money[i].replace("£", "");
                toplamSterlin += Integer.parseInt(money[i]);
            }
        }

        System.out.println("toplamDolar = $" + toplamDolar);
        System.out.println("toplamSterlin = £" + toplamSterlin);

    }
}


