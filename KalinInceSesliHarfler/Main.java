package KalinInceSesliHarfler;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		char harf = 'M';
		
		boolean bulundu = false;
		
		char[] sesli = {'E','A','I','O','U'};
	
		for (char sesliBul : sesli) {
			if (harf ==sesliBul) {
				bulundu=true;
			}
		}
		
		if (bulundu) {
			System.out.println("Harf seslidir = " + harf);
		}else {
			System.out.println("Harf sessizdir = "+ harf);
		}

	}

}
