package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle giriniz : ");
        String cumle = scan.nextLine();

        String kelime = longestWord(cumle);
        System.out.println("en uzun kelime : "+kelime);

    }

    private static String longestWord(String cumle) {
        List<String> cumleList = new ArrayList<String>();
        cumle = cumle.trim().replaceAll("\\p{Punct}", ""); //punctuation isaretlerini hiclik'le degistirir
        cumleList = List.of(cumle.split(" ")); //cumlenin her bir kelimesini split ile ayryip listin icersine atti

        String enUzunKelime = cumleList.get(0);

        for (int i = 0; i < cumleList.size(); i++) {
            if (cumleList.get(i).length() > enUzunKelime.length()) {
                enUzunKelime = cumleList.get(i);
            }
        }
        return enUzunKelime;
    }
}