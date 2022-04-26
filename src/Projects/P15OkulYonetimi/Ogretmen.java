package Projects.P15OkulYonetimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void fakeOgtermenEkle() {
        ogretmenlerMap.put("123456987411", "Ali , Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412", "Veli , Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413", "Ayse , Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414", "Ali , San, 1983, Kimya");
        ogretmenlerMap.put("123456987415", "Alp , Yan, 1984, Matematik");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "=========== OGRETMEN MENU ============\n" +
                    "\t  1- Ogretmenler Listesi Yazdir\n" +
                    "\t  2- Soyisimden Ogretmen Bulma\n" +
                    "\t  3- Branstan Ogretmen Bulma\n" +
                    "\t  4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t  5- Kimlik No Ile Kayit Silme\n" +
                    "\t  A- ANAMENU\n" +
                    "\t  Q- ÇIKIŞ");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1": // Ogretmenler Listesi Yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2": // Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3":// Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;
                case "4": // Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    break;
                case "5": //Kimlik No Ile Kayit Silme
                    kimilkNoIleKayitSilme();
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    // Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Lutfen gecerli tercih yapiniz");
            }

        } while (tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void kimilkNoIleKayitSilme() {
        System.out.print("Silinecek ogretmen kimlik no giriniz: ");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);


        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Verilen kimlik no ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.print("TcNo :");
        String tcNo = scan.nextLine();
        System.out.print("Isim :");
        String isim = scan.nextLine();
        System.out.print("Soyisim :");
        String soyisim = scan.nextLine();
        System.out.print("D.Yili :");
        String dYili = scan.nextLine();
        System.out.print("Brans :");
        String brans = scan.nextLine();

        //burada sadece value deegerini yaziyoruz. Tc kimlik key oldugundan unique'dir
        String eklenecekValue = isim + ", " + soyisim + ", " + dYili + ", " + brans;

        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {

        System.out.print("Aradiginiz ogretmenin bransini girin : ");
        String istenenBrans = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        //map'in normal yazilimi iyi olmadigindan karisik oldugundan bunu set'e atayip oyle islem yapilacak

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "========= BRANS ILE OGRETMEN ARMA ==========\n" +
                "TcNo         Isim   Soyisim  D.Yili Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey(); // burada gelen her bir key'i aliyoruz
            String eachValue = each.getValue(); // burada da gelen her bir value yu aliyor

            // System.out.println(eachKey+" "+ eachValue);
            // bu sekilde yaparsak istedgiimiz ciktiyi alamiyoruz oyuzden array'a atama yapip printf ile yazdiracagiz

            String eachValueArr[] = eachValue.split(", ");
            if (istenenBrans.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%11s %-6s %-8s %6s %s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

            }

        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {

        System.out.print("Aradiginiz ogretmenin soysimini girin : ");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        //map'in normal yazilimi iyi olmadigindan karisik oldugundan bunu set'e atayip oyle islem yapilacak

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "========= SOYISIM ILE OGRETMEN ARMA ==========\n" +
                "TcNo         Isim   Soyisim   D.Yili Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey(); // burada gelen her bir key'i aliyoruz
            String eachValue = each.getValue(); // burada da gelen her bir value yu aliyor

            // System.out.println(eachKey+" "+ eachValue);
            // bu sekilde yaparsak istedgiimiz ciktiyi alamiyoruz oyuzden array'a atama yapip printf ile yazdiracagiz

            String eachValueArr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%11s %-6s %-8s %6s %s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

            }

        }
        Thread.sleep(5000);

    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        //map'in normal yazilimi iyi olmadigindan karisik oldugundan bunu set'e atayip oyle islem yapilacak

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRETMEN LISTESI ============\n" +
                "TcNo         Isim   Soyisim  D.Yili Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey(); // burada gelen her bir key'i aliyoruz
            String eachValue = each.getValue(); // burada da gelen her bir value yu aliyor

            // System.out.println(eachKey+" "+ eachValue);
            // bu sekilde yaparsak istedgiimiz ciktiyi alamiyoruz oyuzden array'a atama yapip printf ile yazdiracagiz

            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%11s %-6s %-8s %6s %s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

        }
        Thread.sleep(5000);


    }
}
