package samet1;

import java.util.Scanner;

public class YasCinsiyetGuzel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		for ( int i = 0 ; i <= 1 ;) {
							
		System.out.println("cinsiyetinizi giriniz: erkek / bayan");
		String cinsiyet = scan.next();		
		
		System.out.println("yasinizi giriniz: ");		
		int yas = scan.nextInt();
			
		
		if ( yas < 1 || yas > 100) {
			System.out.println("yanlis veri girdiniz tekrar deneyiniz");
				}
		
		if ( cinsiyet.equalsIgnoreCase("erkek")) {
			if ( yas >= 18 && yas < 99) {
				System.out.println("Adam");
			} else if ( yas < 18 && yas > 0) {
				System.out.println("Erkek Cocuk"); } }
		
		if (cinsiyet.equalsIgnoreCase("bayan")) {
			 if ( yas >= 18 && yas < 99) {
				System.out.println("Kadin");
			} else if ( yas < 18 && yas > 0 ) {
				System.out.println("Kiz cocuk"); }  }
			
		System.out.println("tekrar sorgulamak icin 1, cikmak icin 2'ye basiniz...");
		
		int i2 = scan.nextInt();
		
		i = i2;
		
		if ( i == 2 ) {
			System.out.println("====  iyi gunler  ====");
		} }
		scan.close();
		
}
}

		




