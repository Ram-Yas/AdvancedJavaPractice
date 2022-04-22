package Projects.P07_GeometrikHesaplama;

public class Cember extends Sekil {


    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public double cevre() {
        cevre = 2*3.14*yaricap;
        return cevre;
    }

    @Override
    public double alan() {
        alan = Math.pow(yaricap,2)*3.14;
        return alan;
    }

    @Override
    public String toString() {
        return "Cember " +
                "yaricap=" + yaricap +
                ", cevre=" + cevre()+
                ", alan=" + alan() ;
    }
}
