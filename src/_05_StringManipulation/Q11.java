package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a = harfDeposu.charAt(harfDeposu.indexOf("A"));//a
        char l = harfDeposu.charAt(harfDeposu.indexOf("L"));//L
        char i = harfDeposu.charAt(harfDeposu.indexOf("I"));//i

        System.out.println(""+a+l+i); // basa "" koymazsak AScii degerlerini alir



    }

}
