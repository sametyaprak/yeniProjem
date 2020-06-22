package calisma;

import java.util.Arrays;

public class ArrayTers {

	public static void main(String[] args) {

		int arr [] = {1,2,3,4,5,6};
		int arrTers [] = new int [arr.length];
		
		for (int i=0; i<arr.length ; i++ ) {
			arrTers[i]=arr[arr.length-1-i];			
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
