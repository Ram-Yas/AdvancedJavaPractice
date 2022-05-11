package Projects.ATM;


public class KullanciBigileri {

private static String kartNo="1111";
private static String sifre="2222";
public static double bakiye = 1000;

    public static String getKartNo() {
        return kartNo;
    }

    public static void setKartNo(String kartNo) {
        KullanciBigileri.kartNo = kartNo;
    }

    public static String getSifre() {
        return sifre;
    }

    public static void setSifre(String sifre) {
        KullanciBigileri.sifre = sifre;
    }


    public KullanciBigileri() {
    }

}
