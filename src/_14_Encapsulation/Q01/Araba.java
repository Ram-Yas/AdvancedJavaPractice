package _14_Encapsulation.Q01;

public class Araba {//POJO : planning old java object-->modal class
                    //API testinde kullaniliyor

   private String model;//encapsulated oldugu icin private
   private String renk;
   private int motor;
   private int yil;

    public Araba() { //p'siz cons
    }


    public Araba(String model, String renk, int motor, int yil) {//p'li constructor
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
       // this.yil = yil;
        setMotor(motor); //cons abj create etmek icin parametre olarak giren motor datasi
                        // setMotor methoduna parametre olarak calistigi degerini aldi

        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("agam bizimle eglenir bu cc'de motor mu olur");
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){//burada hatali girise karsi korumaya aldik
            this.yil =(-1)*yil;
            System.out.println("agam napiyon once araba vardi da biz mi");
            this.motor = 1200;
        }else
        this.yil = yil;
    }

    public Araba(int motor, int yil) { //p'li constructor haciMurat objesinin olsturuldugu yer
        setMotor(motor);
        setYil(yil);
    }

    @Override //annotation
    public String toString() { //bu method bu class dan create edilen obj istenen field'larını stringe çeviririr
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }

}
