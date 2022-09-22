package MukkemmelSayilar;

public class Main {

	public static void main(String[] args) {
		int sayi = 28;
		
		boolean mukkemmel = false;
		int toplam = 0;
		
		for (int i = 1; i <=sayi; i++) {
			if (sayi%i==0) {
				toplam+=i;
				if (sayi*2 ==toplam) {
					mukkemmel=true;
				}
			}
		}
		
		if (mukkemmel) {
			System.out.println("Sayi mukkemmel sayidir = "+ sayi);
		}else {
			System.out.println("Sayi mukkemmel sayi degildir. = " + sayi);
		}
		

	}

}
