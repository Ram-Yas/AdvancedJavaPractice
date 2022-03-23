package _06_Method_Creation;

import java.util.Scanner;

public class AsalCarpan {
    static int bolen = 0;
    static boolean isAsal = true; //Class level


    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scan.nextInt();
        asalCarpan(sayi);

    }

    private static void asalCarpan(int sayi) {

        int asalBolen=0;

        for (int i = 2; i <= sayi; i++) {
            if (sayi %i == 0) {
                bolen = i;
                asalMi(bolen); // method call bolen sayisinin asal olup olmadigini kontro ediyor

            }
            if (isAsal){
                asalBolen= bolen;
            }

        }
        System.out.println("girdiginiz sayinin en buyuk boleni: "+asalBolen);
    }

    private static boolean asalMi(int bolen) {

        for (int i = 2; i < bolen; i++) { // bolen sayisina kadar tum sayilar boldugunde kaln 0 degilse,
            // bu sayi kendisinden baska hicbir sayiya bolunmez
            if (bolen % i == 0) {
                isAsal = false;
                break;
            }

        }
        return isAsal;
    }


}