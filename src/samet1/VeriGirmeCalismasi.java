package samet1;

import java.util.*;

public class VeriGirmeCalismasi {

	public static void main(String[] args) {
		
		//eksikler var 
		
		System.out.println("dogum yilinizi giriniz: ");
		
		Scanner girdi = new Scanner(System.in);
					
		int sonuc = girdi.nextInt();
		
		int yas = (2020 - sonuc);
		
		
		System.out.println("su anki yasiniz: " + yas);
		
		
	

	}

}
