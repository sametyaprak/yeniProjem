package samet1;

import java.util.Scanner;

public class DunyaSaatleri {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ALMANYA'daki guncel saati giriniz:");
		int saat = scan.nextInt();			
		System.out.println("ALMANYA'daki guncel dakikayi giriniz:");
		int dakika = scan.nextInt();
		
		int amerikaSaat = (saat-7+24), japonyaSaat = (saat+8+24), turkiyeSaat = (saat+1);
		
		if (amerikaSaat>24) { amerikaSaat=(amerikaSaat%24); }
		System.out.println("Amerika'da saat suan: " + (amerikaSaat) + ":" +(dakika) );
		
		if (japonyaSaat>24) { japonyaSaat=(japonyaSaat%24); }
		System.out.println("Japonya'da saat suan: " + (japonyaSaat) + ":" +(dakika) );
		
		if (turkiyeSaat>24) { turkiyeSaat=(turkiyeSaat%24); }
		System.out.println("Turkiye'de saat suan: " + (turkiyeSaat) + ":" +(dakika) );
	
		scan.close();	
		
			}

}
