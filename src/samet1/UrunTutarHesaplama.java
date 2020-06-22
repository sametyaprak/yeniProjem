package samet1;

import java.util.Scanner;

public class UrunTutarHesaplama {

	public static void main(String[] args) {
		// eger 1000 den fazla urun alirsa %20 indirim yapan ve toplamini
		// 1000den az alirsa (yada 1000) indirim yapmayin
		
		for ( int i = 0 ; i <= 1 ;) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("kac adet urun almak istersiniz: ");
		int urunSayisi = scan.nextInt();
		System.out.println("urunun birim fiyatini giriniz: ");
		double birimFiyati = scan.nextDouble();
		
		if ( urunSayisi > 1000) {
			System.out.println("alinan urunlerin toplam tutari: " + (birimFiyati * urunSayisi * 0.8 ));
		} if ( urunSayisi <= 1000 ) {
			System.out.println("alinan urunlerin toplam tutari: " + (birimFiyati*urunSayisi));
		}
				
		System.out.println("yeni urun girisi icin 1, cikis icin 2' ye basiniz: ");
		i = scan.nextInt();
		
		if ( i != 1) {
			System.out.println("=======iyi gunler======");
		}
		}

	}

}
