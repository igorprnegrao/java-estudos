package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Products [ ] vectProducts = new Products[n];
		
		for (int i = 0; i < vectProducts.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			Double price = sc.nextDouble();
			vectProducts[i] = new Products(name, price);
		}
		
		
		double sum = 0.0;
		for (int i = 0; i < vectProducts.length; i++) {
			sum  += vectProducts[i].getPrice();
		}
		
		double avg = sum / vectProducts.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
