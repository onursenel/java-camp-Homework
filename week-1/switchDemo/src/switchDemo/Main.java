package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		
		
		switch(grade) {
		case 'A':
			System.out.println("M�kemmel! "+ grade + " ile ge�tiniz..");
			break;
		case 'B':
			//System.out.println("�ok g�zel! "+ grade + " ile ge�tiniz..");
			//break;
		case 'C':
			System.out.println("�yi! "+ grade + " ile ge�tiniz..");
			break;
		case 'D':
			System.out.println("Fena de�il! "+ grade + " ile ge�tiniz..");
			break;
		case 'F':
			System.out.println("Malesef! "+ grade + " ile kald�n�z..");
			break;
			default:
				System.out.println("hatal� bir notlama girdiniz!! ");
		}

	}

}
