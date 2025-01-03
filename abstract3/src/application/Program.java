package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listTp = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			
			System.out.print("Individual or company (i/c)?");
			char taxType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double anuallcome = sc.nextDouble();
			
			if (taxType == 'i') {
				
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				listTp.add(new Individual(name, anuallcome, healthExpenditures));
				
			} else if (taxType == 'c') {
				
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				listTp.add(new Company(name, anuallcome, numberOfEmployees));
			}
			
		}
		
		System.out.println("-------------------------------------");
		System.out.println("TAXES PAID: ");
		
		for (TaxPayer taxPayer : listTp) {
			System.out.println(taxPayer.getName() + ": " +  String.format("%.2f", taxPayer.tax()) );
		}
		
		Double sum = 0.0;
		for (TaxPayer taxPayer : listTp) {
			sum += taxPayer.tax();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();

	}

}
