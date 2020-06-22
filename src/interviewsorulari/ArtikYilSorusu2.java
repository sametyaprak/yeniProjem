package interviewsorulari;

import java.util.Scanner;

public class ArtikYilSorusu2 {

	public static void main(String[] args) {

		System.out.println("bir yil giriniz: ");
		Scanner scan = new Scanner (System.in);
		int yil = scan.nextInt();
		
		// 100e bolunuyorsa 400e bolunmeli
		// 100e bolunmuyorsa 4e bolunmeli
		
		// uc cesit cozumu var if / else if / tenery
		
		String result =  yil % 400 == 0 && yil % 100 == 0 ? "artik yil" : yil % 100 == 0 && yil % 4 == 0 ?
			"artik yil" : "artik yil degil";
		System.out.println("girilen sayi " + result + " dir.");
		
		scan.close();
		
		
		

	}

}
