package javaPracticeday7;

import java.util.Arrays;
import java.util.Scanner;

public class AlfabetikSiralama {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String word = scan.nextLine();
		char arr [] = new char [word.length()];
		for(int i=0;i<word.length();i++) {
			arr[i]=word.charAt(i);
			scan.close();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
