package geneltekrar;

import java.util.Scanner;

public class GenelTekrar3 {

	public static void main(String[] args) {
		
		System.out.println("hi " + 21);
		System.out.println("hi Harun");
		System.out.println(5 + "TechProEd" + 203);
		System.out.println("TechProEd305");
		System.out.println("7TecProEd305");
		
		System.out.println(-5+(8*6));
		System.out.println((55+9) % 9);
		System.out.println(20 + (-3 * 5 ) / 8 );
		System.out.println(5 + (15 / 3) * 2 - (8 % 3 ));
		
		double en = 5.6;
		double boy = 8.5;
		
		System.out.println("dikdortgenin alani: " + (en * boy));
		System.out.println("dikdortgenin cevresi: " + (en + boy) * 2);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir sayi giriniz: ");
		int num1 = scan.nextInt();
		System.out.println("ikinci bir sayi giriniz:");
		int num2 = scan.nextInt();
		System.out.println("ucucncu bir sayi giriniz:");
		int num3 = scan.nextInt();
		System.out.println("girilen sayilarin toplami: " + (num1+num2+num3));
		scan.close();
		
		

	}

}
