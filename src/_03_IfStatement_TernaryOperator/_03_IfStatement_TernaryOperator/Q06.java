package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //kullanicidan aldigi koordinati hangi bolgede olfugunu gosteren program
        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y degerlerni girin");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x>0 && y>0){
            System.out.println("1. bolge");
        }
        else if(x<0 && y>0){
            System.out.println("2.bolge");
        }
        else if(x<0 && y<0){
            System.out.println("3.bolge");
        }
        else if(x>0 && y<0){
            System.out.println("4.bolge");
        }
        else if(x!=0 && y==0){
            System.out.println("x ekseni");
        }
        else if(x==0 && y!=0){
            System.out.println("y ekseni");
        }
        else System.out.printf("", "girdigin degerler orjin dedir");

    }
}
