package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String str1 = "%13.99";
        String str2 = "%10.55";

        str1 = (str1.replaceAll("\\W", ""));
        str2 = (str2.replaceAll("\\W", ""));
        Double first = Double.parseDouble(str1);
        Double second = Double.parseDouble(str2);

        Double total = (first+second)/100;
        System.out.println("iki String in toplami : %"+total);
    }
}
