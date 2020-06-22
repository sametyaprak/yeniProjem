package genelprojelerim;

import java.util.Scanner;

public class LoopIfStatementAndIncrementDecrement {

	public static void main(String[] args) {
		
		usernameSorgulama ();
		paswordSorgulama () ;
		}
	
	public static void usernameSorgulama () {
		for ( int j = 0; j<1 ; ) {
		System.out.println("enter a username..");
		Scanner scan = new Scanner (System.in);
		String username = scan.nextLine();
		int lnt = username.length();
		int error = 0;
			for (int i=0; i<lnt ;i++ ) {
				if (!(Character.isAlphabetic(username.charAt(i))) ) {
				
					System.out.println("girilen veride rakam bulunmakta..");
					error = error + 1;
					break;
				} 
			}
			if (lnt<7) {
				System.out.println("girilen username 8 karakter icermeli");
				error = error + 1 ;
			}
			if (error>0) {
			System.out.println("tekrar denemek icin 0 , cıkmak icin 1 ");
			j = scan.nextInt();
			if (j==1) {
				System.out.println("......iyi gunler.......");
				scan.close();
				 System.exit(0);
			}
		}	else { 
			j++;
		}
		}
	}

	public static void paswordSorgulama () {
		for ( int j = 0; j<1 ; ) {
		System.out.println("enter a password..");
		Scanner scan = new Scanner (System.in);
		String password = scan.nextLine();
		int passwordLnt = password.length();
		int error = 0;
		
		if (passwordLnt<10) {
			System.out.println("girilen sifre an az 10 karakter bulundurmali: ");
			error++;
		}
		int sumAlphabet = 0;
		for (int i=0; i<passwordLnt ;i++ ) {
			if (Character.isAlphabetic(password.charAt(i)) ) {
				sumAlphabet=sumAlphabet+1; }
			}
			if (sumAlphabet<1) {
				System.out.println("sifrenizde karakter yok");
				error++;
			}
		int sumNumber = 0;
		for (int i=0; i<passwordLnt ;i++ ) {
			if (Character.isDigit(password.charAt(i)) ) {
				sumNumber=sumNumber+1; }
				}
			if (sumNumber<1) {
				System.out.println("sifrenizde rakam yok");
				error++;
				}
		int sumCapLetter = 0;
		for (int i=0; i<passwordLnt ;i++ ) {
			if (((password.charAt(i)>=65) && (password.charAt(i)<=90)) ) {
				sumCapLetter=sumCapLetter+1; }
				}
			if (sumCapLetter==0) {
				System.out.println("sifrenizde buyuk harf yok");
				error++;
				}		
		int sumSmallLetter = 0;
		for (int i=0; i<passwordLnt ;i++ ) {
			if (((password.charAt(i)>=97) && (password.charAt(i)<=122)) ) {
				sumSmallLetter=sumSmallLetter+1; }
				}
			if (sumSmallLetter==0) {
				System.out.println("sifrenizde kucuk harf yok");
				error++;
				}		
			if (error>0) {
		System.out.println("tekrar denemek icin 0 , cıkmak icin 1 ");
		j = scan.nextInt();
		if (j==1) {
			System.out.println("......iyi gunler.......");
			scan.close();
			System.exit(0);
			}
		} else {
			System.out.println("veri girisi basarili, iyi gunler dileriz...");
			System.exit(0);
		}
		}
	}
}