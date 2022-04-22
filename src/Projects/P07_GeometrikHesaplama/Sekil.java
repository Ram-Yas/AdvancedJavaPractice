package Projects.P07_GeometrikHesaplama;

public class Sekil {

   double yaricap;
   double uzunKenar;
   double kisaKenar;
   double cevre;
   double alan;

   public Sekil(double uzunKenar, double kisaKenar) {
      this.uzunKenar = uzunKenar;
      this.kisaKenar = kisaKenar;
   }

   public Sekil(double yaricap){
      this.yaricap = yaricap;
   }
   public double cevre(){
       return cevre;
   }

   public double alan(){
       return alan;
   }

}
