package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*      TASK :
                Saati saniyeye, mil'i kilometreye, kilogrami gram'a
                ceviren bir method yaziniz.
         */
        ceviri();

    }

    private static void ceviri() {
        //Scanner scan = new Scanner(System.in);
        System.out.print("Yapmak istediginiz islemi secin: \n" +
                "Saati saniyeye cevirmek icin 1\n" +
                "Mil'i kilometreye cevirmek icin 2\n" +
                "Kilogrami grama a cevirmek icin 3'e basiniz ----- :");
        int secim = scan.nextInt();
        double sonuc = 0;
        int zaman = 0, uzaklik = 0, kutle = 0;

        switch (secim) {
            case 1:
                System.out.println("Bir saat girin");
                zaman = scan.nextInt();
                sonuc = zaman * 60 * 60;
                System.out.println(zaman + " saat = " + sonuc + " saniyedir");
                break;

            case 2:
                System.out.println("cevireceginiz mil'i girin");
                uzaklik = scan.nextInt();
                sonuc = uzaklik * 1.609;
                System.out.println(uzaklik + " mil = " + sonuc + " kilometredir");
                break;

            case 3:
                System.out.println("cevireceginiz kilogram'i girin");
                kutle = scan.nextInt();
                sonuc = kutle * 1000;
                System.out.println(kutle + " kilogram " + sonuc + " gramdir");
                break;
            default:
                System.out.println("Yanlis bir tercih yaptiniz");


        }
    }
}

