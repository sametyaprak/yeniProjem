package samet1;

import java.util.Scanner;

public class SayiMiRakamMi {

	public static void main(String[] args) {

		for ( int i = 0 ; i <= 1;) {
		
		System.out.println("bir sayi giriniz: ");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		
		String result = ( num1 < 10) && ( num1 >= 0) ? "RAKAM" : "SAYI"; 
		System.out.println(result);		
		System.out.println("tekrar sorgulamak icin 1, cikmak icin 2'ye basiniz: ");		
		i = scan.nextInt();		
		if ( i == 2 ) { 
			System.out.println("===  iyi gunler ===");
			scan.close();		}
		}
	}	
	}

