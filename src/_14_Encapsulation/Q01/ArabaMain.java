package _14_Encapsulation.Q01;

public class ArabaMain {

    public static void main(String[] args) {

        Araba honda = new Araba();//p'siz obje create edildi
        honda.setModel("Accord");//hondanin parametreleeri elle tek tek girildi
        honda.setYil(-2018);
        honda.setMotor(90);
        honda.setRenk("Kirmizi");
        Araba toyota = new Araba("avensis", "beyaz", 300, -2020); //p'li
        Araba volvo = new Araba("s80", "fume", 2400, 2010); //p'li
        Araba haciMurat = new Araba(1200,1974);//2 p'li cons


        System.out.println("honda ne ararsan var onda"+honda);//toString () methodu olmazsa bu obje referans degeri print eder
        System.out.println("volvo suikast araci "+volvo);
        System.out.println("sectiginiz arac toyota->"+" modeli :"+toyota.getModel()
                + " renk :"+toyota.getRenk()+ " motor gucu: "+toyota.getMotor()+ " yili: "+toyota.getYil());

        System.out.println(toyota);

    }
}
