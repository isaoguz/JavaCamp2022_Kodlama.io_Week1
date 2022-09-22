package Diziler;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.8,1.3,1.4,1.5,1.6};
		
		double total =0;
		double enBuyuk = myList[0];
		for (double number : myList) {
			total = total+number;
			System.out.println(number);
			if (enBuyuk<number) {
				enBuyuk=number;
			}
		}
		System.out.println("En Buyuk = " + enBuyuk);
		System.out.println("Toplam = " + total);
	}

}
