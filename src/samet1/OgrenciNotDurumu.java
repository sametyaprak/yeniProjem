package samet1;

import java.util.Scanner;

public class OgrenciNotDurumu {

	 
	public static void main(String[] args) {
	
		for ( int i = 0; i <= 2 ;) {
			
			// digerlerinden farkli olarak, hatali veri girdigimizde break komutu ile program duruyor...
			// scan.close() komutunu calistiramadim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci vize notunuzu giriniz:");
		int birinciVize = scan.nextInt();
		System.out.println("ikinci vize notunuzu giriniz");
		int ikinciVize = scan.nextInt();
		System.out.println("Final sinavi notunuzu giriniz");
		int finalSinav = scan.nextInt();
		
		if ( birinciVize > 100 || birinciVize < 0 || ikinciVize > 100 || ikinciVize < 0 
				|| finalSinav < 0 || finalSinav > 100) {
			System.out.println("hatali deger girdiniz, islem sonlandirildi..."); 
			 break; }
		
		
		double sinavOrtalama = ((birinciVize*0.2 + ikinciVize*0.2) + (finalSinav * 0.6) )  ;
		System.out.println("donem sonu sinav ortalamaniz: " + sinavOrtalama);
		
		if (50<sinavOrtalama)  {System.out.println("Sonuc: Basarili..!");   }
		else if (50>sinavOrtalama) {System.out.println("Sonuc: Basarisiz...!");  }
		
		if 		(100<sinavOrtalama)  {System.out.println("HATALI VERI GIRISI");      }
		else if (0>sinavOrtalama)    {System.out.println("HATALI VERI GIRISI");  }
		else if	(50>sinavOrtalama)   {System.out.println("Notunuz F");               }
		else if (50<sinavOrtalama)   {System.out.println("Basari Notunuz D");        }
		else if (65<sinavOrtalama)   {System.out.println("Basari Notunuz C"); 	   }
		else if (80<sinavOrtalama)   {System.out.println("Basari Notunuz B");  		 }
		else if (90<sinavOrtalama)   {System.out.println("Basari Notunuz A");   	   	}
		
		System.out.println("tekrar veri girisi icin 1, cikmak icin 2'ye basin..");
		i = scan.nextInt();
		
		if ( i == 2 ) {
			System.out.println("======  iyi gunler  ======");
			
		}
		scan.close();
		}
		
	}

}

