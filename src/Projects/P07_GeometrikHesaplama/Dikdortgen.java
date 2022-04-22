package Projects.P07_GeometrikHesaplama;

public class Dikdortgen extends Sekil {


    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public double cevre() {
        cevre = (kisaKenar + uzunKenar)*2;
        return cevre;
    }

    @Override
    public double alan() {
        alan = kisaKenar*uzunKenar;
        return alan;
    }

    @Override
    public String toString() {
        return "Dikdortgen " +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                ", cevre=" + cevre() +
                ", alan=" + alan ();
    }
}
