package loopDemo;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

	public static void main(String[] args) {
		//for d�ng�s�:
		
		for(int i = 0 ; i<10; i++) {
			System.out.println(i); // s�f�rdan ba�layarak 10 a kadar olan say�lar� d�ng� ile yazd�rd�k. 10 dahil de�ildir!!
			
		}
		System.out.println("1. for d�ng�s� bitti!!");
		
		System.out.println("----------------------------");
		
		
		for(int a = 0 ; a<100;a+=2 ) {
			System.out.println(a);// s�f�rdan baslayarak 100 e kadar 2 �er 2 �er artarak giden bir for d�ng�s� yazd�k 100 dahil de�ildi.!!
		}
		System.out.println("2. for d�ng�s� bitti ");
		
		System.out.println("FOR D�NG�LER� B�TT� !!!!");
		//while d�ng�s�:
		
		int sayac = 0;
		
		while (sayac<10){ // s�f�rdan baslayarak 10 a kadar olan say�lar� d�ng� ile yazd�rd�k. 
			sayac = sayac + 1 ;
			System.out.println(sayac);
			
		
		}
		System.out.println("1. while d�ng�s� bitti!!");
		
		
		System.out.println("--------------------------------------");
		
		while(sayac<100) { // s�f�rdan baslayarak 100 e kadar 2 �er 2 �er artt�rarak giden bir while d�ng�s� yazd�k  
			sayac = sayac + 2;
			System.out.println(sayac);
		}
		
		System.out.println("2. While d�ng�s� bittiiiiii ");
		
		System.out.println("WH�LE D�NG�LER� B�TT� !!!  ");
		
		//do-while d�ng�s�: 
		
		int j=0;
		do { // s�f�rdan baslayarak 10 a kadar olan say�lar� d�ng� ile yazd�rd�k. 10 dahil de�ildir.
			
			System.out.println(j);
			j+=1;
		}while(j<10);
		
		System.out.println("1.do while d�ng�s� bitti");
		
		System.out.println("------------------------------------");
		
		do { // s�f�rdan baslayarak 100 e kadar 2 �er 2 �er artt�rarak giden bir while d�ng�s� yazd�k 100 dahil de�ildir. 
			System.out.println(j);
			j +=2;
			
		}while(j<100);
		
		System.out.println("2. do while d�ng�s� bitti ");
		
		System.out.println("DO-WH�LE D�NG�LER� B�TT� !!! ");
	}

}
