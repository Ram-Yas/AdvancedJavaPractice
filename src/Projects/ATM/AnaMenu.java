package Projects.ATM;

import Projects.P02_javaBankATM.JavaBankATM03.MethodlarClass;
import Projects.P02_javaBankATM.JavaBankATM03.MusteriBilgileri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnaMenu {

    static Scanner scan = new Scanner(System.in);

    public static void giris() {
        System.out.println("BANKAMIZA HOSGELDINIZ");
        System.out.print("Kullanici kart no'sunu girin: ");
        String kartNo = scan.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        String sifre = scan.next();

        if (kartNo.equals(MusteriBilgileri.getKartNo()) &&
                sifre.equals(MusteriBilgileri.getSifre())) {
            anaMenuSecim();

        } else {
            System.out.println("Kart numaraniz veya sifreniz hatali. Lutfen tekrar deneyiniz...");
            giris();
        }


    }

    public static void anaMenuSecim() {

        System.out.println("Yapmak istediginiz islemi seciniz : ");
        System.out.println("1- Bakiye sorgulama\n2-Para Yatirma\n3-Para Cekme\n4-Para Gonderme\n5-Sifre Degistime\6-Cikis");

    }


}
