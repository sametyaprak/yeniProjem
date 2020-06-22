package javapracticeders9;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		System.out.println("bir sayi tahmin ediniz: ");
		Scanner sayi = new Scanner (System.in);
		int num =  sayi.nextInt();		
		int num2 = (int) (Math.random()*100);
		int sum=1;
		
		while (num!=num2 && sum!=3) {
			sum++;
			System.out.println(sum + ". denemeniz tekrar deneyin");
			num =  sayi.nextInt();
		}
		if (sum==3) {
			System.out.println("bulamadınız");
			System.out.println("gercek sayi: "+ num2 + " idi.");
		} else if (num==num2) {
			System.out.println("buldunz");
		}
		sayi.close();
	}

}
