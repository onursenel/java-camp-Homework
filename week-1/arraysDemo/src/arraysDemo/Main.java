package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "onur";
		String ogrenci2= "mert";
		String ogrenci3= "banu";
		String ogrenci4= "ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("----------------------");
		String[] ogrenciler = new String[3]; // dizi tan�mlamas� yaparak burada ��renciler dizisi i�erisinde 3 adet veri olaca��n� belirttik.
		
		
		ogrenciler[0]= "onur";
		ogrenciler[1]= "mert";
		ogrenciler[2]= "banu";

		
		for (String ogrenci : ogrenciler) { // for each d�ng�s� ile dizilerin i�erisinde d�ng� kurarak ��rencileri yazd�rd�k
			System.out.println(ogrenci);
		}
		System.out.println("1. for d�ng�s� bitti ");
		System.out.println("*********************************************************");
		
		
		
		for (int i = 0 ; i<ogrenciler.length ; i++) { // di�er bir for d�ng�s� ile yap�lan dizilerin i�erisinde d�ng� kurma durumu ve bu durumla birlikte ��rencileri yazd�rm�� olduk.
			
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("2. for d�ng�s� bitti");
	}

}
