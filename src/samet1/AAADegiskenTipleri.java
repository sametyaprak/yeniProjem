package samet1;

import java.util.Scanner; //bunu control+shift+O ile otomatik olarak getirtebilirsin

public class AAADegiskenTipleri {
	
	public static void main(String[] args) {
		/* DEĞİŞKENLER VE DEĞİŞKEN TİPLERİ
		  
		  byte.....sayı , 8 bit   -128 ile 127 arası
		  short......sayı , 16 bit   -32768 ile 32767 arası
		  int......sayı, 32 bit		JAVA BÜTÜN SAYILARI İNT OLARAK TANIR
		  long......sayı, 64 bit    örnek =>  long l = 8542215L;
		 		  
		  float......ondalıklı sayı, 32 bit küçük ondalıklı sayı   örnek =>    float f = 5.45125F;
		  double......ondalıklı sayı, 64 bit büyük ondalıklı sayı
				  
		  char........karakter, 2 byte
		  bloolen.....true ya da false, 1 bit
		  
		  
		   % kalanı verme işlemi(mod alma) ingilizcesi modulus
	
		 
		  KOŞUL DURUMLARI
		  a == b .....a b.ye eşit ise true, değilse false
		  a != b .....a beye eşit değil ise true, eşit ise false
		  a > b  .....a b den büyükse true, küçük ise false
		 
		
		  MANTIKSAL BAĞLAÇLAR
		  ! NOT OPERATÖRÜ        	tru ise false , false ise true şeklinde değişiklik yapar
		  && AND OPERATÖRÜ			iki durumun ikisi true ise true..yoksa false...VE operatörü
		  & tek kullaniminda ayni sonucu verir fakat bir false gorse bile kodu okumaya devam eder. Zamandan
		  || OR OPERATÖRÜ.....iki durumun birisinin tru olması sonucun true olması için yeterli..VEYA operatörü
		 
		
		      KULLANICIDAN VERİ ALMA
		    Scanner scan = new Scanner(System.in);
		    int num1 = scan.nextint()
		    char harf = scan.next().charAt(0)		kullanicidan char alma
		
				GÜZEL CLASSLAR
	  	  .contentEquals()							String kariilastirma
		  .equalsIgnoreCase()						String karsilastirma, buyuk/kucuk harf onemsiz
		  .toLowerCase()							bu metod stringleri kucuk harfe cevirmek icin kullanılır		
		  switch(mystring.equalsIgnoreCase() )
		  Character.isDigit()						girilen rakam mi degil mi char icin
		  Character.isAlphabetic()					girilen alfabetik karakter mi
		  System.out.println(Character.isLetter('a')); // true
		  
		  if ( kosul) { emir } ;
		  else { emir } ;
		  
		  ....    TENARY OPERATOR    ....
		  
		  (condition) ? true : fale ;
		  
		  .......   SWITCH   ........
		  
		  switch (variable) {
		  	case (durum) : { emir } ;
		  		break;
		  		
		  		default :
		  		 { emir } ;
		  		 
		  		 harf=Character.toLowerCase(harf) 
		  
		  */
		}
}