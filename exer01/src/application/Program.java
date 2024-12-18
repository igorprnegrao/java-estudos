package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("================================");
		System.out.println("*Entre com os dados do contrato*");
		System.out.println("================================");
		
		System.out.print("Número: ");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), dtf);
		
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		System.out.println("================================");
		
		
		
		sc.close();
	}

}
