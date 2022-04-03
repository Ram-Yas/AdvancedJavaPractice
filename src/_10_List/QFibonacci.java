package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);

       // int temp = 0;


        if(sayi<=0){
            System.out.println("sayiniz negatif olamaz");
        }else if(sayi==1){
            System.out.println(list.get(0));
        }else if(sayi==2){
            System.out.println(list);
        }else{

            //counter starts from 3, as first two numbers in series are 0 and 1

            for (int i = 3; i <=sayi ; i++) {

                list.add(list.get(i-2)+list.get(i-3));

            }
            System.out.println(list);
        }

    }
}
