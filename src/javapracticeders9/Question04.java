package javapracticeders9;

import java.util.Scanner;

public class Question04 {
	
	public static void main(String[] args) {
		
		System.out.println( setSumNumbers() );
		
	}

	private static int setSumNumbers () {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number: ");
		int num=scan.nextInt();
		scan.close();
		String str = Integer.toString(num); 
		int sum=0;
		for (int i=0;i<str.length();i++) {
			
			sum = sum + num%10;
			num=num/10;
		}
		return sum;
	}
	
}
