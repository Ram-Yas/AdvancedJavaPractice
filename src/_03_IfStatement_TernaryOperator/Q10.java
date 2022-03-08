package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 yoksa 0 yaziniz");
        int ehliyet = scan.nextInt();
        if (ehliyet == 0 || ehliyet == 1) {
            System.out.print("hizinizi giriniz");
            int hiz = scan.nextInt();

            if (ehliyet == 1) {
                if (hiz < 0) {
                    System.out.println("hiw negatif olmaz hatali girdiniw");
                } else if (hiz >= 55 && hiz < 75) {
                    System.out.println("ceza 100 dolardir");
                } else if (hiz >= 75 && hiz < 84) {
                    System.out.println("ceza 150 dolardir");
                } else if (hiz >= 84 && hiz <= 94) {
                    System.out.println("ceza 320 dolardir");
                } else if (hiz > 94) {
                    System.out.println("ceza 500 dolardir");
                } else System.out.println("hiz sinirinda seyahat ediyorsunz. hayirli yolcujluklar");

            } else if (ehliyet == 0) {
                if (hiz < 0) {
                    System.out.println("hiw negatif olmaz hatali girdiniw");
                } else if (hiz >= 55 && hiz < 75) {
                    System.out.println("ceza 300 dolardir");
                } else if (hiz >= 75 && hiz < 84) {
                    System.out.println("ceza 350 dolardir");
                } else if (hiz >= 84 && hiz <= 94) {
                    System.out.println("ceza 520 dolardir");
                } else if (hiz > 94) {
                    System.out.println("ceza 700 dolardir");
                } else
                    System.out.println("hiz sinirinda seyahat ediyorsunz. ancak ehliyetsiz oldugunuzdan cezaniz 200 dolar");


            } else System.out.println("lutfen gecerli bir deger girin. ehliey var mi yok mu");

        } else System.out.println("bizimle eglenir ehliyet var mi yoh mu");
    }
}
