package samet1;

import java.util.Scanner;

public class SaniyeHesaplama {

	public static void main(String[] args) {		// scan.close...koyamadim
		
		for ( int i = 0 ; i <=1 ;) {
		
		System.out.println("saat bilgisi girin: ");		
		Scanner saat = new Scanner(System.in);		
		int saat1 = saat.nextInt();		
		System.out.println("dakika bilgisi girin: ");		
		Scanner dakika = new Scanner(System.in);		
		int dakika1 = dakika.nextInt();				
		System.out.println("saniye bilgisi girin: ");					
		Scanner saniye = new Scanner(System.in);
		int saniye1 = saniye.nextInt();
		
		if ( dakika1>60 || dakika1 <0 || saat1 < 0 || saniye1 < 0 || saniye1 > 60 ) { 
			System.out.println("hatali veri girdiniz") ;
			 
		} else {
			int toplam = ((saat1*60*60) + (dakika1*60) + saniye1);
			 { System.out.println("girdiginiz verilerin toplami " + toplam + " saniyedir.");  
		
		}; 		
		}; 
		System.out.println("yeni veri girisi icin 1, cikmek icin 2'ye basiniz..");
		int i2 = saat.nextInt();
		i = i2;
		if ( i == 2) {
			System.out.println("====  iyi gunler ====");
			
		}
	};
 
}
}	
		
		
				




