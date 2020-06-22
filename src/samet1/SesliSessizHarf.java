package samet1;

import java.util.Scanner;

public class SesliSessizHarf {

	public static void main(String[] args) {
		
		

		for ( int i = 0 ; i <= 1 ;) {
		
		System.out.println("bir harf giriniz: ");
		Scanner scan = new Scanner (System.in);
		String harf = scan.next();
		
		if ( harf.equalsIgnoreCase("a") || harf.equalsIgnoreCase("e") || harf.equalsIgnoreCase("i")
				|| harf.equalsIgnoreCase("o") || harf.equalsIgnoreCase("u") ) {
			System.out.println("sesli harf girdiniz.. ");
		} else if (harf.equalsIgnoreCase("b") || harf.equalsIgnoreCase("c") || harf.equalsIgnoreCase("d")
				|| harf.equalsIgnoreCase("e") ) {
			System.out.println("sessiz harf girdiniz.."); }
		  else   { System.out.println("tanimlanamadi..") ; }
		
			System.out.println("yeni sorgulama icin 1, cikmak icin 2'ye basiniz..");
			String i2 = scan.next();
			i = Integer.parseInt(i2);
			
			if ( i == 2) {System.out.println("===  iyi gunler  ==="); }
			
		}

	}

}
