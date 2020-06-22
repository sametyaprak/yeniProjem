package samet1;

import java.util.Scanner;

public class NegatifMiPozitifMi {

	public static void main(String[] args) {

		for ( int i = 0 ; i <=1 ;) {
		
		System.out.println("bir sayi giriniz: ");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		System.out.println("yeni bir sayi daha giriniz: ");
		int num2 = scan.nextInt();
		
		if ( ( (num1 < 0) && ( num2 < 0) ) || ( ( num1 > 0 ) && ( num2 > 0) ) ) {
			System.out.println("girilen sayilar ayni isaretli..");
			
		} else if (( num1 == 0) || ( num2 == 0 )) {
			System.out.println("sifir harici baska bir deger girmelisiniz..");
			
		} else { System.out.println("girilen sayilar farkli isaretli.."); }
		
		System.out.println("tekrar denemek icin 1, cikmak icin 2'yi tuslayin..");
		i = scan.nextInt();
		
		if ( i == 2 ) { System.out.println("===== iyi gunler ====="); }
		
		scan.close();
			
		}

	}

}
