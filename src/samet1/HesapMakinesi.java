package samet1;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		for ( int say=0 ; say <= 1 ; ) {
		
		System.out.println("bir rakam giriniz: ");
		Scanner scan = new Scanner (System.in);
		String sayi1 = scan.nextLine();
		
		System.out.println("yapmak istediginiz islemi giriniz: +, -, *, / ");
		String islem = scan.nextLine();
				
		System.out.println("baska bir rakam girini:");
		String sayi2 = scan.nextLine();
		
		int gercekSayi1 = Integer.parseInt(sayi1) ;
		int gercekSayi2 = Integer.parseInt(sayi2) ;
		
		if        (islem.equalsIgnoreCase("+")) 	{System.out.println("islem sonucu: " + (gercekSayi1 + gercekSayi2)) ; }
		else if   (islem.equalsIgnoreCase("-"))		{System.out.println("islem sonucu: " + (gercekSayi1 - gercekSayi2)) ; }
		else if   (islem.equalsIgnoreCase("*"))  	{System.out.println("islem sonucu: " + (gercekSayi1 * gercekSayi2)) ; }
		else if   (islem.equalsIgnoreCase("/"))		{System.out.println("islem sonucu: " + (gercekSayi1 / gercekSayi2)) ; }  
		
		System.out.println(" yeni hesap için 1'e, cikmak icin 2'ye basiniz");
		String giris = scan.nextLine();
		int giris2 = Integer.parseInt(giris);
		say = giris2;
		
		if  (say == 2)	{System.out.println("===========iyi gunler==========="); }
		
		}		
		}
	
}
	


