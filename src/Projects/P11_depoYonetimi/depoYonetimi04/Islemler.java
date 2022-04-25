package Projects.P11_depoYonetimi.depoYonetimi04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static Projects.P05_HalukMarket.HalukMarket.urunListele;

public class Islemler {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static int id = 1000;
    static HashMap<Integer, Urunler> urunler = new HashMap<>(); // urunleri depolanacagi bos map

    public static void girisPanel() {
        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN TANIMLAMA  |            | 2-MİKTAR GUNCELLEME|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-RAF GUNCELLEME  |            | 4-URUN CIKISI     |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN LİSTELE    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);
        System.out.print("ISLEM SECİNİZ : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                urunTanimla();
                girisPanel();
                break;
            case 2:
                miktarGuncelle();
                girisPanel();
                break;
            case 3: //burasi tamamlandi
                rafGuncelle();
                girisPanel();
                break;
            case 4: //burasi tamamlanacak
                urunCikisi();
                girisPanel();
                break;
            case 5:
                urunListele();
                girisPanel();
                break;
            case 6:
                cikinizLutfen();
                break;
            default:
                System.out.println("adam gibi deger gir gelmiyim oraya");
                break;
        }
    }

    private static void urunCikisi() {
        System.out.print("cikisi yapilacak urunun ID'sini giriniz");
        int arananId = scan.nextInt();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("Urunden hangi birimde cikilacagini giriniz");
            String cikacakBirim = scan.next();
        //    System.out.print("urundn ne kadar cikilacagini giriniz: ");
          //  int urunCikisi = scan.nextInt();

        }
    }

    private static void rafGuncelle() {
        System.out.print("Guncelleyeceginiz urunun id giriniz");
        int arananId = scan.nextInt();
        if (urunler.keySet().contains(arananId)){
            System.out.print("Guncel rafi giriniz");
            String guncelRaf = scan.next();
            urunler.get(arananId).setRaf(guncelRaf);
            System.out.print("urun rafiniz guncel hale getirildi");
        } else System.out.print("aradiginiz urun yok");
    }

    private static void miktarGuncelle() {

        System.out.print("miktar guncelleyeceginiz id giriniz : ");
        int arananId = scan.nextInt();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("Guncel Miktarinizi giriniz: ");
            int guncelMiktar = scan.nextInt();
            urunler.get(arananId).setMiktar(guncelMiktar+urunler.get(arananId).getMiktar());
            //map'e git, urunu bul , miktari guncelle , sonra guncel mika=tari ekle nereye urunler map indeki arana id deki mmiktari


            System.out.println("urun miktariniz guncel hale getirildi ");

        }else System.out.println("aradiginiz urun yok");


    }

    private static void cikinizLutfen() {
        System.out.println("yine bekleriz");
    }

    private static void urunListele() {
        System.out.println("*** Urun Listesi ***");
        System.out.println(urunler);

    }

    private static void urunTanimla() {

        System.out.print("urun ismini giriniz: ");
        String urunIsmi = scan.next();
        scan.nextLine(); //dummy
        System.out.print("uretici bilgisi giriniz: ");
        String uretici = scan.next();
        scan.nextLine(); //dummy

        System.out.print("urun birimi giriniz: ");
        String urunBirimi = scan.next();

        System.out.print("urun miktarini giriniz: ");
        int miktar = scan.nextInt();

        System.out.print("urun icin raf giriniz: ");
        String raf = scan.next();

        Urunler urun = new Urunler(urunIsmi, uretici, miktar, urunBirimi, raf);
        urunler.put(id, urun);
        System.out.println(id + " : " + urunler.get(id));
        id++;

    }

}
