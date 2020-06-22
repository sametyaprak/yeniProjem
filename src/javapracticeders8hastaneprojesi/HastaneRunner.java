package javapracticeders8hastaneprojesi;

public class HastaneRunner {
	
	private static Hastane hastane = new Hastane();
	
	
	public static void main(String[] args) {
		
		String hastaDurumu = "Migren";
		String unvan = doktorUnvan(hastaDurumu);
		hastane.setDoktor(doktorBul(unvan));
		
		System.out.println("doktorun unvanı: " + unvan);	
		System.out.println("doktorun ismi "+ hastane.getDoktor().getIsim());
		
		
		Durum durum = new Durum();				
	}
	
	public static String doktorUnvan (String aktuelDrum) {
		
		if (aktuelDrum.equals("Allerji")) {
			return hastane.unvanlar[0];
		} else if (aktuelDrum.equals("Bas Agrisi")) {
			return hastane.unvanlar[1];
		} else if (aktuelDrum.equals("Diabet")) {
			return hastane.unvanlar[2];
		} else if (aktuelDrum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		} else if (aktuelDrum.equals("Migren")) {
			return hastane.unvanlar[4];
		} else if (aktuelDrum.equals("Kalp hastaliklari")) {
			return hastane.unvanlar[5];
		} 
		
		return "yanlış unvan";
	}


	public static Doktor doktorBul (String unvan) {
		
		Doktor doktor = new Doktor();
		
		for (int i=0; i<hastane.unvanlar.length;i++) {
			if (unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doktorIsimleri[i]);
				doktor.setSoyisim(hastane.doktorSoyisimleri[i]);
				doktor.setUnvan(hastane.unvanlar[i]);				
			}
		}
			
		return doktor;
		}
	}
	
	