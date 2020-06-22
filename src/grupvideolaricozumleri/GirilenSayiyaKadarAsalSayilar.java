package grupvideolaricozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirilenSayiyaKadarAsalSayilar extends AsalVeyaDegil{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("hangi rakama kadar asal sayilari gormek istersiniz: ");
		int num2 = scan.nextInt();
		scan.close();
		
		List <Integer> myList = new ArrayList <>();
		
		for (int i=2; i<num2 ; i++) {
			if (asalMi (i)) {
					myList.add(i);
				}
			}
		
		System.out.println(myList);
	}

}
