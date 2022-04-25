package Projects.P15OkulYonetimi;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "============== ANA MENU ==============\n\n" +
                    "\t  1- Okul Bilgileri Goruntule\n" +
                    "\t  2- Ogretmen Menu\n" +
                    "\t  3- Ogrenci Menu\n" +
                    "\t  Q- ÇIKIŞ");
            System.out.print("Lutfen menuden tercihinizi yapiniz: ");
            tercih = scan.nextLine();
            switch (tercih) {
                case "1": // okul bilgileri
                    // 1 'i "" icerisine yazdik.bunun sebebi string olmasi
                    okulBigileriniYazdir();
                    break;
                case "2": // ogretmen menu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3": // ogrnci menusu
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }


        } while (!tercih.equalsIgnoreCase("q")); // tercih q olmadikca donguye devam eder

        Depo.projeDurdur();
    }

    private static void okulBigileriniYazdir() throws InterruptedException {
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "\t\t Adres : " + Okul.adres +
                "\n\t\t Telefon : " + Okul.telefon);
        Thread.sleep(500);//bilgiler geldikten sonra bir muddet beklemesini istedigimiz icin bu methdu ekledik
        //herhangi bir yerde bekletmek istedigimizde kullaniyoruz
    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz...");
    }
}
