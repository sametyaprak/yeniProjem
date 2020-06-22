package grupvideolaricozumleri;

import java.util.Scanner;

public class AsalVeyaDegil {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("kontrol etmek istediginiz sayiyi giriniz: ");
		int num = scan.nextInt();
		System.out.println(asalMi (6));
		scan.close();

	}
	
	protected static boolean asalMi (int num) {
				
		int result=0;
		for (int i=2;i<num;i++) {
			if (num%i==0 ) {
				result++;
			}
		}
		if (result==0) {		
		return true;
	} else {
		return false;
	}
	}
}
