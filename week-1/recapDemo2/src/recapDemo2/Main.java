package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList= {6.7,23.3,4.3,4.6}; // dizi tan�mlad�ktan sonra dizi i�erisindeki elemanlar� bu �ekildede doldurmam�z m�mk�nd�r.
		double total = 0;
		double enBuyuk = myList[0];
		
		for(double number: myList) {
			if(enBuyuk<number){// o anki say� bizim en buyuk say�m�zdan daha b�y�k ise
				enBuyuk = number;
				
			}
			total += number;
			System.out.println(number);
			
		}
		System.out.println("En b�y�k sayi : " + enBuyuk);
		System.out.println("dizi i�erisindeki elemanlar�n toplam� : " +total);
		
		
		
		
		
	}

}
