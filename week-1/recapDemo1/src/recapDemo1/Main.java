package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 29;
		int sayi2= 25;
		int sayi3= 322;
		
		int enBuyuk = sayi1;
		
		if(enBuyuk< sayi2 ) {
			enBuyuk = sayi2;
			
		}else if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
			
		}
		
		System.out.println("en b�y�k say� : "+ enBuyuk);
		

	}

}
