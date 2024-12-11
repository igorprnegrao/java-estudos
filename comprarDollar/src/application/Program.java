package application;

import java.util.Locale;
import java.util.Scanner;

import conversor.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarValue = sc.nextDouble();

		double conversor = CurrencyConverter.conversorMoeda(price, dollarValue);

		System.out.printf("Amount to be paid in reais = $ %.2f", conversor);

		sc.close();
	}

}
