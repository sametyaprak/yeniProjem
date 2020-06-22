package samet1;

import java.util.Scanner;

public class HarfMiRakamMiKarakterMi {

	public static void main(String[] args) {

		for ( int i = 0 ; i <= 1 ;) {
		
		System.out.println("istediginiz bir karakter giriniz: ");
		
		Scanner scan = new Scanner (System.in);
		char harf = scan.next().charAt(0);		
			if ( Character.isDigit(harf)) {
				System.out.println("girilen veri rakam..");
			} else if (Character.isAlphabetic(harf)) 
				{System.out.println("girilen veri harf..");
			} else { 				
				System.out.println("girilen veri sembol.."); }			
				System.out.println("tekrar sorgulama icin 1,  cikmak icin 2'ye basiniz..");				
				i = scan.nextInt();			
				if ( i == 2) { 
					System.out.println("....iyi gunler....");
					scan.close();
				}  else {	
					System.out.println("yanlis bir tusa bastiniz...tekrar deneyin");
					System.out.println("tekrar sorgulama icin 1,  cikmak icin 2'ye basiniz..");
					i = scan.nextInt();
				
		}
			}
		}

	}


