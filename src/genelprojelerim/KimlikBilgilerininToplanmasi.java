package genelprojelerim;

import java.util.Scanner;

public class KimlikBilgilerininToplanmasi {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
				String word="";
				int space=0;
				int lnt=0;
				
				for (int i = 0; i<=1 ; ) {
					System.out.println("kimlik bilgileri girisi icin (1), dogum bilgileri girisi icin (2),"
							+ " not bilgi girisi icin (3) ");
					Scanner scan = new Scanner (System.in);
					int secenek = scan.nextInt();
						switch (secenek) {
							case (1) : { isimSoyadAlma (word, lnt, space);
										break;	}
							case (2) : { dogumYeriYasCinsiyet ();
										break;}		
							case (3) : { notHesaplama() ;
										break; }
						}
						System.out.println("tekrar denemek icin (1), cikmak icin (2)");
						i = scan.nextInt();
						if ( i==2) {
							System.out.println("====iyi gunler====");
							scan.close();							
						}							
				}					
			}
			public static void isimSoyadAlma (String word,int lnt, int space ) {
				System.out.println("enter your sentences..");
				Scanner scan =  new Scanner (System.in);
				word = scan.nextLine();
				word.trim();
				space = 0;
				lnt = word.length();
				for ( int i=0; i<=lnt-1 ; i++) {		
					
					if ( ' ' == word.charAt(i)) 
						{ space = i;}					
			}
				System.out.println("isim :" + word.subSequence(0, space));
				System.out.println("soyad :" + word.subSequence(space+1, lnt));				
		}		
			public static void dogumYeriYasCinsiyet () {
				System.out.println("dogum yerinizi giriniz: ");
				Scanner scan = new Scanner (System.in);
				String dogumYeri = scan.nextLine();
				System.out.println("dogum yilinizi giriniz giriniz: ");				
				String dogumYili = scan.nextLine();
				int dogumYiliInt = Integer.parseInt(dogumYili);
				System.out.println("cinsiyetinizi giriniz: ");				
				String cinsiyet = scan.nextLine();
				System.out.println("dogum yeri: "+ dogumYeri+" cinsiyet: "+cinsiyet+" yas: "+(2020-dogumYiliInt));
			}	
			public static void notHesaplama() {for ( int i = 0; i <= 2 ;) {
				
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
				
			}
}

}


