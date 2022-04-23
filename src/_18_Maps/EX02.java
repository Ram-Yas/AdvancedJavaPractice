package _18_Maps;

import java.util.HashMap;
import java.util.Scanner;

public class EX02 {     /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdiran method creat ediniz.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();// ali gel gel de sevelim seni

        System.out.println(kelimeSay(metin));
        //Bu soruyu TreeMap seklinde de yapabiliriz

    }

    public static HashMap<String, Integer> kelimeSay(String metin) {

        HashMap<String, Integer> kelimeSayisi = new HashMap<>();

        String arrMetin[] =metin.split(" "); // metnin her bir kelimesi rray'e atandi

        for (int i = 0; i < arrMetin.length; i++) { // metnin her bir elemani icin dongu acildi

            if (kelimeSayisi.containsKey(arrMetin[i])) { // Map'in kelime olan key'inde array'den gelen kelime varsa
                                                         // bu kelime daha once map'e eklenip eklenmedigi kontrol ediliyor
                kelimeSayisi.put(arrMetin[i],kelimeSayisi.get(arrMetin[i])+1); // map' e key olarak kelime value olarak integer ekleniyor
            } else kelimeSayisi.put(arrMetin[i],1);
        }

        return kelimeSayisi;
    }


}
