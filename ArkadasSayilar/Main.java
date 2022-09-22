package ArkadasSayilar;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi1Total = 0;
		int sayi2 = 285;
		int sayi2Total = 0;
		boolean arkadasmi = false;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				sayi1Total += i;
			}
		}

		for (int j = 1; j < sayi2; j++) {
			if (sayi2 % j == 0) {
				sayi2Total += j;
			}

		}
		if (sayi1Total == sayi2 && sayi1==sayi2Total) {
			arkadasmi = true;
		}

		if (arkadasmi) {
			System.out.println("Sayilar arkadastir");
		} else {
			System.out.println("Sayilar arkadaş değil");
		}

	}

}
