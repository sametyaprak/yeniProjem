package samet1;

import java.util.Scanner;

public class SayilBulmaca2 {

	public static void main(String[] args) {
		
		// for dongusu ile degistirilmesi gerekiyor

		System.out.println("birden yuze kadar bir sayi belirleyin:");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		
		int num2 = (int)(Math.random()*(100));
		
		String result = num1 == num2 ? "dogru tahmin" : num1 > num2 ? "yuksek" : "dusuk" ;
		
		System.out.println("sonuc: " + result + " dogru deger " + num2);
		scan.close();

	}

}
