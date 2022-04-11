package Projects.P04_okulYönetimi.ogrcOgrtYonetimi;

public class Ogrenci extends Kisi { // POJO class

    private String ogrcNo; //aritmetik olmadigi icin string
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String ogrcNo, String sinifi) {
        this.ogrcNo = ogrcNo;
        this.sinif = sinif;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNo, String sinifi) {
        super(adSoyad, kimlikNo, yas);
        this.ogrcNo = ogrcNo;
        this.sinif = sinifi;
    }

    public String getOgrcNo() {
        return ogrcNo;
    }

    public void setOgrcNo(String ogrcNo) {
        this.ogrcNo = ogrcNo;
    }

    public String getSinifi() {
        return sinif;
    }

    public void setSinifi(String sinifi) {
        this.sinif = sinifi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrcNo='" + ogrcNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
