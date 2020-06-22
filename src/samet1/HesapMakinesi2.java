package samet1;

import java.util.Scanner;

public class HesapMakinesi2 {
		
		int numA = 0;
		int numB = 5;
		String word1 = "samet";
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir rakam giriniz:");
		String num1 = scan.nextLine();
		System.out.println("yapilacak islemi giriniz: ");
		String islem = scan.nextLine();
		System.out.println("diger rakami giriniz: ");
		String num2 = scan.nextLine();			
		hesapMakinesi (num1 , islem , num2  );
		
		HesapMakinesi2 arttirma = new HesapMakinesi2 ();
		System.out.println(arttirma.word1.toUpperCase());
		
		scan.close();
	}
		public static void hesapMakinesi (String num1, String islem, String num2 ){		
		
		double num3 = Double.parseDouble(num1);
		double num4 = Double.parseDouble(num2);
		
		switch (islem) {
		case "+" :
			System.out.println("islem sonucu: " + (num3+num4) );
			break;
		case "-" :
			System.out.println("islem sonucu: " + (num3-num4) );
			break;
		case "*" :
			System.out.println("islem sonucu: " + (num3*num4) );
			break;
		case "/" :
			System.out.println("islem sonucu: " + (num3/num4) );
			break;
			default:
				System.out.println("belirsiz islem...");
				
		}
		
		 }
	}


