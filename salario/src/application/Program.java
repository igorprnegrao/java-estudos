package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee aumento = new Employee();
		
		System.out.print("Name: ");
		aumento.name = sc.nextLine();
		System.out.print("Gross salary: ");
		aumento.grossSalary = sc.nextDouble();
		System.out.printf("Tax: %.2f%n", aumento.tax);
		System.out.println();
		
		System.out.println("Employee:  " + aumento);
		
		
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		aumento.increaseSalary(percentage);
		
		
		System.out.print("Updated data: " + aumento );
		
		sc.close();
	}

}
