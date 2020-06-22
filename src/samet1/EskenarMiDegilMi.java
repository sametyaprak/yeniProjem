package samet1;

import java.util.Scanner;

public class EskenarMiDegilMi {

	public static void main(String[] args) {

		for ( int i = 0; i <= 1; ) {
		
		System.out.println("ucgenin kenar uzunluklarini sirasi ile giriniz: ");
		Scanner scan = new Scanner (System.in);
		
		int BirinciKenar = scan.nextInt();
		int IkinciKenar = scan.nextInt();
		int UcuncuKenar = scan.nextInt();
		
		if ( ( BirinciKenar == IkinciKenar ) && ( IkinciKenar == UcuncuKenar) ) { 
			System.out.println("eskenar ucgen");
		} else System.out.println("eskenar degil");
		
		System.out.println("tekrar denemek icin 1,  cikic icin 2'ye basiniz ");
		
		
		i = scan.nextInt();
		 
		if ( i == 2) {System.out.println("====  iyi gunler ====");}
			
		
	}
		
}
		

	}


