package Projects.P07_GeometrikHesaplama;

public class Kare extends Dikdortgen {

    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public double cevre() {
        return super.cevre();
    }

    @Override
    public double alan() {
        return super.alan();
    }

    @Override
    public String toString() {
        return "Kare " +
                "Kenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                ", cevre=" + cevre() +
                ", alan=" + alan()
                ;
    }
}
