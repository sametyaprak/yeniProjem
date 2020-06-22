package grupvideolaricozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IstedigimizKadarAsalSayilar extends AsalVeyaDegil{

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("kac tane asal sayi gormek istersiz: ");
		int num3 = scan.nextInt();
		scan.close();
		int num4=0;
		List <Integer> mySecondList = new ArrayList <>();
		
		while (mySecondList.size()!=num3) {
			num4++;
			if (asalMi (num4)) {
				mySecondList.add(num4);
			}
		}
		System.out.println(mySecondList);
	}

}
