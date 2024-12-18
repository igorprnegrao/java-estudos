package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// formatar Localdate
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("================================");
		System.out.println("*Entre com os dados do contrato*");
		System.out.println("================================");
		
		System.out.print("Número: ");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		//inserir a data 
		LocalDate data = LocalDate.parse(sc.next(), dtf);
		
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		//instanciar a classe contrato com número, data, valor total do contrato
		Contract obj = new Contract(number, data, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		//instaciei contrato de serviço 
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n);
		
		System.out.println("================================");
		
		System.out.println("Parcelas (Juros / taxa): ");
		System.out.println();
		
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		System.out.println("================================");
		
		sc.close();
	}

}
