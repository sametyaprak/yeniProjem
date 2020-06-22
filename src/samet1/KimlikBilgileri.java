package samet1;

import java.util.Scanner;

public class KimlikBilgileri {
	
	public static void main(String[] args) {
		
		// son guncelleme 09.05
		
		 Scanner scan = new Scanner(System.in) ;		 
		 	System.out.println("isminizi giriniz: ");			
		 String ad = scan.nextLine();
		 	System.out.println("soyadinizi giriniz: ");
		 String soyadi = scan.nextLine();				
		 	System.out.println("yasinizi giriniz: ");	
		 int yas = scan.nextInt();	
		 		
		if (yas <= 0 || yas >= 100) {
				System.out.println("hatali veri girisi, yasinizi tekrar giriniz:  ");
			yas = scan.nextInt();
				System.out.println("kimlik bilgileriniz: " + ad + " "+ soyadi + " " + "yas:" + (yas) );
			} else {
				System.out.println("kimlik bilgileriniz: " + ad + " "+ soyadi + " " + "yas:" + (yas) );		
			}			
			scan.close();
				}

			}
			
		
	
	
		

