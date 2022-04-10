package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>();//bos list create edildi, kayitAl() method bu liste ekleme yapacak
    // bu list kullanici class'indaki objeleri listeler

    public List<Kullanici> kayitAl() {
        //List<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi girin: ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now()); //Kullanici class'tan p'li cons ile obj create edildi
        kisiler.add(k1);//Kullanici class'tan p'li cons ile obj create edilen obje kisile listesine eklendi
        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll){

        for (Kullanici k: kll) {//kayitAl() methodundan create edilen her bir kullanici donguye sokuldu
            if (k.kayitZamani.getSecond()<10){ //her bir kullanicini kayitZamanindaki saniye if sartina sokuldu
                System.out.println("sansli kisiniz " + k.name+ " 5 kilo bal kazandin");
            } else System.out.println("Maalesef sansli kisi degilsiniz "+k.name+ " ballar balini buldunuz kovaniniz yagmalandi");
        }
    }

    public void listele (List<Kullanici> kullanicilar){
        for (Kullanici k: kullanicilar) { //KayitAl mzthodundan kisiler listesini donguye sokuyor
            System.out.println("adi: "+k.name+ " kayit zamani: "+k.kayitZamani); //listedeki her bir kullanicinin ad ve kayit zamani
        }

    }



}
