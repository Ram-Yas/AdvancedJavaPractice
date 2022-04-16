package Projects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static ArrayList<Kisi> ogretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");
        System.out.print("isliminizi seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikisIslemi();
                break;
            default:
                System.out.println("Hatali giris yaptiniz :(");
                girisPaneli();//recursuve method call
                break;
        }
    }

    private static void cikisIslemi() {
        System.out.println("Eline saglik yine bekleriz.....");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz Kişi turu :  " + kisiTuru + " icin aşağıdaki işlemleri gösteren============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n");
        System.out.print("Islem tercihinizi giriniz: ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
            default:
                System.out.println("adam gibi birsey gir");
                islemMenusu();
                break;
        }
    }

    private static void arama() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");
        boolean kontrol = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            scan.next();
            System.out.print("Aradğığınız öğrencinin kimlik no giriniz.");
            String arananKimlikNo = scan.nextLine();
            for (Kisi k : ogrenciListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                    System.out.println("Aradığınız : " + k.getAdSoyad());
                    kontrol = false;
                }
            }
            if (kontrol) {
                System.out.println("aradıgınız ogrenci mevcut degildir");
            }
        } else {
            if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
                System.out.print("Aradğığınız öğretmenin kimlik no giriniz.");
                String arananKimlikNo = scan.nextLine();
                for (Kisi k : ogretmenListesi) {
                    if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                        System.out.println("Aradığınız : " + k.getAdSoyad());
                        kontrol = false;
                    }
                }
                if (kontrol) {
                    System.out.println("aradıgınız ogrenci mevcut degildir");
                }
            }
        }
    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " silme sayfası   ***");

        boolean kontrol = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            scan.next();
            System.out.print("Silinecek öğrencinin kimlik no giriniz.");

            String silinenKimlikNo = scan.nextLine();


            for (Kisi k : ogrenciListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(silinenKimlikNo)) {
                    System.out.println("Silinecek : " + k.getAdSoyad());
                    ogrenciListesi.remove(k);
                    kontrol = false;
                    break;
                }

            }
            if (kontrol) {
                System.out.println("silinecek ogrenci mevcut degildir");
            }
        } else {

            if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
                System.out.print("Silinecek öğretmenin kimlik no giriniz.");
                String silinecekKimlikNo = scan.nextLine();

                for (Kisi k : ogretmenListesi) {
                    if (k.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)) {
                        System.out.println("Sileceğiniz : " + k.getAdSoyad());
                        ogretmenListesi.remove(k);
                        kontrol = false;
                        break;
                    }

                }
                if (kontrol) {
                    System.out.println("Silinecek ogrenci mevcut degildir");
                }


            }

        }
    }

    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " liseleme sayfasi   ***");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {// ogrenci listeleme
            System.out.println(ogrenciListesi);
        } else { // ogremen listeleniyor
            for (Kisi k : ogretmenListesi
            ) {
                System.out.println(k.toString());
            }
        }
    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfasi   ***");
        System.out.print("ad soyadini girniz: "); //parametre data'larini creae ediyoruz
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("Kimilk no girniz: ");
        String kimlikNo = scan.next();
        System.out.print("yas girniz: ");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCI")) {
            System.out.print("Ogrenci numarasi giriniz: ");
            scan.nextLine();//dummy hayalet komut
            String ogrcNo = scan.next();
            System.out.print("sinif giriniz: ");
            String sinif = scan.next();
            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrcNo, sinif);//p'li constructor ogrc obj create edildi
            ogrenciListesi.add(sefilOgrenci);//datalari girien ogrenciyi listeye ekledi

        } else {
            System.out.print("Sicil numarasi giriniz");
            String sicilNo = scan.next();
            System.out.print("bolum giriniz");
            String bolum = scan.nextLine();
            Ogretmen muallim = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum); //p'li constructor ogrc obj create edildi
            ogretmenListesi.add(muallim);
        }
    }
}
