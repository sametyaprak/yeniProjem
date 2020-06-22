package genelcalisma;

public class Ulke {
	
	private int fiyat = 15;						// sadece okursunuz
	private int stok = 100;						//	işlem serbest
	private String urunIsmı = "kalem";			// sadece okursunuz
	private String usunIsmı2 = "kitap";			// sadece okursunuz
	boolean kalemKalite = false;				// değiştirebilirsiniz ama okuyamazsınız
	boolean kitapKalite = true;					// değiştirebilirsiniz ama okuyamazsınız
	

	public static void main(String[] args) {
		
	}
	public void firmaBilgileri () {
		System.out.println("firma bilgileri methoduna hosgeldiniz:");
		System.out.println("bu method ulke classinin icinde olusturulmustur:");
	}


	public int getFiyat() {
		return fiyat;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public String getUrunIsmı() {
		return urunIsmı;
	}
	
	public String getUsunIsmı2() {
		return usunIsmı2;
	}
	
	public void setKalemKalite(boolean kalemKalite) {
		this.kalemKalite = kalemKalite;
	}
	
	public void setKitapKalite(boolean kitapKalite) {
		this.kitapKalite = kitapKalite;
	}

}
