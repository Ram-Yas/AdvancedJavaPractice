package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme,
    para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app.
    code create ediniz
     */
    public static void main(String[] args) {
        System.out.println("      ******     ");
        System.out.println("atm ye hosgeldin");
        Scanner scan = new Scanner(System.in);
        System.out.print("Bakiye sorgulama :1 \nPara cekme : 2\nParaYatirma : 3\nPara yatirma: 4\nLutfen yapacaginiz islemi seciniz: ");

       // System.out.println("yilin kacinci ayini ogrenmek istiyorsun");
        int islem = scan.nextInt();
        int bakiye = 1000;

        switch (islem){
            case 1:
                System.out.println("Mevcut bakiyeniz: "+bakiye);
                break;
            case 2:
                System.out.print("cekeceginiz miktari giriniz: ");
                int cekilenMiktar = scan.nextInt();
                if(cekilenMiktar>bakiye){
                    System.out.println("agam nidddin olmayan parayi cekemezsin");
                }else {
                    bakiye=bakiye-cekilenMiktar;
                    System.out.println("bakiyenizin guncl hali: "+bakiye);
                }
                break;
            case 3:
                System.out.println("yatiracaginiz miktari giriniz");
                int yatirilanMiktar = scan.nextInt();
                bakiye= bakiye+yatirilanMiktar;
                System.out.println("bakiyenizin guncl hali: "+bakiye);
                break;
            case 4:
                System.out.println("Cikisiniz yapilmistir. yine bekleriz");
                break;
        }

    }
}
