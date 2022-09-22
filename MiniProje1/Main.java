package MiniProje1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int sayi = 1;
		
		
		boolean isPrime = true;
		if (sayi<2) {
			System.out.println("Gecersiz sayi");
			return;
		}
		for (int i = 2; i < sayi; i++) {
			if (sayi%i==0) {
				isPrime=false;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayi asaldır");
		}else {
			System.out.println("Sayi asal degil");
		}

	}

}
