package Projects.ucusProjesi;

public class Yolcu {
    String city;
    String flytype;
    int age;

    public Yolcu(String city, String flytype, int age) {
        this.city = city;
        this.flytype = flytype;
        this.age = age;
    }

    public Yolcu(String city) {
        this.city = city;
    }
}
