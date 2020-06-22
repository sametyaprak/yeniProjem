package samet1;

import java.util.Scanner;

public class SayiBulmaca {

	public static void main(String[] args) {
		int randomSayi = (int)(Math.random()*(100)); //0 ile 100 arasinda sayi
		
		
		System.out.println("aklinizdan sifirdan 100'e kadar bir sayi tutun ve sisteme girin: ");
		Scanner scan = new Scanner(System.in);
	    int deneme1 = scan.nextInt(); 	    	    
	  	// for (degisken baslatma; kosul; degisken arttirma) { islem}
	   
	    int sayi3;
		for (int sayi = 1; deneme1 != randomSayi; sayi = sayi+1  ) {
			
			System.out.println(sayi + ". denemeniz..");		
			Scanner scan2 = new Scanner(System.in);
			
		    if      (deneme1>randomSayi) 		{System.out.println("yuksek") ;
		    									System.out.println("yeni tahmininizi girin: ");
		    								    int sayi2 = scan2.nextInt(); 
		    								    deneme1 = sayi2;}
		    
		    
		    else if (deneme1<randomSayi)  	    {System.out.println("dusuk"); 
		    									 System.out.println("yeni tahmininizi girin: ");
		    									 int sayi2 = scan2.nextInt(); 
		    									 deneme1 = sayi2;} 
		
		    else if (deneme1==randomSayi)		{System.out.println("dogru tahmin") ; 
		    									System.out.println("sistemin belirledigi sayi: " + randomSayi);
		    									int sayi2 = scan2.nextInt(); 
		    									deneme1 = sayi2;}	
		    
		    
		       
	}
}
	}
