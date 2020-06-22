package samet1;

import java.util.Scanner;

public class UcunKatlari {

	public static void main(String[] args) {
		
		// bir sayi giriyoruz, 3ün kati mi degil mi kontrol ediyoruz. 
		
		for ( int i= 0 ; i <= 1; ) {
			
		System.out.println("bit tamsayi giriniz: ");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		int bolum = num1 % 3;
		
		if (bolum == 0) {
			System.out.println("3'un kati");
		} else {
			System.out.println("3'un kati degil.."); }
			
			System.out.println("yeni sorgulama icin 1, cikmak icin 2");
			
			i = scan.nextInt();
			if (i == 2) {
				System.out.println("iyi gunler");
		}
			
			scan.close();
		

	}

	}}
