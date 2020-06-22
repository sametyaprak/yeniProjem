package genelcalisma;

public class Eyalet extends Ulke {
	
	private boolean eyaletKarDurumu = false;
	int eyaletCalısanBilgileri = 50;

	public static void main(String[] args) {
		
		Ulke ulke = new Ulke();
		ulke.firmaBilgileri();
		 firmaEyaletBilgileri ();
		 yonetimBilgiPortalli ();
		

	}

	public static void firmaEyaletBilgileri () {
		System.out.println("eyalet bilgileri methoduna hoş geldiniz");
		
		Ulke ulke1 = new Ulke();
		System.out.println("kalemin mevcut kalitesi: " + ulke1.kalemKalite);
		System.out.println("kitabin mevcut kalitesi: " + ulke1.kitapKalite);
		ulke1.getFiyat();
		System.out.println("ilk urununumuz:" + ulke1.getUrunIsmı());
		System.out.println("ikinci urunumuz: " + ulke1.getUsunIsmı2());	
		
	}
	
	public static void yonetimBilgiPortalli () {
		System.out.println("yonetimBilgiPortalina hoş geldiniz");
		Ulke ulke2 = new Ulke();
		ulke2.setKalemKalite(true);
		ulke2.setKitapKalite(true);
	}
	
}
