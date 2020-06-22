package interviewsorulari;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		
		// kullanicidan bir sayi alin 
		// bu sayinin tersini yazdirin
		// cikan rakama iki ekleyin
		
		
		System.out.println("enter a number:");
		Scanner scan = new Scanner (System.in);
		String num = scan.nextLine();
		String result = "";
		int lnt = num.length();
		
		for ( int i = lnt-1 ; i>=0 ; i--) {
			
			result = result + num.charAt(i) +""; }//char'in sonuna "" ekleyerek stirnge çevirebiliriz.
			System.out.println(result);
			int num2 = Integer.valueOf(result);
			System.out.print(num2+2);
		}
		
		
	}


