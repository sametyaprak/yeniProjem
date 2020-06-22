package javaPracticeday7;

import java.util.Scanner;

public class StringManipulations {
	public static void main(String[] args) {
		
		System.out.println("enter your name end sirname");
		Scanner scan = new Scanner (System.in);
		String word = scan.nextLine();
		scan.close();
		int divide = word.lastIndexOf(' ');
		String name = word.substring(0, divide);
		int divide2 = name.lastIndexOf(' ');
		String sirName = word.substring(divide+1);
		System.out.println(name.substring(0, 1).toUpperCase()+name.substring(1,divide2).toLowerCase());
		System.out.println(name.substring(divide2+1, divide2+2).toUpperCase()+name.substring(divide2+2).toLowerCase());
		System.out.println(sirName.substring(0, 1).toUpperCase()+sirName.substring(1).toLowerCase());

	}

}
