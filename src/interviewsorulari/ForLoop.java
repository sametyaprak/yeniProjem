package interviewsorulari;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		// Bir string alin ve bu stingi tersten yazdirin
		
		System.out.println("enter a word:");
		Scanner scan = new Scanner (System.in);
		String word = scan.nextLine();
		int num=word.length();
		int i=num-1;
			while ( i>=0) {
				System.out.print(""+word.charAt(i));
				i--;			
		} scan.close();

	}

}
