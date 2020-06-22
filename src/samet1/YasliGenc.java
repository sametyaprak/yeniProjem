package samet1;

import java.util.Scanner; //bunu control+shift+O ile otomatik olarak getirtebilirsin

public class YasliGenc {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("dogum tarihinizi giriniz:");
		
	int a = scan.nextInt();
	// aritmetik öperatörler
	int b = 2020-a;
				
	System.out.println("su anki yasiniz: "+ b);
	
	if ( b > 35) { System.out.println("yaslisiniz") ;  }
	
	else  { System.out.println("gencsiniz");   }
	}
}
  