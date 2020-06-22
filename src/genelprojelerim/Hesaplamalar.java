package genelprojelerim;

import java.util.Scanner;

public class Hesaplamalar {

	public static void main(String[] args) {
		
		hesaplamalar ();

		
	}
	public static void hesaplamalar () {

		Scanner scan = new Scanner(System.in);	
		System.out.println("yolculuk yaptiginiz km.yi giriniz:");		
		int yapilanYolculuk = scan.nextInt(); 	
		System.out.println("yolun ne kadari sehirler arasi:");	
		int sehirlerArasiMesafe = scan.nextInt(); 		
			while ( yapilanYolculuk < sehirlerArasiMesafe  ) { 
				System.out.println("hatali veri girdiniz verileri tekrar giriniz") ;
				System.out.println("yolculuk yaptiginiz km.yi giriniz:");		
				yapilanYolculuk = scan.nextInt(); 	
				System.out.println("yolun ne kadari sehirler arasi:");	
				sehirlerArasiMesafe = scan.nextInt(); } ;
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
			scan.close();
		}
		
	}
	  


