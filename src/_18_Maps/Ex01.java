package _18_Maps;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
        // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
        // output : {ahmet=şeref, ahmet can=erdem, haluk=bilgin};

        String ad[] = {"ahmet", "ahmet can", "haluk"};
        String soyad[] = {"şeref", "erdem", "bilgin"};

        Map<String, String> adSoyad = new HashMap<String, String>();

        for (int i = 0; i < ad.length; i++) {
            adSoyad.put(ad[i], soyad[i]);
        }

        System.out.println("ad soyad : "+adSoyad);

    }
}
