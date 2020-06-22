package samet1;

import java.util.Scanner;

public class KutsalGun {

	public static void main(String[] args) {

		for ( int i = 0 ; i <= 1;) {
		
		System.out.println("bir gun ismi giriniz: ");
		Scanner scan = new Scanner (System.in);
		String HaftaninGunu = scan.nextLine();
		
		if (HaftaninGunu.contentEquals("cuma")) {
			System.out.println("muslumanlar icin kutsal gun...");
			
		} else if ( HaftaninGunu.contentEquals("cumartesi") ) {
			System.out.println("Yahudiler icin kutsal gun...");
			
		} else if ( HaftaninGunu.contentEquals("pazar") ) {
			System.out.println("hristiyanlar icin kutsal gun...");
			
		} else { System.out.println("kutsal bir gun degil..."); }
		
		System.out.println("tekrar denemek icin 1, cikmak icin 2'ye basin..");
		
		i = scan.nextInt();
		 
		if ( i == 2) {System.out.println("====  iyi gunler ====");}
		
		scan.close();
	}

	}}
