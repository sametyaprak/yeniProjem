package javapracticeders9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		
	
		
	Scanner scan = new Scanner (System.in);
	System.out.println("cm cinsinden uzunluk giriniz: ");
		double cm = scan.nextDouble();
		double m=cm/100;
		double km=0.001*m;	
		scan.close();
		DecimalFormat df = new DecimalFormat("#.####");	
		System.out.println("girilen uzunluk: " + m + " metre, " + df.format(km) + " km.dir.");
	
	System.out.println(getM(cm));
	System.out.println(getKm(m));
	
	}
	
	private static double getM(double cm) {
		return cm/100;
	}
	
	private static String getKm (double m) {
		DecimalFormat df = new DecimalFormat("#.####");	
		return df.format(0.001*m);
	}
	
}
