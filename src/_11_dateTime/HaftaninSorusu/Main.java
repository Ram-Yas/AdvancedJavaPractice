package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int islem;
        Kayit yeniKayit = new Kayit();//obj ile method call yapilacak
        List<Kullanici> kisi = new ArrayList<>();

        boolean cikilsinMi = false;

        while (!cikilsinMi) {

            System.out.println("lutfen\n1: KayitAl\n2:Sansli kisi bul\n" +
                    "3:Kisileri listele\n4:Cikis");
            System.out.println("isleminizi seciniz : ");
            islem = scan.nextInt();

            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();//kisi list'i degerini yenikayit abj ile kayitAl() method call'dan alacak
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);// obje den sanlsi kullanicii methodunu cagirridk
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("hatali veri girdiniz.");
                    break;

            }
        }
    }
}
