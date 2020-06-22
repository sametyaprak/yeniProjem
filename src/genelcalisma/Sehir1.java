package genelcalisma;

public class Sehir1 extends Eyalet {
	
	static String sehirDukyanBilgileri = "istanbul, ankara";
	
	public static void main(String[] args) {
		
		Ulke sehir1 = new Ulke();
		sehir1.firmaBilgileri();
		Eyalet.firmaEyaletBilgileri();
		Eyalet.yonetimBilgiPortalli();

	}

	public static void  firmaSehirBilgileri () {
		System.out.println("1. sehrin bilgi portalına hosgeldiniz: ");
	}
 }
