package interviewsorulari;

import java.util.Scanner;

public class ArtikYilSorusu {

	public static void main(String[] args) {
		
		System.out.println("bir yil giriniz: ");
		Scanner scan = new Scanner (System.in);
		int yil = scan.nextInt();
		
		if (( yil % 100) == 0   &&  ( yil % 400) == 0 ) {
				System.out.println( yil + " yili artik yil...");
				
			} else if ((yil % 100) != 0 && ( yil % 4) == 0)  {
				System.out.println( yil + " yili artik yildir...");
				
			} else { System.out.println( yil + " yili artik yil degildir..");
				
			}
	
		

	}

}
