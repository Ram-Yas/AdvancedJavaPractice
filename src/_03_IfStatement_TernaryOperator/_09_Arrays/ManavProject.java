package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan = new Scanner(System.in);// ortak kullanilacak elemanlar

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        urunListesi.add("domat - urun kodu : 1");
        urunListesi.add("muz - urun kodu : 2");
        urunListesi.add("elma - urun kkodu : 3");
        urunListesi.add("erik - urun kodu : 4");
        urunListesi.add("cilek - urun kodu : 5");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.8);

        System.out.println(urunListesi);
        musteriSecim();

    }

    private static void musteriSecim() {
        System.out.println("sectiginiz urun kodunu giriniz");
        int secim = scan.nextInt();
        System.out.println("sectiginiz urunden kac kilo alacaksin");
        double kilo = scan.nextDouble();
        double urunTutari = kilo * urunFiyatlari.get(secim - 1);
        toplamOdeme += urunTutari;//alinan urunleri genel toplama atti

        System.out.println("alisverise devam etmek istiyorsaniz 1 , kassa icin 2 seciniz");
        int devam = scan.nextInt();
        if (devam == 1) {
            musteriSecim(); //recursive method. (ancak cok kullanisli da degildir)
        } else {
            kasa();
        }

    }
    //hazir kutuphanelerin kullanin daha makbuldur

    private static void kasa() {
        System.out.println("yine bekleriz. odenmesi gereken miktar:" + toplamOdeme);
    }


}
