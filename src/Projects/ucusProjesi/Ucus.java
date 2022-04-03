package Projects.ucusProjesi;

import java.util.Locale;
import java.util.Scanner;

public class Ucus {

     /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km, C şehrine  700km , D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("B sehri icin 1\nC sehri icin 2\nD sehri icin 3'e basiniz...");
        int secim = scan.nextInt();



        double tutar = 0;
        switch (secim) {
            case 1: //b sehri500 km
                System.out.println("B sehrine yolculuk etmek istiyorsun.");
                tutar = 500 * 0.10;
                break;
            case 2:// C şehrine  700km
                System.out.println("C sehrine yolculuk etmek istiyorsun.");
                tutar = 700 * 0.10;
                break;
            case 3: //D şehrine  900 km
                System.out.println("D sehrine yolculuk etmek istiyorsun.");
                tutar = 900 * 0.10;
                break;
            default:
                System.out.println("yanlis bir secim yaptiniz");
        }
        System.out.print("tek yon icin T\nGidis-donus icin G'ye basiniz");
        String gidis = scan.next().toLowerCase();

       System.out.print("yasinizi girin: ");
        int yas = scan.nextInt();
        if (yas > 0) {

            if (yas < 12) { //yude 50 indirim
                tutar *= 0.5;
            } else if (yas >= 12 && yas < 24) { //yude 10 indirim
                tutar *= 0.9;
            } else if (yas > 65) {//yuzde 30 indiirm
                tutar *= 0.7;

            }else if (yas <65) tutar = tutar;
            else System.out.println("lutfen gecerli bir yas girin");
        }

        if (gidis.equals("g") ) {
            tutar = (tutar * 2) * 0.8;
        }

        System.out.println("yolculugunuz icin tutariniz : "+tutar);


    }
}
