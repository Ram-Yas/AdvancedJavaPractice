package Projects.ATM;


public class KullanciBigileri {

private static String kartNo="1111222233334444";
private static int sifre=2222;
public static double bakiye = 1000;

    public static String getKartNo() {
        return kartNo;
    }

    public static void setKartNo(String kartNo) {
        KullanciBigileri.kartNo = kartNo;
    }

    public static int getSifre() {
        return sifre;
    }

    public static void setSifre(int sifre) {
        KullanciBigileri.sifre = sifre;
    }

    public KullanciBigileri() {
    }

}
