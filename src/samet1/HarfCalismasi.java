package samet1;

import java.util.Scanner;

public class HarfCalismasi {

	public static void main(String[] args) {
		
		// girilen harifin buyuk/kucuk olarak ayirt ettigimiz program
		// for dongusu ile gelistirilmeli

		System.out.println("bir harf giriniz: ");
		Scanner scan = new Scanner (System.in);
		 char harf = scan.next().charAt(0);
		 
		 if ( harf <= 122 && harf >= 97 ) {
			 if ( harf == 97 ) {
				 System.out.println("girilen harf ilk kucuk harf...");
			 } else {
				 System.out.println("girilen harf ilk kucuk harf degil...");
			 }
		 } if   ( harf >= 65 && harf <= 90 ) {
			 if ( harf == 90 ) {
			 System.out.println("son buyuk harf...");
		 } else {
			 System.out.println("son buyuk harf degil"); }
			 
		 }
		 
		 scan.close();

	}

}
