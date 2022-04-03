package Projects.filmTahmin;

import java.util.*;

public class FilmTahmin {

	static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

		System.out.println("1-"+(film.size())+" arasinda bir sayi giriniz");

		int secilenFilmIndex = scan.nextInt();

		filmGetir (film, secilenFilmIndex);


	}

	private static void filmGetir(List<String> filmler, int index) {

		Scanner scan = new Scanner(System.in);
		System.out.println(film.get(index).replaceAll("\\w", " - ") ); //tum harf karakterlerini - ile degistirdi
		System.out.println(film.get(index).length()+ " harfli yabanci film tahmin etmek icin harf giriniz:  ");

		char harf = ' ';
		int tahminSayisi =0;
		int dogruTahminSayisi = 0;
		String str = "";


		do {
			//System.out.println("yanlis tahmin sayi");
			harf = scan.next().toUpperCase().charAt(0); // film icin tahmin edilen harf alindi
			str+=harf;

			//if(!tahmined)

		}while (tahminSayisi-dogruTahminSayisi!=filmler.get(index).length());//yanlis sayisi verilen hakka ulasana kadar do blogu calisir

		if((tahminSayisi-dogruTahminSayisi)== 2 * filmler.get(index).length()){
			System.out.println("yanlis tahmin sayisi : "+ (tahminSayisi-dogruTahminSayisi));
			System.out.println("game over yine bekleriz   ..... tahmin edemedigin film : "+filmler.get(index).length());
		}



	}
}
