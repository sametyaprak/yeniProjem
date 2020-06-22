package javapracticeders9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("yazınısı giris yapiniz: ");
		String writing = scan.nextLine();
		String  sentences [] = writing.split("\\."); 
		System.out.println(Arrays.toString(sentences));
		Map <String, Integer> kelimeListesi = new HashMap <>();
		for (int i=0; i<sentences.length; i++ ) {
			String words [] = sentences[i].trim().split(" ");
			System.out.println(Arrays.toString(words));
			
			for ( int j=0; j<words.length;j++) {
				if (kelimeListesi.get(words[j])== null) {
					kelimeListesi.put(words[j], 1);
				} else {
					int sayi = kelimeListesi.get(words[j]);
					kelimeListesi.put(words[j], sayi+1);
				}
			}
		}
		
		for (String w : kelimeListesi.keySet()) {
			System.out.println(w);
		}
		
		
		
		
				
		}
		
	}
	
	


