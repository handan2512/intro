package intro;

import java.util.Iterator;

public class Main {
	//main java da ba�lang�� metodur.

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//De�i�ken isimlendirmeleri java'da camelCase yaz�l�r.
		
		String ortaMetin = "�lginizi �ekebilir";
		String altMetin = "Vade s�resi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade=12;
		
		double dolarDun =18.25;
		double dolarBugun =18.20;
		
		boolean dolarDustuMu =false;
		
		String okYonu ="";
		
		if (dolarBugun<dolarDun) {
			okYonu ="down.svg";
			System.out.println(okYonu);
			
		} else if (dolarBugun>dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);

			
			
		}
		
		else {
			okYonu ="equal.svg";
			System.out.println(okYonu);

		}
		//array
		String[] krediler= {"H�zl� kredi","Maa��n� halkbanktan alanlar","Mutlu Emekli"};
		
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		
			
		}
		
		
		
		

	}

}
