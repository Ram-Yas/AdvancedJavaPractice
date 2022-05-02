package Projects.P01_FilmTahmin2;

import java.util.*;

public class FilmTahmin {

    /*
   TASK : "JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"
    yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
    filmin index nosuna göre sectiriniz
    seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
    sağlayan method create ediniz...
    Ahanda TRICK...
    kullanıcının sectiği filmin harf sayısını  console yazdırınız.
    kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
    kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
    kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
    kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

   */
    static Map<Integer, String> filmListesiMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static int secim;
    static int dogruTahminSayisi = 0;
    static int yanlisTahminSayisi = 0;

    public static void main(String[] args) {
        filmListesiMap.put(1, "JOKER");
        filmListesiMap.put(2, "INCEPTION");
        filmListesiMap.put(3, "PIYANIST");
        filmListesiMap.put(4, "GREENMILE");
        filmListesiMap.put(5, "LEON");
        filmListesiMap.put(6, "GODFATHER");
        filmListesiMap.put(7, "JURASSICPARK");
        filmListesiMap.put(8, "TITANIC");

        System.out.println("FILM TAHMIN OYUNUNA HOSGELDINIZ");
        System.out.println("********************************");

        filmTahminEt(filmListesiMap);

    }

    private static void filmTahminEt(Map<Integer, String> filmListesi) {


        do {
            System.out.println("Bitirmek icin 0'a basiniz...");
            while (true) {
                try {
                    System.out.print("Tahmin etmek isteginiz film icin bir numara girin: ");
                    secim = scan.nextInt();
                    if (secim < 0 || secim > filmListesi.size()) { // 0'dan kucuk ve filmlistesi map'in sayisindan buyuk olursa
                        throw new ArithmeticException();
                    } else
                        break;
                } catch (ArithmeticException e) { // Integer girilirse ancak girilen integer degeri bizim istedigimiz sayilar arasinda degilse exception'u
                    System.out.println("1 ile " + filmListesi.size() + " arasinda sayi girmelisin");
                } catch (Exception e) { // Integer haricinde girdigi karakterler icin olusturulan exception
                    String str = scan.next();
                    System.out.print("Yanlis bir secim oldu. Tekrar deneyin..");

                }
            }

            if (secim != 0) { // secim 0 olmamasi durumunda oyun baslar
                String tahminEdilecekFilm = filmListesiMap.get(secim);
                String[] tahminEdilecekFilmArray = tahminEdilecekFilm.split("");
                StringBuilder sb = new StringBuilder(tahminEdilecekFilm.replaceAll("\\w", "-")); // tahmin edilen isim ----- karakterleriyle yeni bir stringBuilder'e atandi
                List<String> tahminEdilenHarflerListesi = new ArrayList<>();
                System.out.println("Tahmin edilecek film : " + sb);
                System.out.println("Tahmin hakki : " + tahminEdilecekFilm.length() * 2);
                int kalanHak = tahminEdilecekFilm.length() * 2;

                int sayac = 0;
                boolean kazaandiMi = false;
                while (kalanHak > 0) { // kalanHak 0'dan buyuk oldugu surece
                    sayac++;
                    System.out.println("Kalan hakkiniz : " + kalanHak);
                    System.out.print(sayac + " . harf tahmini :");
                    String tahminEdilenHarf = scan.next().toUpperCase();

                    if (tahminEdilenHarflerListesi.contains(tahminEdilenHarf)) {
                        System.out.println("Bu harf daha once tahmin edildi");
                        sayac--;
                    } else {
                        tahminEdilenHarflerListesi.add(tahminEdilenHarf);
                        if (tahminEdilecekFilm.contains(tahminEdilenHarf)) {
                            for (int i = 0; i < tahminEdilecekFilmArray.length; i++) {
                                if (tahminEdilecekFilmArray[i].equals(tahminEdilenHarf)) {
                                    sb.replace(i, i + 1, tahminEdilenHarf);
                                    dogruTahminSayisi++;
                                    if (sb.toString().equals(tahminEdilecekFilm)) {
                                        System.out.println("Kazandiniz....");
                                        kazaandiMi = true;
                                        kalanHak = 0;
                                        break;
                                    }
                                }
                            }
                            System.out.println(sb);
                           // kalanHak--;

                        } else {
                            yanlisTahminSayisi++;
                            System.out.println("Yanlis tahmin");
                            System.out.println(sb);

                        }
                        kalanHak--;
                    }

                }
                if (!kazaandiMi) {
                    System.out.println("Maalesef kaybettiniz");
                    System.out.println("Tahmin etmeniz gereken film : " + tahminEdilecekFilm);
                }

            }
        } while (secim != 0); // programi bitirmeyi kontrol ediyor
    }
/*
    public static void anaMenu() {
        System.out.println("FILM  OYUNUNA HOSGELDINIZ");
        System.out.println("Lutfen seciminizi yapiniz\n1-Film tahmin icin\n2-Film ekleme icin");
        int scm = scan.nextInt();

        switch (scm) {
            case 1:
                filmTahminEt(filmListesiMap);
                anaMenu();
                break;
            case 2:
                filmEkleme(filmListesiMap);
                anaMenu();
                break;
        }

    }

    private static void filmEkleme(Map<Integer, String> filmListesiMap) {
        System.out.println("eklemek istedigini filmin ismini giriniz: ");
        String yeniFilm = scan.next();
        if (filmListesiMap.containsValue(yeniFilm)){
            System.out.println("bu film listemizde var");
        } else {
            filmListesiMap.put(9,yeniFilm);
        }
    }*/
}
