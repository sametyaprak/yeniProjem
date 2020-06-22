package baslangicprijesi;

import java.util.Scanner;

public class Main01 {
	
	static String name;
	static String sirname;
	static int age;
	
	public Main01(String name, String sirname) {
		this.name= name;
		this.sirname=sirname;
	}
		

	public static void main(String[] args) {
		
		MainInformation();
		MainInformation01  ("" , "" );
		
	}
		
	public static void MainInformation() {	
		
		System.out.println("enter name ");
		Scanner scan = new Scanner(System.in);
		Main01.name = scan.nextLine();
		System.out.println("enter sirname ");
		Main01.sirname = scan.nextLine();
		System.out.println("enter age ");
		Main01.age = scan.nextInt();
		scan.close();		
	}
	public static void MainInformation01 (String name, String sirname) {
		
		Main01.name="xx";
		Main01.sirname="xxx";
		System.out.println(Main01.name);
		System.out.println(Main01.sirname);
	}
	}



