package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bugun Hava �ok S�cak                     " ;
		
		
		System.out.println(mesaj);

//		System.out.println("eleman say�s� : "+ mesaj.length());
//		System.out.println("5. eleman� : "+ mesaj.charAt(4));
//		System.out.println(mesaj.concat(" of!"));//sonuna ya�as�n kelimesini ekledik.
//		System.out.println(mesaj.startsWith("B"));// e�er mesaj i�erisindeki yaz�lan ifade B ile ba�l�yorsa true d�ner yoksa false d�ner.
//		System.out.println(mesaj.endsWith("k")); // mesaj i�erisindeki yaz�lan ifade k ile bitiyor ise true d�ner yoksa false d�ner.
//		
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		
//		System.out.println(mesaj.indexOf("a"));//ilk buldugu a harfinde aramay� bitirir ve oradaki indexi g�sterir.
//		System.out.println(mesaj.lastIndexOf("a")); // sa�dan ba�layarak a harfini arar ve oradaki indexi g�sterir.
		
		String yeniMesaj = mesaj.replace(' ', '-');// bo�uk olan yerleri - ile de�i�tirme i�lemi
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));// 2. indexinden itibaren yaz.
		
		System.out.println(mesaj.substring(2,8)); // 2. indexten 8 'e kadar olan indexin yerlerini yaz.
		
		for(String kelime :mesaj.split(" ")) {// split kullanarak her bir kelimeyi dizi olarak tek tek yazma i�lemi
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//c�mlede ge�en b�t�n b�y�k harfleri k���ltmeye yarar.
		
		System.out.println(mesaj.toUpperCase());//c�mlede ge�en b�y�k k���k harfleri b�y�tmeye yarar.
		
		
		System.out.println(mesaj.trim());// ba��ndaki ve sonundaki bo�luklar� atmaya yarar.
		
		
		
		
		
	}

}
