package samet1;

import java.util.Scanner;

public class KarakterHarfCalismasiGuzel {

	public static void main(String[] args) {
		
		// girilen karakter mi degil mi onu ayirdiktan sonra buyuk kucuk ayrımı yapip ilk veya 
		// son harf mi girildi ona bakiyoruz...

		for ( int i = 0; i <=1 ;) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir harf giriniz: ");
		char harf = scan.next().charAt(0);
		
		if ( Character.isAlphabetic(harf) != true) { 
			System.out.println("girilen veri harf degil..!"); 
			
		} else {
		
		String result = harf>=97 && harf<=122 ? harf == 97 ? "a" : "ilk harf degil" :
			harf>=65 && harf<=90 && harf == 90 ? "Z" : "son harfi degil" ;
			
			System.out.println("girilen deger: " + result + " dir.");  }
			
			System.out.println("tekrar sorgulama icin 1, cikmak icin'ye basiniz...");
			i = scan.nextInt();
			
			if ( i == 2 ) {
				System.out.println("====  iyi gunler  ====");  scan.close(); }
				
			}
		
	}

}
