package samet1;

import java.util.Scanner; //bunu control+shift+O ile otomatik olarak getirtebilirsin

public class YakitHesaplama {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);	
	System.out.println("yolculuk yaptiginiz km.yi giriniz:");		
	int yapilanYolculuk = scan.nextInt(); 	
	System.out.println("yolun ne kadari sehirler arasi:");	
	int sehirlerArasiMesafe = scan.nextInt(); 		
		if ( (yapilanYolculuk < sehirlerArasiMesafe) ) { 
			System.out.println("hatali veri girdiniz") ; } ;
	System.out.println("yakitin litre fiyati nedir?");
	double yakit = scan.nextDouble();
	double sehirlerArasi = 7;   	
	double sehirIci = 11;
	double sehirlerArasiYakitMasrafi = (sehirlerArasi*sehirlerArasiMesafe/100)*yakit;
	double sehirlerIciYakitMasrafi = ((yapilanYolculuk-sehirlerArasiMesafe)*sehirIci/100)*yakit;
	double toplamYakitMasrafi = sehirlerArasiYakitMasrafi+sehirlerIciYakitMasrafi;

		System.out.println("toplam yakit masrafiniz yaklasik "+ ((int)toplamYakitMasrafi) + " euro");	
		if ( (sehirlerArasi+sehirIci) > 35) { 
			System.out.println("masrafiniz cok") ;  
			}	else  { System.out.println("ucuz");   }
	}
	
}
  