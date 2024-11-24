package intro;

import java.util.Iterator;

public class Main {
	//main java da baþlangýç metodur.

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//Deðiþken isimlendirmeleri java'da camelCase yazýlýr.
		
		String ortaMetin = "Ýlginizi çekebilir";
		String altMetin = "Vade süresi";
		
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
		String[] krediler= {"Hýzlý kredi","Maaþýný halkbanktan alanlar","Mutlu Emekli"};
		
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		
			
		}
		
		
		
		

	}

}
