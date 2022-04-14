package Projects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class HalukMarket {

    public static List<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Soğan",
            "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"));
    public static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));

    public static List<String> sepetUrunler = new ArrayList<>();
    public static List<Double> sepetKg = new ArrayList<>();
    public static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */

        String devam;

        double toplamFiyat = 0;

        do{
            urunListele();
            System.out.print("urununuzu numaraya gore seciniz: ");
            int secim = scan.nextInt();
            System.out.print("agirlik giriniz: ");
            double kg = scan.nextDouble();
            sepeteEkle(secim,kg);
            toplamFiyat = Math.round(sepeteYazdir());
            System.out.println("Alisverise devam etmek ister misiniz?");
            devam = scan.next();

        }while(devam.equalsIgnoreCase("e"));
        odeme(toplamFiyat);

    }

    private static void odeme(double toplamFiyat) {
        System.out.println("*****************************");
        System.out.println("************ODEME***********");
       double nakit =0;
       do{
           System.out.print("Lutfen Nakit Giiniz: ");
           nakit+=scan.nextDouble();
           if (nakit<toplamFiyat){
               System.out.println("Girilen rakam yetersiz");
               System.out.println((toplamFiyat-nakit)+ " TL daha yatirmaniz gerekmektedir.");
           }
       }while(nakit<toplamFiyat);

       double paraUstu = nakit- toplamFiyat;
       if (paraUstu>0){
           System.out.println("para ustu :"+paraUstu);
       }
        System.out.println("Yine bekleriz");
    }

    private static double sepeteYazdir() {
        double fiyatToplami = 0;
        double kgToplami = 0;

        System.out.println("urun adi \tKg\t\tFiyati");
        System.out.println("===============================");
        for (int i = 0; i < sepetUrunler.size(); i++) {
            System.out.println(sepetUrunler.get(i)+ "\t\t"+ sepetKg.get(i)+"\t\t"+sepetFiyatlar.get(i));
            fiyatToplami += sepetFiyatlar.get(i);
            kgToplami +=sepetKg.get(i);

        }
        System.out.println("===============================");
        System.out.println("\tTOPLAM:"+kgToplami+"\t\t"+fiyatToplami);
        return fiyatToplami;

    }

    private static void sepeteEkle(int secim, double kg) {
        sepetUrunler.add(urunler.get(secim));
        sepetKg.add(kg);
        sepetFiyatlar.add(fiyatlar.get(secim)*kg);
    }

    private static void urunListele() {
        System.out.println("No\t Urunler \t Fiyatlar");
        System.out.println("===\t =======\t =========");

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(" "+i +"\t"+urunler.get(i)+"\t\t"+fiyatlar.get(i));
        }
    }
}
