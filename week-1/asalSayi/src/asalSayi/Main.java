package asalSayi;

public class Main {

	public static void main(String[] args) {
		int number=1;
		int remainder =number % 2;
		
		boolean isPrime =true;
		
		if(number == 1) {
			System.out.println("say� asal de�ildir");
			return;
		}
		
		if(number < 1 ) {
			System.out.println("ge�ersiz bir say� girildi.");
		}
		
		
		for(int i =2 ; i<number; i++) {
			if(number % i ==0) {
				isPrime=false;
			}
			
		}
		if (isPrime) {
			System.out.println(number + " say�s� bir asal say�d�r.");
		}else {
			System.out.println(number + " say�s� bir asal say� de�ildir.");
		}
	}

}
